package unq.edu.ar.po2.tp11.TempleteYAdapter.LlamadasTelefonicas;

public class classLlamadaDescuento extends LlamadaTelefonica{
	
	public classLlamadaDescuento(int tiempo, int horaDelDia) {
		super(tiempo, horaDelDia);
		
	}
	
	@Override
	public boolean esHoraPico() {
		return false;
	}
		
	@Override
	public float costoNeto(){
		return this.getTiempo()*0.95f;
	}

}
