/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class AdaptiveCyberDefenseRule extends org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public AdaptiveCyberDefenseRule(org.eclipse.emf.ecore.EClass metaclass, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseChoice choice, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseCardinality cardinality) {
		super(cardinality, new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseChoice getDefinition() {
		return (org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseChoice) getChildren()[0];
	}
	
}

