/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug;

/**
 * DebugMessages are exchanged between the debug server (the Eclipse debug
 * framework) and the debug client (a running process or interpreter). To exchange
 * messages they are serialized and sent over sockets.
 */
public class AdaptiveCyberDefenseDebugMessage {
	
	private static final char DELIMITER = ':';
	private org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.EAdaptiveCyberDefenseDebugMessageTypes messageType;
	private String[] arguments;
	
	public AdaptiveCyberDefenseDebugMessage(org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.EAdaptiveCyberDefenseDebugMessageTypes messageType, String[] arguments) {
		super();
		this.messageType = messageType;
		this.arguments = arguments;
	}
	
	public AdaptiveCyberDefenseDebugMessage(org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.EAdaptiveCyberDefenseDebugMessageTypes messageType, java.util.List<String> arguments) {
		super();
		this.messageType = messageType;
		this.arguments = new String[arguments.size()];
		for (int i = 0; i < arguments.size(); i++) {
			this.arguments[i] = arguments.get(i);
		}
	}
	
	public org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.EAdaptiveCyberDefenseDebugMessageTypes getMessageType() {
		return messageType;
	}
	
	public String[] getArguments() {
		return arguments;
	}
	
	public String serialize() {
		java.util.List<String> parts = new java.util.ArrayList<String>();
		parts.add(messageType.name());
		for (String argument : arguments) {
			parts.add(argument);
		}
		return org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.util.AdaptiveCyberDefenseStringUtil.encode(DELIMITER, parts);
	}
	
	public static AdaptiveCyberDefenseDebugMessage deserialize(String response) {
		java.util.List<String> parts = org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.util.AdaptiveCyberDefenseStringUtil.decode(response, DELIMITER);
		String messageType = parts.get(0);
		String[] arguments = new String[parts.size() - 1];
		for (int i = 1; i < parts.size(); i++) {
			arguments[i - 1] = parts.get(i);
		}
		org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.EAdaptiveCyberDefenseDebugMessageTypes type = org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.EAdaptiveCyberDefenseDebugMessageTypes.valueOf(messageType);
		AdaptiveCyberDefenseDebugMessage message = new AdaptiveCyberDefenseDebugMessage(type, arguments);
		return message;
	}
	
	public boolean hasType(org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.EAdaptiveCyberDefenseDebugMessageTypes type) {
		return this.messageType == type;
	}
	
	public String getArgument(int index) {
		return getArguments()[index];
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + "[" + messageType.name() + ": " + org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.util.AdaptiveCyberDefenseStringUtil.explode(arguments, ", ") + "]";
	}
	
}
