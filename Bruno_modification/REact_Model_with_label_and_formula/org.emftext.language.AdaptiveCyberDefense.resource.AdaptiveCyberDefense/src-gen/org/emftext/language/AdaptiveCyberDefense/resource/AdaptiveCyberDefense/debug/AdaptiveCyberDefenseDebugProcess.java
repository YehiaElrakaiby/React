/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug;

public class AdaptiveCyberDefenseDebugProcess extends org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.AdaptiveCyberDefenseDebugElement implements org.eclipse.debug.core.model.IProcess, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.IAdaptiveCyberDefenseDebugEventListener {
	
	private org.eclipse.debug.core.ILaunch launch;
	
	private boolean terminated = false;
	
	public AdaptiveCyberDefenseDebugProcess(org.eclipse.debug.core.ILaunch launch) {
		super(launch.getDebugTarget());
		this.launch = launch;
	}
	
	public boolean canTerminate() {
		return !terminated;
	}
	
	public boolean isTerminated() {
		return terminated;
	}
	
	public void terminate() throws org.eclipse.debug.core.DebugException {
		terminated = true;
	}
	
	public String getLabel() {
		return null;
	}
	
	public org.eclipse.debug.core.ILaunch getLaunch() {
		return launch;
	}
	
	public org.eclipse.debug.core.model.IStreamsProxy getStreamsProxy() {
		return null;
	}
	
	public void setAttribute(String key, String value) {
	}
	
	public String getAttribute(String key) {
		return null;
	}
	
	public int getExitValue() throws org.eclipse.debug.core.DebugException {
		return 0;
	}
	
	public void handleMessage(org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.AdaptiveCyberDefenseDebugMessage message) {
		if (message.hasType(org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.EAdaptiveCyberDefenseDebugMessageTypes.TERMINATED)) {
			terminated = true;
		} else {
			// ignore other events
		}
	}
	
}
