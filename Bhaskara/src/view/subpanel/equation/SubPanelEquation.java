package view.subpanel.equation;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class SubPanelEquation extends JPanel {

	private static final long serialVersionUID = 4225565493821552288L;

	private final String SUBPANEL_TITLE = "Equação";
	private final int SUBPANEL_X = 10;
	private final int SUBPANEL_Y = 10;
	private final int SUBPANEL_WIDTH = 290;
	private final int SUBPANEL_HEIGHT = 85;
	
	private ArrayList<JTextField> textFieldList;
	
	public SubPanelEquation() {
		super();
		initialize();
	}
	
	public ArrayList<JTextField> textFieldList() {
		return textFieldList;
	}
	
	private void initialize() {
		
		/* SUBPANEL */
		
		this.setLayout(null);
		this.setBounds(SUBPANEL_X, SUBPANEL_Y, SUBPANEL_WIDTH, SUBPANEL_HEIGHT);
		this.setBorder(new TitledBorder(new EtchedBorder(), SUBPANEL_TITLE));
		
		/* FONT */
		
		Font labelFont = new Font("Tahoma", Font.BOLD, 16);
		
		/* LABELS */
		
		for (LabelEquation labelEnum : LabelEquation.values()) {
			JLabel label = new JLabel(labelEnum.title());
			label.setBounds(labelEnum.x(), labelEnum.y(), labelEnum.width(), labelEnum.height());
			label.setHorizontalAlignment(JLabel.CENTER);
			label.setFont(labelFont);
			this.add(label);
		}
		
		/* TEXT FIELDS */
		
		textFieldList = new ArrayList<JTextField>();
		
		for (TextFieldEquation textFieldEnum : TextFieldEquation.values()) {
			JTextField textField = new JTextField();
			textField.setBounds(textFieldEnum.x(), textFieldEnum.y(), textFieldEnum.width(), textFieldEnum.height());
			textField.setHorizontalAlignment(JTextField.CENTER);
			this.add(textField);
			textFieldList.add(textField);
		}
	}
}
