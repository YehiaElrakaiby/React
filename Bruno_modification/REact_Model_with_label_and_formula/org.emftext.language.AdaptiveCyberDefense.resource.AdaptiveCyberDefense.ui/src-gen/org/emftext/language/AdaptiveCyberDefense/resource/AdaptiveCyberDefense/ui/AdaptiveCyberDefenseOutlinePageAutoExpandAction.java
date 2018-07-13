/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.ui;

public class AdaptiveCyberDefenseOutlinePageAutoExpandAction extends org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.ui.AbstractAdaptiveCyberDefenseOutlinePageAction {
	
	public AdaptiveCyberDefenseOutlinePageAutoExpandAction(org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.ui.AdaptiveCyberDefenseOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Auto expand", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/auto_expand_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setAutoExpand(on);
		getTreeViewer().refresh();
	}
	
}
