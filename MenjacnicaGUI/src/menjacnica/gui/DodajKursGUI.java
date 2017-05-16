package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DodajKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblSifra;
	private JLabel lblNaziv;
	private JTextField sifraTextField;
	private JTextField nazivTextField;
	private JLabel lblProdajniKurs;
	private JLabel lblSrednjiKurs;
	private JTextField prodajniKursTextField;
	private JTextField srednjiKursTextField;
	private JLabel lblKupovniKurs;
	private JLabel lblSkraceniNaziv;
	private JTextField kupovniKursTextField;
	private JTextField skraceniNazivTextField;
	private JButton btnDodaj;
	private JButton btnOdustani;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DodajKursGUI frame = new DodajKursGUI();
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
	public DodajKursGUI() {
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				GUIKontroler.zatvoriProzorDodajKursGUI();
			}
		});
		
		setResizable(false);
		setTitle("Dodaj kurs");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 452, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblSifra());
		contentPane.add(getLblNaziv());
		contentPane.add(getSifraTextField());
		contentPane.add(getNazivTextField());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getProdajniKursTextField());
		contentPane.add(getSrednjiKursTextField());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getKupovniKursTextField());
		contentPane.add(getSkraceniNazivTextField());
		contentPane.add(getBtnDodaj());
		contentPane.add(getBtnOdustani());
	}
	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblSifra.setBounds(10, 23, 159, 32);
		}
		return lblSifra;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNaziv.setBounds(234, 23, 159, 32);
		}
		return lblNaziv;
	}
	private JTextField getSifraTextField() {
		if (sifraTextField == null) {
			sifraTextField = new JTextField();
			sifraTextField.setBounds(10, 66, 159, 20);
			sifraTextField.setColumns(10);
		}
		return sifraTextField;
	}
	private JTextField getNazivTextField() {
		if (nazivTextField == null) {
			nazivTextField = new JTextField();
			nazivTextField.setBounds(260, 66, 176, 20);
			nazivTextField.setColumns(10);
		}
		return nazivTextField;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblProdajniKurs.setBounds(10, 110, 128, 20);
		}
		return lblProdajniKurs;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblSrednjiKurs.setBounds(234, 113, 135, 14);
		}
		return lblSrednjiKurs;
	}
	private JTextField getProdajniKursTextField() {
		if (prodajniKursTextField == null) {
			prodajniKursTextField = new JTextField();
			prodajniKursTextField.setBounds(10, 138, 159, 20);
			prodajniKursTextField.setColumns(10);
		}
		return prodajniKursTextField;
	}
	private JTextField getSrednjiKursTextField() {
		if (srednjiKursTextField == null) {
			srednjiKursTextField = new JTextField();
			srednjiKursTextField.setBounds(260, 138, 176, 20);
			srednjiKursTextField.setColumns(10);
		}
		return srednjiKursTextField;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblKupovniKurs.setBounds(10, 193, 411, 14);
		}
		return lblKupovniKurs;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblSkraceniNaziv.setBounds(234, 193, 187, 14);
		}
		return lblSkraceniNaziv;
	}
	private JTextField getKupovniKursTextField() {
		if (kupovniKursTextField == null) {
			kupovniKursTextField = new JTextField();
			kupovniKursTextField.setBounds(10, 218, 159, 20);
			kupovniKursTextField.setColumns(10);
		}
		return kupovniKursTextField;
	}
	private JTextField getSkraceniNazivTextField() {
		if (skraceniNazivTextField == null) {
			skraceniNazivTextField = new JTextField();
			skraceniNazivTextField.setBounds(260, 218, 176, 20);
			skraceniNazivTextField.setColumns(10);
		}
		return skraceniNazivTextField;
	}
	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String tekst = "Naziv: "+nazivTextField.getText()+" Sifra: "+sifraTextField.getText()+
							" Prodajni kurs: "+prodajniKursTextField.getText()+" Srednji kurs: "+srednjiKursTextField.getText()+
							" Kupovni kurs: "+kupovniKursTextField.getText()+" Skraceni naziv: "+skraceniNazivTextField.getText();
					
					GUIKontroler.upisiTextUMenjacnicaGUI(tekst);
				}
			});
			btnDodaj.setBounds(10, 292, 159, 23);
		}
		return btnDodaj;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.zatvoriProzorDodajKursGUI();
				}
			});
			btnOdustani.setBounds(260, 292, 176, 23);
		}
		return btnOdustani;
	}
}
