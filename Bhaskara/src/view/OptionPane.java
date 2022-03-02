package view;

import javax.swing.JOptionPane;

public class OptionPane {

	private final String ERROR_TITLE = "Erro";
	private final String MESSAGE_NUMBER_FORMAT_EXCEPTION = "Todos os campos devem ser preenchidos com somente números!";
	private final String MESSAGE_NOT_QUADRATIC_EXCEPTION = "Esta equação não é do 2º grau!";
	private final String MESSAGE_NO_REAL_ROOTS_EXCEPTION = "Esta equação não possui raízes reais!";
	private final String MESSAGE_TITLE = "Sobre Bhaskara";
	private final String MESSAGE_ABOUT =
		"Bhaskara"
		+ "\nCopyright © Mar 2022"
		+ "\n\nVersão: 1.2.0"
		+ "\n\nAmaury Tavares"
		+ "\namauryot@gmail.com\n\n";
	
	public void showMessageAbout() {
		JOptionPane.showMessageDialog(null, MESSAGE_ABOUT, MESSAGE_TITLE, JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void showMessageNumberFormatException() {
		JOptionPane.showMessageDialog(null, MESSAGE_NUMBER_FORMAT_EXCEPTION, ERROR_TITLE, JOptionPane.ERROR_MESSAGE);
	}
	
	public void showMessageNotQuadraticException() {
		JOptionPane.showMessageDialog(null, MESSAGE_NOT_QUADRATIC_EXCEPTION, ERROR_TITLE, JOptionPane.ERROR_MESSAGE);
	}
	
	public void showMessageNoRealRootsException() {
		JOptionPane.showMessageDialog(null, MESSAGE_NO_REAL_ROOTS_EXCEPTION, ERROR_TITLE, JOptionPane.ERROR_MESSAGE);
	}
}
