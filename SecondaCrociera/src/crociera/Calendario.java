package secondaCrociera;

public class Calendario {
	Attivita[][] calendario;
	
	public Calendario(){
		this.calendario= new Attivita[8][7];
	}
	
	public void addAttivita(Attivita a, int giorno, int iesimaOraInizio, int iesimaOraFine){
		for(int i=iesimaOraInizio;i<iesimaOraFine;i++)
		this.calendario[i][giorno]=a;
	}
	
	public int pesoAttivitaPerGiorno(int giorno){
		int value=0;
		for(int i=0;i< this.calendario[0].length;i++){
			if(this.calendario[i][giorno]!=null){
			value+=this.calendario[i][giorno].getPeso();
			System.out.println("peso singola attività"+this.calendario[i][giorno].getPeso());
			}
		}
		return value;
	}
	
	public void printAttivitaPerGiorno(int giorno){
		System.out.println("Giorno della settimana n. "+giorno+":\nLe attività sono: ");
		for(int i=0;i< this.calendario[0].length;i++){
			if(this.calendario[i][giorno]!=null)
			System.out.println(this.calendario[i][giorno]+" ora: "+i);
		}
	}
}
