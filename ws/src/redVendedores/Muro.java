package redVendedores;

public class Muro {

	private String mensaje;
	private String cometario;
	private int  meGusta;
	
	/**
	 * Getter y Setters hasta *****
	 * @return
	 */
	
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getCometario() {
		return cometario;
	}
	public void setCometario(String cometario) {
		this.cometario = cometario;
	}
	public int getMeGusta() {
		return meGusta;
	}
	public void setMeGusta(int meGusta) {
		this.meGusta = meGusta;
	}
	
	//*****
	/**
	 *  Metodo toString
	 */
	@Override
	public String toString() {
		return "Muro [mensaje=" + mensaje + ", cometario=" + cometario + ", meGusta=" + meGusta + "]";
		}

	
	/**
	 * Metodo constructor
	 * @param mensaje
	 * @param cometario
	 * @param meGusta
	 */
	
	public Muro(String mensaje, String cometario, int meGusta) {
		super();
		this.mensaje = mensaje;
		this.cometario = cometario;
		this.meGusta = meGusta;
	}
	
	
}
