package controlador.Strategy;
//Descuento por bodas:
public class DescuentoPorBodasStrategy implements PrecioStrategy {
    @Override
    public double calcularPrecio(double precioBase) {
        return precioBase * 0.85;
    }
}
