/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Pedido {
    private int idPedido;
    private int idCliente;
    private int idSalon;
    private LocalDate fechaPedido;
    private LocalTime horaPedido;
    private double totalPedido;
    private String estadoPedido;

    public Pedido() {
    }

    public Pedido(int idPedido, int idCliente, int idSalon, LocalDate fechaPedido, LocalTime horaPedido, double totalPedido, String estadoPedido) {
        this.idPedido = idPedido;
        this.idCliente = idCliente;
        this.idSalon = idSalon;
        this.fechaPedido = fechaPedido;
        this.horaPedido = horaPedido;
        this.totalPedido = totalPedido;
        this.estadoPedido = estadoPedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
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

	public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public LocalTime getHoraPedido() {
        return horaPedido;
    }

    public void setHoraPedido(LocalTime horaPedido) {
        this.horaPedido = horaPedido;
    }

    public double getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(double totalPedido) {
        this.totalPedido = totalPedido;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    @Override
    public String toString() {
        return "Pedido[ " + "Id: " + idPedido + ", ID Cliente: " + idCliente + ", ID Salon: " + idSalon + ", Fecha: " + fechaPedido + ", Hora: " + horaPedido + ", Total: " + totalPedido + ", Estado: " + estadoPedido + " ]";
    }
    
    
}
