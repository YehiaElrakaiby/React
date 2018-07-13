/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface IAdaptiveCyberDefenseCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
