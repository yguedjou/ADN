package dna.com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;

import javax.swing.JFileChooser;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;

import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class FenêtreTransciptionDna {

	private JFrame frame;
	private JRadioButton rdbtnSaisie;
	private JRadioButton rdbtnLire;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenêtreTransciptionDna window = new FenêtreTransciptionDna();
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
	public FenêtreTransciptionDna() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 240, 240));
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Lire un fichier");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("//ouvrir une arborescence.");
				//
				try{		
				
				JFileChooser chooser = new JFileChooser();
			    File f = new File("c:/folder");
			    chooser.setCurrentDirectory(f);
			    chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
			    chooser.showOpenDialog(null);
				}catch (Exception ee) {
					System.out.println(ee.getMessage());
				}
			
		
			}
		});
		btnNewButton.setBounds(74, 462, 131, 32);
		frame.getContentPane().add(btnNewButton);
		
		
		final JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 56, 439, 369);
		frame.getContentPane().add(textArea);
		
		
		final JTextArea ARNtextArea = new JTextArea();
		ARNtextArea.setBounds(904, 56, 455, 369);
		frame.getContentPane().add(ARNtextArea);
		frame.setBounds(100, 100, 1385, 596);
		
		JButton btnNewButton_1 = new JButton("valider");
		
		final JTextArea BrinctextArea = new JTextArea();
		BrinctextArea.setBounds(455, 56, 443, 369);		
		frame.getContentPane().add(BrinctextArea);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texte = textArea.getText();
				System.out.println(texte);
				converter ff = new converter();
				String builder_2=ff.complementWC(texte);
				ARNm bb = new ARNm();
				String builder_3 = bb.GenereARN(texte);
				BrinctextArea.setText(builder_2);
				ARNtextArea.setText(builder_3);
				
			}	
	});
		
		btnNewButton_1.setBounds(294, 462, 139, 32);
		frame.getContentPane().add(btnNewButton_1);
		rdbtnSaisie = new JRadioButton("Saisie à la main");
		rdbtnSaisie.setBounds(371, 0, 200, 50);
		frame.getContentPane().add(rdbtnSaisie);
		
		rdbtnLire = new JRadioButton("Lecture depuis un Fichier");
		rdbtnLire.setBounds(848, 9, 200, 32);
		frame.getContentPane().add(rdbtnLire);
		
		
		JButton btnNewButton_2 = new JButton("Creation d'Acides aminés");
		btnNewButton_2.setBounds(1122, 462, 151, 32);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblArnm = new JLabel("ARNm");
		lblArnm.setBounds(1096, 33, 46, 14);
		frame.getContentPane().add(lblArnm);
		
		JLabel lblBrinComplmentaire = new JLabel("Brin Compl\u00E9mentaire");
		lblBrinComplmentaire.setBounds(726, 33, 151, 20);
		frame.getContentPane().add(lblBrinComplmentaire);
		
		JLabel lblBrin = new JLabel("Brin");
		lblBrin.setBounds(185, 36, 46, 14);
		frame.getContentPane().add(lblBrin);
		
		JButton btnAnnimation = new JButton("Annimations");
		btnAnnimation.setBounds(883, 462, 161, 32);
		frame.getContentPane().add(btnAnnimation);
		
		
		
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
