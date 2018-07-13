/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp;

public class AdaptiveCyberDefensePrinter implements org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTextPrinter {
	
	protected org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolverFactory tokenResolverFactory = new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTokenResolverFactory();
	
	protected java.io.OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTextResource resource;
	
	private java.util.Map<?, ?> options;
	private String encoding = System.getProperty("file.encoding");
	
	public AdaptiveCyberDefensePrinter(java.io.OutputStream outputStream, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	protected int matchCount(java.util.Map<String, Integer> featureCounter, java.util.Collection<String> needed) {
		int pos = 0;
		int neg = 0;
		
		for (String featureName : featureCounter.keySet()) {
			if (needed.contains(featureName)) {
				int value = featureCounter.get(featureName);
				if (value == 0) {
					neg += 1;
				} else {
					pos += 1;
				}
			}
		}
		return neg > 0 ? -neg : pos;
	}
	
	protected void doPrint(org.eclipse.emf.ecore.EObject element, java.io.PrintWriter out, String globaltab) {
		if (element == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write.");
		}
		if (out == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.DomainDescription) {
			print_org_emftext_language_AdaptiveCyberDefense_DomainDescription((org.emftext.language.AdaptiveCyberDefense.DomainDescription) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.StateVariable) {
			print_org_emftext_language_AdaptiveCyberDefense_StateVariable((org.emftext.language.AdaptiveCyberDefense.StateVariable) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.ActionDescription) {
			print_org_emftext_language_AdaptiveCyberDefense_ActionDescription((org.emftext.language.AdaptiveCyberDefense.ActionDescription) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.EventDescription) {
			print_org_emftext_language_AdaptiveCyberDefense_EventDescription((org.emftext.language.AdaptiveCyberDefense.EventDescription) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.ProbabilisticContextualEffect) {
			print_org_emftext_language_AdaptiveCyberDefense_ProbabilisticContextualEffect((org.emftext.language.AdaptiveCyberDefense.ProbabilisticContextualEffect) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.ContextualEffect) {
			print_org_emftext_language_AdaptiveCyberDefense_ContextualEffect((org.emftext.language.AdaptiveCyberDefense.ContextualEffect) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.UA) {
			print_org_emftext_language_AdaptiveCyberDefense_UA((org.emftext.language.AdaptiveCyberDefense.UA) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.CA) {
			print_org_emftext_language_AdaptiveCyberDefense_CA((org.emftext.language.AdaptiveCyberDefense.CA) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.DEA) {
			print_org_emftext_language_AdaptiveCyberDefense_DEA((org.emftext.language.AdaptiveCyberDefense.DEA) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.DFA) {
			print_org_emftext_language_AdaptiveCyberDefense_DFA((org.emftext.language.AdaptiveCyberDefense.DFA) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.UM) {
			print_org_emftext_language_AdaptiveCyberDefense_UM((org.emftext.language.AdaptiveCyberDefense.UM) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.CM) {
			print_org_emftext_language_AdaptiveCyberDefense_CM((org.emftext.language.AdaptiveCyberDefense.CM) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.DEM) {
			print_org_emftext_language_AdaptiveCyberDefense_DEM((org.emftext.language.AdaptiveCyberDefense.DEM) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.DFM) {
			print_org_emftext_language_AdaptiveCyberDefense_DFM((org.emftext.language.AdaptiveCyberDefense.DFM) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.PM) {
			print_org_emftext_language_AdaptiveCyberDefense_PM((org.emftext.language.AdaptiveCyberDefense.PM) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.RPM) {
			print_org_emftext_language_AdaptiveCyberDefense_RPM((org.emftext.language.AdaptiveCyberDefense.RPM) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.PDEM) {
			print_org_emftext_language_AdaptiveCyberDefense_PDEM((org.emftext.language.AdaptiveCyberDefense.PDEM) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.RPDEM) {
			print_org_emftext_language_AdaptiveCyberDefense_RPDEM((org.emftext.language.AdaptiveCyberDefense.RPDEM) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.PDFM) {
			print_org_emftext_language_AdaptiveCyberDefense_PDFM((org.emftext.language.AdaptiveCyberDefense.PDFM) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.RPDFM) {
			print_org_emftext_language_AdaptiveCyberDefense_RPDFM((org.emftext.language.AdaptiveCyberDefense.RPDFM) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect) {
			print_org_emftext_language_AdaptiveCyberDefense_ProbabilisticEffect((org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.Conjunction) {
			print_org_emftext_language_AdaptiveCyberDefense_Conjunction((org.emftext.language.AdaptiveCyberDefense.Conjunction) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.Disjunction) {
			print_org_emftext_language_AdaptiveCyberDefense_Disjunction((org.emftext.language.AdaptiveCyberDefense.Disjunction) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.Negation) {
			print_org_emftext_language_AdaptiveCyberDefense_Negation((org.emftext.language.AdaptiveCyberDefense.Negation) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.Parentheses) {
			print_org_emftext_language_AdaptiveCyberDefense_Parentheses((org.emftext.language.AdaptiveCyberDefense.Parentheses) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.FormulaAtom) {
			print_org_emftext_language_AdaptiveCyberDefense_FormulaAtom((org.emftext.language.AdaptiveCyberDefense.FormulaAtom) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.True) {
			print_org_emftext_language_AdaptiveCyberDefense_True((org.emftext.language.AdaptiveCyberDefense.True) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.False) {
			print_org_emftext_language_AdaptiveCyberDefense_False((org.emftext.language.AdaptiveCyberDefense.False) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.StateAtom) {
			print_org_emftext_language_AdaptiveCyberDefense_StateAtom((org.emftext.language.AdaptiveCyberDefense.StateAtom) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.InitialAtom) {
			print_org_emftext_language_AdaptiveCyberDefense_InitialAtom((org.emftext.language.AdaptiveCyberDefense.InitialAtom) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.Label) {
			print_org_emftext_language_AdaptiveCyberDefense_Label((org.emftext.language.AdaptiveCyberDefense.Label) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.PConjunction) {
			print_org_emftext_language_AdaptiveCyberDefense_PConjunction((org.emftext.language.AdaptiveCyberDefense.PConjunction) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.PDisjunction) {
			print_org_emftext_language_AdaptiveCyberDefense_PDisjunction((org.emftext.language.AdaptiveCyberDefense.PDisjunction) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.PNegation) {
			print_org_emftext_language_AdaptiveCyberDefense_PNegation((org.emftext.language.AdaptiveCyberDefense.PNegation) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.LabelReference) {
			print_org_emftext_language_AdaptiveCyberDefense_LabelReference((org.emftext.language.AdaptiveCyberDefense.LabelReference) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.POperator) {
			print_org_emftext_language_AdaptiveCyberDefense_POperator((org.emftext.language.AdaptiveCyberDefense.POperator) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.Until) {
			print_org_emftext_language_AdaptiveCyberDefense_Until((org.emftext.language.AdaptiveCyberDefense.Until) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.BoundedUntil) {
			print_org_emftext_language_AdaptiveCyberDefense_BoundedUntil((org.emftext.language.AdaptiveCyberDefense.BoundedUntil) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.Eventually) {
			print_org_emftext_language_AdaptiveCyberDefense_Eventually((org.emftext.language.AdaptiveCyberDefense.Eventually) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.BoundedEventually) {
			print_org_emftext_language_AdaptiveCyberDefense_BoundedEventually((org.emftext.language.AdaptiveCyberDefense.BoundedEventually) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.Globally) {
			print_org_emftext_language_AdaptiveCyberDefense_Globally((org.emftext.language.AdaptiveCyberDefense.Globally) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.PTrue) {
			print_org_emftext_language_AdaptiveCyberDefense_PTrue((org.emftext.language.AdaptiveCyberDefense.PTrue) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.AdaptiveCyberDefense.PFalse) {
			print_org_emftext_language_AdaptiveCyberDefense_PFalse((org.emftext.language.AdaptiveCyberDefense.PFalse) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseReferenceResolverSwitch getReferenceResolverSwitch() {
		return (org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseReferenceResolverSwitch) new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseProblem(errorMessage, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.AdaptiveCyberDefenseEProblemType.PRINT_PROBLEM, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.AdaptiveCyberDefenseEProblemSeverity.WARNING), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public void setEncoding(String encoding) {
		if (encoding != null) {
			this.encoding = encoding;
		}
	}
	
	public String getEncoding() {
		return encoding;
	}
	
	public org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTextResource getResource() {
		return resource;
	}
	
	/**
	 * Calls {@link #doPrint(EObject, PrintWriter, String)} and writes the result to
	 * the underlying output stream.
	 */
	public void print(org.eclipse.emf.ecore.EObject element) throws java.io.IOException {
		java.io.PrintWriter out = new java.io.PrintWriter(new java.io.OutputStreamWriter(new java.io.BufferedOutputStream(outputStream), encoding));
		doPrint(element, out, "");
		out.flush();
		out.close();
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_DomainDescription(org.emftext.language.AdaptiveCyberDefense.DomainDescription element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__STATE_VARIABLES));
		printCountingMap.put("state_variables", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__ACTION_DESCRIPTIONS));
		printCountingMap.put("action_descriptions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__REQUIREMENTS));
		printCountingMap.put("requirements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__INITIAL_ATOMS));
		printCountingMap.put("initial_atoms", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__EVENT_DESCRIPTIONS));
		printCountingMap.put("event_descriptions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__LABELS));
		printCountingMap.put("labels", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__PROPERTIES));
		printCountingMap.put("properties", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("DomainDescription");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__NAME));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("StateVariables");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("<");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_emftext_language_AdaptiveCyberDefense_DomainDescription_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(">");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("Label");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("<");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_emftext_language_AdaptiveCyberDefense_DomainDescription_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(">");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("Properties");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("<");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_emftext_language_AdaptiveCyberDefense_DomainDescription_2(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(">");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("ActionDescriptions");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("<");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_emftext_language_AdaptiveCyberDefense_DomainDescription_3(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(">");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("EventDescriptions");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("<");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_emftext_language_AdaptiveCyberDefense_DomainDescription_4(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(">");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("Requirements");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("<");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_emftext_language_AdaptiveCyberDefense_DomainDescription_5(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(">");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("CurrentState");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("<");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("initial_atoms");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__INITIAL_ATOMS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("initial_atoms", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_emftext_language_AdaptiveCyberDefense_DomainDescription_6(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(">");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_DomainDescription_0(org.emftext.language.AdaptiveCyberDefense.DomainDescription element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("state_variables");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__STATE_VARIABLES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("state_variables", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_DomainDescription_1(org.emftext.language.AdaptiveCyberDefense.DomainDescription element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("labels");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__LABELS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("labels", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_DomainDescription_2(org.emftext.language.AdaptiveCyberDefense.DomainDescription element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("properties");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__PROPERTIES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("properties", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_DomainDescription_3(org.emftext.language.AdaptiveCyberDefense.DomainDescription element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("action_descriptions");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__ACTION_DESCRIPTIONS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("action_descriptions", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_DomainDescription_4(org.emftext.language.AdaptiveCyberDefense.DomainDescription element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("event_descriptions");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__EVENT_DESCRIPTIONS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("event_descriptions", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_DomainDescription_5(org.emftext.language.AdaptiveCyberDefense.DomainDescription element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("requirements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__REQUIREMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("requirements", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_DomainDescription_6(org.emftext.language.AdaptiveCyberDefense.DomainDescription element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("initial_atoms");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__INITIAL_ATOMS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("initial_atoms", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_StateVariable(org.emftext.language.AdaptiveCyberDefense.StateVariable element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.STATE_VARIABLE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.STATE_VARIABLE__VALUES));
		printCountingMap.put("values", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Variable");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.STATE_VARIABLE__NAME));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.STATE_VARIABLE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("domain");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("values");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.STATE_VARIABLE__VALUES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.STATE_VARIABLE__VALUES), element));
				out.print(" ");
			}
			printCountingMap.put("values", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_emftext_language_AdaptiveCyberDefense_StateVariable_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_StateVariable_0(org.emftext.language.AdaptiveCyberDefense.StateVariable element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("values");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.STATE_VARIABLE__VALUES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.STATE_VARIABLE__VALUES), element));
				out.print(" ");
			}
			printCountingMap.put("values", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_ActionDescription(org.emftext.language.AdaptiveCyberDefense.ActionDescription element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__COST));
		printCountingMap.put("cost", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__CONTEXTUAL_EFFECTS));
		printCountingMap.put("contextual_effects", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Action");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__NAME));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_AdaptiveCyberDefense_ActionDescription_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("contextual_effects");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__CONTEXTUAL_EFFECTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("contextual_effects", 0);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_AdaptiveCyberDefense_ActionDescription_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_ActionDescription_0(org.emftext.language.AdaptiveCyberDefense.ActionDescription element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__VALUE));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_ActionDescription_1(org.emftext.language.AdaptiveCyberDefense.ActionDescription element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("cost");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("cost");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__COST));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("FLOAT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__COST), element));
				out.print(" ");
			}
			printCountingMap.put("cost", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_EventDescription(org.emftext.language.AdaptiveCyberDefense.EventDescription element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__PROBABILISTIC_CONTEXTUAL_EFFECTS));
		printCountingMap.put("probabilistic_contextual_effects", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Event");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__NAME));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_AdaptiveCyberDefense_EventDescription_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("probabilistic_contextual_effects");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__PROBABILISTIC_CONTEXTUAL_EFFECTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("probabilistic_contextual_effects", 0);
		}
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_EventDescription_0(org.emftext.language.AdaptiveCyberDefense.EventDescription element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__VALUE));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_ProbabilisticContextualEffect(org.emftext.language.AdaptiveCyberDefense.ProbabilisticContextualEffect element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PROBABILISTIC_CONTEXTUAL_EFFECT__CONTEXT));
		printCountingMap.put("context", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PROBABILISTIC_CONTEXTUAL_EFFECT__EFFECTS));
		printCountingMap.put("effects", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PROBABILISTIC_CONTEXTUAL_EFFECT__OCCURRENCE_PROBABILITY));
		printCountingMap.put("occurrence_probability", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("if");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("context");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PROBABILISTIC_CONTEXTUAL_EFFECT__CONTEXT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("context", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_AdaptiveCyberDefense_ProbabilisticContextualEffect_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("effects");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("effects");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PROBABILISTIC_CONTEXTUAL_EFFECT__EFFECTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("effects", 0);
		}
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_ProbabilisticContextualEffect_0(org.emftext.language.AdaptiveCyberDefense.ProbabilisticContextualEffect element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("occurrence probability");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("occurrence_probability");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PROBABILISTIC_CONTEXTUAL_EFFECT__OCCURRENCE_PROBABILITY));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("FLOAT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PROBABILISTIC_CONTEXTUAL_EFFECT__OCCURRENCE_PROBABILITY), element));
				out.print(" ");
			}
			printCountingMap.put("occurrence_probability", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_ContextualEffect(org.emftext.language.AdaptiveCyberDefense.ContextualEffect element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CONTEXTUAL_EFFECT__CONTEXT));
		printCountingMap.put("context", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CONTEXTUAL_EFFECT__EFFECTS));
		printCountingMap.put("effects", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("if");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("context");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CONTEXTUAL_EFFECT__CONTEXT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("context", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("effects");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("effects");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CONTEXTUAL_EFFECT__EFFECTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("effects", 0);
		}
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_UA(org.emftext.language.AdaptiveCyberDefense.UA element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UA__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UA__REWARD));
		printCountingMap.put("reward", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UA__CONDITION));
		printCountingMap.put("condition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UA__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("ReqID");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UA__NAME));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UA__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("achieve");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("condition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UA__CONDITION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("condition", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("reward");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("reward");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UA__REWARD));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UA__REWARD), element));
				out.print(" ");
			}
			printCountingMap.put("reward", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_AdaptiveCyberDefense_UA_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_UA_0(org.emftext.language.AdaptiveCyberDefense.UA element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("description");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("description");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UA__DESCRIPTION));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UA__DESCRIPTION), element));
				out.print(" ");
			}
			printCountingMap.put("description", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_CA(org.emftext.language.AdaptiveCyberDefense.CA element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CA__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CA__REWARD));
		printCountingMap.put("reward", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CA__CONDITION));
		printCountingMap.put("condition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CA__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CA__ACTIVATION));
		printCountingMap.put("activation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CA__CANCELLATION));
		printCountingMap.put("cancellation", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("ReqID");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CA__NAME));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CA__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("achieve");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("condition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CA__CONDITION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("condition", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("if");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("activation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CA__ACTIVATION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("activation", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_AdaptiveCyberDefense_CA_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("reward");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("reward");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CA__REWARD));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CA__REWARD), element));
				out.print(" ");
			}
			printCountingMap.put("reward", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_AdaptiveCyberDefense_CA_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_CA_0(org.emftext.language.AdaptiveCyberDefense.CA element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("unless");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("cancellation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CA__CANCELLATION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("cancellation", count - 1);
		}
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_CA_1(org.emftext.language.AdaptiveCyberDefense.CA element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("description");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("description");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CA__DESCRIPTION));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CA__DESCRIPTION), element));
				out.print(" ");
			}
			printCountingMap.put("description", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_DEA(org.emftext.language.AdaptiveCyberDefense.DEA element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEA__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEA__REWARD));
		printCountingMap.put("reward", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEA__CONDITION));
		printCountingMap.put("condition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEA__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEA__ACTIVATION));
		printCountingMap.put("activation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEA__CANCELLATION));
		printCountingMap.put("cancellation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEA__DEADLINE));
		printCountingMap.put("deadline", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("ReqID");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEA__NAME));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEA__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("achieve");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("condition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEA__CONDITION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("condition", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("after");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("deadline");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEA__DEADLINE));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEA__DEADLINE), element));
				out.print(" ");
			}
			printCountingMap.put("deadline", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("if");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("activation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEA__ACTIVATION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("activation", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_AdaptiveCyberDefense_DEA_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("reward");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("reward");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEA__REWARD));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEA__REWARD), element));
				out.print(" ");
			}
			printCountingMap.put("reward", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_AdaptiveCyberDefense_DEA_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_DEA_0(org.emftext.language.AdaptiveCyberDefense.DEA element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("unless");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("cancellation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEA__CANCELLATION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("cancellation", count - 1);
		}
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_DEA_1(org.emftext.language.AdaptiveCyberDefense.DEA element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("description");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("description");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEA__DESCRIPTION));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEA__DESCRIPTION), element));
				out.print(" ");
			}
			printCountingMap.put("description", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_DFA(org.emftext.language.AdaptiveCyberDefense.DFA element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFA__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFA__REWARD));
		printCountingMap.put("reward", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFA__CONDITION));
		printCountingMap.put("condition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFA__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFA__ACTIVATION));
		printCountingMap.put("activation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFA__CANCELLATION));
		printCountingMap.put("cancellation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFA__DEADLINE));
		printCountingMap.put("deadline", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("ReqID");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFA__NAME));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFA__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("achieve");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("condition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFA__CONDITION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("condition", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("within");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("deadline");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFA__DEADLINE));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFA__DEADLINE), element));
				out.print(" ");
			}
			printCountingMap.put("deadline", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("if");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("activation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFA__ACTIVATION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("activation", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_AdaptiveCyberDefense_DFA_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("reward");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("reward");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFA__REWARD));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFA__REWARD), element));
				out.print(" ");
			}
			printCountingMap.put("reward", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_AdaptiveCyberDefense_DFA_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_DFA_0(org.emftext.language.AdaptiveCyberDefense.DFA element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("unless");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("cancellation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFA__CANCELLATION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("cancellation", count - 1);
		}
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_DFA_1(org.emftext.language.AdaptiveCyberDefense.DFA element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("description");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("description");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFA__DESCRIPTION));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFA__DESCRIPTION), element));
				out.print(" ");
			}
			printCountingMap.put("description", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_UM(org.emftext.language.AdaptiveCyberDefense.UM element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UM__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UM__REWARD));
		printCountingMap.put("reward", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UM__CONDITION));
		printCountingMap.put("condition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UM__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("ReqID");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UM__NAME));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UM__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("maintain");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("condition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UM__CONDITION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("condition", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("reward");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("reward");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UM__REWARD));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UM__REWARD), element));
				out.print(" ");
			}
			printCountingMap.put("reward", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_AdaptiveCyberDefense_UM_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_UM_0(org.emftext.language.AdaptiveCyberDefense.UM element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("description");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("description");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UM__DESCRIPTION));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UM__DESCRIPTION), element));
				out.print(" ");
			}
			printCountingMap.put("description", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_CM(org.emftext.language.AdaptiveCyberDefense.CM element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CM__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CM__REWARD));
		printCountingMap.put("reward", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CM__CONDITION));
		printCountingMap.put("condition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CM__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CM__ACTIVATION));
		printCountingMap.put("activation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CM__CANCELLATION));
		printCountingMap.put("cancellation", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("ReqID");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CM__NAME));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CM__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("maintain");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("condition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CM__CONDITION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("condition", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("if");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("activation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CM__ACTIVATION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("activation", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_AdaptiveCyberDefense_CM_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("reward");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("reward");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CM__REWARD));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CM__REWARD), element));
				out.print(" ");
			}
			printCountingMap.put("reward", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_AdaptiveCyberDefense_CM_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_CM_0(org.emftext.language.AdaptiveCyberDefense.CM element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("unless");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("cancellation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CM__CANCELLATION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("cancellation", count - 1);
		}
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_CM_1(org.emftext.language.AdaptiveCyberDefense.CM element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("description");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("description");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CM__DESCRIPTION));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CM__DESCRIPTION), element));
				out.print(" ");
			}
			printCountingMap.put("description", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_DEM(org.emftext.language.AdaptiveCyberDefense.DEM element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEM__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEM__REWARD));
		printCountingMap.put("reward", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEM__CONDITION));
		printCountingMap.put("condition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEM__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEM__ACTIVATION));
		printCountingMap.put("activation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEM__CANCELLATION));
		printCountingMap.put("cancellation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEM__DEADLINE));
		printCountingMap.put("deadline", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("ReqID");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEM__NAME));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEM__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("maintain");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("condition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEM__CONDITION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("condition", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("after");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("deadline");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEM__DEADLINE));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEM__DEADLINE), element));
				out.print(" ");
			}
			printCountingMap.put("deadline", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("if");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("activation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEM__ACTIVATION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("activation", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_AdaptiveCyberDefense_DEM_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("reward");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("reward");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEM__REWARD));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEM__REWARD), element));
				out.print(" ");
			}
			printCountingMap.put("reward", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_AdaptiveCyberDefense_DEM_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_DEM_0(org.emftext.language.AdaptiveCyberDefense.DEM element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("unless");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("cancellation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEM__CANCELLATION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("cancellation", count - 1);
		}
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_DEM_1(org.emftext.language.AdaptiveCyberDefense.DEM element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("description");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("description");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEM__DESCRIPTION));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEM__DESCRIPTION), element));
				out.print(" ");
			}
			printCountingMap.put("description", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_DFM(org.emftext.language.AdaptiveCyberDefense.DFM element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFM__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFM__REWARD));
		printCountingMap.put("reward", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFM__CONDITION));
		printCountingMap.put("condition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFM__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFM__ACTIVATION));
		printCountingMap.put("activation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFM__CANCELLATION));
		printCountingMap.put("cancellation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFM__DEADLINE));
		printCountingMap.put("deadline", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("ReqID");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFM__NAME));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFM__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("maintain");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("condition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFM__CONDITION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("condition", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("within");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("deadline");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFM__DEADLINE));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFM__DEADLINE), element));
				out.print(" ");
			}
			printCountingMap.put("deadline", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("if");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("activation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFM__ACTIVATION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("activation", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_AdaptiveCyberDefense_DFM_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("reward");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("reward");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFM__REWARD));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFM__REWARD), element));
				out.print(" ");
			}
			printCountingMap.put("reward", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_AdaptiveCyberDefense_DFM_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_DFM_0(org.emftext.language.AdaptiveCyberDefense.DFM element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("unless");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("cancellation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFM__CANCELLATION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("cancellation", count - 1);
		}
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_DFM_1(org.emftext.language.AdaptiveCyberDefense.DFM element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("description");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("description");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFM__DESCRIPTION));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFM__DESCRIPTION), element));
				out.print(" ");
			}
			printCountingMap.put("description", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_PM(org.emftext.language.AdaptiveCyberDefense.PM element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PM__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PM__REWARD));
		printCountingMap.put("reward", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PM__CONDITION));
		printCountingMap.put("condition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PM__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PM__ACTIVATION));
		printCountingMap.put("activation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PM__CANCELLATION));
		printCountingMap.put("cancellation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PM__DURATION));
		printCountingMap.put("duration", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("ReqID");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PM__NAME));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PM__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("maintain");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("condition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PM__CONDITION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("condition", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("for");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("duration");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PM__DURATION));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PM__DURATION), element));
				out.print(" ");
			}
			printCountingMap.put("duration", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("if");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("activation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PM__ACTIVATION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("activation", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_AdaptiveCyberDefense_PM_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("reward");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("reward");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PM__REWARD));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PM__REWARD), element));
				out.print(" ");
			}
			printCountingMap.put("reward", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_AdaptiveCyberDefense_PM_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_PM_0(org.emftext.language.AdaptiveCyberDefense.PM element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("unless");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("cancellation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PM__CANCELLATION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("cancellation", count - 1);
		}
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_PM_1(org.emftext.language.AdaptiveCyberDefense.PM element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("description");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("description");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PM__DESCRIPTION));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PM__DESCRIPTION), element));
				out.print(" ");
			}
			printCountingMap.put("description", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_RPM(org.emftext.language.AdaptiveCyberDefense.RPM element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPM__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPM__REWARD));
		printCountingMap.put("reward", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPM__CONDITION));
		printCountingMap.put("condition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPM__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPM__ACTIVATION));
		printCountingMap.put("activation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPM__CANCELLATION));
		printCountingMap.put("cancellation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPM__DURATION));
		printCountingMap.put("duration", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("ReqID");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPM__NAME));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPM__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("maintain");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("condition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPM__CONDITION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("condition", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("for");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("duration");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPM__DURATION));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPM__DURATION), element));
				out.print(" ");
			}
			printCountingMap.put("duration", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("if");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("activation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPM__ACTIVATION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("activation", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_AdaptiveCyberDefense_RPM_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("reward_once");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("reward");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPM__REWARD));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPM__REWARD), element));
				out.print(" ");
			}
			printCountingMap.put("reward", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_AdaptiveCyberDefense_RPM_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_RPM_0(org.emftext.language.AdaptiveCyberDefense.RPM element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("unless");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("cancellation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPM__CANCELLATION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("cancellation", count - 1);
		}
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_RPM_1(org.emftext.language.AdaptiveCyberDefense.RPM element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("description");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("description");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPM__DESCRIPTION));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPM__DESCRIPTION), element));
				out.print(" ");
			}
			printCountingMap.put("description", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_PDEM(org.emftext.language.AdaptiveCyberDefense.PDEM element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDEM__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDEM__REWARD));
		printCountingMap.put("reward", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDEM__CONDITION));
		printCountingMap.put("condition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDEM__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDEM__ACTIVATION));
		printCountingMap.put("activation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDEM__CANCELLATION));
		printCountingMap.put("cancellation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDEM__DEADLINE));
		printCountingMap.put("deadline", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDEM__DURATION));
		printCountingMap.put("duration", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("ReqID");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDEM__NAME));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDEM__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("maintain");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("condition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDEM__CONDITION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("condition", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("for");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("duration");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDEM__DURATION));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDEM__DURATION), element));
				out.print(" ");
			}
			printCountingMap.put("duration", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("after");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("deadline");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDEM__DEADLINE));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDEM__DEADLINE), element));
				out.print(" ");
			}
			printCountingMap.put("deadline", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("if");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("activation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDEM__ACTIVATION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("activation", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_AdaptiveCyberDefense_PDEM_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("reward");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("reward");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDEM__REWARD));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDEM__REWARD), element));
				out.print(" ");
			}
			printCountingMap.put("reward", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_AdaptiveCyberDefense_PDEM_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_PDEM_0(org.emftext.language.AdaptiveCyberDefense.PDEM element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("unless");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("cancellation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDEM__CANCELLATION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("cancellation", count - 1);
		}
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_PDEM_1(org.emftext.language.AdaptiveCyberDefense.PDEM element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("description");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("description");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDEM__DESCRIPTION));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDEM__DESCRIPTION), element));
				out.print(" ");
			}
			printCountingMap.put("description", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_RPDEM(org.emftext.language.AdaptiveCyberDefense.RPDEM element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDEM__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDEM__REWARD));
		printCountingMap.put("reward", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDEM__CONDITION));
		printCountingMap.put("condition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDEM__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDEM__ACTIVATION));
		printCountingMap.put("activation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDEM__CANCELLATION));
		printCountingMap.put("cancellation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDEM__DEADLINE));
		printCountingMap.put("deadline", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDEM__DURATION));
		printCountingMap.put("duration", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("ReqID");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDEM__NAME));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDEM__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("maintain");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("condition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDEM__CONDITION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("condition", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("for");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("duration");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDEM__DURATION));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDEM__DURATION), element));
				out.print(" ");
			}
			printCountingMap.put("duration", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("after");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("deadline");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDEM__DEADLINE));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDEM__DEADLINE), element));
				out.print(" ");
			}
			printCountingMap.put("deadline", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("if");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("activation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDEM__ACTIVATION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("activation", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_AdaptiveCyberDefense_RPDEM_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("reward_once");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("reward");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDEM__REWARD));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDEM__REWARD), element));
				out.print(" ");
			}
			printCountingMap.put("reward", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_AdaptiveCyberDefense_RPDEM_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_RPDEM_0(org.emftext.language.AdaptiveCyberDefense.RPDEM element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("unless");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("cancellation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDEM__CANCELLATION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("cancellation", count - 1);
		}
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_RPDEM_1(org.emftext.language.AdaptiveCyberDefense.RPDEM element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("description");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("description");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDEM__DESCRIPTION));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDEM__DESCRIPTION), element));
				out.print(" ");
			}
			printCountingMap.put("description", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_PDFM(org.emftext.language.AdaptiveCyberDefense.PDFM element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDFM__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDFM__REWARD));
		printCountingMap.put("reward", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDFM__CONDITION));
		printCountingMap.put("condition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDFM__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDFM__ACTIVATION));
		printCountingMap.put("activation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDFM__CANCELLATION));
		printCountingMap.put("cancellation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDFM__DEADLINE));
		printCountingMap.put("deadline", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDFM__DURATION));
		printCountingMap.put("duration", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("ReqID");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDFM__NAME));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDFM__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("maintain");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("condition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDFM__CONDITION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("condition", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("for");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("duration");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDFM__DURATION));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDFM__DURATION), element));
				out.print(" ");
			}
			printCountingMap.put("duration", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("within");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("deadline");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDFM__DEADLINE));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDFM__DEADLINE), element));
				out.print(" ");
			}
			printCountingMap.put("deadline", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("if");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("activation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDFM__ACTIVATION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("activation", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_AdaptiveCyberDefense_PDFM_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("reward");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("reward");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDFM__REWARD));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDFM__REWARD), element));
				out.print(" ");
			}
			printCountingMap.put("reward", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_AdaptiveCyberDefense_PDFM_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_PDFM_0(org.emftext.language.AdaptiveCyberDefense.PDFM element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("unless");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("cancellation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDFM__CANCELLATION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("cancellation", count - 1);
		}
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_PDFM_1(org.emftext.language.AdaptiveCyberDefense.PDFM element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("description");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("description");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDFM__DESCRIPTION));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDFM__DESCRIPTION), element));
				out.print(" ");
			}
			printCountingMap.put("description", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_RPDFM(org.emftext.language.AdaptiveCyberDefense.RPDFM element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDFM__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDFM__REWARD));
		printCountingMap.put("reward", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDFM__CONDITION));
		printCountingMap.put("condition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDFM__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDFM__ACTIVATION));
		printCountingMap.put("activation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDFM__CANCELLATION));
		printCountingMap.put("cancellation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDFM__DEADLINE));
		printCountingMap.put("deadline", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDFM__DURATION));
		printCountingMap.put("duration", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("ReqID");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDFM__NAME));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDFM__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("maintain");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("condition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDFM__CONDITION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("condition", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("for");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("duration");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDFM__DURATION));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDFM__DURATION), element));
				out.print(" ");
			}
			printCountingMap.put("duration", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("within");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("deadline");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDFM__DEADLINE));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDFM__DEADLINE), element));
				out.print(" ");
			}
			printCountingMap.put("deadline", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("if");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("activation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDFM__ACTIVATION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("activation", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_AdaptiveCyberDefense_RPDFM_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("reward_once");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("reward");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDFM__REWARD));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDFM__REWARD), element));
				out.print(" ");
			}
			printCountingMap.put("reward", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_AdaptiveCyberDefense_RPDFM_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_RPDFM_0(org.emftext.language.AdaptiveCyberDefense.RPDFM element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("unless");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("cancellation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDFM__CANCELLATION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("cancellation", count - 1);
		}
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_RPDFM_1(org.emftext.language.AdaptiveCyberDefense.RPDFM element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("description");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("description");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDFM__DESCRIPTION));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDFM__DESCRIPTION), element));
				out.print(" ");
			}
			printCountingMap.put("description", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_ProbabilisticEffect(org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PROBABILISTIC_EFFECT__PROBABILITY));
		printCountingMap.put("probability", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PROBABILISTIC_EFFECT__STATE_ATOMS));
		printCountingMap.put("state_atoms", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("<");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_AdaptiveCyberDefense_ProbabilisticEffect_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_AdaptiveCyberDefense_ProbabilisticEffect_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(">");
		out.print(" ");
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_ProbabilisticEffect_0(org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("state_atoms");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PROBABILISTIC_EFFECT__STATE_ATOMS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("state_atoms", 0);
		}
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_ProbabilisticEffect_1(org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("prob");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("probability");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PROBABILISTIC_EFFECT__PROBABILITY));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("FLOAT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PROBABILISTIC_EFFECT__PROBABILITY), element));
				out.print(" ");
			}
			printCountingMap.put("probability", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_Conjunction(org.emftext.language.AdaptiveCyberDefense.Conjunction element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CONJUNCTION__RHS));
		printCountingMap.put("rhs", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CONJUNCTION__LHS));
		printCountingMap.put("lhs", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("lhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CONJUNCTION__LHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("lhs", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("&");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("rhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CONJUNCTION__RHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rhs", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_Disjunction(org.emftext.language.AdaptiveCyberDefense.Disjunction element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DISJUNCTION__LHS));
		printCountingMap.put("lhs", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DISJUNCTION__RHS));
		printCountingMap.put("rhs", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("lhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DISJUNCTION__LHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("lhs", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("|");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("rhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DISJUNCTION__RHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rhs", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_Negation(org.emftext.language.AdaptiveCyberDefense.Negation element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.NEGATION__FORMULA));
		printCountingMap.put("formula", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("!");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("formula");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.NEGATION__FORMULA));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("formula", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_Parentheses(org.emftext.language.AdaptiveCyberDefense.Parentheses element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PARENTHESES__FORMULA));
		printCountingMap.put("formula", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("formula");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PARENTHESES__FORMULA));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("formula", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_FormulaAtom(org.emftext.language.AdaptiveCyberDefense.FormulaAtom element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.FORMULA_ATOM__DESCRIPTION_ENTITY));
		printCountingMap.put("description_entity", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.FORMULA_ATOM__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("description_entity");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.FORMULA_ATOM__DESCRIPTION_ENTITY));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getFormulaAtomDescription_entityReferenceResolver().deResolve((org.emftext.language.AdaptiveCyberDefense.DescriptionEntity) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.FORMULA_ATOM__DESCRIPTION_ENTITY)), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.FORMULA_ATOM__DESCRIPTION_ENTITY), element));
				out.print(" ");
			}
			printCountingMap.put("description_entity", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_AdaptiveCyberDefense_FormulaAtom_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_FormulaAtom_0(org.emftext.language.AdaptiveCyberDefense.FormulaAtom element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.FORMULA_ATOM__VALUE));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.FORMULA_ATOM__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_True(org.emftext.language.AdaptiveCyberDefense.True element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("true");
		out.print(" ");
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_False(org.emftext.language.AdaptiveCyberDefense.False element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("false");
		out.print(" ");
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_StateAtom(org.emftext.language.AdaptiveCyberDefense.StateAtom element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.STATE_ATOM__STATE_VARIABLE));
		printCountingMap.put("state_variable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.STATE_ATOM__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("state_variable");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.STATE_ATOM__STATE_VARIABLE));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getStateAtomState_variableReferenceResolver().deResolve((org.emftext.language.AdaptiveCyberDefense.StateVariable) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.STATE_ATOM__STATE_VARIABLE)), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.STATE_ATOM__STATE_VARIABLE), element));
				out.print(" ");
			}
			printCountingMap.put("state_variable", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_AdaptiveCyberDefense_StateAtom_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_StateAtom_0(org.emftext.language.AdaptiveCyberDefense.StateAtom element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.STATE_ATOM__VALUE));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.STATE_ATOM__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_InitialAtom(org.emftext.language.AdaptiveCyberDefense.InitialAtom element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.INITIAL_ATOM__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.INITIAL_ATOM__INITIALVARIABLE));
		printCountingMap.put("initialvariable", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("initialvariable");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.INITIAL_ATOM__INITIALVARIABLE));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getInitialAtomInitialvariableReferenceResolver().deResolve((org.emftext.language.AdaptiveCyberDefense.InitialVariable) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.INITIAL_ATOM__INITIALVARIABLE)), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.INITIAL_ATOM__INITIALVARIABLE), element));
				out.print(" ");
			}
			printCountingMap.put("initialvariable", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_AdaptiveCyberDefense_InitialAtom_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_emftext_language_AdaptiveCyberDefense_InitialAtom_0(org.emftext.language.AdaptiveCyberDefense.InitialAtom element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.INITIAL_ATOM__VALUE));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.INITIAL_ATOM__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_Label(org.emftext.language.AdaptiveCyberDefense.Label element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.LABEL__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.LABEL__PROPERTY));
		printCountingMap.put("property", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Label");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.LABEL__VALUE));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.LABEL__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("property");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.LABEL__PROPERTY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("property", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_PConjunction(org.emftext.language.AdaptiveCyberDefense.PConjunction element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PCONJUNCTION__RHS));
		printCountingMap.put("rhs", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PCONJUNCTION__LHS));
		printCountingMap.put("lhs", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("lhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PCONJUNCTION__LHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("lhs", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("&");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("rhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PCONJUNCTION__RHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rhs", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_PDisjunction(org.emftext.language.AdaptiveCyberDefense.PDisjunction element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDISJUNCTION__RHS));
		printCountingMap.put("rhs", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDISJUNCTION__LHS));
		printCountingMap.put("lhs", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("lhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDISJUNCTION__LHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("lhs", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("|");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("rhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDISJUNCTION__RHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rhs", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_PNegation(org.emftext.language.AdaptiveCyberDefense.PNegation element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PNEGATION__OP));
		printCountingMap.put("op", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("!");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("op");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PNEGATION__OP));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("op", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_LabelReference(org.emftext.language.AdaptiveCyberDefense.LabelReference element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.LABEL_REFERENCE__LABEL));
		printCountingMap.put("label", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("label");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.LABEL_REFERENCE__LABEL));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getLabelReferenceLabelReferenceResolver().deResolve((org.emftext.language.AdaptiveCyberDefense.Label) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.LABEL_REFERENCE__LABEL)), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.LABEL_REFERENCE__LABEL), element));
				out.print(" ");
			}
			printCountingMap.put("label", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_POperator(org.emftext.language.AdaptiveCyberDefense.POperator element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.POPERATOR__OPERATOR));
		printCountingMap.put("operator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.POPERATOR__BOUND));
		printCountingMap.put("bound", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.POPERATOR__OP));
		printCountingMap.put("op", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.POPERATOR__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.POPERATOR__TYPE));
			if (o != null) {
			}
			printCountingMap.put("type", count - 1);
		}
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("operator");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.POPERATOR__OPERATOR));
			if (o != null) {
			}
			printCountingMap.put("operator", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("bound");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.POPERATOR__BOUND));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("FLOAT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.POPERATOR__BOUND), element));
				out.print(" ");
			}
			printCountingMap.put("bound", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("[");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("op");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.POPERATOR__OP));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("op", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("]");
		out.print(" ");
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_Until(org.emftext.language.AdaptiveCyberDefense.Until element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UNTIL__LHS));
		printCountingMap.put("lhs", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UNTIL__RHS));
		printCountingMap.put("rhs", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("lhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UNTIL__LHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("lhs", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("U");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("rhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UNTIL__RHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rhs", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_BoundedUntil(org.emftext.language.AdaptiveCyberDefense.BoundedUntil element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.BOUNDED_UNTIL__RHS));
		printCountingMap.put("rhs", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.BOUNDED_UNTIL__LHS));
		printCountingMap.put("lhs", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.BOUNDED_UNTIL__BOUND));
		printCountingMap.put("bound", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.BOUNDED_UNTIL__OPERATOR));
		printCountingMap.put("operator", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("lhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.BOUNDED_UNTIL__LHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("lhs", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("U");
		out.print(" ");
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("operator");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.BOUNDED_UNTIL__OPERATOR));
			if (o != null) {
			}
			printCountingMap.put("operator", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("bound");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.BOUNDED_UNTIL__BOUND));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.BOUNDED_UNTIL__BOUND), element));
				out.print(" ");
			}
			printCountingMap.put("bound", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("rhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.BOUNDED_UNTIL__RHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rhs", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_Eventually(org.emftext.language.AdaptiveCyberDefense.Eventually element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.EVENTUALLY__OP));
		printCountingMap.put("op", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("F");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("op");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.EVENTUALLY__OP));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("op", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_BoundedEventually(org.emftext.language.AdaptiveCyberDefense.BoundedEventually element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.BOUNDED_EVENTUALLY__OP));
		printCountingMap.put("op", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.BOUNDED_EVENTUALLY__BOUND));
		printCountingMap.put("bound", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.BOUNDED_EVENTUALLY__OPERATOR));
		printCountingMap.put("operator", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("F");
		out.print(" ");
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("operator");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.BOUNDED_EVENTUALLY__OPERATOR));
			if (o != null) {
			}
			printCountingMap.put("operator", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("bound");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.BOUNDED_EVENTUALLY__BOUND));
			if (o != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.BOUNDED_EVENTUALLY__BOUND), element));
				out.print(" ");
			}
			printCountingMap.put("bound", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("op");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.BOUNDED_EVENTUALLY__OP));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("op", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_Globally(org.emftext.language.AdaptiveCyberDefense.Globally element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.GLOBALLY__OP));
		printCountingMap.put("op", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("G");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("op");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.GLOBALLY__OP));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("op", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_PTrue(org.emftext.language.AdaptiveCyberDefense.PTrue element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("true");
		out.print(" ");
	}
	
	
	public void print_org_emftext_language_AdaptiveCyberDefense_PFalse(org.emftext.language.AdaptiveCyberDefense.PFalse element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("false");
		out.print(" ");
	}
	
	
}
