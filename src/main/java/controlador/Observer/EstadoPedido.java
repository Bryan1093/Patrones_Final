/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.Observer;

import java.util.ArrayList;
import java.util.List;
//Notificamos sobre los cambios en nuestro estado del pedido desarrollado:
public class EstadoPedido {
    private List<Observer> observadores = new ArrayList<>();
    private String estado;

    public void agregarObservador(Observer observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(Observer observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.actualizar("Estado del pedido: " + estado);
        }
    }

    public void actualizarEstado(String nuevoEstado) {
        estado = nuevoEstado;
        notificarObservadores();
    }
}

