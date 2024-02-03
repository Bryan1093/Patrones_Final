package controlador.AuxiliarDatos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import modelo.Reserva;
import vista.TipoSalonGlapagos;
import vista.TipoSalonCuenca;
import vista.TipoSalonOro;
//Gurdamos los Atributos Individuales en cada paso que damos:
public class DatosUsuario {
    private static int idSalonSeleccionado = -1;
    private static int idUsuario = -1;
    private static int idEspacio = -1;
    private static List<Double> preciosSeleccionados = new ArrayList<>();
    private static Reserva reservaActual;
    private static List<TipoSalonSeleccionado> tipoSalonSeleccionados = new ArrayList<>();
    private static double precioConDescuento;
    private static String nombreCliente;
    //Getters y Setters:
    public static void setNombreRegister(String nombre) {
        nombreCliente = nombre;
    }

    public static String getNombreRegister() {
        return nombreCliente;
    }
    
    public static void setIdSalonSeleccionado(int id) {
        idSalonSeleccionado = id;
    }

    public static int getIdSalonSeleccionado() {
        return idSalonSeleccionado;
    }

    public static void setIdUsuarioSeleccionado(int id) {
        idUsuario = id;
    }

    public static int getIdUsuarioSeleccionado() {
        return idUsuario;
    }

    public static void setIdEspacioSeleccionado(int id) {
        idEspacio = id;
    }

    public static int getIdEpsacioSeleccionado() {
        return idEspacio;
    }

    public static void agregarPrecioSeleccionado(double precio) {
        preciosSeleccionados.add(precio);
        actualizarTotalLabel();
    }

    public static List<Double> getPreciosSeleccionados() {
        return preciosSeleccionados;
    }
    public static void setPrecioConDescuento(double precio) {
        precioConDescuento = precio;
    }

    public static double getPrecioConDescuento() {
        return precioConDescuento;
    }
    //Actualizamos los Labels:
    public static void actualizarTotalLabel() {
    	TipoSalonGlapagos tipoSalonCuenca = TipoSalonGlapagos.getInstancia(); 
    JLabel totalLabel = tipoSalonCuenca.getTotalLabel(); 
    double totalAcumulado = DatosUsuario.calcularTotalAcumulado(); 
    String totalFormateado = String.format("%.2f", totalAcumulado);
    totalLabel.setText("Total: " + totalFormateado);
    
    totalLabel.revalidate();
    totalLabel.repaint();
}
    public static void actualizarTotalLabelUno() {
    	TipoSalonGlapagos tipoSalonGlapagos = TipoSalonGlapagos.getInstancia(); 
    JLabel totalLabel = tipoSalonGlapagos.getTotalLabel(); 
    double totalAcumulado = DatosUsuario.calcularTotalAcumulado(); 
    String totalFormateado = String.format("%.2f", totalAcumulado);
    totalLabel.setText("Total: " + totalFormateado);
    
    totalLabel.revalidate();
    totalLabel.repaint();
}
     public static void actualizarTotalLabelDos() {
    	 TipoSalonOro tipoSalonOro = TipoSalonOro.getInstancia(); 
    JLabel totalLabel = tipoSalonOro.getTotalLabel(); 
    double totalAcumulado = DatosUsuario.calcularTotalAcumulado(); 
    String totalFormateado = String.format("%.2f", totalAcumulado);
    totalLabel.setText("Total: " + totalFormateado);
    
    totalLabel.revalidate();
    totalLabel.repaint();
}
    //Calculamos los monton inciales:
    public static double calcularTotalAcumulado() {
        double total = 0;
        for (Double precio : preciosSeleccionados) {
            total += precio;
        }
        return total;
    }
    //Obtenemos el Monto Acumulado:
    public static double getTotalAcumulado() {
    double total = 0;
    for (Double precio : preciosSeleccionados) {
        total += precio;
    }
    return total;
}
    //Guardamos las reservas de los usuarios:
public static void setReservaActual(Reserva reserva) {
        reservaActual = reserva;
    }

    public static Reserva getReservaActual() {
        return reservaActual;
    }
    public static void agregarTipoSalonSeleccionado(String nombreMenu, double precio) {
        tipoSalonSeleccionados.add(new TipoSalonSeleccionado(nombreMenu, precio));
        actualizarTotalLabel();
    }
    //Obtenemos los menus seleccionados en una lista:
    public static List<TipoSalonSeleccionado> getTipoSalonSeleccionados() {
        return tipoSalonSeleccionados;
    }
}
