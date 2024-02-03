/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.Strategy;

/**
 *
 * @author LENOVO
 */
//Aplicamos una estrategia para la seleccion determinada de los TipoSalones con el precio Base y su Strategy:
public class MenuStrategy {
    private double precioBase;
    private PrecioStrategy precioStrategy;

    public MenuStrategy(double precioBase, PrecioStrategy precioStrategy) {
        this.precioBase = precioBase;
        this.precioStrategy = precioStrategy;
    }

    public double calcularPrecioFinal() {
        return precioStrategy.calcularPrecio(precioBase);
    }

}

