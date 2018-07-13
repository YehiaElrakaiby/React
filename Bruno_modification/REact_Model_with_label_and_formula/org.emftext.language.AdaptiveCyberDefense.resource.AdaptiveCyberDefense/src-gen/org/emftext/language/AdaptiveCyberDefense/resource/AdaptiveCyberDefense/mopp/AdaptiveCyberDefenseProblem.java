/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp;

public class AdaptiveCyberDefenseProblem implements org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseProblem {
	
	private String message;
	private org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.AdaptiveCyberDefenseEProblemType type;
	private org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.AdaptiveCyberDefenseEProblemSeverity severity;
	private java.util.Collection<org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseQuickFix> quickFixes;
	
	public AdaptiveCyberDefenseProblem(String message, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.AdaptiveCyberDefenseEProblemType type, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.AdaptiveCyberDefenseEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseQuickFix>emptySet());
	}
	
	public AdaptiveCyberDefenseProblem(String message, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.AdaptiveCyberDefenseEProblemType type, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.AdaptiveCyberDefenseEProblemSeverity severity, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public AdaptiveCyberDefenseProblem(String message, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.AdaptiveCyberDefenseEProblemType type, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.AdaptiveCyberDefenseEProblemSeverity severity, java.util.Collection<org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.AdaptiveCyberDefenseEProblemType getType() {
		return type;
	}
	
	public org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.AdaptiveCyberDefenseEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
