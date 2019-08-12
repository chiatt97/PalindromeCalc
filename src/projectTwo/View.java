package projectTwo;
/**@author Chandler Hiatt
 * @version last updated 10-16-16
 * @class View - Creates the GUI
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class View extends JFrame {
 
	private JPanel contentPane;
	private JTextField textField_1;
	private Controller c;
	private JLabel lblReversed;
	private JButton btnGo;
	/**
	 * @author Chandler Hiatt
	 * @param _c The controller which performs methods on inputted strings.
	 * Made with eclipses WindowBuilder.
	 */
	public View(Controller _c) {
		this.c = _c;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 1, 0, 0));
		
		JLabel lblInput_1 = new JLabel("Input: ");
		panel.add(lblInput_1);
		
		JLabel lblPalindrome = new JLabel("Palindrome:");
		panel.add(lblPalindrome);
		
		lblReversed = new JLabel("Reversed:");
		panel.add(lblReversed);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		
		JLabel lblInput = new JLabel("Input: ");
		panel_1.add(lblInput);
		
		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		
		btnGo = new JButton("Go");
		
		btnGo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				c.reverse(textField_1.getText());
				lblInput_1.setText("Input:     "+textField_1.getText());
				lblPalindrome.setText("Palindrome:     " + c.isPalindrome());
				contentPane.validate();
				contentPane.repaint();
	         }
		});
		
		panel_2.add(btnGo);
		contentPane.setVisible(true);
		this.setVisible(true);
	}
	/**
	 * @author Chandler Hiatt
	 * @param s inputted string
	 * Sets the JLabel to the reversed string.
	 */
	public void setReversed(String s){
		lblReversed.setText("Reversed:     " + s);
		lblReversed.paintImmediately(lblReversed.getVisibleRect());
	}
}
