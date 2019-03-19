package dto;

public class PersonaDTO 
{
	private int idPersona;
	private String nombre;
	private String telefono;
	//private int idDomicilio;
	//private int idTipoDeContacto;
	
	

	public PersonaDTO(int idPersona, String nombre, String telefono/*,int idDomicilio, int idTipoDeContacto*/)
	{
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.telefono = telefono;
		//this.setIdDomicilio(idDomicilio);
		//this.setIdTipoDeContacto(idTipoDeContacto);
	}
	
	public int getIdPersona() 
	{
		return this.idPersona;
	}

	public void setIdPersona(int idPersona) 
	{
		this.idPersona = idPersona;
	}

	public String getNombre() 
	{
		return this.nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public String getTelefono() 
	{
		return this.telefono;
	}

	public void setTelefono(String telefono) 
	{
		this.telefono = telefono;
	}

	/*public int getIdDomicilio() {
		return idDomicilio;
	}

	public void setIdDomicilio(int idDomicilio) {
		this.idDomicilio = idDomicilio;
	}

	public int getIdTipoDeContacto() {
		return idTipoDeContacto;
	}

	public void setIdTipoDeContacto(int idTipoDeContacto) {
		this.idTipoDeContacto = idTipoDeContacto;
	}*/
}
