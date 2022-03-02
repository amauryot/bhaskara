package view;

import javax.swing.JOptionPane;

public class OptionPane {

	private final String ERROR_TITLE = "Erro";
	private final String MESSAGE_NUMBER_FORMAT_EXCEPTION = "Todos os campos devem ser preenchidos com somente números.";
	private final String MESSAGE_TITLE = "Sobre Bhaskara";
	private final String MESSAGE_ABOUT =
		"Bhaskara"
		+ "\nCopyright © Mar 2022"
		+ "\n\nVersão: 1.1.0"
		+ "\n\nAmaury Tavares"
		+ "\namauryot@gmail.com\n\n";
	
	public void showMessageAbout() {
		JOptionPane.showMessageDialog(null, MESSAGE_ABOUT, MESSAGE_TITLE, JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void showMessageNumberFormatException() {
		JOptionPane.showMessageDialog(null, MESSAGE_NUMBER_FORMAT_EXCEPTION, ERROR_TITLE, JOptionPane.ERROR_MESSAGE);
	}
}
