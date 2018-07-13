/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug;

/**
 * The DebugProxy allows to communicate between the interpreter, which runs in a
 * separate thread or process and the Eclipse Debug framework (i.e., the
 * DebugTarget class).
 */
public class AdaptiveCyberDefenseDebugProxy {
	
	public static final int STARTUP_DELAY = 1000;
	
	private java.io.PrintStream output;
	
	private java.io.BufferedReader reader;
	
	private org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.AdaptiveCyberDefenseDebugTarget debugTarget;
	
	private org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.AdaptiveCyberDefenseDebugCommunicationHelper communicationHelper = new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.AdaptiveCyberDefenseDebugCommunicationHelper();
	
	public AdaptiveCyberDefenseDebugProxy(org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.AdaptiveCyberDefenseDebugTarget debugTarget, int requestPort) throws java.net.UnknownHostException, java.io.IOException {
		this.debugTarget = debugTarget;
		// give interpreter a chance to start
		try {
			Thread.sleep(STARTUP_DELAY);
		} catch (InterruptedException e) {
		}
		startSocket(requestPort);
	}
	
	private void startSocket(int requestPort) throws java.net.UnknownHostException, java.io.IOException {
		// creating client proxy socket (trying to connect)...
		java.net.Socket client = new java.net.Socket("localhost", requestPort);
		// creating client proxy socket - done. (connected)
		try {
			java.io.BufferedInputStream input = new java.io.BufferedInputStream(client.getInputStream());
			reader = new java.io.BufferedReader(new java.io.InputStreamReader(input));
		} catch (java.io.IOException e) {
			System.out.println(e);
		}
		try {
			output = new java.io.PrintStream(client.getOutputStream());
		} catch (java.io.IOException e) {
			System.out.println(e);
		}
	}
	
	public void resume() {
		sendCommand(org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.EAdaptiveCyberDefenseDebugMessageTypes.RESUME);
	}
	
	public void stepOver() {
		sendCommand(org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.EAdaptiveCyberDefenseDebugMessageTypes.STEP_OVER);
	}
	
	public void stepInto() {
		sendCommand(org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.EAdaptiveCyberDefenseDebugMessageTypes.STEP_INTO);
	}
	
	public void stepReturn() {
		sendCommand(org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.EAdaptiveCyberDefenseDebugMessageTypes.STEP_RETURN);
	}
	
	public void terminate() {
		sendCommand(org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.EAdaptiveCyberDefenseDebugMessageTypes.EXIT);
	}
	
	public org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.AdaptiveCyberDefenseDebugMessage getStack() {
		return sendCommandAndRead(org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.EAdaptiveCyberDefenseDebugMessageTypes.GET_STACK);
	}
	
	public void addLineBreakpoint(String location, int line) {
		org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.AdaptiveCyberDefenseDebugMessage message = new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.AdaptiveCyberDefenseDebugMessage(org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.EAdaptiveCyberDefenseDebugMessageTypes.ADD_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public void removeLineBreakpoint(String location, int line) {
		org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.AdaptiveCyberDefenseDebugMessage message = new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.AdaptiveCyberDefenseDebugMessage(org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.EAdaptiveCyberDefenseDebugMessageTypes.REMOVE_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public org.eclipse.debug.core.model.IVariable[] getStackVariables(String stackFrame) {
		org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.AdaptiveCyberDefenseDebugMessage response = sendCommandAndRead(org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.EAdaptiveCyberDefenseDebugMessageTypes.GET_FRAME_VARIABLES, new String[] {stackFrame});
		String[] ids = response.getArguments();
		// fetch all variables
		org.eclipse.debug.core.model.IVariable[] variables = getVariables(ids);
		return variables;
	}
	
	public org.eclipse.debug.core.model.IVariable[] getVariables(String... requestedIDs) {
		org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.AdaptiveCyberDefenseDebugMessage response = sendCommandAndRead(org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.EAdaptiveCyberDefenseDebugMessageTypes.GET_VARIABLES, requestedIDs);
		String[] varStrings = response.getArguments();
		org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.AdaptiveCyberDefenseDebugVariable[] variables  = new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.AdaptiveCyberDefenseDebugVariable[varStrings.length];
		int i = 0;
		for (String varString : varStrings) {
			java.util.Map<String, String> properties = org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.util.AdaptiveCyberDefenseStringUtil.convertFromString(varString);
			
			// convert varString to variables and values
			String valueString = properties.get("!valueString");
			String valueRefType = "valueRefType";
			java.util.Map<String, Long> childVariables = new java.util.TreeMap<String, Long>(new java.util.Comparator<String>() {
				public int compare(String s1, String s2) {
					return s1.compareToIgnoreCase(s2);
				}
			});
			for (String property : properties.keySet()) {
				// ignore special properties - they are not children
				if (property.startsWith("!")) {
					continue;
				}
				childVariables.put(property, Long.parseLong(properties.get(property)));
			}
			String id = properties.get("!id");
			org.eclipse.debug.core.model.IValue value = new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.AdaptiveCyberDefenseDebugValue(debugTarget, id, valueString, valueRefType, childVariables);
			
			String variableName = properties.get("!name");
			String variableRefType = properties.get("!type");
			
			org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.AdaptiveCyberDefenseDebugVariable variable = new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.AdaptiveCyberDefenseDebugVariable(debugTarget, variableName, value, variableRefType);
			variables[i++] = variable;
		}
		return variables;
	}
	
	private void sendCommand(org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.EAdaptiveCyberDefenseDebugMessageTypes command, String... parameters) {
		org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.AdaptiveCyberDefenseDebugMessage message = new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.AdaptiveCyberDefenseDebugMessage(command, parameters);
		communicationHelper.sendEvent(message, output);
	}
	
	private org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.AdaptiveCyberDefenseDebugMessage sendCommandAndRead(org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.EAdaptiveCyberDefenseDebugMessageTypes command, String... parameters) {
		org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.AdaptiveCyberDefenseDebugMessage message = new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.AdaptiveCyberDefenseDebugMessage(command, parameters);
		return communicationHelper.sendAndReceive(message, output, reader);
	}
	
}
