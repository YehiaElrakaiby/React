/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.ui;

public class AdaptiveCyberDefenseOutlinePageActionProvider {
	
	public java.util.List<org.eclipse.jface.action.IAction> getActions(org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.ui.AdaptiveCyberDefenseOutlinePageTreeViewer treeViewer) {
		// To add custom actions to the outline view, set the
		// 'overrideOutlinePageActionProvider' option to <code>false</code> and modify
		// this method.
		java.util.List<org.eclipse.jface.action.IAction> defaultActions = new java.util.ArrayList<org.eclipse.jface.action.IAction>();
		defaultActions.add(new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.ui.AdaptiveCyberDefenseOutlinePageLinkWithEditorAction(treeViewer));
		defaultActions.add(new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.ui.AdaptiveCyberDefenseOutlinePageCollapseAllAction(treeViewer));
		defaultActions.add(new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.ui.AdaptiveCyberDefenseOutlinePageExpandAllAction(treeViewer));
		defaultActions.add(new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.ui.AdaptiveCyberDefenseOutlinePageAutoExpandAction(treeViewer));
		defaultActions.add(new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.ui.AdaptiveCyberDefenseOutlinePageLexicalSortingAction(treeViewer));
		defaultActions.add(new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.ui.AdaptiveCyberDefenseOutlinePageTypeSortingAction(treeViewer));
		return defaultActions;
	}
	
}
