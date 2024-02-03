package controlador.Builder;

import controlador.AuxiliarDatos.DatosUsuario;
import java.time.LocalDate;
import java.time.LocalTime;
//Usamos el Builder para obtener cada atributo de forma individual:
public class PedidoBuilder {
    int idPedido;
    int idCliente;
    int idSalon;
    LocalDate fechaPedido;
    LocalTime horaPedido;
    double totalPedido;
    String estadoPedido;
    DatosUsuario datosUsuario;
    //Constructor:
    public PedidoBuilder datosUsuario(DatosUsuario datosUsuario) {
        this.datosUsuario = datosUsuario;
        return this;
    }
    //Simulacion de un Get y un Set haciendo uso del Builder:
    public PedidoBuilder idPedido(int idPedido) {
        this.idPedido = idPedido;
        return this;
    }

    public PedidoBuilder idCliente(int idCliente) {
        this.idCliente = idCliente;
        return this;
    }

    public PedidoBuilder idSalon(int idSalon) {
        this.idSalon = idSalon;
        return this;
    }

    public PedidoBuilder fechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
        return this;
    }

    public PedidoBuilder horaPedido(LocalTime horaPedido) {
        this.horaPedido = horaPedido;
        return this;
    }

    public PedidoBuilder totalPedido(double totalPedido) {
        this.totalPedido = totalPedido;
        return this;
    }

    public PedidoBuilder estadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
        return this;
    }
//Construimos nuestro Pedido:
    public PedidoB build() {
        return new PedidoB(this); 
    }
}

