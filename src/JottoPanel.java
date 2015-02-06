import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.JSeparator;
import javax.swing.JTree;
import javax.swing.JComboBox;


public class JottoPanel extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public JottoPanel() {
		
		JTree tree = new JTree();
		add(tree);
		
		textField = new JTextField();
		add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		add(separator);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		add(chckbxNewCheckBox);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		add(tglbtnNewToggleButton);

	}

}
