package rcpdemo;

import java.awt.Color;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import swing2swt.layout.FlowLayout;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.layout.grouplayout.GroupLayout;

public class ViewPart2 extends ViewPart {
	private Text text_1;
	private Text text;
	private Text text_2;

	public ViewPart2() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		parent.setFont(SWTResourceManager.getFont("ËÎÌו", 16, SWT.NORMAL));
		
		Label label = new Label(parent, SWT.HORIZONTAL | SWT.CENTER);
		label.setFont(SWTResourceManager.getFont("ËÎÌו", 16, SWT.NORMAL));
		label.setText("\u7528\u6237\u6CE8\u518C");
		
		Label label_1 = new Label(parent, SWT.NONE);
		label_1.setText("\u7528\u6237\u540D");
		
		Label label_2 = new Label(parent, SWT.NONE);
		label_2.setText("\u5BC6\u7801");
		
		Label label_3 = new Label(parent, SWT.NONE);
		label_3.setText("\u91CD\u590D\u5BC6\u7801");
		
		text_1 = new Text(parent, SWT.BORDER);
		
		Button button_1 = new Button(parent, SWT.NONE);
		button_1.setText("\u6CE8\u518C");
		
		text = new Text(parent, SWT.BORDER);
		
		text_2 = new Text(parent, SWT.BORDER);
		GroupLayout gl_parent = new GroupLayout(parent);
		gl_parent.setHorizontalGroup(
			gl_parent.createParallelGroup(GroupLayout.LEADING)
				.add(gl_parent.createSequentialGroup()
					.add(204)
					.add(label, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))
				.add(gl_parent.createSequentialGroup()
					.add(191)
					.add(label_1)
					.add(27)
					.add(text, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
				.add(gl_parent.createSequentialGroup()
					.add(203)
					.add(label_2)
					.add(27)
					.add(text_1, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
				.add(gl_parent.createSequentialGroup()
					.add(179)
					.add(label_3)
					.add(27)
					.add(text_2, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
				.add(gl_parent.createSequentialGroup()
					.add(221)
					.add(button_1, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
		);
		gl_parent.setVerticalGroup(
			gl_parent.createParallelGroup(GroupLayout.LEADING)
				.add(gl_parent.createSequentialGroup()
					.add(41)
					.add(label, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.add(5)
					.add(gl_parent.createParallelGroup(GroupLayout.LEADING)
						.add(gl_parent.createSequentialGroup()
							.add(1)
							.add(label_1))
						.add(text, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.add(12)
					.add(gl_parent.createParallelGroup(GroupLayout.LEADING)
						.add(label_2)
						.add(text_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.add(11)
					.add(gl_parent.createParallelGroup(GroupLayout.LEADING)
						.add(label_3)
						.add(text_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.add(28)
					.add(button_1))
		);
		parent.setLayout(gl_parent);
	}

	@Override
	public void setFocus() {

	}
}
