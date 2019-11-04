package projectoClase2Practico;

public class Usuario {
	//atributos: (nombre, apellido, dni, area y sector, dias de vacaciones, categoria de vacaciones y un codigo)
	private String nombre;
	private String apellido;
	private String dni;
	private String area;
	private String sector;
	private int diasVacaciones;
	private int categoriaVacaciones;
	private int codigo;
	private int edad;

	public Usuario( String nombre, 
				    String apellido, 
					String dni,
					String area,
					String sector,
					int diasVacaciones,
					int edad) {
		setNombre(nombre);
		setApellido(apellido);
		setDni(dni);
		setArea(area);
		setSector(sector);
		setDiasVacaciones(diasVacaciones);
		setCategoriaVacaciones(0);
		setCodigo(0);
		setEdad(edad);
	}
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
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public int getDiasVacaciones() {
		return diasVacaciones;
	}
	public void setDiasVacaciones(int diasVacaciones) {
		this.diasVacaciones = diasVacaciones;
	}
	public int getCategoriaVacaciones() {
		return categoriaVacaciones;
	}
	public void setCategoriaVacaciones(int categoriaVacaciones) {
		this.categoriaVacaciones = categoriaVacaciones;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
