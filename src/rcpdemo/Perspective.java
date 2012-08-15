package rcpdemo;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(true);
		// layout.addStandaloneView(WorkSpaceHeader.ID, false, IPageLayout.TOP,
		// 0.15f, layout.getEditorArea());
		IFolderLayout navFold = layout.createFolder("Navigator",
				IPageLayout.LEFT, 0.95f, layout.getEditorArea());
		navFold.addView("rcpdemo.view1");
		navFold.addView("rcpdemo.view2");
	}
}
