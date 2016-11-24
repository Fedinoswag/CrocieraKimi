package crociera;

import java.util.Date;

public abstract class AttivitaGioco extends Attivita {

	public AttivitaGioco(Date start, Date stop) {
		super(start, stop);
		// TODO Auto-generated constructor stub
	}
	
	public int getPeso(){
		return 1;
	}


}
