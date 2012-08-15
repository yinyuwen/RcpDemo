package rcpdemo;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.custom.TableCursor;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.Button;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Label;
import swing2swt.layout.FlowLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import swing2swt.layout.BorderLayout;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.wb.swt.SWTResourceManager;

public class ViewPart1 extends ViewPart {
	private Text text;
	private Table table;

	public ViewPart1() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new FormLayout());
		
		Label label = new Label(parent, SWT.CENTER);
		FormData fd_label = new FormData();
		fd_label.bottom = new FormAttachment(100, -126);
		fd_label.left = new FormAttachment(0, 38);
		fd_label.right = new FormAttachment(0, 522);
		fd_label.top = new FormAttachment(0, 408);
		label.setLayoutData(fd_label);
		
		Label label_1 = new Label(parent, SWT.CENTER);
		FormData fd_label_1 = new FormData();
		fd_label_1.bottom = new FormAttachment(0, 47);
		fd_label_1.right = new FormAttachment(0, 337);
		fd_label_1.top = new FormAttachment(0, 10);
		fd_label_1.left = new FormAttachment(0, 214);
		label_1.setLayoutData(fd_label_1);
		label_1.setFont(SWTResourceManager.getFont("ËÎÌו", 16, SWT.NORMAL));
		label_1.setText("\u4FE1\u606F\u67E5\u8BE2");
		
		Label label_2 = new Label(parent, SWT.NONE);
		FormData fd_label_2 = new FormData();
		fd_label_2.top = new FormAttachment(0, 59);
		fd_label_2.left = new FormAttachment(0, 134);
		label_2.setLayoutData(fd_label_2);
		label_2.setText("\u7528\u6237\u540D");
		
		Button button = new Button(parent, SWT.NONE);
		FormData fd_button = new FormData();
		fd_button.right = new FormAttachment(0, 430);
		fd_button.top = new FormAttachment(0, 51);
		fd_button.left = new FormAttachment(0, 374);
		button.setLayoutData(fd_button);
		button.setText("\u67E5\u8BE2");
		
		text = new Text(parent, SWT.BORDER);
		FormData fd_text = new FormData();
		fd_text.right = new FormAttachment(0, 349);
		fd_text.top = new FormAttachment(0, 53);
		fd_text.left = new FormAttachment(0, 193);
		text.setLayoutData(fd_text);
		
		table = new Table(parent, SWT.BORDER | SWT.FULL_SELECTION);
		FormData fd_table = new FormData();
		fd_table.bottom = new FormAttachment(label, -66);
		fd_table.top = new FormAttachment(button, 36);
		fd_table.left = new FormAttachment(0, 62);
		fd_table.right = new FormAttachment(100, -64);
		table.setLayoutData(fd_table);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tableColumn = new TableColumn(table, SWT.NONE);
		tableColumn.setWidth(118);
		tableColumn.setText("\u7528\u6237\u540D");
		
		TableColumn tableColumn_1 = new TableColumn(table, SWT.NONE);
		tableColumn_1.setWidth(110);
		tableColumn_1.setText("\u5BC6\u7801");
		
		TableColumn tableColumn_2 = new TableColumn(table, SWT.NONE);
		tableColumn_2.setWidth(139);
		tableColumn_2.setText("\u6CE8\u518C\u65E5\u671F");
		
		TableColumn tableColumn_3 = new TableColumn(table, SWT.NONE);
		tableColumn_3.setWidth(192);
		tableColumn_3.setText("\u5907\u6CE8");
	}

	@Override
	public void setFocus() {

	}
}
