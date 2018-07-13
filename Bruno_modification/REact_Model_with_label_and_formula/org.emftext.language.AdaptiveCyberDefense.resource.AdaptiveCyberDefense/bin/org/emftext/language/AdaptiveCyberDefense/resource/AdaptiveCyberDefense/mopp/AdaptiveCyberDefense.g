grammar AdaptiveCyberDefense;

options {
	superClass = AdaptiveCyberDefenseANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp;
}

@lexer::members {
	public java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>();
	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
	
	public void reportError(org.antlr.runtime3_4_0.RecognitionException e) {
		lexerExceptions.add(e);
		lexerExceptionsPosition.add(((org.antlr.runtime3_4_0.ANTLRStringStream) input).index());
	}
}
@header{
	package org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp;
}

@members{
	private org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolverFactory tokenResolverFactory = new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTokenResolverFactory();
	
	/**
	 * the index of the last token that was handled by collectHiddenTokens()
	 */
	private int lastPosition;
	
	/**
	 * A flag that indicates whether the parser should remember all expected elements.
	 * This flag is set to true when using the parse for code completion. Otherwise it
	 * is set to false.
	 */
	private boolean rememberExpectedElements = false;
	
	private Object parseToIndexTypeObject;
	private int lastTokenIndex = 0;
	
	/**
	 * A list of expected elements the were collected while parsing the input stream.
	 * This list is only filled if <code>rememberExpectedElements</code> is set to
	 * true.
	 */
	private java.util.List<org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectedTerminal> expectedElements = new java.util.ArrayList<org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectedTerminal>();
	
	private int mismatchedTokenRecoveryTries = 0;
	/**
	 * A helper list to allow a lexer to pass errors to its parser
	 */
	protected java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>());
	
	/**
	 * Another helper list to allow a lexer to pass positions of errors to its parser
	 */
	protected java.util.List<Integer> lexerExceptionsPosition = java.util.Collections.synchronizedList(new java.util.ArrayList<Integer>());
	
	/**
	 * A stack for incomplete objects. This stack is used filled when the parser is
	 * used for code completion. Whenever the parser starts to read an object it is
	 * pushed on the stack. Once the element was parser completely it is popped from
	 * the stack.
	 */
	java.util.List<org.eclipse.emf.ecore.EObject> incompleteObjects = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
	
	private int stopIncludingHiddenTokens;
	private int stopExcludingHiddenTokens;
	private int tokenIndexOfLastCompleteElement;
	
	private int expectedElementsIndexOfLastCompleteElement;
	
	/**
	 * The offset indicating the cursor position when the parser is used for code
	 * completion by calling parseToExpectedElements().
	 */
	private int cursorOffset;
	
	/**
	 * The offset of the first hidden token of the last expected element. This offset
	 * is used to discard expected elements, which are not needed for code completion.
	 */
	private int lastStartIncludingHidden;
	
	protected void addErrorToResource(final String errorMessage, final int column, final int line, final int startIndex, final int stopIndex) {
		postParseCommands.add(new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseCommand<org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTextResource>() {
			public boolean execute(org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTextResource resource) {
				if (resource == null) {
					// the resource can be null if the parser is used for code completion
					return true;
				}
				resource.addProblem(new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseProblem() {
					public org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.AdaptiveCyberDefenseEProblemSeverity getSeverity() {
						return org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.AdaptiveCyberDefenseEProblemSeverity.ERROR;
					}
					public org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.AdaptiveCyberDefenseEProblemType getType() {
						return org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.AdaptiveCyberDefenseEProblemType.SYNTAX_ERROR;
					}
					public String getMessage() {
						return errorMessage;
					}
					public java.util.Collection<org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseQuickFix> getQuickFixes() {
						return null;
					}
				}, column, line, startIndex, stopIndex);
				return true;
			}
		});
	}
	
	public void addExpectedElement(org.eclipse.emf.ecore.EClass eClass, int[] ids) {
		if (!this.rememberExpectedElements) {
			return;
		}
		int terminalID = ids[0];
		int followSetID = ids[1];
		org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseExpectedElement terminal = org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseFollowSetProvider.TERMINALS[terminalID];
		org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseContainedFeature[] containmentFeatures = new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseContainedFeature[ids.length - 2];
		for (int i = 2; i < ids.length; i++) {
			containmentFeatures[i - 2] = org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseFollowSetProvider.LINKS[ids[i]];
		}
		org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseContainmentTrace containmentTrace = new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseContainmentTrace(eClass, containmentFeatures);
		org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
		org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectedTerminal expectedElement = new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectedTerminal(container, terminal, followSetID, containmentTrace);
		setPosition(expectedElement, input.index());
		int startIncludingHiddenTokens = expectedElement.getStartIncludingHiddenTokens();
		if (lastStartIncludingHidden >= 0 && lastStartIncludingHidden < startIncludingHiddenTokens && cursorOffset > startIncludingHiddenTokens) {
			// clear list of expected elements
			this.expectedElements.clear();
			this.expectedElementsIndexOfLastCompleteElement = 0;
		}
		lastStartIncludingHidden = startIncludingHiddenTokens;
		this.expectedElements.add(expectedElement);
	}
	
	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
	}
	
	protected void copyLocalizationInfos(final org.eclipse.emf.ecore.EObject source, final org.eclipse.emf.ecore.EObject target) {
		if (disableLocationMap) {
			return;
		}
		postParseCommands.add(new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseCommand<org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTextResource>() {
			public boolean execute(org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTextResource resource) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseLocationMap locationMap = resource.getLocationMap();
				if (locationMap == null) {
					// the locationMap can be null if the parser is used for code completion
					return true;
				}
				locationMap.setCharStart(target, locationMap.getCharStart(source));
				locationMap.setCharEnd(target, locationMap.getCharEnd(source));
				locationMap.setColumn(target, locationMap.getColumn(source));
				locationMap.setLine(target, locationMap.getLine(source));
				return true;
			}
		});
	}
	
	protected void copyLocalizationInfos(final org.antlr.runtime3_4_0.CommonToken source, final org.eclipse.emf.ecore.EObject target) {
		if (disableLocationMap) {
			return;
		}
		postParseCommands.add(new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseCommand<org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTextResource>() {
			public boolean execute(org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTextResource resource) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseLocationMap locationMap = resource.getLocationMap();
				if (locationMap == null) {
					// the locationMap can be null if the parser is used for code completion
					return true;
				}
				if (source == null) {
					return true;
				}
				locationMap.setCharStart(target, source.getStartIndex());
				locationMap.setCharEnd(target, source.getStopIndex());
				locationMap.setColumn(target, source.getCharPositionInLine());
				locationMap.setLine(target, source.getLine());
				return true;
			}
		});
	}
	
	/**
	 * Sets the end character index and the last line for the given object in the
	 * location map.
	 */
	protected void setLocalizationEnd(java.util.Collection<org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseCommand<org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
		if (disableLocationMap) {
			return;
		}
		postParseCommands.add(new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseCommand<org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTextResource>() {
			public boolean execute(org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTextResource resource) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseLocationMap locationMap = resource.getLocationMap();
				if (locationMap == null) {
					// the locationMap can be null if the parser is used for code completion
					return true;
				}
				locationMap.setCharEnd(object, endChar);
				locationMap.setLine(object, endLine);
				return true;
			}
		});
	}
	
	public org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
		try {
			if (encoding == null) {
				return new AdaptiveCyberDefenseParser(new org.antlr.runtime3_4_0.CommonTokenStream(new AdaptiveCyberDefenseLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream))));
			} else {
				return new AdaptiveCyberDefenseParser(new org.antlr.runtime3_4_0.CommonTokenStream(new AdaptiveCyberDefenseLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream, encoding))));
			}
		} catch (java.io.IOException e) {
			new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.util.AdaptiveCyberDefenseRuntimeUtil().logError("Error while creating parser.", e);
			return null;
		}
	}
	
	/**
	 * This default constructor is only used to call createInstance() on it.
	 */
	public AdaptiveCyberDefenseParser() {
		super(null);
	}
	
	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_4_0.RecognitionException {
		this.lastPosition = 0;
		// required because the lexer class can not be subclassed
		((AdaptiveCyberDefenseLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
		((AdaptiveCyberDefenseLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
		Object typeObject = getTypeObject();
		if (typeObject == null) {
			return start();
		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
			if (type.getInstanceClass() == org.emftext.language.AdaptiveCyberDefense.DomainDescription.class) {
				return parse_org_emftext_language_AdaptiveCyberDefense_DomainDescription();
			}
			if (type.getInstanceClass() == org.emftext.language.AdaptiveCyberDefense.StateVariable.class) {
				return parse_org_emftext_language_AdaptiveCyberDefense_StateVariable();
			}
			if (type.getInstanceClass() == org.emftext.language.AdaptiveCyberDefense.ActionDescription.class) {
				return parse_org_emftext_language_AdaptiveCyberDefense_ActionDescription();
			}
			if (type.getInstanceClass() == org.emftext.language.AdaptiveCyberDefense.EventDescription.class) {
				return parse_org_emftext_language_AdaptiveCyberDefense_EventDescription();
			}
			if (type.getInstanceClass() == org.emftext.language.AdaptiveCyberDefense.ProbabilisticContextualEffect.class) {
				return parse_org_emftext_language_AdaptiveCyberDefense_ProbabilisticContextualEffect();
			}
			if (type.getInstanceClass() == org.emftext.language.AdaptiveCyberDefense.ContextualEffect.class) {
				return parse_org_emftext_language_AdaptiveCyberDefense_ContextualEffect();
			}
			if (type.getInstanceClass() == org.emftext.language.AdaptiveCyberDefense.UA.class) {
				return parse_org_emftext_language_AdaptiveCyberDefense_UA();
			}
			if (type.getInstanceClass() == org.emftext.language.AdaptiveCyberDefense.CA.class) {
				return parse_org_emftext_language_AdaptiveCyberDefense_CA();
			}
			if (type.getInstanceClass() == org.emftext.language.AdaptiveCyberDefense.DEA.class) {
				return parse_org_emftext_language_AdaptiveCyberDefense_DEA();
			}
			if (type.getInstanceClass() == org.emftext.language.AdaptiveCyberDefense.DFA.class) {
				return parse_org_emftext_language_AdaptiveCyberDefense_DFA();
			}
			if (type.getInstanceClass() == org.emftext.language.AdaptiveCyberDefense.UM.class) {
				return parse_org_emftext_language_AdaptiveCyberDefense_UM();
			}
			if (type.getInstanceClass() == org.emftext.language.AdaptiveCyberDefense.CM.class) {
				return parse_org_emftext_language_AdaptiveCyberDefense_CM();
			}
			if (type.getInstanceClass() == org.emftext.language.AdaptiveCyberDefense.DEM.class) {
				return parse_org_emftext_language_AdaptiveCyberDefense_DEM();
			}
			if (type.getInstanceClass() == org.emftext.language.AdaptiveCyberDefense.DFM.class) {
				return parse_org_emftext_language_AdaptiveCyberDefense_DFM();
			}
			if (type.getInstanceClass() == org.emftext.language.AdaptiveCyberDefense.PM.class) {
				return parse_org_emftext_language_AdaptiveCyberDefense_PM();
			}
			if (type.getInstanceClass() == org.emftext.language.AdaptiveCyberDefense.RPM.class) {
				return parse_org_emftext_language_AdaptiveCyberDefense_RPM();
			}
			if (type.getInstanceClass() == org.emftext.language.AdaptiveCyberDefense.PDEM.class) {
				return parse_org_emftext_language_AdaptiveCyberDefense_PDEM();
			}
			if (type.getInstanceClass() == org.emftext.language.AdaptiveCyberDefense.RPDEM.class) {
				return parse_org_emftext_language_AdaptiveCyberDefense_RPDEM();
			}
			if (type.getInstanceClass() == org.emftext.language.AdaptiveCyberDefense.PDFM.class) {
				return parse_org_emftext_language_AdaptiveCyberDefense_PDFM();
			}
			if (type.getInstanceClass() == org.emftext.language.AdaptiveCyberDefense.RPDFM.class) {
				return parse_org_emftext_language_AdaptiveCyberDefense_RPDFM();
			}
			if (type.getInstanceClass() == org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect.class) {
				return parse_org_emftext_language_AdaptiveCyberDefense_ProbabilisticEffect();
			}
			if (type.getInstanceClass() == org.emftext.language.AdaptiveCyberDefense.StateAtom.class) {
				return parse_org_emftext_language_AdaptiveCyberDefense_StateAtom();
			}
			if (type.getInstanceClass() == org.emftext.language.AdaptiveCyberDefense.InitialAtom.class) {
				return parse_org_emftext_language_AdaptiveCyberDefense_InitialAtom();
			}
			if (type.getInstanceClass() == org.emftext.language.AdaptiveCyberDefense.Label.class) {
				return parse_org_emftext_language_AdaptiveCyberDefense_Label();
			}
			if (type.getInstanceClass() == org.emftext.language.AdaptiveCyberDefense.Until.class) {
				return parse_org_emftext_language_AdaptiveCyberDefense_Until();
			}
			if (type.getInstanceClass() == org.emftext.language.AdaptiveCyberDefense.BoundedUntil.class) {
				return parse_org_emftext_language_AdaptiveCyberDefense_BoundedUntil();
			}
			if (type.getInstanceClass() == org.emftext.language.AdaptiveCyberDefense.Eventually.class) {
				return parse_org_emftext_language_AdaptiveCyberDefense_Eventually();
			}
			if (type.getInstanceClass() == org.emftext.language.AdaptiveCyberDefense.BoundedEventually.class) {
				return parse_org_emftext_language_AdaptiveCyberDefense_BoundedEventually();
			}
			if (type.getInstanceClass() == org.emftext.language.AdaptiveCyberDefense.Globally.class) {
				return parse_org_emftext_language_AdaptiveCyberDefense_Globally();
			}
			if (type.getInstanceClass() == org.emftext.language.AdaptiveCyberDefense.PTrue.class) {
				return parse_org_emftext_language_AdaptiveCyberDefense_PTrue();
			}
			if (type.getInstanceClass() == org.emftext.language.AdaptiveCyberDefense.PFalse.class) {
				return parse_org_emftext_language_AdaptiveCyberDefense_PFalse();
			}
		}
		throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseUnexpectedContentTypeException(typeObject);
	}
	
	public int getMismatchedTokenRecoveryTries() {
		return mismatchedTokenRecoveryTries;
	}
	
	public Object getMissingSymbol(org.antlr.runtime3_4_0.IntStream arg0, org.antlr.runtime3_4_0.RecognitionException arg1, int arg2, org.antlr.runtime3_4_0.BitSet arg3) {
		mismatchedTokenRecoveryTries++;
		return super.getMissingSymbol(arg0, arg1, arg2, arg3);
	}
	
	public Object getParseToIndexTypeObject() {
		return parseToIndexTypeObject;
	}
	
	protected Object getTypeObject() {
		Object typeObject = getParseToIndexTypeObject();
		if (typeObject != null) {
			return typeObject;
		}
		java.util.Map<?,?> options = getOptions();
		if (options != null) {
			typeObject = options.get(org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseOptions.RESOURCE_CONTENT_TYPE);
		}
		return typeObject;
	}
	
	/**
	 * Implementation that calls {@link #doParse()} and handles the thrown
	 * RecognitionExceptions.
	 */
	public org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseParseResult parse() {
		terminateParsing = false;
		postParseCommands = new java.util.ArrayList<org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseCommand<org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTextResource>>();
		org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseParseResult parseResult = new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseParseResult();
		try {
			org.eclipse.emf.ecore.EObject result =  doParse();
			if (lexerExceptions.isEmpty()) {
				parseResult.setRoot(result);
			}
		} catch (org.antlr.runtime3_4_0.RecognitionException re) {
			reportError(re);
		} catch (java.lang.IllegalArgumentException iae) {
			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
				// can be caused if a null is set on EMF models where not allowed. this will just
				// happen if other errors occurred before
			} else {
				iae.printStackTrace();
			}
		}
		for (org.antlr.runtime3_4_0.RecognitionException re : lexerExceptions) {
			reportLexicalError(re);
		}
		parseResult.getPostParseCommands().addAll(postParseCommands);
		return parseResult;
	}
	
	public java.util.List<org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTextResource dummyResource, int cursorOffset) {
		this.rememberExpectedElements = true;
		this.parseToIndexTypeObject = type;
		this.cursorOffset = cursorOffset;
		this.lastStartIncludingHidden = -1;
		final org.antlr.runtime3_4_0.CommonTokenStream tokenStream = (org.antlr.runtime3_4_0.CommonTokenStream) getTokenStream();
		org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseParseResult result = parse();
		for (org.eclipse.emf.ecore.EObject incompleteObject : incompleteObjects) {
			org.antlr.runtime3_4_0.Lexer lexer = (org.antlr.runtime3_4_0.Lexer) tokenStream.getTokenSource();
			int endChar = lexer.getCharIndex();
			int endLine = lexer.getLine();
			setLocalizationEnd(result.getPostParseCommands(), incompleteObject, endChar, endLine);
		}
		if (result != null) {
			org.eclipse.emf.ecore.EObject root = result.getRoot();
			if (root != null) {
				dummyResource.getContentsInternal().add(root);
			}
			for (org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseCommand<org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTextResource> command : result.getPostParseCommands()) {
				command.execute(dummyResource);
			}
		}
		// remove all expected elements that were added after the last complete element
		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
		java.util.Set<org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectedTerminal>();
		java.util.List<org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectedTerminal> newFollowSet = new java.util.ArrayList<org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectedTerminal>();
		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
			org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectedTerminal expectedElementI = expectedElements.get(i);
			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
				currentFollowSet.add(expectedElementI);
			} else {
				break;
			}
		}
		int followSetID = 363;
		int i;
		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
			org.antlr.runtime3_4_0.CommonToken nextToken = (org.antlr.runtime3_4_0.CommonToken) tokenStream.get(i);
			if (nextToken.getType() < 0) {
				break;
			}
			if (nextToken.getChannel() == 99) {
				// hidden tokens do not reduce the follow set
			} else {
				// now that we have found the next visible token the position for that expected
				// terminals can be set
				for (org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectedTerminal nextFollow : newFollowSet) {
					lastTokenIndex = 0;
					setPosition(nextFollow, i);
				}
				newFollowSet.clear();
				// normal tokens do reduce the follow set - only elements that match the token are
				// kept
				for (org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectedTerminal nextFollow : currentFollowSet) {
					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
						// keep this one - it matches
						java.util.Collection<org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.util.AdaptiveCyberDefensePair<org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseExpectedElement, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseContainedFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
						for (org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.util.AdaptiveCyberDefensePair<org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseExpectedElement, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseContainedFeature[]> newFollowerPair : newFollowers) {
							org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseExpectedElement newFollower = newFollowerPair.getLeft();
							org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
							org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseContainmentTrace containmentTrace = new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseContainmentTrace(null, newFollowerPair.getRight());
							org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectedTerminal newFollowTerminal = new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectedTerminal(container, newFollower, followSetID, containmentTrace);
							newFollowSet.add(newFollowTerminal);
							expectedElements.add(newFollowTerminal);
						}
					}
				}
				currentFollowSet.clear();
				currentFollowSet.addAll(newFollowSet);
			}
			followSetID++;
		}
		// after the last token in the stream we must set the position for the elements
		// that were added during the last iteration of the loop
		for (org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectedTerminal nextFollow : newFollowSet) {
			lastTokenIndex = 0;
			setPosition(nextFollow, i);
		}
		return this.expectedElements;
	}
	
	public void setPosition(org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectedTerminal expectedElement, int tokenIndex) {
		int currentIndex = Math.max(0, tokenIndex);
		for (int index = lastTokenIndex; index < currentIndex; index++) {
			if (index >= input.size()) {
				break;
			}
			org.antlr.runtime3_4_0.CommonToken tokenAtIndex = (org.antlr.runtime3_4_0.CommonToken) input.get(index);
			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
			if (tokenAtIndex.getChannel() != 99 && !anonymousTokens.contains(tokenAtIndex)) {
				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
			}
		}
		lastTokenIndex = Math.max(0, currentIndex);
		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
	}
	
	public Object recoverFromMismatchedToken(org.antlr.runtime3_4_0.IntStream input, int ttype, org.antlr.runtime3_4_0.BitSet follow) throws org.antlr.runtime3_4_0.RecognitionException {
		if (!rememberExpectedElements) {
			return super.recoverFromMismatchedToken(input, ttype, follow);
		} else {
			return null;
		}
	}
	
	/**
	 * Translates errors thrown by the parser into human readable messages.
	 */
	public void reportError(final org.antlr.runtime3_4_0.RecognitionException e)  {
		String message = e.getMessage();
		if (e instanceof org.antlr.runtime3_4_0.MismatchedTokenException) {
			org.antlr.runtime3_4_0.MismatchedTokenException mte = (org.antlr.runtime3_4_0.MismatchedTokenException) e;
			String expectedTokenName = formatTokenName(mte.expecting);
			String actualTokenName = formatTokenName(e.token.getType());
			message = "Syntax error on token \"" + e.token.getText() + " (" + actualTokenName + ")\", \"" + expectedTokenName + "\" expected";
		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedTreeNodeException) {
			org.antlr.runtime3_4_0.MismatchedTreeNodeException mtne = (org.antlr.runtime3_4_0.MismatchedTreeNodeException) e;
			String expectedTokenName = formatTokenName(mtne.expecting);
			message = "mismatched tree node: " + "xxx" + "; tokenName " + expectedTokenName;
		} else if (e instanceof org.antlr.runtime3_4_0.NoViableAltException) {
			message = "Syntax error on token \"" + e.token.getText() + "\", check following tokens";
		} else if (e instanceof org.antlr.runtime3_4_0.EarlyExitException) {
			message = "Syntax error on token \"" + e.token.getText() + "\", delete this token";
		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedSetException) {
			org.antlr.runtime3_4_0.MismatchedSetException mse = (org.antlr.runtime3_4_0.MismatchedSetException) e;
			message = "mismatched token: " + e.token + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedNotSetException) {
			org.antlr.runtime3_4_0.MismatchedNotSetException mse = (org.antlr.runtime3_4_0.MismatchedNotSetException) e;
			message = "mismatched token: " +  e.token + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_4_0.FailedPredicateException) {
			org.antlr.runtime3_4_0.FailedPredicateException fpe = (org.antlr.runtime3_4_0.FailedPredicateException) e;
			message = "rule " + fpe.ruleName + " failed predicate: {" +  fpe.predicateText + "}?";
		}
		// the resource may be null if the parser is used for code completion
		final String finalMessage = message;
		if (e.token instanceof org.antlr.runtime3_4_0.CommonToken) {
			final org.antlr.runtime3_4_0.CommonToken ct = (org.antlr.runtime3_4_0.CommonToken) e.token;
			addErrorToResource(finalMessage, ct.getCharPositionInLine(), ct.getLine(), ct.getStartIndex(), ct.getStopIndex());
		} else {
			addErrorToResource(finalMessage, e.token.getCharPositionInLine(), e.token.getLine(), 1, 5);
		}
	}
	
	/**
	 * Translates errors thrown by the lexer into human readable messages.
	 */
	public void reportLexicalError(final org.antlr.runtime3_4_0.RecognitionException e)  {
		String message = "";
		if (e instanceof org.antlr.runtime3_4_0.MismatchedTokenException) {
			org.antlr.runtime3_4_0.MismatchedTokenException mte = (org.antlr.runtime3_4_0.MismatchedTokenException) e;
			message = "Syntax error on token \"" + ((char) e.c) + "\", \"" + (char) mte.expecting + "\" expected";
		} else if (e instanceof org.antlr.runtime3_4_0.NoViableAltException) {
			message = "Syntax error on token \"" + ((char) e.c) + "\", delete this token";
		} else if (e instanceof org.antlr.runtime3_4_0.EarlyExitException) {
			org.antlr.runtime3_4_0.EarlyExitException eee = (org.antlr.runtime3_4_0.EarlyExitException) e;
			message = "required (...)+ loop (decision=" + eee.decisionNumber + ") did not match anything; on line " + e.line + ":" + e.charPositionInLine + " char=" + ((char) e.c) + "'";
		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedSetException) {
			org.antlr.runtime3_4_0.MismatchedSetException mse = (org.antlr.runtime3_4_0.MismatchedSetException) e;
			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedNotSetException) {
			org.antlr.runtime3_4_0.MismatchedNotSetException mse = (org.antlr.runtime3_4_0.MismatchedNotSetException) e;
			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedRangeException) {
			org.antlr.runtime3_4_0.MismatchedRangeException mre = (org.antlr.runtime3_4_0.MismatchedRangeException) e;
			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set '" + (char) mre.a + "'..'" + (char) mre.b + "'";
		} else if (e instanceof org.antlr.runtime3_4_0.FailedPredicateException) {
			org.antlr.runtime3_4_0.FailedPredicateException fpe = (org.antlr.runtime3_4_0.FailedPredicateException) e;
			message = "rule " + fpe.ruleName + " failed predicate: {" + fpe.predicateText + "}?";
		}
		addErrorToResource(message, e.charPositionInLine, e.line, lexerExceptionsPosition.get(lexerExceptions.indexOf(e)), lexerExceptionsPosition.get(lexerExceptions.indexOf(e)));
	}
	
	private void startIncompleteElement(Object object) {
		if (object instanceof org.eclipse.emf.ecore.EObject) {
			this.incompleteObjects.add((org.eclipse.emf.ecore.EObject) object);
		}
	}
	
	private void completedElement(Object object, boolean isContainment) {
		if (isContainment && !this.incompleteObjects.isEmpty()) {
			boolean exists = this.incompleteObjects.remove(object);
			if (!exists) {
			}
		}
		if (object instanceof org.eclipse.emf.ecore.EObject) {
			this.tokenIndexOfLastCompleteElement = getTokenStream().index();
			this.expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
		}
	}
	
	private org.eclipse.emf.ecore.EObject getLastIncompleteElement() {
		if (incompleteObjects.isEmpty()) {
			return null;
		}
		return incompleteObjects.get(incompleteObjects.size() - 1);
	}
	
}

start returns [ org.eclipse.emf.ecore.EObject element = null]
:
	{
		// follow set for start rule(s)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[0]);
		expectedElementsIndexOfLastCompleteElement = 0;
	}
	(
		c0 = parse_org_emftext_language_AdaptiveCyberDefense_DomainDescription{ element = c0; }
	)
	EOF	{
		retrieveLayoutInformation(element, null, null, false);
	}
	
;

parse_org_emftext_language_AdaptiveCyberDefense_DomainDescription returns [org.emftext.language.AdaptiveCyberDefense.DomainDescription element = null]
@init{
}
:
	a0 = 'DomainDescription' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[1]);
	}
	
	(
		a1 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[2]);
	}
	
	a2 = '{' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[3]);
	}
	
	a3 = 'StateVariables' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[4]);
	}
	
	a4 = '=' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[5]);
	}
	
	a5 = '<' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[6]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[7]);
	}
	
	(
		(
			(
				a6_0 = parse_org_emftext_language_AdaptiveCyberDefense_StateVariable				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
						startIncompleteElement(element);
					}
					if (a6_0 != null) {
						if (a6_0 != null) {
							Object value = a6_0;
							addObjectToList(element, org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__STATE_VARIABLES, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_6_0_0_0, a6_0, true);
						copyLocalizationInfos(a6_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[8]);
			}
			
			a7 = ';' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_6_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[9]);
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[10]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[11]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[12]);
	}
	
	a8 = '>' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[13]);
	}
	
	a9 = 'Label' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_8, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[14]);
	}
	
	a10 = '=' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_9, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[15]);
	}
	
	a11 = '<' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_10, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[16]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[17]);
	}
	
	(
		(
			(
				a12_0 = parse_org_emftext_language_AdaptiveCyberDefense_Label				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
						startIncompleteElement(element);
					}
					if (a12_0 != null) {
						if (a12_0 != null) {
							Object value = a12_0;
							addObjectToList(element, org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__LABELS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_11_0_0_0, a12_0, true);
						copyLocalizationInfos(a12_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[18]);
			}
			
			a13 = ';' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_11_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[19]);
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[20]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[21]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[22]);
	}
	
	a14 = '>' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_12, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[23]);
	}
	
	a15 = 'Properties' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_13, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[24]);
	}
	
	a16 = '=' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_14, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a16, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[25]);
	}
	
	a17 = '<' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_15, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[26]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[27]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[28]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[29]);
	}
	
	(
		(
			(
				a18_0 = parse_org_emftext_language_AdaptiveCyberDefense_PCTLStateFormula				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
						startIncompleteElement(element);
					}
					if (a18_0 != null) {
						if (a18_0 != null) {
							Object value = a18_0;
							addObjectToList(element, org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__PROPERTIES, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_16_0_0_0, a18_0, true);
						copyLocalizationInfos(a18_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[30]);
			}
			
			a19 = ';' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_16_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a19, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[31]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[32]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[33]);
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[34]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[35]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[36]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[37]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[38]);
	}
	
	a20 = '>' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_17, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a20, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[39]);
	}
	
	a21 = 'ActionDescriptions' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_18, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a21, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[40]);
	}
	
	a22 = '=' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_19, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a22, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[41]);
	}
	
	a23 = '<' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_20, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a23, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[42]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[43]);
	}
	
	(
		(
			(
				a24_0 = parse_org_emftext_language_AdaptiveCyberDefense_ActionDescription				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
						startIncompleteElement(element);
					}
					if (a24_0 != null) {
						if (a24_0 != null) {
							Object value = a24_0;
							addObjectToList(element, org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__ACTION_DESCRIPTIONS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_21_0_0_0, a24_0, true);
						copyLocalizationInfos(a24_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[44]);
			}
			
			a25 = ';' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_21_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a25, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[45]);
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[46]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[47]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[48]);
	}
	
	a26 = '>' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_22, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a26, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[49]);
	}
	
	a27 = 'EventDescriptions' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_23, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a27, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[50]);
	}
	
	a28 = '=' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_24, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a28, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[51]);
	}
	
	a29 = '<' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_25, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a29, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[52]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[53]);
	}
	
	(
		(
			(
				a30_0 = parse_org_emftext_language_AdaptiveCyberDefense_EventDescription				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
						startIncompleteElement(element);
					}
					if (a30_0 != null) {
						if (a30_0 != null) {
							Object value = a30_0;
							addObjectToList(element, org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__EVENT_DESCRIPTIONS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_26_0_0_0, a30_0, true);
						copyLocalizationInfos(a30_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[54]);
			}
			
			a31 = ';' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_26_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a31, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[55]);
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[56]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[57]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[58]);
	}
	
	a32 = '>' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_27, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a32, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[59]);
	}
	
	a33 = 'Requirements' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_28, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a33, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[60]);
	}
	
	a34 = '=' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_29, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a34, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[61]);
	}
	
	a35 = '<' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_30, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a35, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[62]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[63]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[64]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[65]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[66]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[67]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[68]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[69]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[70]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[71]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[72]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[73]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[74]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[75]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[76]);
	}
	
	(
		(
			(
				a36_0 = parse_org_emftext_language_AdaptiveCyberDefense_Requirement				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
						startIncompleteElement(element);
					}
					if (a36_0 != null) {
						if (a36_0 != null) {
							Object value = a36_0;
							addObjectToList(element, org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__REQUIREMENTS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_31_0_0_0, a36_0, true);
						copyLocalizationInfos(a36_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[77]);
			}
			
			a37 = ';' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_31_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a37, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[78]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[79]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[80]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[81]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[82]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[83]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[84]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[85]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[86]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[87]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[88]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[89]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[90]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[91]);
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[92]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[93]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[94]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[95]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[96]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[97]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[98]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[99]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[100]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[101]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[102]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[103]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[104]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[105]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[106]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[107]);
	}
	
	a38 = '>' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_32, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a38, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[108]);
	}
	
	a39 = 'CurrentState' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_33, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a39, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[109]);
	}
	
	a40 = '=' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_34, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a40, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[110]);
	}
	
	a41 = '<' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_35, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a41, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[111]);
	}
	
	(
		a42_0 = parse_org_emftext_language_AdaptiveCyberDefense_InitialAtom		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
				startIncompleteElement(element);
			}
			if (a42_0 != null) {
				if (a42_0 != null) {
					Object value = a42_0;
					addObjectToList(element, org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__INITIAL_ATOMS, value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_36, a42_0, true);
				copyLocalizationInfos(a42_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[112]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[113]);
	}
	
	(
		(
			a43 = ',' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_37_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a43, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDomainDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[114]);
			}
			
			(
				a44_0 = parse_org_emftext_language_AdaptiveCyberDefense_InitialAtom				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
						startIncompleteElement(element);
					}
					if (a44_0 != null) {
						if (a44_0 != null) {
							Object value = a44_0;
							addObjectToList(element, org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__INITIAL_ATOMS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_37_0_0_1, a44_0, true);
						copyLocalizationInfos(a44_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[115]);
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[116]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[117]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[118]);
	}
	
	a45 = '>' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_38, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a45, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[119]);
	}
	
	a46 = '}' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDomainDescription();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_0_0_0_39, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a46, element);
	}
	{
		// expected elements (follow set)
	}
	
;

parse_org_emftext_language_AdaptiveCyberDefense_StateVariable returns [org.emftext.language.AdaptiveCyberDefense.StateVariable element = null]
@init{
}
:
	a0 = 'Variable' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createStateVariable();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_1_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[120]);
	}
	
	(
		a1 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createStateVariable();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.STATE_VARIABLE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.STATE_VARIABLE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_1_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[121]);
	}
	
	a2 = 'domain' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createStateVariable();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_1_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[122]);
	}
	
	a3 = '{' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createStateVariable();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_1_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[123]);
	}
	
	(
		a4 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createStateVariable();
				startIncompleteElement(element);
			}
			if (a4 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.STATE_VARIABLE__VALUES), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					addObjectToList(element, org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.STATE_VARIABLE__VALUES, value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_1_0_0_4, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[124]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[125]);
	}
	
	(
		(
			a5 = ',' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createStateVariable();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_1_0_0_5_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[126]);
			}
			
			(
				a6 = IDENTIFIER				
				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createStateVariable();
						startIncompleteElement(element);
					}
					if (a6 != null) {
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
						tokenResolver.setOptions(getOptions());
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.STATE_VARIABLE__VALUES), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a6).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.STATE_VARIABLE__VALUES, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_1_0_0_5_0_0_1, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a6, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[127]);
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[128]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[129]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[130]);
	}
	
	a7 = '}' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createStateVariable();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_1_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[131]);
	}
	
;

parse_org_emftext_language_AdaptiveCyberDefense_ActionDescription returns [org.emftext.language.AdaptiveCyberDefense.ActionDescription element = null]
@init{
}
:
	a0 = 'Action' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createActionDescription();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_2_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[132]);
	}
	
	(
		a1 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createActionDescription();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_2_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[133]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getActionDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[134]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getActionDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[135]);
	}
	
	(
		(
			a2 = '=' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createActionDescription();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_2_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[136]);
			}
			
			(
				a3 = IDENTIFIER				
				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createActionDescription();
						startIncompleteElement(element);
					}
					if (a3 != null) {
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
						tokenResolver.setOptions(getOptions());
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__VALUE), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__VALUE), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_2_0_0_2_0_0_1, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getActionDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[137]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getActionDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[138]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getActionDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[139]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getActionDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[140]);
	}
	
	(
		(
			a4_0 = parse_org_emftext_language_AdaptiveCyberDefense_ContextualEffect			{
				if (terminateParsing) {
					throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
				}
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createActionDescription();
					startIncompleteElement(element);
				}
				if (a4_0 != null) {
					if (a4_0 != null) {
						Object value = a4_0;
						addObjectToList(element, org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__CONTEXTUAL_EFFECTS, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_2_0_0_3, a4_0, true);
					copyLocalizationInfos(a4_0, element);
				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getActionDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[141]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getActionDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[142]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[143]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[144]);
	}
	
	(
		(
			a5 = 'cost' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createActionDescription();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_2_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[145]);
			}
			
			(
				a6 = FLOAT				
				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createActionDescription();
						startIncompleteElement(element);
					}
					if (a6 != null) {
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("FLOAT");
						tokenResolver.setOptions(getOptions());
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__COST), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a6).getStopIndex());
						}
						java.math.BigDecimal resolved = (java.math.BigDecimal) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__COST), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_2_0_0_4_0_0_1, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a6, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[146]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[147]);
	}
	
;

parse_org_emftext_language_AdaptiveCyberDefense_EventDescription returns [org.emftext.language.AdaptiveCyberDefense.EventDescription element = null]
@init{
}
:
	a0 = 'Event' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createEventDescription();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_3_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[148]);
	}
	
	(
		a1 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createEventDescription();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_3_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[149]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getEventDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[150]);
	}
	
	(
		(
			a2 = '=' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createEventDescription();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_3_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[151]);
			}
			
			(
				a3 = IDENTIFIER				
				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createEventDescription();
						startIncompleteElement(element);
					}
					if (a3 != null) {
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
						tokenResolver.setOptions(getOptions());
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__VALUE), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__VALUE), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_3_0_0_2_0_0_1, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getEventDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[152]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getEventDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[153]);
	}
	
	(
		(
			a4_0 = parse_org_emftext_language_AdaptiveCyberDefense_ProbabilisticContextualEffect			{
				if (terminateParsing) {
					throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
				}
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createEventDescription();
					startIncompleteElement(element);
				}
				if (a4_0 != null) {
					if (a4_0 != null) {
						Object value = a4_0;
						addObjectToList(element, org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__PROBABILISTIC_CONTEXTUAL_EFFECTS, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_3_0_0_3, a4_0, true);
					copyLocalizationInfos(a4_0, element);
				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getEventDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[154]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[155]);
	}
	
;

parse_org_emftext_language_AdaptiveCyberDefense_ProbabilisticContextualEffect returns [org.emftext.language.AdaptiveCyberDefense.ProbabilisticContextualEffect element = null]
@init{
}
:
	a0 = 'if' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createProbabilisticContextualEffect();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_4_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getProbabilisticContextualEffect(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[156]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getProbabilisticContextualEffect(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[157]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getProbabilisticContextualEffect(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[158]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getProbabilisticContextualEffect(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[159]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getProbabilisticContextualEffect(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[160]);
	}
	
	(
		a1_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createProbabilisticContextualEffect();
				startIncompleteElement(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PROBABILISTIC_CONTEXTUAL_EFFECT__CONTEXT), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_4_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[161]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[162]);
	}
	
	(
		(
			a2 = 'occurrence probability' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createProbabilisticContextualEffect();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_4_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[163]);
			}
			
			(
				a3 = FLOAT				
				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createProbabilisticContextualEffect();
						startIncompleteElement(element);
					}
					if (a3 != null) {
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("FLOAT");
						tokenResolver.setOptions(getOptions());
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PROBABILISTIC_CONTEXTUAL_EFFECT__OCCURRENCE_PROBABILITY), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
						}
						java.math.BigDecimal resolved = (java.math.BigDecimal) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PROBABILISTIC_CONTEXTUAL_EFFECT__OCCURRENCE_PROBABILITY), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_4_0_0_2_0_0_1, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[164]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[165]);
	}
	
	a4 = 'effects' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createProbabilisticContextualEffect();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_4_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getProbabilisticContextualEffect(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[166]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getActionDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[167]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getActionDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[168]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[169]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[170]);
	}
	
	(
		(
			a5_0 = parse_org_emftext_language_AdaptiveCyberDefense_ProbabilisticEffect			{
				if (terminateParsing) {
					throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
				}
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createProbabilisticContextualEffect();
					startIncompleteElement(element);
				}
				if (a5_0 != null) {
					if (a5_0 != null) {
						Object value = a5_0;
						addObjectToList(element, org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PROBABILISTIC_CONTEXTUAL_EFFECT__EFFECTS, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_4_0_0_4, a5_0, true);
					copyLocalizationInfos(a5_0, element);
				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getProbabilisticContextualEffect(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[171]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getActionDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[172]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getActionDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[173]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[174]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[175]);
	}
	
;

parse_org_emftext_language_AdaptiveCyberDefense_ContextualEffect returns [org.emftext.language.AdaptiveCyberDefense.ContextualEffect element = null]
@init{
}
:
	a0 = 'if' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createContextualEffect();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_5_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getContextualEffect(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[176]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getContextualEffect(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[177]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getContextualEffect(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[178]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getContextualEffect(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[179]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getContextualEffect(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[180]);
	}
	
	(
		a1_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createContextualEffect();
				startIncompleteElement(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CONTEXTUAL_EFFECT__CONTEXT), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_5_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[181]);
	}
	
	a2 = 'effects' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createContextualEffect();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_5_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getContextualEffect(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[182]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getActionDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[183]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getActionDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[184]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[185]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[186]);
	}
	
	(
		(
			a3_0 = parse_org_emftext_language_AdaptiveCyberDefense_ProbabilisticEffect			{
				if (terminateParsing) {
					throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
				}
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createContextualEffect();
					startIncompleteElement(element);
				}
				if (a3_0 != null) {
					if (a3_0 != null) {
						Object value = a3_0;
						addObjectToList(element, org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CONTEXTUAL_EFFECT__EFFECTS, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_5_0_0_3, a3_0, true);
					copyLocalizationInfos(a3_0, element);
				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getContextualEffect(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[187]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getActionDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[188]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getActionDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[189]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[190]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[191]);
	}
	
	|//derived choice rules for sub-classes: 
	
	c0 = parse_org_emftext_language_AdaptiveCyberDefense_ProbabilisticContextualEffect{ element = c0; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_emftext_language_AdaptiveCyberDefense_UA returns [org.emftext.language.AdaptiveCyberDefense.UA element = null]
@init{
}
:
	a0 = 'ReqID' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createUA();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_6_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[192]);
	}
	
	(
		a1 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createUA();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UA__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UA__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_6_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[193]);
	}
	
	a2 = 'achieve' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createUA();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_6_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getUA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[194]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getUA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[195]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getUA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[196]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getUA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[197]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getUA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[198]);
	}
	
	(
		a3_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createUA();
				startIncompleteElement(element);
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					Object value = a3_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UA__CONDITION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_6_0_0_3, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[199]);
	}
	
	a4 = 'reward' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createUA();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_6_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[200]);
	}
	
	(
		a5 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createUA();
				startIncompleteElement(element);
			}
			if (a5 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UA__REWARD), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UA__REWARD), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_6_0_0_5, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[201]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[202]);
	}
	
	(
		(
			a6 = 'description' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createUA();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_6_0_0_6_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[203]);
			}
			
			(
				a7 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createUA();
						startIncompleteElement(element);
					}
					if (a7 != null) {
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UA__DESCRIPTION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UA__DESCRIPTION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_6_0_0_6_0_0_1, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a7, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[204]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[205]);
	}
	
;

parse_org_emftext_language_AdaptiveCyberDefense_CA returns [org.emftext.language.AdaptiveCyberDefense.CA element = null]
@init{
}
:
	a0 = 'ReqID' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createCA();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_7_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[206]);
	}
	
	(
		a1 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createCA();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CA__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CA__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_7_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[207]);
	}
	
	a2 = 'achieve' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createCA();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_7_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getCA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[208]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getCA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[209]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getCA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[210]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getCA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[211]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getCA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[212]);
	}
	
	(
		a3_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createCA();
				startIncompleteElement(element);
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					Object value = a3_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CA__CONDITION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_7_0_0_3, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[213]);
	}
	
	a4 = 'if' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createCA();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_7_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getCA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[214]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getCA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[215]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getCA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[216]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getCA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[217]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getCA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[218]);
	}
	
	(
		a5_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createCA();
				startIncompleteElement(element);
			}
			if (a5_0 != null) {
				if (a5_0 != null) {
					Object value = a5_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CA__ACTIVATION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_7_0_0_5, a5_0, true);
				copyLocalizationInfos(a5_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[219]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[220]);
	}
	
	(
		(
			a6 = 'unless' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createCA();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_7_0_0_6_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getCA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[221]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getCA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[222]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getCA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[223]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getCA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[224]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getCA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[225]);
			}
			
			(
				a7_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createCA();
						startIncompleteElement(element);
					}
					if (a7_0 != null) {
						if (a7_0 != null) {
							Object value = a7_0;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CA__CANCELLATION), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_7_0_0_6_0_0_1, a7_0, true);
						copyLocalizationInfos(a7_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[226]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[227]);
	}
	
	a8 = 'reward' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createCA();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_7_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[228]);
	}
	
	(
		a9 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createCA();
				startIncompleteElement(element);
			}
			if (a9 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a9.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CA__REWARD), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a9).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a9).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a9).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a9).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CA__REWARD), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_7_0_0_8, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a9, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[229]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[230]);
	}
	
	(
		(
			a10 = 'description' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createCA();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_7_0_0_9_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[231]);
			}
			
			(
				a11 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createCA();
						startIncompleteElement(element);
					}
					if (a11 != null) {
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a11.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CA__DESCRIPTION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a11).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a11).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a11).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a11).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CA__DESCRIPTION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_7_0_0_9_0_0_1, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a11, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[232]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[233]);
	}
	
;

parse_org_emftext_language_AdaptiveCyberDefense_DEA returns [org.emftext.language.AdaptiveCyberDefense.DEA element = null]
@init{
}
:
	a0 = 'ReqID' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDEA();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_8_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[234]);
	}
	
	(
		a1 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDEA();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEA__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEA__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_8_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[235]);
	}
	
	a2 = 'achieve' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDEA();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_8_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDEA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[236]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDEA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[237]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDEA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[238]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDEA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[239]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDEA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[240]);
	}
	
	(
		a3_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDEA();
				startIncompleteElement(element);
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					Object value = a3_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEA__CONDITION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_8_0_0_3, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[241]);
	}
	
	a4 = 'after' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDEA();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_8_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[242]);
	}
	
	(
		a5 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDEA();
				startIncompleteElement(element);
			}
			if (a5 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEA__DEADLINE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEA__DEADLINE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_8_0_0_5, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[243]);
	}
	
	a6 = 'if' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDEA();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_8_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDEA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[244]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDEA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[245]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDEA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[246]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDEA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[247]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDEA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[248]);
	}
	
	(
		a7_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDEA();
				startIncompleteElement(element);
			}
			if (a7_0 != null) {
				if (a7_0 != null) {
					Object value = a7_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEA__ACTIVATION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_8_0_0_7, a7_0, true);
				copyLocalizationInfos(a7_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[249]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[250]);
	}
	
	(
		(
			a8 = 'unless' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDEA();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_8_0_0_8_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDEA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[251]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDEA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[252]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDEA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[253]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDEA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[254]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDEA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[255]);
			}
			
			(
				a9_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDEA();
						startIncompleteElement(element);
					}
					if (a9_0 != null) {
						if (a9_0 != null) {
							Object value = a9_0;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEA__CANCELLATION), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_8_0_0_8_0_0_1, a9_0, true);
						copyLocalizationInfos(a9_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[256]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[257]);
	}
	
	a10 = 'reward' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDEA();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_8_0_0_9, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[258]);
	}
	
	(
		a11 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDEA();
				startIncompleteElement(element);
			}
			if (a11 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a11.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEA__REWARD), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a11).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a11).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a11).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a11).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEA__REWARD), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_8_0_0_10, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a11, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[259]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[260]);
	}
	
	(
		(
			a12 = 'description' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDEA();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_8_0_0_11_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[261]);
			}
			
			(
				a13 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDEA();
						startIncompleteElement(element);
					}
					if (a13 != null) {
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a13.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEA__DESCRIPTION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a13).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEA__DESCRIPTION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_8_0_0_11_0_0_1, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a13, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[262]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[263]);
	}
	
;

parse_org_emftext_language_AdaptiveCyberDefense_DFA returns [org.emftext.language.AdaptiveCyberDefense.DFA element = null]
@init{
}
:
	a0 = 'ReqID' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDFA();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_9_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[264]);
	}
	
	(
		a1 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDFA();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFA__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFA__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_9_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[265]);
	}
	
	a2 = 'achieve' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDFA();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_9_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDFA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[266]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDFA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[267]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDFA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[268]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDFA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[269]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDFA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[270]);
	}
	
	(
		a3_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDFA();
				startIncompleteElement(element);
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					Object value = a3_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFA__CONDITION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_9_0_0_3, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[271]);
	}
	
	a4 = 'within' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDFA();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_9_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[272]);
	}
	
	(
		a5 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDFA();
				startIncompleteElement(element);
			}
			if (a5 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFA__DEADLINE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFA__DEADLINE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_9_0_0_5, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[273]);
	}
	
	a6 = 'if' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDFA();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_9_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDFA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[274]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDFA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[275]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDFA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[276]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDFA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[277]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDFA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[278]);
	}
	
	(
		a7_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDFA();
				startIncompleteElement(element);
			}
			if (a7_0 != null) {
				if (a7_0 != null) {
					Object value = a7_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFA__ACTIVATION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_9_0_0_7, a7_0, true);
				copyLocalizationInfos(a7_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[279]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[280]);
	}
	
	(
		(
			a8 = 'unless' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDFA();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_9_0_0_8_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDFA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[281]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDFA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[282]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDFA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[283]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDFA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[284]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDFA(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[285]);
			}
			
			(
				a9_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDFA();
						startIncompleteElement(element);
					}
					if (a9_0 != null) {
						if (a9_0 != null) {
							Object value = a9_0;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFA__CANCELLATION), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_9_0_0_8_0_0_1, a9_0, true);
						copyLocalizationInfos(a9_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[286]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[287]);
	}
	
	a10 = 'reward' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDFA();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_9_0_0_9, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[288]);
	}
	
	(
		a11 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDFA();
				startIncompleteElement(element);
			}
			if (a11 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a11.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFA__REWARD), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a11).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a11).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a11).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a11).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFA__REWARD), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_9_0_0_10, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a11, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[289]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[290]);
	}
	
	(
		(
			a12 = 'description' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDFA();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_9_0_0_11_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[291]);
			}
			
			(
				a13 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDFA();
						startIncompleteElement(element);
					}
					if (a13 != null) {
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a13.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFA__DESCRIPTION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a13).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFA__DESCRIPTION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_9_0_0_11_0_0_1, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a13, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[292]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[293]);
	}
	
;

parse_org_emftext_language_AdaptiveCyberDefense_UM returns [org.emftext.language.AdaptiveCyberDefense.UM element = null]
@init{
}
:
	a0 = 'ReqID' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createUM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_10_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[294]);
	}
	
	(
		a1 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createUM();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UM__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UM__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_10_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[295]);
	}
	
	a2 = 'maintain' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createUM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_10_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getUM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[296]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getUM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[297]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getUM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[298]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getUM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[299]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getUM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[300]);
	}
	
	(
		a3_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createUM();
				startIncompleteElement(element);
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					Object value = a3_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UM__CONDITION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_10_0_0_3, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[301]);
	}
	
	a4 = 'reward' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createUM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_10_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[302]);
	}
	
	(
		a5 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createUM();
				startIncompleteElement(element);
			}
			if (a5 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UM__REWARD), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UM__REWARD), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_10_0_0_5, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[303]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[304]);
	}
	
	(
		(
			a6 = 'description' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createUM();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_10_0_0_6_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[305]);
			}
			
			(
				a7 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createUM();
						startIncompleteElement(element);
					}
					if (a7 != null) {
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UM__DESCRIPTION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UM__DESCRIPTION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_10_0_0_6_0_0_1, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a7, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[306]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[307]);
	}
	
;

parse_org_emftext_language_AdaptiveCyberDefense_CM returns [org.emftext.language.AdaptiveCyberDefense.CM element = null]
@init{
}
:
	a0 = 'ReqID' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createCM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_11_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[308]);
	}
	
	(
		a1 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createCM();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CM__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CM__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_11_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[309]);
	}
	
	a2 = 'maintain' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createCM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_11_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getCM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[310]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getCM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[311]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getCM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[312]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getCM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[313]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getCM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[314]);
	}
	
	(
		a3_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createCM();
				startIncompleteElement(element);
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					Object value = a3_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CM__CONDITION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_11_0_0_3, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[315]);
	}
	
	a4 = 'if' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createCM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_11_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getCM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[316]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getCM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[317]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getCM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[318]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getCM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[319]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getCM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[320]);
	}
	
	(
		a5_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createCM();
				startIncompleteElement(element);
			}
			if (a5_0 != null) {
				if (a5_0 != null) {
					Object value = a5_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CM__ACTIVATION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_11_0_0_5, a5_0, true);
				copyLocalizationInfos(a5_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[321]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[322]);
	}
	
	(
		(
			a6 = 'unless' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createCM();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_11_0_0_6_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getCM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[323]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getCM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[324]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getCM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[325]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getCM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[326]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getCM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[327]);
			}
			
			(
				a7_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createCM();
						startIncompleteElement(element);
					}
					if (a7_0 != null) {
						if (a7_0 != null) {
							Object value = a7_0;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CM__CANCELLATION), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_11_0_0_6_0_0_1, a7_0, true);
						copyLocalizationInfos(a7_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[328]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[329]);
	}
	
	a8 = 'reward' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createCM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_11_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[330]);
	}
	
	(
		a9 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createCM();
				startIncompleteElement(element);
			}
			if (a9 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a9.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CM__REWARD), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a9).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a9).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a9).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a9).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CM__REWARD), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_11_0_0_8, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a9, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[331]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[332]);
	}
	
	(
		(
			a10 = 'description' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createCM();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_11_0_0_9_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[333]);
			}
			
			(
				a11 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createCM();
						startIncompleteElement(element);
					}
					if (a11 != null) {
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a11.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CM__DESCRIPTION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a11).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a11).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a11).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a11).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CM__DESCRIPTION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_11_0_0_9_0_0_1, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a11, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[334]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[335]);
	}
	
;

parse_org_emftext_language_AdaptiveCyberDefense_DEM returns [org.emftext.language.AdaptiveCyberDefense.DEM element = null]
@init{
}
:
	a0 = 'ReqID' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDEM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_12_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[336]);
	}
	
	(
		a1 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDEM();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEM__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEM__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_12_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[337]);
	}
	
	a2 = 'maintain' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDEM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_12_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[338]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[339]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[340]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[341]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[342]);
	}
	
	(
		a3_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDEM();
				startIncompleteElement(element);
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					Object value = a3_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEM__CONDITION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_12_0_0_3, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[343]);
	}
	
	a4 = 'after' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDEM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_12_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[344]);
	}
	
	(
		a5 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDEM();
				startIncompleteElement(element);
			}
			if (a5 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEM__DEADLINE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEM__DEADLINE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_12_0_0_5, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[345]);
	}
	
	a6 = 'if' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDEM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_12_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[346]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[347]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[348]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[349]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[350]);
	}
	
	(
		a7_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDEM();
				startIncompleteElement(element);
			}
			if (a7_0 != null) {
				if (a7_0 != null) {
					Object value = a7_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEM__ACTIVATION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_12_0_0_7, a7_0, true);
				copyLocalizationInfos(a7_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[351]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[352]);
	}
	
	(
		(
			a8 = 'unless' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDEM();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_12_0_0_8_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[353]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[354]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[355]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[356]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[357]);
			}
			
			(
				a9_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDEM();
						startIncompleteElement(element);
					}
					if (a9_0 != null) {
						if (a9_0 != null) {
							Object value = a9_0;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEM__CANCELLATION), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_12_0_0_8_0_0_1, a9_0, true);
						copyLocalizationInfos(a9_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[358]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[359]);
	}
	
	a10 = 'reward' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDEM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_12_0_0_9, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[360]);
	}
	
	(
		a11 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDEM();
				startIncompleteElement(element);
			}
			if (a11 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a11.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEM__REWARD), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a11).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a11).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a11).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a11).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEM__REWARD), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_12_0_0_10, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a11, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[361]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[362]);
	}
	
	(
		(
			a12 = 'description' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDEM();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_12_0_0_11_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[363]);
			}
			
			(
				a13 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDEM();
						startIncompleteElement(element);
					}
					if (a13 != null) {
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a13.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEM__DESCRIPTION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a13).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DEM__DESCRIPTION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_12_0_0_11_0_0_1, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a13, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[364]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[365]);
	}
	
;

parse_org_emftext_language_AdaptiveCyberDefense_DFM returns [org.emftext.language.AdaptiveCyberDefense.DFM element = null]
@init{
}
:
	a0 = 'ReqID' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDFM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_13_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[366]);
	}
	
	(
		a1 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDFM();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFM__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFM__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_13_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[367]);
	}
	
	a2 = 'maintain' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDFM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_13_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[368]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[369]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[370]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[371]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[372]);
	}
	
	(
		a3_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDFM();
				startIncompleteElement(element);
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					Object value = a3_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFM__CONDITION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_13_0_0_3, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[373]);
	}
	
	a4 = 'within' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDFM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_13_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[374]);
	}
	
	(
		a5 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDFM();
				startIncompleteElement(element);
			}
			if (a5 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFM__DEADLINE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFM__DEADLINE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_13_0_0_5, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[375]);
	}
	
	a6 = 'if' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDFM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_13_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[376]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[377]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[378]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[379]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[380]);
	}
	
	(
		a7_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDFM();
				startIncompleteElement(element);
			}
			if (a7_0 != null) {
				if (a7_0 != null) {
					Object value = a7_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFM__ACTIVATION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_13_0_0_7, a7_0, true);
				copyLocalizationInfos(a7_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[381]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[382]);
	}
	
	(
		(
			a8 = 'unless' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDFM();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_13_0_0_8_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[383]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[384]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[385]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[386]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[387]);
			}
			
			(
				a9_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDFM();
						startIncompleteElement(element);
					}
					if (a9_0 != null) {
						if (a9_0 != null) {
							Object value = a9_0;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFM__CANCELLATION), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_13_0_0_8_0_0_1, a9_0, true);
						copyLocalizationInfos(a9_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[388]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[389]);
	}
	
	a10 = 'reward' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDFM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_13_0_0_9, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[390]);
	}
	
	(
		a11 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDFM();
				startIncompleteElement(element);
			}
			if (a11 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a11.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFM__REWARD), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a11).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a11).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a11).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a11).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFM__REWARD), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_13_0_0_10, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a11, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[391]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[392]);
	}
	
	(
		(
			a12 = 'description' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDFM();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_13_0_0_11_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[393]);
			}
			
			(
				a13 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDFM();
						startIncompleteElement(element);
					}
					if (a13 != null) {
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a13.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFM__DESCRIPTION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a13).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DFM__DESCRIPTION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_13_0_0_11_0_0_1, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a13, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[394]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[395]);
	}
	
;

parse_org_emftext_language_AdaptiveCyberDefense_PM returns [org.emftext.language.AdaptiveCyberDefense.PM element = null]
@init{
}
:
	a0 = 'ReqID' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_14_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[396]);
	}
	
	(
		a1 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPM();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PM__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PM__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_14_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[397]);
	}
	
	a2 = 'maintain' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_14_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[398]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[399]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[400]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[401]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[402]);
	}
	
	(
		a3_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPM();
				startIncompleteElement(element);
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					Object value = a3_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PM__CONDITION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_14_0_0_3, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[403]);
	}
	
	a4 = 'for' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_14_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[404]);
	}
	
	(
		a5 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPM();
				startIncompleteElement(element);
			}
			if (a5 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PM__DURATION), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PM__DURATION), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_14_0_0_5, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[405]);
	}
	
	a6 = 'if' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_14_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[406]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[407]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[408]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[409]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[410]);
	}
	
	(
		a7_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPM();
				startIncompleteElement(element);
			}
			if (a7_0 != null) {
				if (a7_0 != null) {
					Object value = a7_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PM__ACTIVATION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_14_0_0_7, a7_0, true);
				copyLocalizationInfos(a7_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[411]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[412]);
	}
	
	(
		(
			a8 = 'unless' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPM();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_14_0_0_8_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[413]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[414]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[415]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[416]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[417]);
			}
			
			(
				a9_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPM();
						startIncompleteElement(element);
					}
					if (a9_0 != null) {
						if (a9_0 != null) {
							Object value = a9_0;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PM__CANCELLATION), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_14_0_0_8_0_0_1, a9_0, true);
						copyLocalizationInfos(a9_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[418]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[419]);
	}
	
	a10 = 'reward' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_14_0_0_9, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[420]);
	}
	
	(
		a11 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPM();
				startIncompleteElement(element);
			}
			if (a11 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a11.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PM__REWARD), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a11).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a11).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a11).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a11).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PM__REWARD), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_14_0_0_10, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a11, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[421]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[422]);
	}
	
	(
		(
			a12 = 'description' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPM();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_14_0_0_11_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[423]);
			}
			
			(
				a13 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPM();
						startIncompleteElement(element);
					}
					if (a13 != null) {
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a13.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PM__DESCRIPTION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a13).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PM__DESCRIPTION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_14_0_0_11_0_0_1, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a13, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[424]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[425]);
	}
	
;

parse_org_emftext_language_AdaptiveCyberDefense_RPM returns [org.emftext.language.AdaptiveCyberDefense.RPM element = null]
@init{
}
:
	a0 = 'ReqID' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_15_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[426]);
	}
	
	(
		a1 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPM();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPM__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPM__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_15_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[427]);
	}
	
	a2 = 'maintain' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_15_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[428]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[429]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[430]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[431]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[432]);
	}
	
	(
		a3_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPM();
				startIncompleteElement(element);
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					Object value = a3_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPM__CONDITION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_15_0_0_3, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[433]);
	}
	
	a4 = 'for' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_15_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[434]);
	}
	
	(
		a5 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPM();
				startIncompleteElement(element);
			}
			if (a5 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPM__DURATION), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPM__DURATION), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_15_0_0_5, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[435]);
	}
	
	a6 = 'if' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_15_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[436]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[437]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[438]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[439]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[440]);
	}
	
	(
		a7_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPM();
				startIncompleteElement(element);
			}
			if (a7_0 != null) {
				if (a7_0 != null) {
					Object value = a7_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPM__ACTIVATION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_15_0_0_7, a7_0, true);
				copyLocalizationInfos(a7_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[441]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[442]);
	}
	
	(
		(
			a8 = 'unless' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPM();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_15_0_0_8_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[443]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[444]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[445]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[446]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[447]);
			}
			
			(
				a9_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPM();
						startIncompleteElement(element);
					}
					if (a9_0 != null) {
						if (a9_0 != null) {
							Object value = a9_0;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPM__CANCELLATION), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_15_0_0_8_0_0_1, a9_0, true);
						copyLocalizationInfos(a9_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[448]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[449]);
	}
	
	a10 = 'reward_once' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_15_0_0_9, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[450]);
	}
	
	(
		a11 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPM();
				startIncompleteElement(element);
			}
			if (a11 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a11.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPM__REWARD), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a11).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a11).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a11).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a11).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPM__REWARD), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_15_0_0_10, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a11, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[451]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[452]);
	}
	
	(
		(
			a12 = 'description' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPM();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_15_0_0_11_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[453]);
			}
			
			(
				a13 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPM();
						startIncompleteElement(element);
					}
					if (a13 != null) {
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a13.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPM__DESCRIPTION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a13).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPM__DESCRIPTION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_15_0_0_11_0_0_1, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a13, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[454]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[455]);
	}
	
;

parse_org_emftext_language_AdaptiveCyberDefense_PDEM returns [org.emftext.language.AdaptiveCyberDefense.PDEM element = null]
@init{
}
:
	a0 = 'ReqID' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPDEM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_16_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[456]);
	}
	
	(
		a1 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPDEM();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDEM__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDEM__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_16_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[457]);
	}
	
	a2 = 'maintain' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPDEM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_16_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[458]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[459]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[460]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[461]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[462]);
	}
	
	(
		a3_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPDEM();
				startIncompleteElement(element);
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					Object value = a3_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDEM__CONDITION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_16_0_0_3, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[463]);
	}
	
	a4 = 'for' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPDEM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_16_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[464]);
	}
	
	(
		a5 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPDEM();
				startIncompleteElement(element);
			}
			if (a5 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDEM__DURATION), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDEM__DURATION), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_16_0_0_5, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[465]);
	}
	
	a6 = 'after' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPDEM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_16_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[466]);
	}
	
	(
		a7 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPDEM();
				startIncompleteElement(element);
			}
			if (a7 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDEM__DEADLINE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDEM__DEADLINE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_16_0_0_7, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a7, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[467]);
	}
	
	a8 = 'if' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPDEM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_16_0_0_8, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[468]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[469]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[470]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[471]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[472]);
	}
	
	(
		a9_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPDEM();
				startIncompleteElement(element);
			}
			if (a9_0 != null) {
				if (a9_0 != null) {
					Object value = a9_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDEM__ACTIVATION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_16_0_0_9, a9_0, true);
				copyLocalizationInfos(a9_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[473]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[474]);
	}
	
	(
		(
			a10 = 'unless' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPDEM();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_16_0_0_10_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[475]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[476]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[477]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[478]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[479]);
			}
			
			(
				a11_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPDEM();
						startIncompleteElement(element);
					}
					if (a11_0 != null) {
						if (a11_0 != null) {
							Object value = a11_0;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDEM__CANCELLATION), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_16_0_0_10_0_0_1, a11_0, true);
						copyLocalizationInfos(a11_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[480]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[481]);
	}
	
	a12 = 'reward' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPDEM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_16_0_0_11, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[482]);
	}
	
	(
		a13 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPDEM();
				startIncompleteElement(element);
			}
			if (a13 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a13.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDEM__REWARD), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a13).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDEM__REWARD), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_16_0_0_12, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a13, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[483]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[484]);
	}
	
	(
		(
			a14 = 'description' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPDEM();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_16_0_0_13_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[485]);
			}
			
			(
				a15 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPDEM();
						startIncompleteElement(element);
					}
					if (a15 != null) {
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a15.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDEM__DESCRIPTION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a15).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a15).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a15).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a15).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDEM__DESCRIPTION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_16_0_0_13_0_0_1, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a15, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[486]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[487]);
	}
	
;

parse_org_emftext_language_AdaptiveCyberDefense_RPDEM returns [org.emftext.language.AdaptiveCyberDefense.RPDEM element = null]
@init{
}
:
	a0 = 'ReqID' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPDEM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_17_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[488]);
	}
	
	(
		a1 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPDEM();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDEM__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDEM__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_17_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[489]);
	}
	
	a2 = 'maintain' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPDEM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_17_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[490]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[491]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[492]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[493]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[494]);
	}
	
	(
		a3_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPDEM();
				startIncompleteElement(element);
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					Object value = a3_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDEM__CONDITION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_17_0_0_3, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[495]);
	}
	
	a4 = 'for' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPDEM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_17_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[496]);
	}
	
	(
		a5 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPDEM();
				startIncompleteElement(element);
			}
			if (a5 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDEM__DURATION), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDEM__DURATION), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_17_0_0_5, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[497]);
	}
	
	a6 = 'after' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPDEM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_17_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[498]);
	}
	
	(
		a7 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPDEM();
				startIncompleteElement(element);
			}
			if (a7 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDEM__DEADLINE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDEM__DEADLINE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_17_0_0_7, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a7, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[499]);
	}
	
	a8 = 'if' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPDEM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_17_0_0_8, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[500]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[501]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[502]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[503]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[504]);
	}
	
	(
		a9_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPDEM();
				startIncompleteElement(element);
			}
			if (a9_0 != null) {
				if (a9_0 != null) {
					Object value = a9_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDEM__ACTIVATION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_17_0_0_9, a9_0, true);
				copyLocalizationInfos(a9_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[505]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[506]);
	}
	
	(
		(
			a10 = 'unless' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPDEM();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_17_0_0_10_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[507]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[508]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[509]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[510]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPDEM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[511]);
			}
			
			(
				a11_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPDEM();
						startIncompleteElement(element);
					}
					if (a11_0 != null) {
						if (a11_0 != null) {
							Object value = a11_0;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDEM__CANCELLATION), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_17_0_0_10_0_0_1, a11_0, true);
						copyLocalizationInfos(a11_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[512]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[513]);
	}
	
	a12 = 'reward_once' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPDEM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_17_0_0_11, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[514]);
	}
	
	(
		a13 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPDEM();
				startIncompleteElement(element);
			}
			if (a13 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a13.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDEM__REWARD), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a13).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDEM__REWARD), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_17_0_0_12, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a13, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[515]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[516]);
	}
	
	(
		(
			a14 = 'description' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPDEM();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_17_0_0_13_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[517]);
			}
			
			(
				a15 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPDEM();
						startIncompleteElement(element);
					}
					if (a15 != null) {
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a15.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDEM__DESCRIPTION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a15).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a15).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a15).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a15).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDEM__DESCRIPTION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_17_0_0_13_0_0_1, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a15, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[518]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[519]);
	}
	
;

parse_org_emftext_language_AdaptiveCyberDefense_PDFM returns [org.emftext.language.AdaptiveCyberDefense.PDFM element = null]
@init{
}
:
	a0 = 'ReqID' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPDFM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_18_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[520]);
	}
	
	(
		a1 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPDFM();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDFM__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDFM__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_18_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[521]);
	}
	
	a2 = 'maintain' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPDFM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_18_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[522]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[523]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[524]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[525]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[526]);
	}
	
	(
		a3_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPDFM();
				startIncompleteElement(element);
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					Object value = a3_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDFM__CONDITION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_18_0_0_3, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[527]);
	}
	
	a4 = 'for' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPDFM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_18_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[528]);
	}
	
	(
		a5 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPDFM();
				startIncompleteElement(element);
			}
			if (a5 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDFM__DURATION), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDFM__DURATION), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_18_0_0_5, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[529]);
	}
	
	a6 = 'within' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPDFM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_18_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[530]);
	}
	
	(
		a7 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPDFM();
				startIncompleteElement(element);
			}
			if (a7 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDFM__DEADLINE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDFM__DEADLINE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_18_0_0_7, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a7, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[531]);
	}
	
	a8 = 'if' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPDFM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_18_0_0_8, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[532]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[533]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[534]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[535]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[536]);
	}
	
	(
		a9_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPDFM();
				startIncompleteElement(element);
			}
			if (a9_0 != null) {
				if (a9_0 != null) {
					Object value = a9_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDFM__ACTIVATION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_18_0_0_9, a9_0, true);
				copyLocalizationInfos(a9_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[537]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[538]);
	}
	
	(
		(
			a10 = 'unless' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPDFM();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_18_0_0_10_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[539]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[540]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[541]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[542]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[543]);
			}
			
			(
				a11_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPDFM();
						startIncompleteElement(element);
					}
					if (a11_0 != null) {
						if (a11_0 != null) {
							Object value = a11_0;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDFM__CANCELLATION), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_18_0_0_10_0_0_1, a11_0, true);
						copyLocalizationInfos(a11_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[544]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[545]);
	}
	
	a12 = 'reward' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPDFM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_18_0_0_11, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[546]);
	}
	
	(
		a13 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPDFM();
				startIncompleteElement(element);
			}
			if (a13 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a13.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDFM__REWARD), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a13).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDFM__REWARD), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_18_0_0_12, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a13, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[547]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[548]);
	}
	
	(
		(
			a14 = 'description' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPDFM();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_18_0_0_13_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[549]);
			}
			
			(
				a15 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPDFM();
						startIncompleteElement(element);
					}
					if (a15 != null) {
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a15.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDFM__DESCRIPTION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a15).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a15).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a15).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a15).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDFM__DESCRIPTION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_18_0_0_13_0_0_1, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a15, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[550]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[551]);
	}
	
;

parse_org_emftext_language_AdaptiveCyberDefense_RPDFM returns [org.emftext.language.AdaptiveCyberDefense.RPDFM element = null]
@init{
}
:
	a0 = 'ReqID' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPDFM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_19_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[552]);
	}
	
	(
		a1 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPDFM();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDFM__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDFM__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_19_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[553]);
	}
	
	a2 = 'maintain' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPDFM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_19_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[554]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[555]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[556]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[557]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[558]);
	}
	
	(
		a3_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPDFM();
				startIncompleteElement(element);
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					Object value = a3_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDFM__CONDITION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_19_0_0_3, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[559]);
	}
	
	a4 = 'for' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPDFM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_19_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[560]);
	}
	
	(
		a5 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPDFM();
				startIncompleteElement(element);
			}
			if (a5 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDFM__DURATION), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDFM__DURATION), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_19_0_0_5, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[561]);
	}
	
	a6 = 'within' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPDFM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_19_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[562]);
	}
	
	(
		a7 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPDFM();
				startIncompleteElement(element);
			}
			if (a7 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDFM__DEADLINE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDFM__DEADLINE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_19_0_0_7, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a7, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[563]);
	}
	
	a8 = 'if' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPDFM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_19_0_0_8, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[564]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[565]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[566]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[567]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[568]);
	}
	
	(
		a9_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPDFM();
				startIncompleteElement(element);
			}
			if (a9_0 != null) {
				if (a9_0 != null) {
					Object value = a9_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDFM__ACTIVATION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_19_0_0_9, a9_0, true);
				copyLocalizationInfos(a9_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[569]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[570]);
	}
	
	(
		(
			a10 = 'unless' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPDFM();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_19_0_0_10_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[571]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[572]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[573]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[574]);
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getRPDFM(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[575]);
			}
			
			(
				a11_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPDFM();
						startIncompleteElement(element);
					}
					if (a11_0 != null) {
						if (a11_0 != null) {
							Object value = a11_0;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDFM__CANCELLATION), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_19_0_0_10_0_0_1, a11_0, true);
						copyLocalizationInfos(a11_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[576]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[577]);
	}
	
	a12 = 'reward_once' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPDFM();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_19_0_0_11, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[578]);
	}
	
	(
		a13 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPDFM();
				startIncompleteElement(element);
			}
			if (a13 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a13.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDFM__REWARD), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a13).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDFM__REWARD), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_19_0_0_12, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a13, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[579]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[580]);
	}
	
	(
		(
			a14 = 'description' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPDFM();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_19_0_0_13_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[581]);
			}
			
			(
				a15 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createRPDFM();
						startIncompleteElement(element);
					}
					if (a15 != null) {
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a15.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDFM__DESCRIPTION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a15).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a15).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a15).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a15).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.RPDFM__DESCRIPTION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_19_0_0_13_0_0_1, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a15, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[582]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[583]);
	}
	
;

parse_org_emftext_language_AdaptiveCyberDefense_ProbabilisticEffect returns [org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect element = null]
@init{
}
:
	a0 = '<' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createProbabilisticEffect();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_20_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getProbabilisticEffect(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[584]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[585]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[586]);
	}
	
	(
		(
			(
				(
					a1_0 = parse_org_emftext_language_AdaptiveCyberDefense_StateAtom					{
						if (terminateParsing) {
							throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
						}
						if (element == null) {
							element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createProbabilisticEffect();
							startIncompleteElement(element);
						}
						if (a1_0 != null) {
							if (a1_0 != null) {
								Object value = a1_0;
								addObjectToList(element, org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PROBABILISTIC_EFFECT__STATE_ATOMS, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_20_0_0_1_0_0_0, a1_0, true);
							copyLocalizationInfos(a1_0, element);
						}
					}
				)
				
			)+			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getProbabilisticEffect(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[587]);
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[588]);
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[589]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[590]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[591]);
	}
	
	(
		(
			a2 = 'prob' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createProbabilisticEffect();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_20_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[592]);
			}
			
			(
				a3 = FLOAT				
				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createProbabilisticEffect();
						startIncompleteElement(element);
					}
					if (a3 != null) {
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("FLOAT");
						tokenResolver.setOptions(getOptions());
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PROBABILISTIC_EFFECT__PROBABILITY), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
						}
						java.math.BigDecimal resolved = (java.math.BigDecimal) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PROBABILISTIC_EFFECT__PROBABILITY), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_20_0_0_2_0_0_1, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[593]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[594]);
	}
	
	a4 = '>' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createProbabilisticEffect();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_20_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getProbabilisticContextualEffect(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[595]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getActionDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[596]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getActionDescription(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[597]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[598]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[599]);
	}
	
;

parse_org_emftext_language_AdaptiveCyberDefense_StateAtom returns [org.emftext.language.AdaptiveCyberDefense.StateAtom element = null]
@init{
}
:
	(
		a0 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createStateAtom();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.STATE_ATOM__STATE_VARIABLE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				org.emftext.language.AdaptiveCyberDefense.StateVariable proxy = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createStateVariable();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseContextDependentURIFragmentFactory<org.emftext.language.AdaptiveCyberDefense.StateAtom, org.emftext.language.AdaptiveCyberDefense.StateVariable>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getStateAtomState_variableReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.STATE_ATOM__STATE_VARIABLE), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.STATE_ATOM__STATE_VARIABLE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_28_0_0_0, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[600]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getProbabilisticEffect(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[601]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[602]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[603]);
	}
	
	(
		(
			a1 = '=' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createStateAtom();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_28_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[604]);
			}
			
			(
				a2 = IDENTIFIER				
				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createStateAtom();
						startIncompleteElement(element);
					}
					if (a2 != null) {
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
						tokenResolver.setOptions(getOptions());
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.STATE_ATOM__VALUE), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.STATE_ATOM__VALUE), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_28_0_0_1_0_0_1, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getProbabilisticEffect(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[605]);
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[606]);
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[607]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getProbabilisticEffect(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[608]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[609]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[610]);
	}
	
;

parse_org_emftext_language_AdaptiveCyberDefense_InitialAtom returns [org.emftext.language.AdaptiveCyberDefense.InitialAtom element = null]
@init{
}
:
	(
		a0 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createInitialAtom();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.INITIAL_ATOM__INITIALVARIABLE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				org.emftext.language.AdaptiveCyberDefense.InitialVariable proxy = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createStateVariable();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseContextDependentURIFragmentFactory<org.emftext.language.AdaptiveCyberDefense.InitialAtom, org.emftext.language.AdaptiveCyberDefense.InitialVariable>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getInitialAtomInitialvariableReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.INITIAL_ATOM__INITIALVARIABLE), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.INITIAL_ATOM__INITIALVARIABLE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_29_0_0_0, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[611]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[612]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[613]);
	}
	
	(
		(
			a1 = '=' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createInitialAtom();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_29_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[614]);
			}
			
			(
				a2 = IDENTIFIER				
				{
					if (terminateParsing) {
						throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createInitialAtom();
						startIncompleteElement(element);
					}
					if (a2 != null) {
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
						tokenResolver.setOptions(getOptions());
						org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.INITIAL_ATOM__VALUE), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.INITIAL_ATOM__VALUE), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_29_0_0_1_0_0_1, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[615]);
				addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[616]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[617]);
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[618]);
	}
	
;

parse_org_emftext_language_AdaptiveCyberDefense_Label returns [org.emftext.language.AdaptiveCyberDefense.Label element = null]
@init{
}
:
	a0 = 'Label' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createLabel();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_30_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[619]);
	}
	
	(
		a1 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createLabel();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.LABEL__VALUE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.LABEL__VALUE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_30_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[620]);
	}
	
	a2 = '=' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createLabel();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_30_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getLabel(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[621]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getLabel(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[622]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getLabel(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[623]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getLabel(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[624]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getLabel(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[625]);
	}
	
	(
		a3_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createLabel();
				startIncompleteElement(element);
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					Object value = a3_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.LABEL__PROPERTY), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_30_0_0_3, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[626]);
	}
	
;

parse_org_emftext_language_AdaptiveCyberDefense_Until returns [org.emftext.language.AdaptiveCyberDefense.Until element = null]
@init{
}
:
	(
		a0_0 = parse_org_emftext_language_AdaptiveCyberDefense_PCTLStateFormula		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createUntil();
				startIncompleteElement(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UNTIL__LHS), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_36_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[627]);
	}
	
	a1 = 'U' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createUntil();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_36_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getUntil(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[628]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getUntil(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[629]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getUntil(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[630]);
	}
	
	(
		a2_0 = parse_org_emftext_language_AdaptiveCyberDefense_PCTLStateFormula		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createUntil();
				startIncompleteElement(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.UNTIL__RHS), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_36_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[631]);
	}
	
;

parse_org_emftext_language_AdaptiveCyberDefense_BoundedUntil returns [org.emftext.language.AdaptiveCyberDefense.BoundedUntil element = null]
@init{
}
:
	(
		a0_0 = parse_org_emftext_language_AdaptiveCyberDefense_PCTLStateFormula		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createBoundedUntil();
				startIncompleteElement(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.BOUNDED_UNTIL__LHS), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_37_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[632]);
	}
	
	a1 = 'U' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createBoundedUntil();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_37_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[633]);
	}
	
	(
		(
			a2 = '<' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createBoundedUntil();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_37_0_0_2, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getComparaisonOperator().getEEnumLiteral(org.emftext.language.AdaptiveCyberDefense.ComparaisonOperator.LESS_THAN_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.BOUNDED_UNTIL__OPERATOR), value);
				completedElement(value, false);
			}
			|			a3 = '<=' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createBoundedUntil();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_37_0_0_2, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getComparaisonOperator().getEEnumLiteral(org.emftext.language.AdaptiveCyberDefense.ComparaisonOperator.LESS_THAN_EQUALS_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.BOUNDED_UNTIL__OPERATOR), value);
				completedElement(value, false);
			}
			|			a4 = '==' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createBoundedUntil();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_37_0_0_2, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getComparaisonOperator().getEEnumLiteral(org.emftext.language.AdaptiveCyberDefense.ComparaisonOperator.EQUALS_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.BOUNDED_UNTIL__OPERATOR), value);
				completedElement(value, false);
			}
			|			a5 = '>' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createBoundedUntil();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_37_0_0_2, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getComparaisonOperator().getEEnumLiteral(org.emftext.language.AdaptiveCyberDefense.ComparaisonOperator.GREATER_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.BOUNDED_UNTIL__OPERATOR), value);
				completedElement(value, false);
			}
			|			a6 = '>=' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createBoundedUntil();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_37_0_0_2, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getComparaisonOperator().getEEnumLiteral(org.emftext.language.AdaptiveCyberDefense.ComparaisonOperator.GREATER_THAN_EQUALS_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.BOUNDED_UNTIL__OPERATOR), value);
				completedElement(value, false);
			}
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[634]);
	}
	
	(
		a9 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createBoundedUntil();
				startIncompleteElement(element);
			}
			if (a9 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a9.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.BOUNDED_UNTIL__BOUND), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a9).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a9).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a9).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a9).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.BOUNDED_UNTIL__BOUND), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_37_0_0_3, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a9, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getBoundedUntil(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[635]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getBoundedUntil(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[636]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getBoundedUntil(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[637]);
	}
	
	(
		a10_0 = parse_org_emftext_language_AdaptiveCyberDefense_PCTLStateFormula		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createBoundedUntil();
				startIncompleteElement(element);
			}
			if (a10_0 != null) {
				if (a10_0 != null) {
					Object value = a10_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.BOUNDED_UNTIL__RHS), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_37_0_0_4, a10_0, true);
				copyLocalizationInfos(a10_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[638]);
	}
	
;

parse_org_emftext_language_AdaptiveCyberDefense_Eventually returns [org.emftext.language.AdaptiveCyberDefense.Eventually element = null]
@init{
}
:
	a0 = 'F' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createEventually();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_38_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getEventually(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[639]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getEventually(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[640]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getEventually(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[641]);
	}
	
	(
		a1_0 = parse_org_emftext_language_AdaptiveCyberDefense_PCTLStateFormula		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createEventually();
				startIncompleteElement(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					addObjectToList(element, org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.EVENTUALLY__OP, value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_38_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[642]);
	}
	
;

parse_org_emftext_language_AdaptiveCyberDefense_BoundedEventually returns [org.emftext.language.AdaptiveCyberDefense.BoundedEventually element = null]
@init{
}
:
	a0 = 'F' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createBoundedEventually();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_39_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[643]);
	}
	
	(
		(
			a1 = '<' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createBoundedEventually();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_39_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getComparaisonOperator().getEEnumLiteral(org.emftext.language.AdaptiveCyberDefense.ComparaisonOperator.LESS_THAN_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.BOUNDED_EVENTUALLY__OPERATOR), value);
				completedElement(value, false);
			}
			|			a2 = '<=' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createBoundedEventually();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_39_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getComparaisonOperator().getEEnumLiteral(org.emftext.language.AdaptiveCyberDefense.ComparaisonOperator.LESS_THAN_EQUALS_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.BOUNDED_EVENTUALLY__OPERATOR), value);
				completedElement(value, false);
			}
			|			a3 = '==' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createBoundedEventually();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_39_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getComparaisonOperator().getEEnumLiteral(org.emftext.language.AdaptiveCyberDefense.ComparaisonOperator.EQUALS_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.BOUNDED_EVENTUALLY__OPERATOR), value);
				completedElement(value, false);
			}
			|			a4 = '>' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createBoundedEventually();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_39_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getComparaisonOperator().getEEnumLiteral(org.emftext.language.AdaptiveCyberDefense.ComparaisonOperator.GREATER_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.BOUNDED_EVENTUALLY__OPERATOR), value);
				completedElement(value, false);
			}
			|			a5 = '>=' {
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createBoundedEventually();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_39_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getComparaisonOperator().getEEnumLiteral(org.emftext.language.AdaptiveCyberDefense.ComparaisonOperator.GREATER_THAN_EQUALS_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.BOUNDED_EVENTUALLY__OPERATOR), value);
				completedElement(value, false);
			}
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[644]);
	}
	
	(
		a8 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createBoundedEventually();
				startIncompleteElement(element);
			}
			if (a8 != null) {
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.BOUNDED_EVENTUALLY__BOUND), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a8).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a8).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a8).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.BOUNDED_EVENTUALLY__BOUND), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_39_0_0_2, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a8, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getBoundedEventually(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[645]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getBoundedEventually(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[646]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getBoundedEventually(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[647]);
	}
	
	(
		a9_0 = parse_org_emftext_language_AdaptiveCyberDefense_PCTLStateFormula		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createBoundedEventually();
				startIncompleteElement(element);
			}
			if (a9_0 != null) {
				if (a9_0 != null) {
					Object value = a9_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.BOUNDED_EVENTUALLY__OP), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_39_0_0_3, a9_0, true);
				copyLocalizationInfos(a9_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[648]);
	}
	
;

parse_org_emftext_language_AdaptiveCyberDefense_Globally returns [org.emftext.language.AdaptiveCyberDefense.Globally element = null]
@init{
}
:
	a0 = 'G' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createGlobally();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_40_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getGlobally(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[649]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getGlobally(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[650]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getGlobally(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[651]);
	}
	
	(
		a1_0 = parse_org_emftext_language_AdaptiveCyberDefense_PCTLStateFormula		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createGlobally();
				startIncompleteElement(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.GLOBALLY__OP), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_40_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[652]);
	}
	
;

parse_org_emftext_language_AdaptiveCyberDefense_PTrue returns [org.emftext.language.AdaptiveCyberDefense.PTrue element = null]
@init{
}
:
	a0 = 'true' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPTrue();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_41_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[653]);
	}
	
;

parse_org_emftext_language_AdaptiveCyberDefense_PFalse returns [org.emftext.language.AdaptiveCyberDefense.PFalse element = null]
@init{
}
:
	a0 = 'false' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPFalse();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_42_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[654]);
	}
	
;

parseop_Formula_level_1 returns [org.emftext.language.AdaptiveCyberDefense.Formula element = null]
@init{
}
:
	leftArg = parseop_Formula_level_2	((
		()
		{ element = null; }
		a0 = '&' {
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createConjunction();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_21_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getConjunction(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[655]);
			addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getConjunction(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[656]);
			addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getConjunction(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[657]);
			addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getConjunction(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[658]);
			addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getConjunction(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[659]);
		}
		
		rightArg = parseop_Formula_level_2		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createConjunction();
				startIncompleteElement(element);
			}
			if (leftArg != null) {
				if (leftArg != null) {
					Object value = leftArg;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CONJUNCTION__LHS), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_21_0_0_0, leftArg, true);
				copyLocalizationInfos(leftArg, element);
			}
		}
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createConjunction();
				startIncompleteElement(element);
			}
			if (rightArg != null) {
				if (rightArg != null) {
					Object value = rightArg;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.CONJUNCTION__RHS), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_21_0_0_2, rightArg, true);
				copyLocalizationInfos(rightArg, element);
			}
		}
		{ leftArg = element; /* this may become an argument in the next iteration */ }
		|		
		()
		{ element = null; }
		a0 = '|' {
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDisjunction();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_22_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDisjunction(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[660]);
			addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDisjunction(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[661]);
			addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDisjunction(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[662]);
			addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDisjunction(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[663]);
			addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getDisjunction(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[664]);
		}
		
		rightArg = parseop_Formula_level_2		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDisjunction();
				startIncompleteElement(element);
			}
			if (leftArg != null) {
				if (leftArg != null) {
					Object value = leftArg;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DISJUNCTION__LHS), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_22_0_0_0, leftArg, true);
				copyLocalizationInfos(leftArg, element);
			}
		}
		{
			if (terminateParsing) {
				throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createDisjunction();
				startIncompleteElement(element);
			}
			if (rightArg != null) {
				if (rightArg != null) {
					Object value = rightArg;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.DISJUNCTION__RHS), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_22_0_0_2, rightArg, true);
				copyLocalizationInfos(rightArg, element);
			}
		}
		{ leftArg = element; /* this may become an argument in the next iteration */ }
	)+ | /* epsilon */ { element = leftArg; }
	
)
;

parseop_Formula_level_2 returns [org.emftext.language.AdaptiveCyberDefense.Formula element = null]
@init{
}
:
a0 = '!' {
	if (element == null) {
		element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createNegation();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_23_0_0_0, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
	// expected elements (follow set)
	addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getNegation(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[665]);
	addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getNegation(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[666]);
	addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getNegation(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[667]);
	addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getNegation(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[668]);
	addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getNegation(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[669]);
}

arg = parseop_Formula_level_3{
	if (terminateParsing) {
		throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
	}
	if (element == null) {
		element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createNegation();
		startIncompleteElement(element);
	}
	if (arg != null) {
		if (arg != null) {
			Object value = arg;
			element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.NEGATION__FORMULA), value);
			completedElement(value, true);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_23_0_0_1, arg, true);
		copyLocalizationInfos(arg, element);
	}
}
|

arg = parseop_Formula_level_3{ element = arg; }
;

parseop_Formula_level_3 returns [org.emftext.language.AdaptiveCyberDefense.Formula element = null]
@init{
}
:
c0 = parse_org_emftext_language_AdaptiveCyberDefense_Parentheses{ element = c0; /* this is a subclass or primitive expression choice */ }
|c1 = parse_org_emftext_language_AdaptiveCyberDefense_FormulaAtom{ element = c1; /* this is a subclass or primitive expression choice */ }
|c2 = parse_org_emftext_language_AdaptiveCyberDefense_True{ element = c2; /* this is a subclass or primitive expression choice */ }
|c3 = parse_org_emftext_language_AdaptiveCyberDefense_False{ element = c3; /* this is a subclass or primitive expression choice */ }
;

parse_org_emftext_language_AdaptiveCyberDefense_Parentheses returns [org.emftext.language.AdaptiveCyberDefense.Parentheses element = null]
@init{
}
:
a0 = '(' {
	if (element == null) {
		element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createParentheses();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_24_0_0_0, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
	// expected elements (follow set)
	addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getParentheses(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[670]);
	addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getParentheses(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[671]);
	addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getParentheses(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[672]);
	addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getParentheses(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[673]);
	addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getParentheses(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[674]);
}

(
	a1_0 = parse_org_emftext_language_AdaptiveCyberDefense_Formula	{
		if (terminateParsing) {
			throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
		}
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createParentheses();
			startIncompleteElement(element);
		}
		if (a1_0 != null) {
			if (a1_0 != null) {
				Object value = a1_0;
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PARENTHESES__FORMULA), value);
				completedElement(value, true);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_24_0_0_1, a1_0, true);
			copyLocalizationInfos(a1_0, element);
		}
	}
)
{
	// expected elements (follow set)
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[675]);
}

a2 = ')' {
	if (element == null) {
		element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createParentheses();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_24_0_0_2, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[676]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[677]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[678]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[679]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[680]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[681]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[682]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[683]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[684]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[685]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[686]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[687]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[688]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[689]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[690]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[691]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[692]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[693]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[694]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[695]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[696]);
}

;

parse_org_emftext_language_AdaptiveCyberDefense_FormulaAtom returns [org.emftext.language.AdaptiveCyberDefense.FormulaAtom element = null]
@init{
}
:
(
	a0 = IDENTIFIER	
	{
		if (terminateParsing) {
			throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
		}
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createFormulaAtom();
			startIncompleteElement(element);
		}
		if (a0 != null) {
			org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
			tokenResolver.setOptions(getOptions());
			org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
			tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.FORMULA_ATOM__DESCRIPTION_ENTITY), result);
			Object resolvedObject = result.getResolvedToken();
			if (resolvedObject == null) {
				addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
			}
			String resolved = (String) resolvedObject;
			org.emftext.language.AdaptiveCyberDefense.DescriptionEntity proxy = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createActionDescription();
			collectHiddenTokens(element);
			registerContextDependentProxy(new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseContextDependentURIFragmentFactory<org.emftext.language.AdaptiveCyberDefense.FormulaAtom, org.emftext.language.AdaptiveCyberDefense.DescriptionEntity>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getFormulaAtomDescription_entityReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.FORMULA_ATOM__DESCRIPTION_ENTITY), resolved, proxy);
			if (proxy != null) {
				Object value = proxy;
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.FORMULA_ATOM__DESCRIPTION_ENTITY), value);
				completedElement(value, false);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_25_0_0_0, proxy, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
		}
	}
)
{
	// expected elements (follow set)
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[697]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[698]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[699]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[700]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[701]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[702]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[703]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[704]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[705]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[706]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[707]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[708]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[709]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[710]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[711]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[712]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[713]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[714]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[715]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[716]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[717]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[718]);
}

(
	(
		a1 = '=' {
			if (element == null) {
				element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createFormulaAtom();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_25_0_0_1_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[719]);
		}
		
		(
			a2 = IDENTIFIER			
			{
				if (terminateParsing) {
					throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
				}
				if (element == null) {
					element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createFormulaAtom();
					startIncompleteElement(element);
				}
				if (a2 != null) {
					org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
					tokenResolver.setOptions(getOptions());
					org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.FORMULA_ATOM__VALUE), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.FORMULA_ATOM__VALUE), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_25_0_0_1_0_0_1, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[720]);
			addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[721]);
			addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[722]);
			addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[723]);
			addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[724]);
			addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[725]);
			addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[726]);
			addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[727]);
			addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[728]);
			addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[729]);
			addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[730]);
			addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[731]);
			addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[732]);
			addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[733]);
			addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[734]);
			addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[735]);
			addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[736]);
			addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[737]);
			addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[738]);
			addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[739]);
			addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[740]);
		}
		
	)
	
)?{
	// expected elements (follow set)
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[741]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[742]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[743]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[744]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[745]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[746]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[747]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[748]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[749]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[750]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[751]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[752]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[753]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[754]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[755]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[756]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[757]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[758]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[759]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[760]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[761]);
}

;

parse_org_emftext_language_AdaptiveCyberDefense_True returns [org.emftext.language.AdaptiveCyberDefense.True element = null]
@init{
}
:
a0 = 'true' {
	if (element == null) {
		element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createTrue();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_26_0_0_0, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[762]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[763]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[764]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[765]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[766]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[767]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[768]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[769]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[770]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[771]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[772]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[773]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[774]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[775]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[776]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[777]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[778]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[779]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[780]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[781]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[782]);
}

;

parse_org_emftext_language_AdaptiveCyberDefense_False returns [org.emftext.language.AdaptiveCyberDefense.False element = null]
@init{
}
:
a0 = 'false' {
	if (element == null) {
		element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createFalse();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_27_0_0_0, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[783]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[784]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[785]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[786]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[787]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[788]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[789]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[790]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[791]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[792]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[793]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[794]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[795]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[796]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[797]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[798]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[799]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[800]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[801]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[802]);
	addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[803]);
}

;

parseop_PCTLStateFormula_level_1 returns [org.emftext.language.AdaptiveCyberDefense.PCTLStateFormula element = null]
@init{
}
:
leftArg = parseop_PCTLStateFormula_level_2((
	()
	{ element = null; }
	a0 = '&' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPConjunction();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_31_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPConjunction(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[804]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPConjunction(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[805]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPConjunction(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[806]);
	}
	
	rightArg = parseop_PCTLStateFormula_level_2	{
		if (terminateParsing) {
			throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
		}
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPConjunction();
			startIncompleteElement(element);
		}
		if (leftArg != null) {
			if (leftArg != null) {
				Object value = leftArg;
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PCONJUNCTION__LHS), value);
				completedElement(value, true);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_31_0_0_0, leftArg, true);
			copyLocalizationInfos(leftArg, element);
		}
	}
	{
		if (terminateParsing) {
			throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
		}
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPConjunction();
			startIncompleteElement(element);
		}
		if (rightArg != null) {
			if (rightArg != null) {
				Object value = rightArg;
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PCONJUNCTION__RHS), value);
				completedElement(value, true);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_31_0_0_2, rightArg, true);
			copyLocalizationInfos(rightArg, element);
		}
	}
	{ leftArg = element; /* this may become an argument in the next iteration */ }
	|	
	()
	{ element = null; }
	a0 = '|' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPDisjunction();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_32_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPDisjunction(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[807]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPDisjunction(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[808]);
		addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPDisjunction(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[809]);
	}
	
	rightArg = parseop_PCTLStateFormula_level_2	{
		if (terminateParsing) {
			throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
		}
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPDisjunction();
			startIncompleteElement(element);
		}
		if (leftArg != null) {
			if (leftArg != null) {
				Object value = leftArg;
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDISJUNCTION__LHS), value);
				completedElement(value, true);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_32_0_0_0, leftArg, true);
			copyLocalizationInfos(leftArg, element);
		}
	}
	{
		if (terminateParsing) {
			throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
		}
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPDisjunction();
			startIncompleteElement(element);
		}
		if (rightArg != null) {
			if (rightArg != null) {
				Object value = rightArg;
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PDISJUNCTION__RHS), value);
				completedElement(value, true);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_32_0_0_2, rightArg, true);
			copyLocalizationInfos(rightArg, element);
		}
	}
	{ leftArg = element; /* this may become an argument in the next iteration */ }
)+ | /* epsilon */ { element = leftArg; }

)
;

parseop_PCTLStateFormula_level_2 returns [org.emftext.language.AdaptiveCyberDefense.PCTLStateFormula element = null]
@init{
}
:
a0 = '!' {
if (element == null) {
	element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPNegation();
	startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_33_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
// expected elements (follow set)
addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPNegation(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[810]);
addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPNegation(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[811]);
addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPNegation(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[812]);
}

arg = parseop_PCTLStateFormula_level_3{
if (terminateParsing) {
	throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
}
if (element == null) {
	element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPNegation();
	startIncompleteElement(element);
}
if (arg != null) {
	if (arg != null) {
		Object value = arg;
		element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.PNEGATION__OP), value);
		completedElement(value, true);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_33_0_0_1, arg, true);
	copyLocalizationInfos(arg, element);
}
}
|

arg = parseop_PCTLStateFormula_level_3{ element = arg; }
;

parseop_PCTLStateFormula_level_3 returns [org.emftext.language.AdaptiveCyberDefense.PCTLStateFormula element = null]
@init{
}
:
c0 = parse_org_emftext_language_AdaptiveCyberDefense_LabelReference{ element = c0; /* this is a subclass or primitive expression choice */ }
|c1 = parse_org_emftext_language_AdaptiveCyberDefense_POperator{ element = c1; /* this is a subclass or primitive expression choice */ }
;

parse_org_emftext_language_AdaptiveCyberDefense_LabelReference returns [org.emftext.language.AdaptiveCyberDefense.LabelReference element = null]
@init{
}
:
(
a0 = IDENTIFIER
{
	if (terminateParsing) {
		throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
	}
	if (element == null) {
		element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createLabelReference();
		startIncompleteElement(element);
	}
	if (a0 != null) {
		org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
		tokenResolver.setOptions(getOptions());
		org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
		tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.LABEL_REFERENCE__LABEL), result);
		Object resolvedObject = result.getResolvedToken();
		if (resolvedObject == null) {
			addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
		}
		String resolved = (String) resolvedObject;
		org.emftext.language.AdaptiveCyberDefense.Label proxy = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createLabel();
		collectHiddenTokens(element);
		registerContextDependentProxy(new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseContextDependentURIFragmentFactory<org.emftext.language.AdaptiveCyberDefense.LabelReference, org.emftext.language.AdaptiveCyberDefense.Label>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getLabelReferenceLabelReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.LABEL_REFERENCE__LABEL), resolved, proxy);
		if (proxy != null) {
			Object value = proxy;
			element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.LABEL_REFERENCE__LABEL), value);
			completedElement(value, false);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_34_0_0_0, proxy, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
	}
}
)
{
// expected elements (follow set)
addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[813]);
addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[814]);
addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[815]);
addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[816]);
addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[817]);
addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[818]);
}

;

parse_org_emftext_language_AdaptiveCyberDefense_POperator returns [org.emftext.language.AdaptiveCyberDefense.POperator element = null]
@init{
}
:
(
(
	a0 = 'Pmax' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPOperator();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_35_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
		// set value of enumeration attribute
		Object value = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPOperatorType().getEEnumLiteral(org.emftext.language.AdaptiveCyberDefense.POperatorType.MAX_VALUE).getInstance();
		element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.POPERATOR__TYPE), value);
		completedElement(value, false);
	}
	|	a1 = 'Pmin' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPOperator();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_35_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
		// set value of enumeration attribute
		Object value = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPOperatorType().getEEnumLiteral(org.emftext.language.AdaptiveCyberDefense.POperatorType.MIN_VALUE).getInstance();
		element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.POPERATOR__TYPE), value);
		completedElement(value, false);
	}
)
)
{
// expected elements (follow set)
addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[819]);
}

(
(
	a4 = '<' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPOperator();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_35_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
		// set value of enumeration attribute
		Object value = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getComparaisonOperator().getEEnumLiteral(org.emftext.language.AdaptiveCyberDefense.ComparaisonOperator.LESS_THAN_VALUE).getInstance();
		element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.POPERATOR__OPERATOR), value);
		completedElement(value, false);
	}
	|	a5 = '<=' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPOperator();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_35_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
		// set value of enumeration attribute
		Object value = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getComparaisonOperator().getEEnumLiteral(org.emftext.language.AdaptiveCyberDefense.ComparaisonOperator.LESS_THAN_EQUALS_VALUE).getInstance();
		element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.POPERATOR__OPERATOR), value);
		completedElement(value, false);
	}
	|	a6 = '==' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPOperator();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_35_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
		// set value of enumeration attribute
		Object value = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getComparaisonOperator().getEEnumLiteral(org.emftext.language.AdaptiveCyberDefense.ComparaisonOperator.EQUALS_VALUE).getInstance();
		element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.POPERATOR__OPERATOR), value);
		completedElement(value, false);
	}
	|	a7 = '>' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPOperator();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_35_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
		// set value of enumeration attribute
		Object value = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getComparaisonOperator().getEEnumLiteral(org.emftext.language.AdaptiveCyberDefense.ComparaisonOperator.GREATER_VALUE).getInstance();
		element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.POPERATOR__OPERATOR), value);
		completedElement(value, false);
	}
	|	a8 = '>=' {
		if (element == null) {
			element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPOperator();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_35_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
		// set value of enumeration attribute
		Object value = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getComparaisonOperator().getEEnumLiteral(org.emftext.language.AdaptiveCyberDefense.ComparaisonOperator.GREATER_THAN_EQUALS_VALUE).getInstance();
		element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.POPERATOR__OPERATOR), value);
		completedElement(value, false);
	}
)
)
{
// expected elements (follow set)
addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[820]);
}

(
a11 = FLOAT
{
	if (terminateParsing) {
		throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
	}
	if (element == null) {
		element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPOperator();
		startIncompleteElement(element);
	}
	if (a11 != null) {
		org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("FLOAT");
		tokenResolver.setOptions(getOptions());
		org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolveResult result = getFreshTokenResolveResult();
		tokenResolver.resolve(a11.getText(), element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.POPERATOR__BOUND), result);
		Object resolvedObject = result.getResolvedToken();
		if (resolvedObject == null) {
			addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a11).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a11).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a11).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a11).getStopIndex());
		}
		java.math.BigDecimal resolved = (java.math.BigDecimal) resolvedObject;
		if (resolved != null) {
			Object value = resolved;
			element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.POPERATOR__BOUND), value);
			completedElement(value, false);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_35_0_0_2, resolved, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a11, element);
	}
}
)
{
// expected elements (follow set)
addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[821]);
}

a12 = '[' {
if (element == null) {
	element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPOperator();
	startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_35_0_0_3, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
}
{
// expected elements (follow set)
addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPOperator(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[822]);
addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPOperator(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[823]);
addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPOperator(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[824]);
addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPOperator(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[825]);
addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPOperator(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[826]);
addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPOperator(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[827]);
addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPOperator(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[828]);
addExpectedElement(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.eINSTANCE.getPOperator(), org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[829]);
}

(
a13_0 = parse_org_emftext_language_AdaptiveCyberDefense_PCTLPathFormula{
	if (terminateParsing) {
		throw new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseTerminateParsingException();
	}
	if (element == null) {
		element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPOperator();
		startIncompleteElement(element);
	}
	if (a13_0 != null) {
		if (a13_0 != null) {
			Object value = a13_0;
			element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage.POPERATOR__OP), value);
			completedElement(value, true);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_35_0_0_4, a13_0, true);
		copyLocalizationInfos(a13_0, element);
	}
}
)
{
// expected elements (follow set)
addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[830]);
}

a14 = ']' {
if (element == null) {
	element = org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory.eINSTANCE.createPOperator();
	startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.grammar.AdaptiveCyberDefenseGrammarInformationProvider.ADAPTIVECYBERDEFENSE_35_0_0_5, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
}
{
// expected elements (follow set)
addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[831]);
addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[832]);
addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[833]);
addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[834]);
addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[835]);
addExpectedElement(null, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseExpectationConstants.EXPECTATIONS[836]);
}

;

parse_org_emftext_language_AdaptiveCyberDefense_PCTLStateFormula returns [org.emftext.language.AdaptiveCyberDefense.PCTLStateFormula element = null]
:
c = parseop_PCTLStateFormula_level_1{ element = c; /* this rule is an expression root */ }

;

parse_org_emftext_language_AdaptiveCyberDefense_Requirement returns [org.emftext.language.AdaptiveCyberDefense.Requirement element = null]
:
c0 = parse_org_emftext_language_AdaptiveCyberDefense_UA{ element = c0; /* this is a subclass or primitive expression choice */ }
|c1 = parse_org_emftext_language_AdaptiveCyberDefense_CA{ element = c1; /* this is a subclass or primitive expression choice */ }
|c2 = parse_org_emftext_language_AdaptiveCyberDefense_DEA{ element = c2; /* this is a subclass or primitive expression choice */ }
|c3 = parse_org_emftext_language_AdaptiveCyberDefense_DFA{ element = c3; /* this is a subclass or primitive expression choice */ }
|c4 = parse_org_emftext_language_AdaptiveCyberDefense_UM{ element = c4; /* this is a subclass or primitive expression choice */ }
|c5 = parse_org_emftext_language_AdaptiveCyberDefense_CM{ element = c5; /* this is a subclass or primitive expression choice */ }
|c6 = parse_org_emftext_language_AdaptiveCyberDefense_DEM{ element = c6; /* this is a subclass or primitive expression choice */ }
|c7 = parse_org_emftext_language_AdaptiveCyberDefense_DFM{ element = c7; /* this is a subclass or primitive expression choice */ }
|c8 = parse_org_emftext_language_AdaptiveCyberDefense_PM{ element = c8; /* this is a subclass or primitive expression choice */ }
|c9 = parse_org_emftext_language_AdaptiveCyberDefense_RPM{ element = c9; /* this is a subclass or primitive expression choice */ }
|c10 = parse_org_emftext_language_AdaptiveCyberDefense_PDEM{ element = c10; /* this is a subclass or primitive expression choice */ }
|c11 = parse_org_emftext_language_AdaptiveCyberDefense_RPDEM{ element = c11; /* this is a subclass or primitive expression choice */ }
|c12 = parse_org_emftext_language_AdaptiveCyberDefense_PDFM{ element = c12; /* this is a subclass or primitive expression choice */ }
|c13 = parse_org_emftext_language_AdaptiveCyberDefense_RPDFM{ element = c13; /* this is a subclass or primitive expression choice */ }

;

parse_org_emftext_language_AdaptiveCyberDefense_Formula returns [org.emftext.language.AdaptiveCyberDefense.Formula element = null]
:
c = parseop_Formula_level_1{ element = c; /* this rule is an expression root */ }

;

parse_org_emftext_language_AdaptiveCyberDefense_PCTLPathFormula returns [org.emftext.language.AdaptiveCyberDefense.PCTLPathFormula element = null]
:
c0 = parse_org_emftext_language_AdaptiveCyberDefense_Until{ element = c0; /* this is a subclass or primitive expression choice */ }
|c1 = parse_org_emftext_language_AdaptiveCyberDefense_BoundedUntil{ element = c1; /* this is a subclass or primitive expression choice */ }
|c2 = parse_org_emftext_language_AdaptiveCyberDefense_Eventually{ element = c2; /* this is a subclass or primitive expression choice */ }
|c3 = parse_org_emftext_language_AdaptiveCyberDefense_BoundedEventually{ element = c3; /* this is a subclass or primitive expression choice */ }
|c4 = parse_org_emftext_language_AdaptiveCyberDefense_Globally{ element = c4; /* this is a subclass or primitive expression choice */ }
|c5 = parse_org_emftext_language_AdaptiveCyberDefense_PTrue{ element = c5; /* this is a subclass or primitive expression choice */ }
|c6 = parse_org_emftext_language_AdaptiveCyberDefense_PFalse{ element = c6; /* this is a subclass or primitive expression choice */ }

;

IDENTIFIER:
(('A'..'Z' | 'a'..'z' | '-'| '_')('A'..'Z' | 'a'..'z' | '0'..'9' | '-'| '_')*)
;
WHITESPACE:
((' ' | '\t' | '\f'))
{ _channel = 99; }
;
LINEBREAK:
(('\r\n' | '\r' | '\n'))
{ _channel = 99; }
;
INTEGER:
(('-')?('1'..'9')('0'..'9')*|'0')
;
FLOAT:
(('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ )
;
COMMENT:
('//'(~('\n'|'\r'|'\uffff'))*)
{ _channel = 99; }
;
QUOTED_34_34:
(('"')(~('"'))*('"'))
;

