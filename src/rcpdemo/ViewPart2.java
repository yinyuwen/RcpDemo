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
		parent.setLayout(new FormLayout());
		
		Label label = new Label(parent, SWT.CENTER);
		label.setFont(SWTResourceManager.getFont("ËÎÌו", 16, SWT.NORMAL));
		FormData fd_label = new FormData();
		fd_label.top = new FormAttachment(0, 40);
		fd_label.left = new FormAttachment(0, 208);
		fd_label.right = new FormAttachment(100, -229);
		fd_label.bottom = new FormAttachment(0, 88);
		label.setLayoutData(fd_label);
		label.setText("\u7528\u6237\u6CE8\u518C");
		
		Label label_1 = new Label(parent, SWT.NONE);
		FormData fd_label_1 = new FormData();
		fd_label_1.top = new FormAttachment(label, 7);
		fd_label_1.left = new FormAttachment(0, 191);
		label_1.setLayoutData(fd_label_1);
		label_1.setText("\u7528\u6237\u540D");
		
		Label label_2 = new Label(parent, SWT.NONE);
		FormData fd_label_2 = new FormData();
		fd_label_2.top = new FormAttachment(label_1, 17);
		fd_label_2.right = new FormAttachment(label_1, 0, SWT.RIGHT);
		label_2.setLayoutData(fd_label_2);
		label_2.setText("\u5BC6\u7801");
		
		Label label_3 = new Label(parent, SWT.NONE);
		FormData fd_label_3 = new FormData();
		fd_label_3.top = new FormAttachment(label_2, 17);
		fd_label_3.right = new FormAttachment(label_1, 0, SWT.RIGHT);
		label_3.setLayoutData(fd_label_3);
		label_3.setText("\u91CD\u590D\u5BC6\u7801");
		
		text_1 = new Text(parent, SWT.BORDER);
		FormData fd_text_1 = new FormData();
		fd_text_1.top = new FormAttachment(label, 36);
		fd_text_1.right = new FormAttachment(label_2, 148, SWT.RIGHT);
		fd_text_1.left = new FormAttachment(label_2, 27);
		text_1.setLayoutData(fd_text_1);
		
		Button button_1 = new Button(parent, SWT.NONE);
		FormData fd_button_1 = new FormData();
		fd_button_1.top = new FormAttachment(label_3, 34);
		fd_button_1.left = new FormAttachment(0, 221);
		fd_button_1.right = new FormAttachment(100, -278);
		button_1.setLayoutData(fd_button_1);
		button_1.setText("\u6CE8\u518C");
		
		text = new Text(parent, SWT.BORDER);
		FormData fd_text = new FormData();
		fd_text.right = new FormAttachment(text_1, 0, SWT.RIGHT);
		fd_text.top = new FormAttachment(label, 6);
		fd_text.left = new FormAttachment(label_1, 27);
		text.setLayoutData(fd_text);
		
		text_2 = new Text(parent, SWT.BORDER);
		FormData fd_text_2 = new FormData();
		fd_text_2.right = new FormAttachment(label_3, 148, SWT.RIGHT);
		fd_text_2.top = new FormAttachment(text_1, 11);
		fd_text_2.left = new FormAttachment(label_3, 27);
		text_2.setLayoutData(fd_text_2);
	}

	@Override
	public void setFocus() {

	}
}
