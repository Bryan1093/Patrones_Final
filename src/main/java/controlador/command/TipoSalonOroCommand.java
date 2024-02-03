/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.command;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Crud;
import modelo.TipoSalon;

/**
 *
 * @author LENOVO
 */
//Desplegamos la solicitud de busquedas por TipoSalon (Meriendas):
public class TipoSalonOroCommand implements Command{
    private int id_salon;
    private String nombre;
    private Crud crud;

    public TipoSalonOroCommand(int id_salon, String nombre, Crud crud) {
        this.id_salon = id_salon;
        this.nombre = nombre;
        this.crud = crud;
    }

    @Override
    public List<TipoSalon> execute() {
        try {
            return crud.obtenerTipoSalones(id_salon,nombre);
        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
    
}
