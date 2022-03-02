package view;

import view.frame.Frame;
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

	public void show() {
		frame.setVisible(true);
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
