/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.Observer;

import javax.swing.JOptionPane;
//Cliente para notificar como un Observer:
public class Cliente implements Observer {
    private int idCliente;
    private String nombreCliente;

    public Cliente(int idCliente, String nombreCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
    }

    @Override
    public void actualizar(String mensaje) {
        JOptionPane.showMessageDialog(null, nombreCliente + ": Recibí una notificación -> " + mensaje);
    }
}


