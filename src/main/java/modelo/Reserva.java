/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author LENOVO
 */
public class Reserva {
    private int idReserva;
    private int idCliente;
    private int idSalon;
    private LocalDate fecha;
    private LocalTime hora;
    private int numeroPersonas;
    private String observacion;

    public Reserva() {
    }

    public Reserva(int idReserva, int idCliente, int idSalon, LocalDate fecha, LocalTime hora, int numeroPersonas, String observacion) {
        this.idReserva = idReserva;
        this.idCliente = idCliente;
        this.idSalon = idSalon;
        this.fecha = fecha;
        this.hora = hora;
        this.numeroPersonas = numeroPersonas;
        this.observacion = observacion;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }


    public int getIdSalon() {
		return idSalon;
	}

	public void setIdSalon(int idSalon) {
		this.idSalon = idSalon;
	}

	public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public String toString() {
        return "Reserva[ " + "Id: " + idReserva + ", ID Cliente: " + idCliente + ", ID Salon: " + idSalon + ", Fecha: " + fecha + ", Hora: " + hora + ", Numero Personas: " + numeroPersonas + ", Observacion: " + observacion + " ]";
    }
    
    
}
