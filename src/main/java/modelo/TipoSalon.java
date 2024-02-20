/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class TipoSalon {
    private int idTipoSalon;
    private int idSalon;
    private String nombre;
    private String descripcion;
    private double precio;
    private String otraInformacion;

    public TipoSalon() {
    }
    public TipoSalon(int idTipoSalon, int idSalon, String nombre, String descripcion, double precio, String otraInformacion) {
        this.idTipoSalon = idTipoSalon;
        this.idSalon = idSalon;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.otraInformacion = otraInformacion;
    }

    

    public int getIdTipoSalon() {
		return idTipoSalon;
	}
	public void setIdTipoSalon(int idTipoSalon) {
		this.idTipoSalon = idTipoSalon;
	}
	public int getIdSalon() {
		return idSalon;
	}
	public void setIdSalon(int idSalon) {
		this.idSalon = idSalon;
	}
	public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getOtraInformacion() {
        return otraInformacion;
    }

    public void setOtraInformacion(String otraInformacion) {
        this.otraInformacion = otraInformacion;
    }

    @Override
    public String toString() {
        return "TipoSalon[ " + "Id: " + idTipoSalon + ", ID Salon: " + idSalon + ", Nombre: " + nombre + ", Descripcion: " + descripcion + ", Precio: " + precio + ", Mas informacion: " + otraInformacion + " ]";
    }
}
