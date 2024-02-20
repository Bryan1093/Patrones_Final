/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.Strategy;

public class extraStrategy {
    private double precioBase;
    private PrecioStrategy precioStrategy;

    public extraStrategy(double precioBase, PrecioStrategy precioStrategy) {
        this.precioBase = precioBase;
        this.precioStrategy = precioStrategy;
    }

    public double calcularPrecioFinal() {
        return precioStrategy.calcularPrecio(precioBase);
    }

}

