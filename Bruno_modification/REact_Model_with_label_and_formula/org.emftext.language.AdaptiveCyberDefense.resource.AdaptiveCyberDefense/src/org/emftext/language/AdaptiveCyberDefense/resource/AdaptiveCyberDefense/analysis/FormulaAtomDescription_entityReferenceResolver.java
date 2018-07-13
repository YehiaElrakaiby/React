/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.analysis;

public class FormulaAtomDescription_entityReferenceResolver implements org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseReferenceResolver<org.emftext.language.AdaptiveCyberDefense.FormulaAtom, org.emftext.language.AdaptiveCyberDefense.DescriptionEntity> {
	
	private org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.analysis.AdaptiveCyberDefenseDefaultResolverDelegate<org.emftext.language.AdaptiveCyberDefense.FormulaAtom, org.emftext.language.AdaptiveCyberDefense.DescriptionEntity> delegate = new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.analysis.AdaptiveCyberDefenseDefaultResolverDelegate<org.emftext.language.AdaptiveCyberDefense.FormulaAtom, org.emftext.language.AdaptiveCyberDefense.DescriptionEntity>();
	
	public void resolve(String identifier, org.emftext.language.AdaptiveCyberDefense.FormulaAtom container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseReferenceResolveResult<org.emftext.language.AdaptiveCyberDefense.DescriptionEntity> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(org.emftext.language.AdaptiveCyberDefense.DescriptionEntity element, org.emftext.language.AdaptiveCyberDefense.FormulaAtom container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
