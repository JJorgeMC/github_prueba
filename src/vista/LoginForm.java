package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTable;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JTextField txtSIuser;
	private JTextField txtSIpass;
	private JTextField txtLIuser;
	private JTextField txtLIpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 337, 244);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbSign = new JLabel("Sign in");
		lbSign.setBounds(10, 11, 46, 14);
		contentPane.add(lbSign);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(10, 36, 46, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(10, 62, 60, 14);
		contentPane.add(lblContrasea);
		
		txtSIuser = new JTextField();
		txtSIuser.setBounds(76, 33, 96, 20);
		contentPane.add(txtSIuser);
		txtSIuser.setColumns(10);
		
		txtSIpass = new JTextField();
		txtSIpass.setBounds(76, 59, 96, 20);
		contentPane.add(txtSIpass);
		txtSIpass.setColumns(10);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(188, 32, 89, 23);
		contentPane.add(btnRegistrar);
		
		JLabel lblogin = new JLabel("LOGIN");
		lblogin.setBounds(10, 91, 46, 14);
		contentPane.add(lblogin);
		
		JLabel label = new JLabel("Usuario:");
		label.setBounds(10, 116, 46, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Contrase\u00F1a:");
		label_1.setBounds(10, 141, 60, 14);
		contentPane.add(label_1);
		
		txtLIuser = new JTextField();
		txtLIuser.setColumns(10);
		txtLIuser.setBounds(76, 113, 96, 20);
		contentPane.add(txtLIuser);
		
		txtLIpass = new JTextField();
		txtLIpass.setColumns(10);
		txtLIpass.setBounds(76, 138, 96, 20);
		contentPane.add(txtLIpass);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.setBounds(188, 112, 89, 23);
		contentPane.add(btnIngresar);
	}
}
