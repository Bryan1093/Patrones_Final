package controlador.facade;

//Desplegamos las opciones de actualizacion y notificacion a los usuarios:
public class UsuarioFacade {
    UsuarioActualizar actualizar;
    UsuarioNotificar notificar;
           

    public UsuarioFacade() {
        this.actualizar = new UsuarioActualizar();
        this.notificar = new UsuarioNotificar();
    }
    
    public void actuzalizarUsuario(String nombre, String correo, String telefono, String contrasenia){
        actualizar.actualizarCLiente(nombre,  correo,  telefono, contrasenia);
        notificar.enviarCorreo(correo);
    }
    
    
    
}
