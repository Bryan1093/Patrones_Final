package controlador.facade;

import controlador.AuxiliarDatos.DatosUsuario;
import controlador.Builder.PedidoB;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Crud;

public class UsuarioActualizar {
    
    public void actualizarCLiente(String nombre, String correo, String telefono, String contrasenia){
        Crud c = new Crud();
        Cliente clienteActualizado = new Cliente(0, nombre, correo, telefono, contrasenia);
        try {
            c.actualizarUsuario(correo, clienteActualizado);
        } catch (SQLException ex) {
            System.out.println("Error intentar actualizar usuario");
            Logger.getLogger(UsuarioActualizar.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
}
