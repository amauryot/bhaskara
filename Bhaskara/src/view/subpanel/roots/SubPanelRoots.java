package view.subpanel.roots;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class SubPanelRoots extends JPanel {

	private static final long serialVersionUID = -6919618817865587814L;
	
	private final int SUBPANEL_X      = 10;
	private final int SUBPANEL_Y      = 105;
	private final int SUBPANEL_WIDTH  = 290;
	private final int SUBPANEL_HEIGHT = 120;
	
	private final String SUBPANEL_TITLE = "Raízes";
	
	private ArrayList<JTextField> textFieldList;
	
	public SubPanelRoots() {
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
		
		for (LabelRoots labelEnum : LabelRoots.values()) {
			JLabel label = new JLabel(labelEnum.title());
			label.setBounds(labelEnum.x(), labelEnum.y(), labelEnum.width(), labelEnum.height());
			label.setHorizontalAlignment(JLabel.CENTER);
			label.setFont(labelFont);
			this.add(label);
		}
		
		/* TEXT FIELDS */
		
		textFieldList = new ArrayList<JTextField>();
		
		for (TextFieldRoots textFieldEnum : TextFieldRoots.values()) {
			JTextField textField = new JTextField();
			textField.setBounds(textFieldEnum.x(), textFieldEnum.y(), textFieldEnum.width(), textFieldEnum.height());
			textField.setBorder(new EtchedBorder());
			textField.setHorizontalAlignment(JTextField.CENTER);
			textField.setEditable(false);
			this.add(textField);
			textFieldList.add(textField);
		}
	}
}
