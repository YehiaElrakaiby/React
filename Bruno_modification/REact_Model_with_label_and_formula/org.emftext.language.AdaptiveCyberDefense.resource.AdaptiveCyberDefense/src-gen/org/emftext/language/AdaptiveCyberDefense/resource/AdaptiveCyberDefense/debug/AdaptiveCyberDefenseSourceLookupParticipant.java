/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug;

public class AdaptiveCyberDefenseSourceLookupParticipant extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws org.eclipse.core.runtime.CoreException {
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.AdaptiveCyberDefenseStackFrame) {
			org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.AdaptiveCyberDefenseStackFrame frame = (org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.AdaptiveCyberDefenseStackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}
