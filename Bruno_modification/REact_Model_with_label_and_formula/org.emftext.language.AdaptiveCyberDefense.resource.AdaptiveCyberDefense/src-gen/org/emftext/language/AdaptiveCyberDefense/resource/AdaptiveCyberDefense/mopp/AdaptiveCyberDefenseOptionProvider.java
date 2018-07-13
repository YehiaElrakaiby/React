/**
 * <copyright>
 * </copyright>
 *
 * 
 */
/**
 * This class can be used to configure options that must be used when resources
 * are loaded. This is similar to using the extension point
 * 'org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.default
 * _load_options' with the difference that the options defined in this class are
 * used even if no Eclipse platform is running.
 */
package org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp;

public class AdaptiveCyberDefenseOptionProvider implements org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseOptionProvider {
	
	public java.util.Map<?,?> getOptions() {
		// create a map with static option providers here
		return java.util.Collections.emptyMap();
	}
	
}
