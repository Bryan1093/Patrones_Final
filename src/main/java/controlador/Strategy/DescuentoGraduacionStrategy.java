package controlador.Strategy;
//Descuento por cumpleaños:
public class DescuentoGraduacionStrategy implements PrecioStrategy {
    @Override
    public double calcularPrecio(double precioBase) {
        return precioBase * 0.9;
    }
}
