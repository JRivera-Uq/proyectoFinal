package redVendedores;

public class Producto {
	
	private String nombre;
	private String codigo;
	private String categoria;
	private double precio;

	/**
	 * Getter y Setters hasta *****
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	// *****
	
	/**
	 * Metodo constructor
	 * @param nombre
	 * @param codigo
	 * @param categoria
	 * @param precio
	 */
	public Producto(String nombre, String codigo, String categoria, double precio) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.categoria = categoria;
		this.precio = precio;
	}
	
	/**
	 * Metodo toString
	 */
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", codigo=" + codigo + ", categoria=" + categoria + ", precio=" + precio
				+ "]";
	}










}
