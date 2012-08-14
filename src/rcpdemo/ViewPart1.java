package rcpdemo;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

public class ViewPart1 extends ViewPart {

	public ViewPart1() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		Text t = new Text(parent, SWT.BORDER);
		t.setText("this is my first RcpDemo");
	}

	@Override
	public void setFocus() {

	}

}
