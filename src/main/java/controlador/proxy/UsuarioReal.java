package controlador.proxy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Conexion;
import modelo.Crud;
//Desarrollamos las funcionalidades diferentes de nuestro sistema:
public class UsuarioReal extends Conexion implements IUsuario {
    private Connection connection;
    private int respuestaUsuario;
    private int longitudSerie;
    private int incremento;
    private int valorFaltante;

    public UsuarioReal() {
        this.connection = getConnection();
    }

    private int generarCaptcha() {
        int valorInicial = (int) (Math.random() * 10) + 1;
        incremento = 2; 
        longitudSerie = 5; 

        valorFaltante = valorInicial + (longitudSerie - 1) * incremento;
        return valorFaltante;
    }

    private int[] generarSerie(int valorInicial, int incremento, int longitudSerie) {
        int[] serie = new int[longitudSerie - 1];
        for (int i = 0; i < longitudSerie - 1; i++) {
            serie[i] = valorInicial + i * incremento;
        }
        return serie;
    }

    @Override
    public void registrar(String nombre, String correo, String telefono, String contrasenia) {
        Crud registro = new Crud();
        
        String nombreR = nombre;
        String correoR = correo;
        String telefonoR = telefono;
        String contraseniaR = contrasenia;
        
        if (contraseniaR.length() <= 15 && contraseniaR.length() >= 4) {
            if (contraseniaR.matches("^(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{4,15}$")) {
                try {
                    registro.crearUsuario(new modelo.Cliente(0, nombreR, correoR, telefonoR, contraseniaR));
                } catch (SQLException ex) {
                    Logger.getLogger(UsuarioReal.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null, "¡Te has registrado exitosamente " + nombreR + " !");
            } else {
                JOptionPane.showMessageDialog(null, "La contraseña debe tener al menos una letra mayúscula, un carácter especial y sin espacios");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La contraseña debe tener entre 4 y 15 caracteres");
        }
    }

    @Override
    public boolean iniciarSesion(String correo, String contrasenia) {
        String correoI = correo;
        String contraseniaI = contrasenia;
        String sql = "SELECT * FROM clientes WHERE correo_electronico = ?";
        PreparedStatement sentencia = null;
        
        try {
            sentencia = connection.prepareStatement(sql);
            sentencia.setString(1, correoI);
            ResultSet resultados = sentencia.executeQuery();
            
            if (resultados.next()) {
                String contraseniaBD = resultados.getString("contrasena");
                
                if (contraseniaI.equals(contraseniaBD)) {
                    int captchaValue = generarCaptcha();
                    String serieString = arrayToString(generarSerie(captchaValue - (longitudSerie - 1) * incremento, incremento, longitudSerie));
                    String captchaInput = JOptionPane.showInputDialog(null, "Complete la serie: " + serieString + ", ?");
                    
                    try {
                        respuestaUsuario = Integer.parseInt(captchaInput);
                        
                        if (respuestaUsuario == valorFaltante) {
                            JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso. ¡Bienvenido!");
                            return true;
                        } else {
                            JOptionPane.showMessageDialog(null, "CAPTCHA incorrecto. Por favor, inténtelo nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Ingrese un valor numérico para el CAPTCHA.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta. Por favor, inténtelo nuevamente.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Su cuenta no está registrada. Por favor, regístrese primero.");
            }

            resultados.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (sentencia != null) {
                try {
                    sentencia.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    @Override
    public void cerrarSesion() {
        JOptionPane.showMessageDialog(null, "Ha cerrado sesión correctamente. ¡Hasta pronto!");
        System.exit(0);
    }
    
    private String arrayToString(int[] array) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            builder.append(array[i]);
            if (i < array.length - 1) {
                builder.append(", ");
            }
        }
        return builder.toString();
    }
}
