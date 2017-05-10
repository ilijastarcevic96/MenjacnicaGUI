package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblKupovniKurs;
	private JTextField kupovniKursTextField;
	private JLabel lblValuta;
	private JComboBox valutaComboBox;
	private JLabel lblKupovniKurs_1;
	private JTextField kupovniKursTextField_1;
	private JLabel lblIznos;
	private JTextField iznosTextField;
	private JLabel lblVrstaTransakcije;
	private JRadioButton rdbtnProdaja;
	private JRadioButton rdbtnKupovina;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JSlider slider;
	private JButton btnIzvrsiZamenu;
	private JButton btnOdustani;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IzvrsiZamenuGUI frame = new IzvrsiZamenuGUI();
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
	public IzvrsiZamenuGUI() {
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				GUIKontroler.zatvoriProzorIzvrsiZamenuGUI();
			}
		});
		
		setResizable(false);
		setTitle("Izvrsi zamenu");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 466, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getKupovniKursTextField());
		contentPane.add(getLblValuta());
		contentPane.add(getValutaComboBox());
		contentPane.add(getLblKupovniKurs_1());
		contentPane.add(getKupovniKursTextField_1());
		contentPane.add(getLblIznos());
		contentPane.add(getIznosTextField());
		contentPane.add(getLblVrstaTransakcije());
		contentPane.add(getRdbtnProdaja());
		contentPane.add(getRdbtnKupovina());
		rdbtnKupovina.setSelected(true);
		contentPane.add(getSlider());
		contentPane.add(getBtnIzvrsiZamenu());
		contentPane.add(getBtnOdustani());
		iznosTextField.setText("50");
	}

	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblKupovniKurs.setBounds(10, 11, 86, 14);
		}
		return lblKupovniKurs;
	}
	private JTextField getKupovniKursTextField() {
		if (kupovniKursTextField == null) {
			kupovniKursTextField = new JTextField();
			kupovniKursTextField.setEditable(false);
			kupovniKursTextField.setBounds(10, 36, 149, 20);
			kupovniKursTextField.setColumns(10);
		}
		return kupovniKursTextField;
	}
	private JLabel getLblValuta() {
		if (lblValuta == null) {
			lblValuta = new JLabel("Valuta");
			lblValuta.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblValuta.setBounds(200, 11, 46, 14);
		}
		return lblValuta;
	}
	private JComboBox getValutaComboBox() {
		if (valutaComboBox == null) {
			valutaComboBox = new JComboBox();
			valutaComboBox.addItem("EUR");
			valutaComboBox.addItem("USD");
			valutaComboBox.addItem("CHF");
			valutaComboBox.setBounds(171, 36, 104, 20);
		}
		return valutaComboBox;
	}
	private JLabel getLblKupovniKurs_1() {
		if (lblKupovniKurs_1 == null) {
			lblKupovniKurs_1 = new JLabel("Kupovni kurs");
			lblKupovniKurs_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblKupovniKurs_1.setBounds(321, 15, 103, 14);
		}
		return lblKupovniKurs_1;
	}
	private JTextField getKupovniKursTextField_1() {
		if (kupovniKursTextField_1 == null) {
			kupovniKursTextField_1 = new JTextField();
			kupovniKursTextField_1.setEditable(false);
			kupovniKursTextField_1.setBounds(285, 36, 149, 20);
			kupovniKursTextField_1.setColumns(10);
		}
		return kupovniKursTextField_1;
	}
	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblIznos.setBounds(10, 95, 46, 14);
		}
		return lblIznos;
	}
	private JTextField getIznosTextField() {
		if (iznosTextField == null) {
			iznosTextField = new JTextField();
			iznosTextField.setBounds(10, 120, 149, 20);
			iznosTextField.setColumns(10);
		}
		return iznosTextField;
	}
	private JLabel getLblVrstaTransakcije() {
		if (lblVrstaTransakcije == null) {
			lblVrstaTransakcije = new JLabel("Vrsta transakcije");
			lblVrstaTransakcije.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblVrstaTransakcije.setBounds(200, 97, 128, 14);
		}
		return lblVrstaTransakcije;
	}
	private JRadioButton getRdbtnProdaja() {
		if (rdbtnProdaja == null) {
			rdbtnProdaja = new JRadioButton("Prodaja");
			buttonGroup.add(rdbtnProdaja);
			rdbtnProdaja.setBounds(200, 145, 109, 23);
		}
		return rdbtnProdaja;
	}
	private JRadioButton getRdbtnKupovina() {
		if (rdbtnKupovina == null) {
			rdbtnKupovina = new JRadioButton("Kupovina");
			buttonGroup.add(rdbtnKupovina);
			rdbtnKupovina.setBounds(200, 119, 109, 23);
		}
		return rdbtnKupovina;
	}
	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent arg0) {
					int iznos = slider.getValue();
					getIznosTextField().setText(iznos + "");
				}
			});
			slider.setPaintLabels(true);
			slider.setPaintTicks(true);
			slider.setMajorTickSpacing(10);
			slider.setMinorTickSpacing(5);
			slider.setBounds(26, 175, 375, 36);
		}
		return slider;
	}
	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
			btnIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String transakcija = "";
					if(rdbtnKupovina.isSelected()){transakcija = "Kupvina";}else{
						transakcija = "Prodaja";
					}
					
					GUIKontroler.upisiTextUMenjacnicaGUI("Izvrsena zamena \n Valuta : "
							+ valutaComboBox.getSelectedItem().toString() + " ; Iznos : " + iznosTextField.getText()
							+ " ; Vrsta transakcije : " + transakcija);
				}
				}
			);
			btnIzvrsiZamenu.setBounds(26, 237, 201, 23);
		}
		return btnIzvrsiZamenu;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.zatvoriProzorIzvrsiZamenuGUI();
				}
			});
			btnOdustani.setBounds(237, 237, 197, 23);
		}
		return btnOdustani;
	}
}
