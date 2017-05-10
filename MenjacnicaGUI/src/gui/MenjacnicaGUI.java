package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.basic.BasicTreeUI.SelectionModelPropertyChangeHandler;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenjacnicaGUI extends JFrame {

	private JPanel contentPane;
	private JPanel eastPanel;
	private JButton btnDodajKurs;
	private JButton btnObrisiKurs;
	private JButton btnIzvrsiZamenu;
	private JPanel southPanel;
	private JScrollPane southScrollPane;
	private JTextArea southTextArea;
	private JPanel centerPanel;
	private JScrollPane scrollPane;
	private JTable table;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnHelp;
	private JMenuItem mntmOpen;
	private JMenuItem mntmSave;
	private JMenuItem mntmExit;
	private JMenuItem mntmAbout;
	private JPopupMenu popupMenu;
	private JMenuItem mntmDodajKurs;
	private JMenuItem mntmObrisiKurs;
	private JMenuItem mntmIzvrsiZamenu;
	
	/**
	 * Create the frame.
	 */
	public MenjacnicaGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenjacnicaGUI.class.getResource("/gui/dollar-sign-vector.jpg")));
		setTitle("Menjacnica");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 667, 438);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getEastPanel(), BorderLayout.EAST);
		contentPane.add(getPanel_1(), BorderLayout.SOUTH);
		contentPane.add(getPanel_2(), BorderLayout.CENTER);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				GUIKontroler.izadjiIzPrograma();
			}
		});
		
		
	}
	private JPanel getEastPanel() {
		if (eastPanel == null) {
			eastPanel = new JPanel();
			eastPanel.setPreferredSize(new Dimension(135, 10));
			eastPanel.add(getBtnDodajKurs());
			eastPanel.add(getBtnObrisiKurs());
			eastPanel.add(getBtnIzvrsiZamenu());
		}
		return eastPanel;
	}
	private JButton getBtnDodajKurs() {
		if (btnDodajKurs == null) {
			btnDodajKurs = new JButton("Dodaj kurs");
			btnDodajKurs.setPreferredSize(new Dimension(120, 23));
		}
		return btnDodajKurs;
	}
	private JButton getBtnObrisiKurs() {
		if (btnObrisiKurs == null) {
			btnObrisiKurs = new JButton("Obrisi kurs");
			btnObrisiKurs.setPreferredSize(new Dimension(120, 23));
		}
		return btnObrisiKurs;
	}
	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
			btnIzvrsiZamenu.setPreferredSize(new Dimension(120, 23));
		}
		return btnIzvrsiZamenu;
	}
	private JPanel getPanel_1() {
		if (southPanel == null) {
			southPanel = new JPanel();
			southPanel.setPreferredSize(new Dimension(10, 100));
			southPanel.setBorder(new TitledBorder(null, "STATUS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			southPanel.setLayout(new BorderLayout(0, 0));
			southPanel.add(getSouthScrollPane(), BorderLayout.CENTER);
		}
		return southPanel;
	}
	private JScrollPane getSouthScrollPane() {
		if (southScrollPane == null) {
			southScrollPane = new JScrollPane();
			southScrollPane.setViewportView(getSouthTextArea());
		}
		return southScrollPane;
	}
	private JTextArea getSouthTextArea() {
		if (southTextArea == null) {
			southTextArea = new JTextArea();
			southTextArea.setEditable(false);
		}
		return southTextArea;
	}
	private JPanel getPanel_2() {
		if (centerPanel == null) {
			centerPanel = new JPanel();
			centerPanel.setLayout(new BorderLayout(0, 0));
			centerPanel.add(getScrollPane(), BorderLayout.CENTER);
		}
		return centerPanel;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
				},
				new String[] {
					"Sifra", "Skraceni naziv", "Prodajni", "Srednji", "Kupovni", "Naziv"
				}
			));
			addPopup(table, getPopupMenu());
		}
		return table;
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnFile());
			menuBar.add(getMnHelp());
		}
		return menuBar;
	}
	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("File");
			mnFile.add(getMntmOpen());
			mnFile.add(getMntmSave());
			mnFile.add(getMntmExit());
		}
		return mnFile;
	}
	private JMenu getMnHelp() {
		if (mnHelp == null) {
			mnHelp = new JMenu("Help");
			mnHelp.add(getMntmAbout());
		}
		return mnHelp;
	}
	private JMenuItem getMntmOpen() {
		if (mntmOpen == null) {
			mntmOpen = new JMenuItem("Open...");
			mntmOpen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String putanja = GUIKontroler.izaberiFajl();
					if(!putanja.isEmpty()){
						GUIKontroler.upisiTekst(southTextArea.getText() + "Ucitan je fajl : "+putanja+" .\n", southTextArea);
					}
					
				}
			});
			mntmOpen.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/directory.gif")));
			mntmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		}
		return mntmOpen;
	}
	private JMenuItem getMntmSave() {
		if (mntmSave == null) {
			mntmSave = new JMenuItem("Save...");
			mntmSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String putanja = GUIKontroler.izaberiSaveFile();
					
					if(!putanja.isEmpty()){
						GUIKontroler.upisiTekst(southTextArea.getText() + "Sacuvan je fajl : "+putanja+" .\n", southTextArea);
					}
				}
			});
			mntmSave.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
			mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		}
		return mntmSave;
	}
	private JMenuItem getMntmExit() {
		if (mntmExit == null) {
			mntmExit = new JMenuItem("Exit");
			mntmExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIKontroler.izadjiIzPrograma();
				}
			});
			mntmExit.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/close.gif")));
			mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_MASK));
		}
		return mntmExit;
	}
	private JMenuItem getMntmAbout() {
		if (mntmAbout == null) {
			mntmAbout = new JMenuItem("About");
			mntmAbout.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.podaci();
				}
			});
		}
		return mntmAbout;
	}
	private JPopupMenu getPopupMenu() {
		if (popupMenu == null) {
			popupMenu = new JPopupMenu();
			popupMenu.add(getMntmDodajKurs());
			popupMenu.add(getMntmObrisiKurs());
			popupMenu.add(getMntmIzvrsiZamenu());
		}
		return popupMenu;
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	private JMenuItem getMntmDodajKurs() {
		if (mntmDodajKurs == null) {
			mntmDodajKurs = new JMenuItem("Dodaj kurs");
		}
		return mntmDodajKurs;
	}
	private JMenuItem getMntmObrisiKurs() {
		if (mntmObrisiKurs == null) {
			mntmObrisiKurs = new JMenuItem("Obrisi kurs");
		}
		return mntmObrisiKurs;
	}
	private JMenuItem getMntmIzvrsiZamenu() {
		if (mntmIzvrsiZamenu == null) {
			mntmIzvrsiZamenu = new JMenuItem("Izvrsi zamenu");
		}
		return mntmIzvrsiZamenu;
	}
}
