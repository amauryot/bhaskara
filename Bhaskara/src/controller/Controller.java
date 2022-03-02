package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Audio;
import model.Equation;
import view.OptionPane;
import view.Window;
import view.frame.MenuItem;
import view.subpanel.buttons.Button;
import view.subpanel.equation.TextFieldEquation;

public class Controller implements ActionListener {

	private Audio errorSound;
	private Equation equation;
	private OptionPane optionPane;
	private Window window;
	
	public Controller() {
		errorSound = new Audio();
		equation = new Equation();
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
			try {
				double a = Double.parseDouble(window.getValueOf(TextFieldEquation.A));
				double b = Double.parseDouble(window.getValueOf(TextFieldEquation.B));
				double c = Double.parseDouble(window.getValueOf(TextFieldEquation.C));
				
				equation.setCoefficients(a, b, c);
				
				String x1 = String.format("%.4f", equation.calculateX1());
				String x2 = String.format("%.4f", equation.calculateX2());
				
				window.setRoots(x1, x2);
				
			} catch (NumberFormatException exception) {
				errorSound.play();
				optionPane.showMessageNumberFormatException();
			}
			return;
		}
		
		/* BUTTON CLEAR */
		
		if (event.getSource() == window.getButton(Button.CLEAR)) {
			window.clearAll();
			return;
		}
	}
}
