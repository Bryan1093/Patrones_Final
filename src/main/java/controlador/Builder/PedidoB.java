package controlador.Builder;

import java.time.LocalDate;
import java.time.LocalTime;
//Construimos nuestro pedido con los Atributos de la tabla Pedidos:
public class PedidoB {
    private int idPedido;
    private int idCliente;
    private int idSalon;
    private LocalDate fechaPedido;
    private LocalTime horaPedido;
    private double totalPedido;
    private String estadoPedido;
//Contructor:
    public PedidoB(PedidoBuilder builder) {
        this.idPedido = builder.idPedido;
        this.idCliente = builder.idCliente;
        this.idSalon = builder.idSalon;
        this.fechaPedido = builder.fechaPedido;
        this.horaPedido = builder.horaPedido;
        this.totalPedido = builder.totalPedido;
        this.estadoPedido = builder.estadoPedido;
    }
//Getters y Setters:
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
//Imprimimos la Informacion:
    @Override
    public String toString() {
        return "Pedido[ " + "Id: " + idPedido + ", ID Cliente: " + idCliente + ", ID Salon: " + idSalon + ", Fecha: " + fechaPedido + ", Hora: " + horaPedido + ", Total: " + totalPedido + ", Estado: " + estadoPedido + " ]";
    }
}
