package crociera;

import java.util.Date;
import java.util.LinkedList;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date adesso = new Date();
		adesso.getTime();
		Attivita a = new Freccette(adesso, adesso);
		Attivita b = new Freccette(adesso, adesso);
		Attivita c = new Briscola(adesso, adesso);
		System.out.println(adesso);
		a.inizioFine();
		a.setAttivitaConclusa();
		System.out.println(a.getAttivitaConclusa());
		
		Dipendente Mario = new Dipendente("Mario", "Dejaneiro");
		Dipendente Paolo = new Dipendente("Paolo", "Rossi");
		
		LinkedList<Dipendente> squadra1 = new LinkedList<Dipendente>();
		squadra1.add(Mario);
		squadra1.add(Paolo);
		
		Staff squadra = new Staff(squadra1);
		//squadra.printComponenti();
		
		LinkedList<Attivita> listAtt = new LinkedList<Attivita>();
		listAtt.add(a);
		listAtt.add(b);
		listAtt.add(c);
		
		GestioneSingolaAttivita gsa = new GestioneSingolaAttivita(squadra, listAtt);
		gsa.printGestione();
		
		
	}

}
