package view;

import javax.swing.JMenuItem;

import controller.Controller;
import view.frame.Frame;
import view.frame.MenuItem;
import view.panel.PanelMain;
import view.subpanel.buttons.SubPanelButtons;
import view.subpanel.equation.SubPanelEquation;
import view.subpanel.roots.SubPanelRoots;

public class Window {

	private Frame frame;
	private PanelMain panelMain;
	private SubPanelEquation subPanelEquation;
	private SubPanelRoots subPanelRoots;
	private SubPanelButtons subPanelButtons;

	public Window() {
		initialize();
	}

	public JMenuItem getMenuItem(MenuItem menuItem) {
		return frame.menuItemList().get(menuItem.index());
	}
	
	public void addController(Controller controller) {
		frame.menuItemList().forEach(menuItem -> menuItem.addActionListener(controller));
	}
	
	public void show() {
		frame.setVisible(true);
	}
	
	public void close() {
		frame.dispose();
	}
	
	private void initialize() {
		frame = new Frame();
		
		panelMain = new PanelMain();
		frame.getContentPane().add(panelMain);
		
		subPanelEquation = new SubPanelEquation();
		panelMain.add(subPanelEquation);
		
		subPanelRoots = new SubPanelRoots();
		panelMain.add(subPanelRoots);
		
		subPanelButtons = new SubPanelButtons();
		panelMain.add(subPanelButtons);
	}
}
