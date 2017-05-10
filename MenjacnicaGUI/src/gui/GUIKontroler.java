package gui;

import java.awt.EventQueue;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUIKontroler {

	private static MenjacnicaGUI menjacnicaGui;
	private static DodajKursGUI dodajKursGui;
	
	
	
	public static String izaberiFajl(){
		
		JFileChooser fc = new JFileChooser();
		int a = fc.showOpenDialog(menjacnicaGui);
	
		if (a == JFileChooser.APPROVE_OPTION) { 
			File fajl = fc.getSelectedFile(); 
			return fajl.getAbsolutePath();
		}
		return "";
		
	}
	
	public static void upisiTekst(String tekst, Object obj){
		
		if(obj instanceof JTextArea){
			((JTextArea) obj).setText(tekst);
		}
		if(obj instanceof JTextField){
			((JTextField) obj).setText(tekst);
		}
		
	}
	
	public static String izaberiSaveFile(){
		
		JFileChooser fc = new JFileChooser();
		
		int a = fc.showSaveDialog(menjacnicaGui);
		
		if (a == JFileChooser.APPROVE_OPTION) { 
			File fajl = fc.getSelectedFile(); 
			return fajl.getAbsolutePath();
		}
		return "";
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIKontroler.menjacnicaGui = new MenjacnicaGUI();
					menjacnicaGui.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void izadjiIzPrograma(){
		
		int a = 
				JOptionPane.showConfirmDialog(menjacnicaGui,"Da li zelite da izadjete iz programa?","Izlaz",
						JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
		
		if(a == JOptionPane.YES_OPTION){
			System.exit(0);
		}
	}
	
	public static void podaci(){
		
		JOptionPane.showMessageDialog(menjacnicaGui, "Ilija Starcevic,Fakultet Organizacionih Nauka");
	}
	
	public static void otvoriProzorDodajKursGUI(){
		GUIKontroler.dodajKursGui = new DodajKursGUI();
		dodajKursGui.setVisible(true);
	}

	public static void zatvoriProzorDodajKursGUI() {
		
		dodajKursGui.dispose();
		dodajKursGui = null;
	}
	
	public static void upisiTextUMenjacnicaGUI(String string) {
		String txt = menjacnicaGui.getSouthTextArea().getText() + " \n" + string;
		upisiTekst(txt, menjacnicaGui.getSouthTextArea());
	}
}
