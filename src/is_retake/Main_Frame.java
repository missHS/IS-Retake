package is_retake;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.SystemColor;
import javax.swing.Box;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class Main_Frame extends JFrame {

	private JPanel contentPane;
	private Controller controller;
	private final ButtonGroup buttonGroup = new ButtonGroup();


	public Main_Frame(Controller controller) {
		this.controller = controller;
		setUndecorated(true);
		setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 555);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel titlePanel = new Panel();
		titlePanel.setBackground(new Color(70, 130, 180));
		titlePanel.setBounds(0, 0, 701, 64);
		contentPane.add(titlePanel);
		titlePanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Project Master");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		lblNewLabel.setBounds(15, 0, 551, 64);
		titlePanel.add(lblNewLabel);
		
		JButton btnOganizationOverview = new JButton("Oganization \n Overview");
		btnOganizationOverview.setToolTipText("Employees and organization structure");
		btnOganizationOverview.setBounds(337, 239, 225, 129);
		contentPane.add(btnOganizationOverview);
		btnOganizationOverview.setBorder(new LineBorder(new Color(255, 255, 255)));
		btnOganizationOverview.setForeground(new Color(255, 255, 255));
		btnOganizationOverview.setBackground(new Color(70, 130, 180));
		buttonGroup.add(btnOganizationOverview);
		btnOganizationOverview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnOganizationOverview.setFont(new Font("Arial", Font.BOLD, 16));
		
		JButton btnProjectsOverview = new JButton("Projects Overview");
		btnProjectsOverview.setToolTipText("Projects information and reports");
		btnProjectsOverview.setBounds(95, 239, 225, 129);
		contentPane.add(btnProjectsOverview);
		btnProjectsOverview.setForeground(new Color(255, 255, 255));
		btnProjectsOverview.setBackground(new Color(70, 130, 180));
		btnProjectsOverview.setFont(new Font("Arial", Font.BOLD, 16));
		buttonGroup.add(btnProjectsOverview);
		
		JLabel lblNewLabel_1 = new JLabel("Please make one of the following choices: ");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(15, 113, 374, 24);
		contentPane.add(lblNewLabel_1);
		
		
		
		
		}
	}

