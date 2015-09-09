package Example;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Font;
import javax.swing.BoxLayout;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JComboBox;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;
import javax.swing.JTextPane;
import javax.swing.JLabel;

public class DictionaryWindow extends JFrame {

	private JPanel contentPane;
	private JTextField word;
	private JTextField textField;
	private JTextField description;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Trie t = new Trie();

				try {
					DictionaryWindow frame = new DictionaryWindow();
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
	public DictionaryWindow() {
		setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 16));
		setForeground(Color.DARK_GRAY);
		setTitle("Dictionary");
		setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 477, 332);
		contentPane = new JPanel();
		contentPane.setAlignmentX(Component.LEFT_ALIGNMENT);
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setForeground(Color.RED);
//		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.GRAY));
//		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		textField = new JTextField(40);

		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(232, 35, 136, 41);
		btnSearch.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
//				Trie t = new Trie();
				String word = textField.getText().trim();
				t.search(word);
				
				
				
				
				
				
			}
			
		}
				
				
				
				
				
				);
		contentPane.add(btnSearch);
		

		
		JLabel lblEnter = new JLabel("Enter word:");
		lblEnter.setBounds(36, 14, 95, 15);
		contentPane.add(lblEnter);
		
//		textField = new JTextField();
//		textField.setBounds(36, 35, 121, 30);
//		contentPane.add(textField);
//		textField.setColumns(10);
		

		textField.setBounds(36, 42, 171, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		

		description.setBounds(41, 106, 180, 124);
		contentPane.add(description);
		description.setColumns(10);

		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane}));
	}
}
