package controlador.proxy;

/**
 *
 * @author LENOVO
 */
//Desplegamos las opciones de registro, inciio de sesion y cerrar sesion:
public interface IUsuario {

    void registrar(String nombre, String correo, String telefono ,String contrasenia);

    boolean iniciarSesion(String correo, String contrasenia);

    void cerrarSesion();
}
