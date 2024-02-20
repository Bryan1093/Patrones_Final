/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Espacio {
    private int idEspacio;
    private int idSalon;
    private int capacidad;
    private String estado;

    public Espacio() {
    }

    public Espacio(int idEspacio, int idSalon, int capacidad, String estado) {
        this.idEspacio = idEspacio;
        this.idSalon = idSalon;
        this.capacidad = capacidad;
        this.estado = estado;
    }



    public int getIdEspacio() {
		return idEspacio;
	}

	public void setIdEspacio(int idEspacio) {
		this.idEspacio = idEspacio;
	}

	public int getIdSalon() {
		return idSalon;
	}

	public void setIdSalon(int idSalon) {
		this.idSalon = idSalon;
	}

	public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Espacio[ " + "Id: " + idEspacio + ", ID Salon: " + idSalon + ", Capacidad: " + capacidad + ", Estado: " + estado + " ]";
    }
    
    
    
}
