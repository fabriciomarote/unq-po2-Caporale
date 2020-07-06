package unq.edu.ar.po2.tp11.TempleteYAdapter.LlamadasTelefonicas;

public abstract class LlamadaTelefonica {
	
	private int tiempo;
	private int horaDelDia;
	
	public LlamadaTelefonica(int tiempo, int horaDelDia){
	this.tiempo=tiempo;
	this.horaDelDia=horaDelDia;
	}
	 // primitiva
	public int getTiempo(){
	return this.tiempo;
	}
	// primitiva
	public int getHoraDelDia(){
	return this.horaDelDia;
	}
	
	// metodo abstracto
	public abstract boolean esHoraPico();
	
	/*
	 * templete metodo
	 */
	public float costoFinal(){
		if(this.esHoraPico()){
		 return this.costoNeto()*1.2f*this.getTiempo();
		}else{
		 return this.costoNeto()*this.getTiempo();
		}
	}
		
	public float costoNeto(){
		return this.getTiempo()*1;  // metodo hook
	}

}
