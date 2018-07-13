/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.analysis;

public class StateAtomState_variableReferenceResolver implements org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseReferenceResolver<org.emftext.language.AdaptiveCyberDefense.StateAtom, org.emftext.language.AdaptiveCyberDefense.StateVariable> {
	
	private org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.analysis.AdaptiveCyberDefenseDefaultResolverDelegate<org.emftext.language.AdaptiveCyberDefense.StateAtom, org.emftext.language.AdaptiveCyberDefense.StateVariable> delegate = new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.analysis.AdaptiveCyberDefenseDefaultResolverDelegate<org.emftext.language.AdaptiveCyberDefense.StateAtom, org.emftext.language.AdaptiveCyberDefense.StateVariable>();
	
	public void resolve(String identifier, org.emftext.language.AdaptiveCyberDefense.StateAtom container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseReferenceResolveResult<org.emftext.language.AdaptiveCyberDefense.StateVariable> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(org.emftext.language.AdaptiveCyberDefense.StateVariable element, org.emftext.language.AdaptiveCyberDefense.StateAtom container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
