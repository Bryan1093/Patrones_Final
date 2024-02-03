/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.Strategy;

import controlador.AuxiliarDatos.DatosUsuario;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author LENOVO
 */
//Descuento del gran precio de descuento (Acumulamos cuanto consume nuestro Usuario):
public class DescuentoPorPrecioStrategy implements PrecioStrategy {
    private Map<Double, Double> descuentosPorMonto = new HashMap<>();

    public DescuentoPorPrecioStrategy() {
        descuentosPorMonto.put(15.0, 0.9);  
        descuentosPorMonto.put(30.0, 0.8);  
        descuentosPorMonto.put(45.0, 0.7);  
        descuentosPorMonto.put(60.0, 0.5);  
        descuentosPorMonto.put(75.0, 0.4);  
    }
//Calcular nuestro Precio Base del precio acumulado en la clase Datos Usuario:
    @Override
    public double calcularPrecio(double precioBase) {
        for (Map.Entry<Double, Double> entry : descuentosPorMonto.entrySet()) {
            if (precioBase > entry.getKey()) {
                return precioBase * entry.getValue();
            }
        }
        return precioBase; 
    }
    private PrecioStrategy obtenerEstrategiaDeDescuento() {
    double precioTotal = DatosUsuario.getTotalAcumulado();
    
    DescuentoPorPrecioStrategy descuentoStrategy = new DescuentoPorPrecioStrategy();
    
    PrecioStrategy estrategia;
    if (precioTotal >= 75.0) {
        estrategia = descuentoStrategy;
    } else if (precioTotal >= 60.0) {
        estrategia = descuentoStrategy;
    } else if (precioTotal >= 45.0) {
        estrategia = descuentoStrategy;
    } else if (precioTotal >= 30.0) {
        estrategia = descuentoStrategy;
    } else if (precioTotal >= 15.0) {
        estrategia = descuentoStrategy;
    } else {
        estrategia = new SinDescuentoStrategy();
    }
    
    return estrategia;
}

    
}

