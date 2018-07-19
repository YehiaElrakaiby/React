/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp;

public class AdaptiveCyberDefenseReferenceResolverSwitch implements org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseReferenceResolverSwitch {
	
	/**
	 * This map stores a copy of the options the were set for loading the resource.
	 */
	private java.util.Map<Object, Object> options;
	
	protected org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.analysis.FormulaAtomDescription_entityReferenceResolver formulaAtomDescription_entityReferenceResolver = new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.analysis.FormulaAtomDescription_entityReferenceResolver();
	protected org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.analysis.StateAtomState_variableReferenceResolver stateAtomState_variableReferenceResolver = new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.analysis.StateAtomState_variableReferenceResolver();
	protected org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.analysis.InitialAtomInitialvariableReferenceResolver initialAtomInitialvariableReferenceResolver = new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.analysis.InitialAtomInitialvariableReferenceResolver();
	protected org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.analysis.LabelReferenceLabelReferenceResolver labelReferenceLabelReferenceResolver = new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.analysis.LabelReferenceLabelReferenceResolver();
	
	public org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseReferenceResolver<org.emftext.language.AdaptiveCyberDefense.FormulaAtom, org.emftext.language.AdaptiveCyberDefense.DescriptionEntity> getFormulaAtomDescription_entityReferenceResolver() {
		return getResolverChain(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getFormulaAtom_Description_entity(), formulaAtomDescription_entityReferenceResolver);
	}
	
	public org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseReferenceResolver<org.emftext.language.AdaptiveCyberDefense.StateAtom, org.emftext.language.AdaptiveCyberDefense.StateVariable> getStateAtomState_variableReferenceResolver() {
		return getResolverChain(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getStateAtom_State_variable(), stateAtomState_variableReferenceResolver);
	}
	
	public org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseReferenceResolver<org.emftext.language.AdaptiveCyberDefense.InitialAtom, org.emftext.language.AdaptiveCyberDefense.InitialVariable> getInitialAtomInitialvariableReferenceResolver() {
		return getResolverChain(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getInitialAtom_Initialvariable(), initialAtomInitialvariableReferenceResolver);
	}
	
	public org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseReferenceResolver<org.emftext.language.AdaptiveCyberDefense.LabelReference, org.emftext.language.AdaptiveCyberDefense.Label> getLabelReferenceLabelReferenceResolver() {
		return getResolverChain(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getLabelReference_Label(), labelReferenceLabelReferenceResolver);
	}
	
	public void setOptions(java.util.Map<?, ?> options) {
		if (options != null) {
			this.options = new java.util.LinkedHashMap<Object, Object>();
			this.options.putAll(options);
		}
		formulaAtomDescription_entityReferenceResolver.setOptions(options);
		stateAtomState_variableReferenceResolver.setOptions(options);
		initialAtomInitialvariableReferenceResolver.setOptions(options);
		labelReferenceLabelReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
		if (org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getFormulaAtom().isInstance(container)) {
			AdaptiveCyberDefenseFuzzyResolveResult<org.emftext.language.AdaptiveCyberDefense.DescriptionEntity> frr = new AdaptiveCyberDefenseFuzzyResolveResult<org.emftext.language.AdaptiveCyberDefense.DescriptionEntity>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("description_entity")) {
				formulaAtomDescription_entityReferenceResolver.resolve(identifier, (org.emftext.language.AdaptiveCyberDefense.FormulaAtom) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getStateAtom().isInstance(container)) {
			AdaptiveCyberDefenseFuzzyResolveResult<org.emftext.language.AdaptiveCyberDefense.StateVariable> frr = new AdaptiveCyberDefenseFuzzyResolveResult<org.emftext.language.AdaptiveCyberDefense.StateVariable>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("state_variable")) {
				stateAtomState_variableReferenceResolver.resolve(identifier, (org.emftext.language.AdaptiveCyberDefense.StateAtom) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getInitialAtom().isInstance(container)) {
			AdaptiveCyberDefenseFuzzyResolveResult<org.emftext.language.AdaptiveCyberDefense.InitialVariable> frr = new AdaptiveCyberDefenseFuzzyResolveResult<org.emftext.language.AdaptiveCyberDefense.InitialVariable>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("initialvariable")) {
				initialAtomInitialvariableReferenceResolver.resolve(identifier, (org.emftext.language.AdaptiveCyberDefense.InitialAtom) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getLabelReference().isInstance(container)) {
			AdaptiveCyberDefenseFuzzyResolveResult<org.emftext.language.AdaptiveCyberDefense.Label> frr = new AdaptiveCyberDefenseFuzzyResolveResult<org.emftext.language.AdaptiveCyberDefense.Label>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("label")) {
				labelReferenceLabelReferenceResolver.resolve(identifier, (org.emftext.language.AdaptiveCyberDefense.LabelReference) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
	
	public org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		if (reference == org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getFormulaAtom_Description_entity()) {
			return getResolverChain(reference, formulaAtomDescription_entityReferenceResolver);
		}
		if (reference == org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getStateAtom_State_variable()) {
			return getResolverChain(reference, stateAtomState_variableReferenceResolver);
		}
		if (reference == org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getInitialAtom_Initialvariable()) {
			return getResolverChain(reference, initialAtomInitialvariableReferenceResolver);
		}
		if (reference == org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getLabelReference_Label()) {
			return getResolverChain(reference, labelReferenceLabelReferenceResolver);
		}
		return null;
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})	
	public <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseReferenceResolver<ContainerType, ReferenceType> getResolverChain(org.eclipse.emf.ecore.EStructuralFeature reference, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseReferenceResolver<ContainerType, ReferenceType> originalResolver) {
		if (options == null) {
			return originalResolver;
		}
		Object value = options.get(org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseOptions.ADDITIONAL_REFERENCE_RESOLVERS);
		if (value == null) {
			return originalResolver;
		}
		if (!(value instanceof java.util.Map)) {
			// send this to the error log
			new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.util.AdaptiveCyberDefenseRuntimeUtil().logWarning("Found value with invalid type for option " + org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + java.util.Map.class.getName() + ", but was " + value.getClass().getName() + ")", null);
			return originalResolver;
		}
		java.util.Map<?,?> resolverMap = (java.util.Map<?,?>) value;
		Object resolverValue = resolverMap.get(reference);
		if (resolverValue == null) {
			return originalResolver;
		}
		if (resolverValue instanceof org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseReferenceResolver) {
			org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseReferenceResolver replacingResolver = (org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseReferenceResolver) resolverValue;
			if (replacingResolver instanceof org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseDelegatingReferenceResolver) {
				// pass original resolver to the replacing one
				((org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseDelegatingReferenceResolver) replacingResolver).setDelegate(originalResolver);
			}
			return replacingResolver;
		} else if (resolverValue instanceof java.util.Collection) {
			java.util.Collection replacingResolvers = (java.util.Collection) resolverValue;
			org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseReferenceResolver replacingResolver = originalResolver;
			for (Object next : replacingResolvers) {
				if (next instanceof org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseReferenceCache) {
					org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseReferenceResolver nextResolver = (org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseReferenceResolver) next;
					if (nextResolver instanceof org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseDelegatingReferenceResolver) {
						// pass original resolver to the replacing one
						((org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseDelegatingReferenceResolver) nextResolver).setDelegate(replacingResolver);
					}
					replacingResolver = nextResolver;
				} else {
					// The collection contains a non-resolver. Send a warning to the error log.
					new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.util.AdaptiveCyberDefenseRuntimeUtil().logWarning("Found value with invalid type in value map for option " + org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseDelegatingReferenceResolver.class.getName() + ", but was " + next.getClass().getName() + ")", null);
				}
			}
			return replacingResolver;
		} else {
			// The value for the option ADDITIONAL_REFERENCE_RESOLVERS has an unknown type.
			new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.util.AdaptiveCyberDefenseRuntimeUtil().logWarning("Found value with invalid type in value map for option " + org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseDelegatingReferenceResolver.class.getName() + ", but was " + resolverValue.getClass().getName() + ")", null);
			return originalResolver;
		}
	}
	
}
