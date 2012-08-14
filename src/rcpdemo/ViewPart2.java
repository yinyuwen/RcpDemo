package rcpdemo;

import java.awt.Color;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

public class ViewPart2 extends ViewPart {

	public ViewPart2() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		Table t = new Table(parent, 3);
		t.setBounds(3, 3, 500, 500);
	}

	@Override
	public void setFocus() {

	}

}
