package is_retake;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JToolBar;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTable;

public class EmployeeWindow extends JFrame {

	private JFrame frame;
	private JTextField textField;
	private JTable employeeDataTable;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table_1;
	private JPanel contentPane;
	
	Controller controller;
	


	
	/**
	 * Create the application.
	 */
	public EmployeeWindow(Controller controller) {
			initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 694, 580);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 672, 535);
		frame.getContentPane().add(tabbedPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		tabbedPane.addTab("Manage Employees", null, layeredPane, null);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel findPanel = new JPanel();
		layeredPane.add(findPanel, "name_536648811426400");
		findPanel.setLayout(null);
		
		JLabel label = new JLabel("Administrate Employees");
		label.setFont(new Font("Arial", Font.BOLD, 18));
		label.setBounds(15, 16, 263, 20);
		findPanel.add(label);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(15, 99, 235, 26);
		findPanel.add(comboBox);
		
		JLabel label_1 = new JLabel("Choose a employee below");
		label_1.setBounds(15, 63, 235, 20);
		findPanel.add(label_1);
		
		JLabel label_2 = new JLabel("or search by employee ID");
		label_2.setBounds(15, 137, 235, 20);
		findPanel.add(label_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(15, 173, 235, 26);
		findPanel.add(textField);
		
		JButton button = new JButton("Search");
		button.setBounds(168, 215, 82, 29);
		findPanel.add(button);
		
		JLabel lbResponse = new JLabel("Response");
		lbResponse.setBounds(363, 63, 126, 20);
		findPanel.add(lbResponse);
		
		employeeDataTable = new JTable();
		employeeDataTable.setBounds(611, 222, -252, -124);
		findPanel.add(employeeDataTable);
		
		JButton btnEditEmployeeData = new JButton("Edit Employee data");
		btnEditEmployeeData.setBounds(15, 371, 181, 29);
		findPanel.add(btnEditEmployeeData);
		
		JButton btnDeleteEmployee = new JButton("Delete Employee");
		btnDeleteEmployee.setBounds(15, 404, 181, 29);
		findPanel.add(btnDeleteEmployee);
		
		JPanel editPanel = new JPanel();
		layeredPane.add(editPanel, "name_537246252988700");
		editPanel.setLayout(null);
		
		JLabel label_3 = new JLabel("Change salary");
		label_3.setBounds(388, 99, 136, 20);
		editPanel.add(label_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(506, 135, 146, 26);
		editPanel.add(textField_1);
		
		JLabel label_4 = new JLabel("Change name");
		label_4.setBounds(388, 260, 136, 20);
		editPanel.add(label_4);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(506, 296, 146, 26);
		editPanel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(506, 324, 146, 26);
		editPanel.add(textField_3);
		
		JLabel label_5 = new JLabel("New salary");
		label_5.setBounds(388, 139, 103, 20);
		editPanel.add(label_5);
		
		JLabel label_6 = new JLabel("First name(s)");
		label_6.setBounds(388, 299, 103, 20);
		editPanel.add(label_6);
		
		JLabel label_7 = new JLabel("Last name(s)");
		label_7.setBounds(388, 327, 103, 20);
		editPanel.add(label_7);
		
		JButton button_1 = new JButton("Save");
		button_1.setBounds(570, 378, 82, 29);
		editPanel.add(button_1);
		
		JButton btnBackToSearch = new JButton("Back to search");
		btnBackToSearch.setBounds(15, 424, 159, 29);
		editPanel.add(btnBackToSearch);
		
		JButton button_3 = new JButton("Save");
		button_3.setBounds(570, 173, 82, 29);
		editPanel.add(button_3);
		
		table_1 = new JTable();
		table_1.setBounds(29, 58, 1, 1);
		editPanel.add(table_1);
		
		JLabel lblOptions = new JLabel("Options");
		lblOptions.setBounds(388, 27, 69, 20);
		editPanel.add(lblOptions);
	}
}
