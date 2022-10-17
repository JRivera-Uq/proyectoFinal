package redVendedores;

public class Usuario {

	private String nombre;
	private String apellido;
	private String cedula;
	private String direccion;

	/**
	 * Getters y Setters hasta *****
	 * @return
	 */
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Metodo toString
	 */
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", direccion="
				+ direccion + "]";
	}
	
	/**
	 * Metodo Constructor
	 * @param nombre
	 * @param apellido
	 * @param cedula
	 * @param direccion
	 */
	public Usuario(String nombre, String apellido, String cedula, String direccion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.direccion = direccion;
	}
	
	

	
	
	
	
}
