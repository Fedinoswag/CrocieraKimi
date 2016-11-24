package secondaCrociera;

public class Dipendente {
	protected final String nome;
	protected final String cognome;
	
	public Dipendente(String nome,String cognome){
		this.cognome=cognome;
		this.nome=nome;
	}
	
	public String getNome(){
		return this.nome;
	}
}
