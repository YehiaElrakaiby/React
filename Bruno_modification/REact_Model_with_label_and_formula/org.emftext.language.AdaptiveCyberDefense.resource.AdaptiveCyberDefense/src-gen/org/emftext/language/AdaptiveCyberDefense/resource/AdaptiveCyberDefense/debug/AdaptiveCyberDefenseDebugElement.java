/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug;

public abstract class AdaptiveCyberDefenseDebugElement extends org.eclipse.debug.core.model.DebugElement {
	
	/**
	 * Constructs a new debug element in the given target.
	 */
	public AdaptiveCyberDefenseDebugElement(org.eclipse.debug.core.model.IDebugTarget target) {
		super(target);
	}
	
	public String getModelIdentifier() {
		return org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefensePlugin.DEBUG_MODEL_ID;
	}
	
	/**
	 * Returns the breakpoint manager.
	 * 
	 * @return the breakpoint manager
	 */
	protected org.eclipse.debug.core.IBreakpointManager getBreakpointManager() {
		return org.eclipse.debug.core.DebugPlugin.getDefault().getBreakpointManager();
	}
	
}