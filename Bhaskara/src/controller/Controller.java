package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.OptionPane;
import view.Window;
import view.frame.MenuItem;
import view.subpanel.buttons.Button;

public class Controller implements ActionListener {

	private OptionPane optionPane;
	private Window window;
	
	public Controller() {
		optionPane = new OptionPane();
		window = new Window();
	}
	
	public void run() {
		window.show();
		window.addController(this);
	}

	@Override
	public void actionPerformed(ActionEvent event) {

		/* MENU ITEM ABOUT */
		
		if (event.getSource() == window.getMenuItem(MenuItem.ABOUT)) {
			optionPane.showMessageAbout();
			return;
		}
		
		/* MENU ITEM EXIT */
		
		if (event.getSource() == window.getMenuItem(MenuItem.EXIT)) {
			window.close();
		}
		
		/* BUTTON CALCULATE */
		
		if (event.getSource() == window.getButton(Button.CALCULATE)) {
			// TODO
			return;
		}
		
		/* BUTTON CLEAR */
		
		if (event.getSource() == window.getButton(Button.CLEAR)) {
			window.clearAll();
			return;
		}
	}
}
