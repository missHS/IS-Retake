package is_retake;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class ProjectFrame extends JFrame {

	private JPanel contentPane;
	
	

	public ProjectFrame(Controller controller) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTest = new JLabel("TESTA");
		lblTest.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblTest.setBounds(121, 107, 69, 20);
		contentPane.add(lblTest);
	}

}
