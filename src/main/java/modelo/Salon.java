/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Salon {
    private int idSalon;
    private String nombreSalon;
    private String direccionSalon;
    private String horarioAtencion;
    private String capacidad;
    private String ubicacion;

    public Salon() {
    }

    public Salon(int idSalon, String nombreSalon, String direccionSalon, String horarioAtencion, String capacidad, String ubicacion) {
        this.idSalon = idSalon;
        this.nombreSalon = nombreSalon;
        this.direccionSalon = direccionSalon;
        this.horarioAtencion = horarioAtencion;
        this.capacidad = capacidad;
        this.ubicacion = ubicacion;
    }


    public String getHorarioAtencion() {
        return horarioAtencion;
    }

    public void setHorarioAtencion(String horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }

  

    public int getIdSalon() {
		return idSalon;
	}

	public void setIdSalon(int idSalon) {
		this.idSalon = idSalon;
	}

	public String getNombreSalon() {
		return nombreSalon;
	}

	public void setNombreSalon(String nombreSalon) {
		this.nombreSalon = nombreSalon;
	}

	public String getDireccionSalon() {
		return direccionSalon;
	}

	public void setDireccionSalon(String direccionSalon) {
		this.direccionSalon = direccionSalon;
	}

	public String getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(String tipoEspacio) {
		this.capacidad = tipoEspacio;
	}

	public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Salon[ " + "Id: " + idSalon + ", Nombre: " + nombreSalon + ", Direccion: " + direccionSalon + ", Horario: " + horarioAtencion + ", Capacidad: " + capacidad + ", Ubicacion: " + ubicacion + " ]";
    }
    
    
    
}
