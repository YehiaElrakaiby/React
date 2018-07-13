/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.ui;

public class AdaptiveCyberDefenseUIMetaInformation extends org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseMetaInformation {
	
	public org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseHoverTextProvider getHoverTextProvider() {
		return new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.ui.AdaptiveCyberDefenseHoverTextProvider();
	}
	
	public org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.ui.AdaptiveCyberDefenseImageProvider getImageProvider() {
		return org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.ui.AdaptiveCyberDefenseImageProvider.INSTANCE;
	}
	
	public org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.ui.AdaptiveCyberDefenseColorManager createColorManager() {
		return new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.ui.AdaptiveCyberDefenseColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCy
	 * berDefense.IAdaptiveCyberDefenseTextResource,
	 * org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.ui.Adapt
	 * iveCyberDefenseColorManager) instead.
	 */
	public org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.ui.AdaptiveCyberDefenseTokenScanner createTokenScanner(org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.ui.AdaptiveCyberDefenseColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.ui.AdaptiveCyberDefenseTokenScanner createTokenScanner(org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTextResource resource, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.ui.AdaptiveCyberDefenseColorManager colorManager) {
		return new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.ui.AdaptiveCyberDefenseTokenScanner(resource, colorManager);
	}
	
	public org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.ui.AdaptiveCyberDefenseCodeCompletionHelper createCodeCompletionHelper() {
		return new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.ui.AdaptiveCyberDefenseCodeCompletionHelper();
	}
	
}
