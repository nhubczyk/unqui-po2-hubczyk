package clienteDeEmail;

public class ClienteServidor {
	private ServidorPop servidor;
	private String nombreUsuario;
	private String passUsuario;
	
	public ClienteServidor(ServidorPop servidor, String nombre, String pass) {
		this.servidor=servidor;
		this.nombreUsuario=nombre;
		this.passUsuario=pass;
		this.conectar();
	}
	
	public void conectar(){
		this.servidor.conectar(this.nombreUsuario,this.passUsuario);
	}
	
	public void recibirNuevos(){
		this.servidor.recibirNuevos(this.nombreUsuario, this.passUsuario);
	}
}
