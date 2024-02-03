/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LENOVO
 */
public class Salon {
    private int idSalon;
    private String nombreSalon;
    private String direccionSalon;
    private String horarioAtencion;
    private String tipoEspacio;
    private String otraCaracteristica;

    public Salon() {
    }

    public Salon(int idSalon, String nombreSalon, String direccionSalon, String horarioAtencion, String tipoEspacio, String otraCaracteristica) {
        this.idSalon = idSalon;
        this.nombreSalon = nombreSalon;
        this.direccionSalon = direccionSalon;
        this.horarioAtencion = horarioAtencion;
        this.tipoEspacio = tipoEspacio;
        this.otraCaracteristica = otraCaracteristica;
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

	public String getTipoEspacio() {
		return tipoEspacio;
	}

	public void setTipoEspacio(String tipoEspacio) {
		this.tipoEspacio = tipoEspacio;
	}

	public String getOtraCaracteristica() {
        return otraCaracteristica;
    }

    public void setOtraCaracteristica(String otraCaracteristica) {
        this.otraCaracteristica = otraCaracteristica;
    }

    @Override
    public String toString() {
        return "Salon[ " + "Id: " + idSalon + ", Nombre: " + nombreSalon + ", Direccion: " + direccionSalon + ", Horario: " + horarioAtencion + ", Tipo Cocina: " + tipoEspacio + ", Mas informacion: " + otraCaracteristica + " ]";
    }
    
    
    
}
