/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.util;

/**
 * Class AdaptiveCyberDefenseTextResourceUtil can be used to perform common tasks
 * on text resources, such as loading and saving resources, as well as, checking
 * them for errors. This class is deprecated and has been replaced by
 * org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.util.Ada
 * ptiveCyberDefenseResourceUtil.
 */
public class AdaptiveCyberDefenseTextResourceUtil {
	
	/**
	 * Use
	 * org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.util.Ada
	 * ptiveCyberDefenseResourceUtil.getResource() instead.
	 */
	@Deprecated	
	public static org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseResource getResource(org.eclipse.core.resources.IFile file) {
		return new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.util.AdaptiveCyberDefenseEclipseProxy().getResource(file);
	}
	
	/**
	 * Use
	 * org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.util.Ada
	 * ptiveCyberDefenseResourceUtil.getResource() instead.
	 */
	@Deprecated	
	public static org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.util.AdaptiveCyberDefenseResourceUtil.getResource(file, options);
	}
	
	/**
	 * Use
	 * org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.util.Ada
	 * ptiveCyberDefenseResourceUtil.getResource() instead.
	 */
	@Deprecated	
	public static org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseResource getResource(org.eclipse.emf.common.util.URI uri) {
		return org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.util.AdaptiveCyberDefenseResourceUtil.getResource(uri);
	}
	
	/**
	 * Use
	 * org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.util.Ada
	 * ptiveCyberDefenseResourceUtil.getResource() instead.
	 */
	@Deprecated	
	public static org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.util.AdaptiveCyberDefenseResourceUtil.getResource(uri, options);
	}
	
}
