/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense;

public interface IAdaptiveCyberDefenseProblem {
	public String getMessage();
	public org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.AdaptiveCyberDefenseEProblemSeverity getSeverity();
	public org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.AdaptiveCyberDefenseEProblemType getType();
	public java.util.Collection<org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseQuickFix> getQuickFixes();
}
