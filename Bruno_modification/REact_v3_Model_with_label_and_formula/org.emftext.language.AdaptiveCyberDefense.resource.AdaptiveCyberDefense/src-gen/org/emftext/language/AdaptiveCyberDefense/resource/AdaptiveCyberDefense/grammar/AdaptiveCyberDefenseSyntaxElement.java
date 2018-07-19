/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class AdaptiveCyberDefenseSyntaxElement {
	
	private AdaptiveCyberDefenseSyntaxElement[] children;
	private AdaptiveCyberDefenseSyntaxElement parent;
	private org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseCardinality cardinality;
	
	public AdaptiveCyberDefenseSyntaxElement(org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseCardinality cardinality, AdaptiveCyberDefenseSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (AdaptiveCyberDefenseSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	/**
	 * Sets the parent of this syntax element. This method must be invoked at most
	 * once.
	 */
	public void setParent(AdaptiveCyberDefenseSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	/**
	 * Returns the parent of this syntax element. This parent is determined by the
	 * containment hierarchy in the CS model.
	 */
	public AdaptiveCyberDefenseSyntaxElement getParent() {
		return parent;
	}
	
	public AdaptiveCyberDefenseSyntaxElement[] getChildren() {
		if (children == null) {
			return new AdaptiveCyberDefenseSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseCardinality getCardinality() {
		return cardinality;
	}
	
}
