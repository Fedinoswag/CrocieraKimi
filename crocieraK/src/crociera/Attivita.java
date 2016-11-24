package secondaCrociera;

import java.util.Date;

public abstract class Attivita implements IAttivita {
	protected Date timeStart;
	protected Date timeStop;
	protected boolean attivitaConclusa = false;
	
	public Attivita(Date start, Date stop){
		this.timeStart=start;
		this.timeStop=stop;
	}
	
	public void inizioFine(){
		System.out.println("start: "+timeStart+"\nstop: "+timeStop);
	}
	
	public void setAttivitaConclusa(){
		Date adesso = new Date();
		adesso.getTime();
		attivitaConclusa=adesso.after(timeStop);
	}
	
	public boolean getAttivitaConclusa(){
		return attivitaConclusa;
	}
	

}
