package redVendedores;

import java.util.ArrayList;

public class Red {
/**
 * Inicializacion de variables 
 */
	private String nombre;
	private ArrayList<Vendedor> listaVendedores = new ArrayList<Vendedor>();
	private ArrayList<Producto> listaProductos = new ArrayList<Producto>();
	private ArrayList<Administrador> listaAdministradores = new ArrayList<Administrador>();
	
	
	/**
	 * Getter y setter hasta *****
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Vendedor> getListaVendedores() {
		return listaVendedores;
	}
	public void setListaVendedores(ArrayList<Vendedor> listaVendedores) {
		this.listaVendedores = listaVendedores;
	}
	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}
	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
	public ArrayList<Administrador> getListaAdministradores() {
		return listaAdministradores;
	}
	public void setListaAdministradores(ArrayList<Administrador> listaAdministradores) {
		this.listaAdministradores = listaAdministradores;
	}
	//*****
	

	/**
	 * Metodo toString
	 */
	@Override
	 public String toString() {
		return "Red [nombre=" + nombre + ", listaVendedores=" + listaVendedores + ", listaProductos=" + listaProductos
				+ ", listaAdministradores=" + listaAdministradores + "]";
	}
	
	/**
	 * Metodo Constructor 
	 * @param nombre
	 * @param listaVendedores
	 * @param listaProductos
	 * @param listaAdministradores
	 */
	
	public Red(String nombre, ArrayList<Vendedor> listaVendedores, ArrayList<Producto> listaProductos,
			ArrayList<Administrador> listaAdministradores) {
		super();
		this.nombre = nombre;
		this.listaVendedores = listaVendedores;
		this.listaProductos = listaProductos;
		this.listaAdministradores = listaAdministradores;
	}
	
	/**
	 * Metodo que crea un nuevo Usuario de tipo Vendedor
	 * @param nombre
	 * @param apellido
	 * @param cedula
	 * @param direccion
	 * @return
	 */
	
	public String crearVendedores(String nombre, String apellido, String cedula, String direccion) {
		String mensaje = "Fallo en la creacion del vendedor";
		
		for (int i = 0; i < listaVendedores.size(); i++) {
			if(listaVendedores.get(i) == null) {
				Vendedor vendedor = new Vendedor(nombre,apellido,cedula,direccion);
					listaVendedores.add(vendedor);
					mensaje = "Vendedor Creado";
			}
		}
		return mensaje;
	}
	
	
	/**
	 * Metodo que acualiza los datos del Vendedor
	 * @param nombre
	 * @param apellido
	 * @param cedula
	 * @param direccion
	 * @return
	 */
	public String actualizarDatosVendedor(String nombre, String apellido, String cedula, String direccion){

		String mensaje =  "Vendedor actualizado";
		
			for (int i = 0; i < listaVendedores.size(); i++) {
				if(listaVendedores.get(i).getCedula().equals(cedula)){
					listaVendedores.get(i).setNombre(nombre);
					listaVendedores.get(i).setApellido(apellido);
					listaVendedores.get(i).setCedula(cedula);
					listaVendedores.get(i).setDireccion(direccion);
				
					mensaje = "Vendedor actualizado";
					return mensaje;
			}else {
				mensaje = "El Vendedor no existe";
			}	
			}
			
		return mensaje;
	}

	/**
	 * Metodo que elimina un vendedor 
	 * @param cedula
	 * @return
	 */
	public String eliminarVendedor(String cedula) {
		String mensaje= "Vendedor no eliminado";
			
		for (int i = 0; i < listaVendedores.size(); i++) {
				if(listaVendedores.get(i).getCedula().equals(cedula)) {
						listaVendedores.remove(i);
						mensaje = "Vendedor eliminado";
					}
				}
		
				return mensaje;
			}
/**
 * Metodo que busca un empleado
 * @param cedula
 * @return
 */
	
	public String buscarVendedor(String cedula) {
		String mensaje = "Vendedor no encontrado";
					
		for (int i = 0; i < listaVendedores.size(); i++) {
			if(listaVendedores.get(i).getCedula().equals(cedula)) {
				mensaje = "Vendedor encontrado";		
					}
				}		
				return mensaje;
			}
/**
 * Metodo que crea un Administrador
 * @param nombre
 * @param apellido
 * @param cedula
 * @param direccion
 * @return
 */
	public String crearAdministradores(String nombre, String apellido, String cedula, String direccion) {
		String mensaje = "Fallo en la creacion del Administrador";
		
		for (int i = 0; i < listaAdministradores.size(); i++) {
			if(listaAdministradores.get(i) == null) {
				Administrador admin = new Administrador(nombre,apellido,cedula,direccion);
					listaAdministradores.add(admin);
					mensaje = "Administrador Creado";
			}
		}
		return mensaje;
	}

/**
 * Metodo que actualiza un Administrador
 * @param nombre
 * @param apellido
 * @param cedula
 * @param direccion
 * @return
 */
	public String actualizarDatosAdministrador(String nombre, String apellido, String cedula, String direccion){

		String mensaje =  "Administrador actualizado";
		
			for (int i = 0; i < listaAdministradores.size(); i++) {
				if(listaAdministradores.get(i).getCedula().equals(cedula)){
					listaAdministradores.get(i).setNombre(nombre);
					listaAdministradores.get(i).setApellido(apellido);
					listaAdministradores.get(i).setCedula(cedula);
					listaAdministradores.get(i).setDireccion(direccion);
				
					mensaje = "Administrador actualizado";
					return mensaje;
			}else {
				mensaje = "El Administrador no existe";
				}	
			}
		return mensaje;
	}

/**
 * Metodo que elimina un administrador
 * @param cedula
 * @return
 */
	public String eliminarAdministrador(String cedula) {
		String mensaje= "Administrador no eliminado";
			
		for (int i = 0; i < listaAdministradores.size(); i++) {
				if(listaAdministradores.get(i).getCedula().equals(cedula)) {
						listaAdministradores.remove(i);
						mensaje = "Administrador eliminado";
					}
				}
				return mensaje;
			}

/**
 * Metodo que busca un administrador
 * @param cedula
 * @return
 */
	public String buscarAdministrador(String cedula) {
		String mensaje = "Administrador no encontrado";
					
		for (int i = 0; i < listaAdministradores.size(); i++) {
			if(listaAdministradores.get(i).getCedula().equals(cedula)) {
				mensaje = "Administrador encontrado";		
					}
				}		
				return mensaje;
			}

/**
 * Metodo que crea un nuevo producto
 * @param nombre
 * @param codigo
 * @param categoria
 * @param precio
 * @return
 */
	public String crearProductos(String nombre, String codigo, String categoria,double precio) {
		String mensaje = "Fallo en la creacion del Producto";
		
		for (int i = 0; i < listaProductos.size(); i++) {
			if(listaProductos.get(i) == null) {
				Producto producto = new Producto(nombre,codigo,categoria,precio);
					listaProductos.add(producto);
					mensaje = "Vendedor Creado";
			}
		}
		return mensaje;
	}
	
	/**
	 * Metodo que actualiza los datos de un producto
	 * @param nombre
	 * @param codigo
	 * @param categoria
	 * @param precio
	 * @return
	 */
	
	public String actualizarDatosProductos(String nombre, String codigo, String categoria,double precio){

		String mensaje =  "Producto actualizado";
		
			for (int i = 0; i < listaProductos.size(); i++) {
				if(listaProductos.get(i).getCodigo().equals(codigo)){
					listaProductos.get(i).setNombre(nombre);
					listaProductos.get(i).setCategoria(categoria);
					listaProductos.get(i).setCodigo(codigo);
					listaProductos.get(i).setPrecio(precio);
				
					mensaje = "Producto actualizado";
					return mensaje;
			}else {
				mensaje = "El producto no existe";
			}	
			}
			
		return mensaje;
	}

/**
 * Metodo que elimina un producto
 * @param codigo
 * @return
 */
	public String eliminarProducto(String codigo) {
		String mensaje= "Producto no eliminado";
			
		for (int i = 0; i < listaProductos.size(); i++) {
				if(listaProductos.get(i).getCodigo().equals(codigo)) {
						listaProductos.remove(i);
						mensaje = "Producto eliminado";
					}
				}
				return mensaje;
			}
/**
 * Metodo que busca un producto
 * @param codigo
 * @return
 */
	public String buscarProducto(String codigo) {
		String mensaje = "Producto no encontrado";
					
		for (int i = 0; i < listaProductos.size(); i++) {
			if(listaProductos.get(i).getCodigo().equals(codigo)) {
				mensaje = "Producto encontrado";		
					}
				}		
				return mensaje;
			}






}

