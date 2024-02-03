/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controlador.command;

import java.util.List;
import modelo.TipoSalon;

/**
 *
 * @author LENOVO
 */
//Gestionamos las solicitudes (Cola de solicitudes):
public interface Command {
    List<TipoSalon> execute();
}
