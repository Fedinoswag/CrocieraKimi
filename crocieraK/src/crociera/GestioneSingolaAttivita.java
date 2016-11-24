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
	
	public int calcolaNumAttivitaSportive(){
		int num=0;
		for(int i=0;i<listAttivita.size();i++){
			if(listAttivita.get(i).typeClass().equals("sportiva")){
				num++;
			}
		}
		return num;
	}
	
	public int calcolaNumAttivitaGioco(){
		int num=0;
		for(int i=0;i<listAttivita.size();i++){
			if(listAttivita.get(i).typeClass().equals("gioco")){
				num++;
			}
		}
		return num;
	}
}
