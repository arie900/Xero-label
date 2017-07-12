package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;

import com.itextpdf.text.DocumentException;

import contact.GetContact;
import pdf.CreatePdf;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileNotFoundException;

import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import java.awt.ScrollPane;

public class Gui {

	private JFrame frame;
	private JTextField firstNameText;
	private JTextField lastNameText;
	private String firstName, lastName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1426, 984);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblFirstName = new JLabel("First name");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 38));
		lblFirstName.setBounds(15, 75, 187, 58);
		frame.getContentPane().add(lblFirstName);

		firstNameText = new JTextField();
		firstNameText.setBounds(214, 75, 217, 58);
		frame.getContentPane().add(firstNameText);
		firstNameText.setColumns(10);

		JLabel lblLastName = new JLabel("Last name");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 38));
		lblLastName.setBounds(492, 75, 187, 58);
		frame.getContentPane().add(lblLastName);

		lastNameText = new JTextField();
		lastNameText.setColumns(10);
		lastNameText.setBounds(691, 75, 217, 58);
		frame.getContentPane().add(lastNameText);

		JButton searchButton = new JButton("Search");
		searchButton.setBounds(1132, 75, 115, 58);
		frame.getContentPane().add(searchButton);
		
		
		searchButton.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent arg0) {
			}
			
			public void mousePressed(MouseEvent arg0) {
			}
			
			public void mouseExited(MouseEvent arg0) {
			}
			
			public void mouseEntered(MouseEvent arg0) {
			}
			
			public void mouseClicked(MouseEvent event) {
				if(event.getButton()==MouseEvent.BUTTON1)
				{
					CreatePdf pdf = new CreatePdf();
					firstName=firstNameText.getText();
					lastName=lastNameText.getText();
					if(firstName!=null&&lastName.isEmpty()){
						try {
							System.out.println(firstName);
							pdf.createByFirstName(firstName);
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (DocumentException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					else if(firstName.isEmpty()&&lastName!=null){
						try {
							pdf.createByFirstName(lastName);
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (DocumentException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					else if(firstName!=null&&lastName!=null){
						try {
							pdf.createByFullName(firstName, lastName);
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (DocumentException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
				}
				
			}
		});

	}
}
