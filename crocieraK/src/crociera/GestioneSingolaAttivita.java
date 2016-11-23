package crociera;
import java.util.LinkedList;

public class GestioneSingolaAttivita {
	Staff staff;
	LinkedList<Attivita> listAttivita;
	
	public GestioneSingolaAttivita(Staff staff, LinkedList<Attivita> listaAttivita) {
		this.staff=staff;
		this.listAttivita=listaAttivita;
	}
	
	
	
	public void printGestione(){
		staff.printComponenti();
		for(int i =0;i<listAttivita.size();i++){
			System.out.println("attivita: "+listAttivita.get(i).getClass());
		}
	}
}
