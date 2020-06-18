package is_retake;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OrganizationFrame extends JFrame {

	private JPanel contentPane;
	private Controller controller;
	private JButton btnTestbutton = new JButton("TestButton");


	public JButton getBtnTestbutton() {
		return btnTestbutton;
	}


	public void setBtnTestbutton(JButton btnTestbutton) {
		this.btnTestbutton = btnTestbutton;
	}


	public OrganizationFrame(Controller controller) {
		this.controller = controller;
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 594, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblTeast = new JLabel("TEAST!!");
		contentPane.add(lblTeast, BorderLayout.CENTER);
		
		
		btnTestbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controller.testFrame();
			}
		});
		contentPane.add(btnTestbutton, BorderLayout.EAST);
		
		
	}

}
