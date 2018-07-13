/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp;

/**
 * A basic implementation of the
 * org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiv
 * eCyberDefenseElementMapping interface.
 * 
 * @param <ReferenceType> the type of the reference that can be mapped to
 */
public class AdaptiveCyberDefenseElementMapping<ReferenceType> implements org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseElementMapping<ReferenceType> {
	
	private final ReferenceType target;
	private String identifier;
	private String warning;
	
	public AdaptiveCyberDefenseElementMapping(String identifier, ReferenceType target, String warning) {
		super();
		this.target = target;
		this.identifier = identifier;
		this.warning = warning;
	}
	
	public ReferenceType getTargetElement() {
		return target;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public String getWarning() {
		return warning;
	}
	
}
