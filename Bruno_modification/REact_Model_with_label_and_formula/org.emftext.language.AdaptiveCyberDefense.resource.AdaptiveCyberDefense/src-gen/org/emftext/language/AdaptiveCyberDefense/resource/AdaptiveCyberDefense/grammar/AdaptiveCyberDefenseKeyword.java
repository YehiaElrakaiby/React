/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class AdaptiveCyberDefenseKeyword extends org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseSyntaxElement {
	
	private final String value;
	
	public AdaptiveCyberDefenseKeyword(String value, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseCardinality cardinality) {
		super(cardinality, null);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
	
}
