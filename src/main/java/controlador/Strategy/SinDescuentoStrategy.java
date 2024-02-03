/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.Strategy;

/**
 *
 * @author LENOVO
 */
//Si el usuario lo desea puede obtener un precio sin su descuento apropiado:
public class SinDescuentoStrategy implements PrecioStrategy {
    @Override
    public double calcularPrecio(double precioBase) {
        return precioBase;
    }
}

