package rcpdemo;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.NotEnabledException;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ShellAdapter;
import org.eclipse.swt.events.ShellEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tray;
import org.eclipse.swt.widgets.TrayItem;
import org.eclipse.ui.IWorkbenchPreferenceConstants;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {
	private IWorkbenchWindow window;
	private TrayItem trayItem;
	private Image trayImage;

	private static final String COMMAND_ID = "rcpdemo.exitCommand";

	public ApplicationWorkbenchWindowAdvisor(
			IWorkbenchWindowConfigurer configurer) {
		super(configurer);
	}

	public ActionBarAdvisor createActionBarAdvisor(
			IActionBarConfigurer configurer) {
		return new ApplicationActionBarAdvisor(configurer);
	}

	public void preWindowOpen() {
		IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
		configurer.setInitialSize(new Point(600, 500));
		configurer.setTitle("RCP Demo");
		configurer.setShowCoolBar(false);
		configurer.setShowStatusLine(false);
		configurer.setShowStatusLine(true);
		configurer.setShowPerspectiveBar(true);

		IPreferenceStore ip = PlatformUI.getPreferenceStore();
		ip.setValue(IWorkbenchPreferenceConstants.DOCK_PERSPECTIVE_BAR,
				"TOP_LEFT");

	}

	@Override
	public void postWindowOpen() {
		IStatusLineManager im = getWindowConfigurer().getActionBarConfigurer()
				.getStatusLineManager();
		im.setMessage(" this is Startus");
		window = getWindowConfigurer().getWindow();
		trayItem = initTaskItem(window);
		if (trayItem != null) {
			minimizeBehavior();
			hookPopupMenu();
		}
	}

	private TrayItem initTaskItem(IWorkbenchWindow window2) {
		final Tray tray = window2.getShell().getDisplay().getSystemTray();
		TrayItem trayItem = new TrayItem(tray, SWT.NONE);
		trayImage = AbstractUIPlugin.imageDescriptorFromPlugin("rcpdemo", "/icons/alt_about.gif")
				.createImage();
		trayItem.setImage(trayImage);
		trayItem.setToolTipText("TrayItem");
		return trayItem;
	}

	private void hookPopupMenu() {
		trayItem.addListener(SWT.MenuDetect, new Listener() {

			@Override
			public void handleEvent(Event event) {
				Menu menu = new Menu(window.getShell(), SWT.POP_UP);
				MenuItem item = new MenuItem(menu, SWT.NONE);
				item.setText("GOODBye");
				item.addListener(SWT.Selection, new Listener() {

					@Override
					public void handleEvent(Event event) {
						IHandlerService hs = (IHandlerService) window
								.getService(IHandlerService.class);
						try {
							hs.executeCommand(COMMAND_ID, null);

						} catch (ExecutionException e) {
							e.printStackTrace();
						} catch (NotDefinedException e) {
							e.printStackTrace();
						} catch (NotEnabledException e) {
							e.printStackTrace();
						} catch (NotHandledException e) {
							e.printStackTrace();
						}

					}

				});
				menu.setVisible(true);
			}

		});
	}

	private void minimizeBehavior() {
		window.getShell().addShellListener(new ShellAdapter() {
			public void shellIconified(ShellEvent e) {
				window.getShell().setVisible(false);
			}
		});
		trayItem.addListener(SWT.DefaultSelection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				Shell shell = window.getShell();
				if (!shell.isVisible()) {
					window.getShell().setMinimized(false);
					shell.setVisible(true);
				}
			}

		});
	}

	@Override
	public void dispose() {
		if (trayImage != null) {
			trayImage.dispose();
		}
		if (trayItem != null) {
			trayItem.dispose();
		}
	}
}
