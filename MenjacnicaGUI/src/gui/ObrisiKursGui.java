package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class ObrisiKursGui extends JFrame {

	private JPanel contentPane;
	private JLabel lblSifra;
	private JLabel lblNaziv;
	private JTextField sifraTextField;
	private JTextField nazivTextField;
	private JLabel lblProdajniKurs;
	private JLabel lblKupovniKurs;
	private JTextField prodajniKursTextField;
	private JTextField kupovniKursTextField;
	private JLabel lblSrednjiKurs;
	private JLabel lblSkraceniNaziv;
	private JTextField srednjiKursTextField;
	private JTextField skraceniNazivTextField;
	private JCheckBox chckbxZaistaObrisi;
	private JButton btnObrisi;
	private JButton btnOdustani;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ObrisiKursGui frame = new ObrisiKursGui();
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
	public ObrisiKursGui() {
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				GUIKontroler.zatvoriProzorObrisiKurs();
			}
		});
		
		setResizable(false);
		setTitle("Obrisi kurs");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 452, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblSifra());
		contentPane.add(getLblNaziv());
		contentPane.add(getSifraTextField());
		contentPane.add(getNazivTextField());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getProdajniKursTextField());
		contentPane.add(getKupovniKursTextField());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getSrednjiKursTextField());
		contentPane.add(getSkraceniNazivTextField());
		contentPane.add(getChckbxZaistaObrisi());
		contentPane.add(getBtnObrisi());
		contentPane.add(getBtnOdustani());
	}
	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblSifra.setBounds(10, 22, 128, 14);
		}
		return lblSifra;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNaziv.setBounds(222, 22, 159, 14);
		}
		return lblNaziv;
	}
	private JTextField getSifraTextField() {
		if (sifraTextField == null) {
			sifraTextField = new JTextField();
			sifraTextField.setEditable(false);
			sifraTextField.setBounds(10, 66, 128, 20);
			sifraTextField.setColumns(10);
		}
		return sifraTextField;
	}
	private JTextField getNazivTextField() {
		if (nazivTextField == null) {
			nazivTextField = new JTextField();
			nazivTextField.setEditable(false);
			nazivTextField.setBounds(222, 66, 159, 20);
			nazivTextField.setColumns(10);
		}
		return nazivTextField;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblProdajniKurs.setBounds(10, 126, 128, 14);
		}
		return lblProdajniKurs;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblKupovniKurs.setBounds(222, 126, 159, 14);
		}
		return lblKupovniKurs;
	}
	private JTextField getProdajniKursTextField() {
		if (prodajniKursTextField == null) {
			prodajniKursTextField = new JTextField();
			prodajniKursTextField.setEditable(false);
			prodajniKursTextField.setBounds(10, 173, 128, 20);
			prodajniKursTextField.setColumns(10);
		}
		return prodajniKursTextField;
	}
	private JTextField getKupovniKursTextField() {
		if (kupovniKursTextField == null) {
			kupovniKursTextField = new JTextField();
			kupovniKursTextField.setEditable(false);
			kupovniKursTextField.setBounds(222, 173, 159, 20);
			kupovniKursTextField.setColumns(10);
		}
		return kupovniKursTextField;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblSrednjiKurs.setBounds(10, 232, 371, 14);
		}
		return lblSrednjiKurs;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblSkraceniNaziv.setBounds(222, 232, 159, 14);
		}
		return lblSkraceniNaziv;
	}
	private JTextField getSrednjiKursTextField() {
		if (srednjiKursTextField == null) {
			srednjiKursTextField = new JTextField();
			srednjiKursTextField.setEditable(false);
			srednjiKursTextField.setBounds(10, 287, 128, 20);
			srednjiKursTextField.setColumns(10);
		}
		return srednjiKursTextField;
	}
	private JTextField getSkraceniNazivTextField() {
		if (skraceniNazivTextField == null) {
			skraceniNazivTextField = new JTextField();
			skraceniNazivTextField.setEditable(false);
			skraceniNazivTextField.setBounds(222, 287, 159, 20);
			skraceniNazivTextField.setColumns(10);
		}
		return skraceniNazivTextField;
	}
	private JCheckBox getChckbxZaistaObrisi() {
		if (chckbxZaistaObrisi == null) {
			chckbxZaistaObrisi = new JCheckBox("Zaista obrisi");
			chckbxZaistaObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.promeniStanjeDugmeta(btnObrisi);
				}
			});
			chckbxZaistaObrisi.setBounds(10, 329, 97, 23);
		}
		return chckbxZaistaObrisi;
	}
	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.upisiTextUMenjacnicaGUI("Obrisan kurs \n Sifra : " + getSifraTextField().getText() + " ; Naziv : " + getNazivTextField().getText()
							+ " ; Prodajni kurs : " + getProdajniKursTextField().getText() + " ; Kupovni kurs : " + getKupovniKursTextField().getText()
							+ " ; Srednji kurs : " + getSrednjiKursTextField().getText() + " ; Skraceni Naziv : "
							+ getSkraceniNazivTextField().getText());
				}
			});
			btnObrisi.setEnabled(false);
			btnObrisi.setBounds(10, 377, 186, 23);
		}
		return btnObrisi;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIKontroler.zatvoriProzorObrisiKurs();
				}
			});
			btnOdustani.setBounds(222, 377, 159, 23);
		}
		return btnOdustani;
	}
}
