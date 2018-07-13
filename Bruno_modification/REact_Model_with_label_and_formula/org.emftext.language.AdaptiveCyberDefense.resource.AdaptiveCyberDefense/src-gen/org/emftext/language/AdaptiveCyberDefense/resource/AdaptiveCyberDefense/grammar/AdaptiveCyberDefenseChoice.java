/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar;

public class AdaptiveCyberDefenseChoice extends org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseSyntaxElement {
	
	public AdaptiveCyberDefenseChoice(org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseCardinality cardinality, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.util.AdaptiveCyberDefenseStringUtil.explode(getChildren(), "|");
	}
	
}
