/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.Strategy;

public class DescuentoQuinceStrategy implements PrecioStrategy {
    @Override
    public double calcularPrecio(double precioBase) {
        return precioBase * 0.9; 
    }
}
