package unq.edu.ar.po2.tp6.ClienteEMail;

import java.util.ArrayList;
import java.util.List;

public class ClienteEMail {
	
	 private ServidorPop servidor;
	 private String nombreUsuario;
	 private String passusuario;
	 private List<Correo> inbox;
	 private List<Correo> borrados;
	
	public ServidorPop getServidor() {
		return servidor;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public String getPassusuario() {
		return passusuario;
	}

	public List<Correo> getInbox() {
		return inbox;
	}

	public List<Correo> getBorrados() {
		return borrados;
	}

	public ClienteEMail(ServidorPop servidor, String nombreUsuario, String pass){
		this.servidor=servidor;
		this.nombreUsuario=nombreUsuario;
		this.passusuario=pass;
		this.inbox = new ArrayList<Correo>();
		this.borrados = new ArrayList<Correo>();
		this.conectar();
	}
	
	public void conectar(){
		this.getServidor().conectar(this.nombreUsuario,this.passusuario);
	}
	
	public void borrarCorreo(Correo correo){
		this.getInbox().remove(correo);
		this.getBorrados().remove(correo);
	}
	
	public int contarBorrados(){
		return this.getBorrados().size();
	}
	
	public int contarInbox(){
		return this.getInbox().size();
	}
	
	public void eliminarBorrado(Correo correo){
		this.getBorrados().remove(correo);
	}
	
	public void recibirNuevos(){
		this.getServidor().recibirNuevos(this.nombreUsuario, this.passusuario);
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		this.getServidor().enviar(correo);
	}

}
