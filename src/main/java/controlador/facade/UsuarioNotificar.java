package controlador.facade;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import modelo.Cliente;

//Notificamos al usuario en su correo electronico (existente) como se a procesado su actualizacion de usuario:
public class UsuarioNotificar {
    private static String emailFrom = "losangeleseventos@gmail.com";
    private static String passwordFrom = "itosfyzjdrxbmyuo";
    private String emailTo;
    private String  subject;
    private String content;
    
    private Properties mProperties;
    private Session mSession;
    private MimeMessage mCorreo;

    public UsuarioNotificar() {
        mProperties = new Properties();
                
    }
    private void createEmail() { 
         // Simple mail transfer protocol
        mProperties.put("mail.smtp.host", "smtp.gmail.com");
        mProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        mProperties.setProperty("mail.smtp.starttls.enable", "true");
        mProperties.setProperty("mail.smtp.port", "587");
        mProperties.setProperty("mail.smtp.user",emailFrom);
        mProperties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        mProperties.setProperty("mail.smtp.auth", "true");
        
        mSession = Session.getDefaultInstance(mProperties);
        
        
        try {
            mCorreo = new MimeMessage(mSession);
            mCorreo.setFrom(new InternetAddress(emailFrom));
            mCorreo.setRecipient(Message.RecipientType.TO, new InternetAddress(emailTo));
            mCorreo.setSubject(subject);
            mCorreo.setText(content, "ISO-8859-1", "html");
                     
            
        } catch (AddressException ex) {
            Logger.getLogger(UsuarioNotificar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(UsuarioNotificar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
                    

    private void sendEmail() {
        try {
            Transport mTransport = mSession.getTransport("smtp");
            mTransport.connect(emailFrom, passwordFrom);
            mTransport.sendMessage(mCorreo, mCorreo.getRecipients(Message.RecipientType.TO));
            mTransport.close();
            
        } catch (NoSuchProviderException ex) {
            Logger.getLogger(UsuarioNotificar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(UsuarioNotificar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void enviarCorreo(String correo){
        emailTo = correo;
        subject = "Confirmación de Actualización de Perfil en Los Angeles Eventos";
        content = "<h1>Se actualizó su perfil de usuario con éxito</h1>"
                + "<br>Si usted no realizo estos cambio por favor comuniquese con soporte al cliente<br>"
                + "<p>Esperamos que te encuentres bien. Queremos informarte que hemos recibido con éxito los cambios que realizaste en tu perfil de \"Los Angeles Eventos\", tu app de reservas de salones para eventos, favorito. ¡Gracias por mantener tus datos actualizados!\n" +
"\n" +
"Valoramos tu compromiso con nosotros y deseamos ofrecerte la mejor experiencia posible. Tu perfil actualizado nos permitirá brindarte un servicio aún más personalizado y adaptado a tus preferencias. Desde ahora, podremos ofrecerte recomendaciones exclusivas, promociones especiales y noticias relevantes relacionadas con Los Angeles Eventos.\n" +
"\n" +
"Gracias por ser parte de la familia de Los Angeles Eventos y por permitirnos ser tu compañero en la organización de eventos extraordinarios. . Esperamos verte pronto en alguno de nuestros salones.\n" +
"\n" +
"¡Disfruta la comodidad!\n" +
"\n" +
"Atentamente,\n" +
"El Equipo de Los Angeles Eventos\n" +
"\n" +
"[Información de contacto]\n" +
"Sitio web: [www.angeleseventos.com](http://www.angeleseventos.com/)\n" +
"Teléfono: [Número de teléfono]\n" +
"Correo de Soporte: [soporte@angeleseventos.com](mailto:soporte@angeleseventos.com)\n" +
"\n" +
"[Redes Sociales]\n" +
"Síguenos en Facebook, Instagram y Twitter para estar al tanto de nuestras últimas noticias y ofertas especiales.</p>";
        
        createEmail();
        sendEmail();
    }
    
}
