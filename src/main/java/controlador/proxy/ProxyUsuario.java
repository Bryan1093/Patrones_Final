package controlador.proxy;
//Proxy que implemente nuestras funcionalidades de un usuario real (ocultamos la implementacion de los metodos de entrada)
public class ProxyUsuario implements IUsuario {

    private UsuarioReal usuarioReal;

    public ProxyUsuario() {
        this.usuarioReal = new UsuarioReal();
    }

    @Override
    public void registrar(String nombre, String correo, String telefono, String contrasenia) {
        usuarioReal.registrar(nombre, correo, telefono, contrasenia);
    }

    @Override
    public boolean iniciarSesion(String correo, String contrasenia) {
        return usuarioReal.iniciarSesion(correo, contrasenia);
    }

    @Override
    public void cerrarSesion() {
        usuarioReal.cerrarSesion();
    }

}
