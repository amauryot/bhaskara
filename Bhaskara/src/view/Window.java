package view;

import javax.swing.JButton;
import javax.swing.JMenuItem;

import controller.Controller;
import view.frame.Frame;
import view.frame.MenuItem;
import view.panel.PanelMain;
import view.subpanel.buttons.Button;
import view.subpanel.buttons.SubPanelButtons;
import view.subpanel.equation.SubPanelEquation;
import view.subpanel.equation.TextFieldEquation;
import view.subpanel.roots.SubPanelRoots;
import view.subpanel.roots.TextFieldRoots;

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
	
	public JButton getButton(Button button) {
		return subPanelButtons.buttonList().get(button.index());
	}
	
	public String getValueOf(TextFieldEquation textField) {
		return subPanelEquation.textFieldList().get(textField.index()).getText();
	}
	
	public void setRoots(String x1, String x2) {
		subPanelRoots.textFieldList().get(TextFieldRoots.X1.index()).setText(x1);
		subPanelRoots.textFieldList().get(TextFieldRoots.X2.index()).setText(x2);
	}
	
	public void clearAll() {
		subPanelEquation.textFieldList().forEach(textField -> textField.setText(""));
		subPanelRoots.textFieldList().forEach(textField -> textField.setText(""));
	}
	
	public void addController(Controller controller) {
		frame.menuItemList().forEach(menuItem -> menuItem.addActionListener(controller));
		subPanelButtons.buttonList().forEach(button -> button.addActionListener(controller));
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
