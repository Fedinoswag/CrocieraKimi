package crociera;

import java.util.Date;


public abstract class AttivitaSportiva extends Attivita {

	public AttivitaSportiva(Date start, Date stop) {
		super(start, stop);
		// TODO Auto-generated constructor stub
	}
	
	public int getPeso(){
		return 2;
	}

}
