package dto;

public class LocalidadDTO {

	private int idLocalidad;
	private String nombre;
	
	public LocalidadDTO(int idLocalidad, String nombre) {
		this.idLocalidad = idLocalidad;
		this.nombre = nombre;
	}

	public int getIdLocalidad() {
		return idLocalidad;
	}

	public void setIdLocalidad(int idLocalidad) {
		this.idLocalidad = idLocalidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idLocalidad;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LocalidadDTO other = (LocalidadDTO) obj;
		if (idLocalidad != other.idLocalidad)
			return false;
		return true;
	}
	
}
