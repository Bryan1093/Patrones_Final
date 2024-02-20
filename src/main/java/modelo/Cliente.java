/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Cliente {
    private int idCliente;
    private String nombreCliente;
    private String correoElectronico;
    private String numeroTelefono;
    private String password;

    public Cliente() {
    }

    public Cliente(int idCliente, String nombreCliente, String correoElectronico, String numeroTelefono, String password) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.correoElectronico = correoElectronico;
        this.numeroTelefono = numeroTelefono;
        this.password = password;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Cliente[ " + "Id: " + idCliente + ", Cliente: " + nombreCliente + ", Correo: " + correoElectronico + ", Telefono: " + numeroTelefono + ", Contraseña: " + password + " ]";
    }
    
}
