package linkedList4;

public class Libro {
	
	private String titulo, autor;
	private Socio socio;

	public Libro(String titulo, String autor, Socio socio){
		this.titulo=titulo;
		this.autor=autor;
		this.socio=socio;
	}
	
	public Libro(String titulo, String autor){
		this.titulo=titulo;
		this.autor=autor;
		this.socio=null;
	}
	
	
	
	public String getTitulo(){
		return titulo;
	}
	
	public boolean getSocio(){
		if (socio==null) {
			return false;
		}else {
			return true;
		}
		
	}
	
	public void setSocio(Socio socio){
		this.socio=socio;
	}
	
}
