/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar;

/**
 * A class to represent boolean terminals in a grammar.
 */
public class AdaptiveCyberDefenseBooleanTerminal extends org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseTerminal {
	
	private String trueLiteral;
	private String falseLiteral;
	
	public AdaptiveCyberDefenseBooleanTerminal(org.eclipse.emf.ecore.EStructuralFeature attribute, String trueLiteral, String falseLiteral, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseCardinality cardinality, int mandatoryOccurrencesAfter) {
		super(attribute, cardinality, mandatoryOccurrencesAfter);
		assert attribute instanceof org.eclipse.emf.ecore.EAttribute;
		this.trueLiteral = trueLiteral;
		this.falseLiteral = falseLiteral;
	}
	
	public String getTrueLiteral() {
		return trueLiteral;
	}
	
	public String getFalseLiteral() {
		return falseLiteral;
	}
	
	public org.eclipse.emf.ecore.EAttribute getAttribute() {
		return (org.eclipse.emf.ecore.EAttribute) getFeature();
	}
	
}
