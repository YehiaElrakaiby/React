/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar;

public class AdaptiveCyberDefenseSequence extends org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseSyntaxElement {
	
	public AdaptiveCyberDefenseSequence(org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseCardinality cardinality, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.util.AdaptiveCyberDefenseStringUtil.explode(getChildren(), " ");
	}
	
}
