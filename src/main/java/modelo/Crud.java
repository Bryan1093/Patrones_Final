/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LENOVO
 */

import controlador.AuxiliarDatos.DatosUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
//Operaciones: Create Read Update Delete
public class Crud {

	private Connection connection;
	private PreparedStatement sentencia;
	boolean estadoOP;
        
	private Connection obtenerConexion() throws SQLException {
		return Conexion.getConnection();
	} 
	//CREAR:
	//-----------------USUARIOS------------------------
	public boolean crearUsuario(Cliente cliente) throws SQLException {
    String sql = "INSERT INTO clientes(nombre, correo_electronico, numero_telefono, contrasena) VALUES (?,?,?,?)";
    boolean estadoOP = false;
    Connection connection = obtenerConexion(); 

    try {
        connection.setAutoCommit(false);
        try (PreparedStatement sentencia = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            sentencia.setString(1,cliente.getNombreCliente());
            sentencia.setString(2, cliente.getCorreoElectronico());
            sentencia.setString(3, cliente.getNumeroTelefono());
            sentencia.setString(4, cliente.getPassword());
            
            estadoOP = sentencia.executeUpdate() > 0;

            try (ResultSet generatedKeys = sentencia.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    cliente.setIdCliente(generatedKeys.getInt(1));
                    DatosUsuario.setIdUsuarioSeleccionado(cliente.getIdCliente());
                } else {
                    throw new SQLException("No se pudo obtener el ID del cliente generada.");
                }
            }
        }

        connection.commit();
    } catch (SQLException e) {
        connection.rollback();
        e.printStackTrace();
    } finally {
        connection.close();
    }
    return estadoOP;
}

	//-------------------------------------------------
	//-----------------TIPOSALON-------------------
	public boolean crearTarea(TipoSalon tipoSalon) throws SQLException {
		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();

		try {
			connection.setAutoCommit(false);
			sql = "INSERT INTO tipoSalones(id_tiposalon, nombre, descripcion, precio, otras_caracteristicas)"
					+ "VALUES(?,?,?,?,?)";
			sentencia = connection.prepareStatement(sql);
                        
                        sentencia.setInt(1, tipoSalon.getIdSalon());
                        sentencia.setString(2, tipoSalon.getNombre());
                        sentencia.setString(3, tipoSalon.getDescripcion());
                        sentencia.setDouble(4, tipoSalon.getPrecio());
                        sentencia.setString(5, tipoSalon.getOtraInformacion());
        
			estadoOP = sentencia.executeUpdate() > 0;
			connection.commit();
			sentencia.close();
			connection.close();

		} catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();
		}
		return estadoOP;
	}
	//-----------------------------------------------
	//-----------------ESPACIOS------------------------
	public boolean crearEspacio(Espacio espacio) throws SQLException {
		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();

		try {
			connection.setAutoCommit(false);
			sql = "INSERT INTO espacios(id_salon, capacidad, estado)"
					+ "VALUES(?,?,?)";
			sentencia = connection.prepareStatement(sql);
                        sentencia.setInt(1, espacio.getIdSalon());
                        sentencia.setInt(2, espacio.getCapacidad());
                        sentencia.setString(3, espacio.getEstado());

			estadoOP = sentencia.executeUpdate() > 0;
			connection.commit();
			sentencia.close();
			connection.close();

		} catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();
		}
		return estadoOP;
	}
	//------------------------------------------------
	//----------------PEDIDOS------------------------
	public boolean crearPedido(Pedido pedido) throws SQLException {
		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();

		try {
			connection.setAutoCommit(false);
			sql = "INSERT INTO pedidos (id_cliente, id_salon, fecha_pedido, hora_pedido, total_pedido, estado_pedido)"
					+ "VALUES(?,?,?,?,?,?)";
			sentencia = connection.prepareStatement(sql);
                        sentencia.setInt(1, pedido.getIdCliente());
                        sentencia.setInt(2,pedido.getIdSalon());
                        sentencia.setDate(3, java.sql.Date.valueOf(pedido.getFechaPedido()));
                        sentencia.setTime(4, java.sql.Time.valueOf(pedido.getHoraPedido()));
                        sentencia.setDouble(5, pedido.getTotalPedido());
                        sentencia.setString(6, pedido.getEstadoPedido());
                        
			estadoOP = sentencia.executeUpdate() > 0;
			connection.commit();
			sentencia.close();
			connection.close();

		} catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();
		}
		return estadoOP;
	}
	//------------------------------------------------
	//----------------RESERVAS------------------------
	public boolean crearReserva(Reserva reserva) throws SQLException {
		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();

		try {
			connection.setAutoCommit(false);
			sql = "INSERT INTO reservas(id_cliente, id_salon, fecha, hora, numero_personas, observaciones)"
					+ "VALUES(?,?,?,?,?,?)";
			sentencia = connection.prepareStatement(sql);
                        sentencia.setInt(1, reserva.getIdCliente());
                        sentencia.setInt(2,reserva.getIdSalon());
                        sentencia.setDate(3, java.sql.Date.valueOf(reserva.getFecha()));
                        sentencia.setTime(4, java.sql.Time.valueOf(reserva.getHora()));
                        sentencia.setInt(5, reserva.getNumeroPersonas());
                        sentencia.setString(6, reserva.getObservacion());
                        
			estadoOP = sentencia.executeUpdate() > 0;
			connection.commit();
			sentencia.close();
			connection.close();

		} catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();
		}
		return estadoOP;
	}
	//------------------------------------------------
        //----------------SALONES------------------------
	public boolean crearSalon(Salon salon) throws SQLException {
		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();

		try {
			connection.setAutoCommit(false);
			sql = "INSERT INTO salones(nombre, direccion, horario_atencion, tipo_garage otras_caracteristicas)"
					+ "VALUES(?,?,?,?,?)";
			sentencia = connection.prepareStatement(sql);
                        sentencia.setString(1, salon.getNombreSalon());
                        sentencia.setString(2, salon.getDireccionSalon());
                        sentencia.setString(3, salon.getHorarioAtencion());
                        sentencia.setString(4, salon.getTipoEspacio());
                        sentencia.setString(5, salon.getOtraCaracteristica());
                  
			estadoOP = sentencia.executeUpdate() > 0;
			connection.commit();
			sentencia.close();
			connection.close();

		} catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();
		}
		return estadoOP;
	}
	//------------------------------------------------
                
	//READ:
	//----------------USUARIOS------------------------
	public Cliente leerUsuario(int id) throws SQLException {
		ResultSet resultados = null;
		Cliente cliente = new Cliente();

		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();

		try {
			sql = "SELECT * FROM clientes WHERE id_cliente = ?";
			sentencia = connection.prepareStatement(sql);
			sentencia.setInt(1, id);

			resultados = sentencia.executeQuery();

			if (resultados.next()) {
				connection.setAutoCommit(false);
                               cliente.setIdCliente(resultados.getInt(1));
                               cliente.setNombreCliente(resultados.getString(2));
                               cliente.setCorreoElectronico(resultados.getString(3));
                               cliente.setNumeroTelefono(resultados.getString(4));
                               cliente.setPassword(resultados.getString(5));
                               
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cliente;
	}
	//-----------------------------------------------------
	//---------------TIPOSALONES----------------------
	public TipoSalon leerTipoSalon(String nombre) throws SQLException {
		ResultSet resultados = null;
		TipoSalon tipoSalon = new TipoSalon();

		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();

		try {
			sql = "SELECT * FROM tipoSalones WHERE nombre = ?";
			sentencia = connection.prepareStatement(sql);
			sentencia.setString(3, nombre);

			resultados = sentencia.executeQuery();

			if (resultados.next()) {
				connection.setAutoCommit(false);
				tipoSalon.setIdTipoSalon(resultados.getInt(1));
				tipoSalon.setIdSalon(resultados.getInt(2));
				tipoSalon.setNombre(resultados.getString(3));
				tipoSalon.setDescripcion(resultados.getString(4));
				tipoSalon.setPrecio(resultados.getDouble(5));
				tipoSalon.setOtraInformacion(resultados.getString(6));
                                
                        }

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tipoSalon;
	}
	//-----------------------------------------------
	//---------------ESPACIOS---------------------------
	public Espacio leerEspacio(String estado) throws SQLException {
		ResultSet resultados = null;
		Espacio espacio = new Espacio();

		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();

		try {
			sql = "SELECT * FROM espacios WHERE estado = ?";
			sentencia = connection.prepareStatement(sql);
                        
			sentencia.setString(4, estado);
			resultados = sentencia.executeQuery();

			if (resultados.next()) {
				connection.setAutoCommit(false);
				espacio.setIdEspacio(resultados.getInt(1));
				espacio.setIdSalon(resultados.getInt(2));
				espacio.setCapacidad(resultados.getInt(3));
				espacio.setEstado(resultados.getString(4));

                        }

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return espacio;
	}
	//-----------------------------------------------
	//--------------PEDIDOS--------------------------
	public Pedido leerPedido(int id_cliente) throws SQLException {
		ResultSet resultados = null;
		Pedido pedido = new Pedido();

		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();

		try {
			sql = "SELECT * FROM pedidos WHERE id_cliente = ?";
			sentencia = connection.prepareStatement(sql);
			sentencia.setInt(2, id_cliente);

			resultados = sentencia.executeQuery();

			if (resultados.next()) {
				connection.setAutoCommit(false);
                                pedido.setIdPedido(resultados.getInt(1));
                                pedido.setIdCliente(resultados.getInt(2));
                                pedido.setIdSalon(resultados.getInt(3));
                                pedido.setFechaPedido(resultados.getObject(4,LocalDate.class));
                                pedido.setHoraPedido(resultados.getObject(5,LocalTime.class));
                                pedido.setTotalPedido(resultados.getDouble(6));
                                pedido.setEstadoPedido(resultados.getString(7));
                                
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pedido;
	}
	//-----------------------------------------------
        //--------------RESERVAS--------------------------
	public Reserva leerReserva(int id_cliente) throws SQLException {
		ResultSet resultados = null;
		Reserva reserva = new Reserva();

		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();

		try {
			sql = "SELECT * FROM reservas WHERE id_cliente = ?";
			sentencia = connection.prepareStatement(sql);
			sentencia.setInt(2, id_cliente);

			resultados = sentencia.executeQuery();

			if (resultados.next()) {
				connection.setAutoCommit(false);
                                
                                reserva.setIdReserva(resultados.getInt(1));
                                reserva.setIdCliente(resultados.getInt(2));
                                reserva.setIdSalon(resultados.getInt(3));
                                reserva.setFecha(resultados.getObject(4,LocalDate.class));
                                reserva.setHora(resultados.getObject(5,LocalTime.class));
                                reserva.setNumeroPersonas(resultados.getInt(6));
                                reserva.setObservacion(resultados.getString(7));
                                
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return reserva;
	}
	//-----------------------------------------------
        //--------------SALONES--------------------------
	public Salon leerSalones(String tipo_espacio) throws SQLException {
		ResultSet resultados = null;
		Salon salon = new Salon();

		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();

		try {
			sql = "SELECT * FROM salones WHERE tipo_espacio = ?";
			sentencia = connection.prepareStatement(sql);
                        sentencia.setString(1, tipo_espacio);

			resultados = sentencia.executeQuery();

			if (resultados.next()) {
				connection.setAutoCommit(false);
				salon.setIdSalon(resultados.getInt(1));
				salon.setNombreSalon(resultados.getString(2));
				salon.setDireccionSalon(resultados.getString(3));
				salon.setHorarioAtencion(resultados.getString(4));
				salon.setTipoEspacio(resultados.getString(5));
				salon.setOtraCaracteristica(resultados.getString(6));
                                
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return salon;
	}
	//-----------------------------------------------
 
	//Obtener Datos:
	//-----------------------USUARIOS-----------------
	public List<Cliente> obtenerUsuarios()throws SQLException{
		ResultSet resultado = null;
		List<Cliente> listaCliente = new ArrayList<>(); 

		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();

		try {
			connection.setAutoCommit(false);
			sql = "SELECT * FROM clientes";
			sentencia = connection.prepareStatement(sql);
			resultado = sentencia.executeQuery();

			while(resultado.next()){
				Cliente cliente = new Cliente();
                               cliente.setIdCliente(resultado.getInt(1));
                               cliente.setNombreCliente(resultado.getString(2));
                               cliente.setCorreoElectronico(resultado.getString(3));
                               cliente.setNumeroTelefono(resultado.getString(4));
                               cliente.setPassword(resultado.getString(5));

				listaCliente.add(cliente);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaCliente;
	}
	//------------------------------------------------
	//-----------------------TIPOSALONES-------------
	public List<TipoSalon> obtenerTipoSalones(int id_salon,String nombre)throws SQLException{
		ResultSet resultado = null;
		List<TipoSalon> listaTipoSalones = new ArrayList<>(); 

		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();

		try {
			connection.setAutoCommit(false);
			sql = "SELECT * FROM tipoSalones WHERE id_salon = ? AND nombre = ?";
                        
			sentencia = connection.prepareStatement(sql);
                        sentencia.setInt(1, id_salon);
                        sentencia.setString(2, nombre);
			resultado = sentencia.executeQuery();

			while(resultado.next()){
				TipoSalon tipoSalones = new TipoSalon();

				tipoSalones.setIdTipoSalon(resultado.getInt(1));
				tipoSalones.setIdSalon(resultado.getInt(2));
				tipoSalones.setNombre(resultado.getString(3));
				tipoSalones.setDescripcion(resultado.getString(4));
                                tipoSalones.setPrecio(resultado.getDouble(5));
                                tipoSalones.setOtraInformacion(resultado.getString(6));
                                
				listaTipoSalones.add(tipoSalones);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaTipoSalones;
	}
	//------------------------------------------------
	//-----------------------ESPACIOS------------------
	public List<Espacio> obtenerEspacios(String estado, int id_salon)throws SQLException{
		ResultSet resultado = null;
		List<Espacio> listaEspacios = new ArrayList<>(); 

		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();

		try {
			connection.setAutoCommit(false);
			sql = "SELECT * FROM espacios WHERE estado = ? AND id_salon = ?";
			sentencia = connection.prepareStatement(sql);
                        sentencia.setString(1, estado);
                        sentencia.setInt(2, id_salon);
			resultado = sentencia.executeQuery();

			while(resultado.next()){
				Espacio espacio = new Espacio();
				espacio.setIdEspacio(resultado.getInt(1));
				espacio.setIdSalon(resultado.getInt(2));
				espacio.setCapacidad(resultado.getInt(3));
				espacio.setEstado(resultado.getString(4));

				listaEspacios.add(espacio);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaEspacios;
	}
	//------------------------------------------------
	//-----------------------PEDIDOS--------------------
	public List<Pedido> obtenerPedidos(int id_cliente)throws SQLException{
		ResultSet resultado = null;
		List<Pedido> listaPedidos = new ArrayList<>(); 

		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();

		try {
			connection.setAutoCommit(false);
			sql = "SELECT * FROM pedidos WHERE id_cliente = ? ";
			sentencia = connection.prepareStatement(sql);
                        sentencia.setInt(1, id_cliente);
			resultado = sentencia.executeQuery();

			while(resultado.next()){
				Pedido pedido = new Pedido();

				pedido.setIdPedido(resultado.getInt(1));
                                pedido.setIdCliente(resultado.getInt(2));
                                pedido.setIdSalon(resultado.getInt(3));
                                pedido.setFechaPedido(resultado.getObject(4,LocalDate.class));
                                pedido.setHoraPedido(resultado.getObject(5,LocalTime.class));
                                pedido.setTotalPedido(resultado.getDouble(6));
                                pedido.setEstadoPedido(resultado.getString(7));
                                
				listaPedidos.add(pedido);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaPedidos;
	}
	//------------------------------------------------
        //-----------------------RESERVAS--------------------
	public List<Reserva> obtenerReservas(int id_cliente)throws SQLException{
		ResultSet resultado = null;
		List<Reserva> listaReservas = new ArrayList<>(); 

		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();

		try {
			connection.setAutoCommit(false);
			sql = "SELECT * FROM reservas WHERE id_cliente = ? ";
			sentencia = connection.prepareStatement(sql);
                        sentencia.setInt(1, id_cliente);
			resultado = sentencia.executeQuery();

			while(resultado.next()){
				Reserva reserva = new Reserva();

				reserva.setIdReserva(resultado.getInt(1));
                                reserva.setIdCliente(resultado.getInt(2));
                                reserva.setIdSalon(resultado.getInt(3));
                                reserva.setFecha(resultado.getObject(4,LocalDate.class));
                                reserva.setHora(resultado.getObject(5,LocalTime.class));
                                reserva.setNumeroPersonas(resultado.getInt(6));
                                reserva.setObservacion(resultado.getString(7));
                                
				listaReservas.add(reserva);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaReservas;
	}
	//------------------------------------------------
        //-----------------------SALONES--------------------
	public List<Salon> obtenerSalones(String tipo_espacio)throws SQLException{
		ResultSet resultado = null;
		List<Salon> listaSalones = new ArrayList<>(); 

		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();

		try {
			connection.setAutoCommit(false);
			sql = "SELECT * FROM salones WHERE tipo_espacio = ? ";
			sentencia = connection.prepareStatement(sql);
                        sentencia.setString(1, tipo_espacio);
			resultado = sentencia.executeQuery();

			while(resultado.next()){
				Salon salon = new Salon();

				salon.setIdSalon(resultado.getInt(1));
				salon.setNombreSalon(resultado.getString(2));
				salon.setDireccionSalon(resultado.getString(3));
				salon.setHorarioAtencion(resultado.getString(4));
                                salon.setTipoEspacio(resultado.getString(5));
                                salon.setOtraCaracteristica(resultado.getString(6));
                                
                                listaSalones.add(salon);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaSalones;
	}
	//------------------------------------------------
        
        
	//UPDATE:
	//-------------------USUARIO-----------------------
	public boolean actualizarUsuario(int id, Cliente cliente) throws SQLException {
		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();
		
		
		try {
			connection.setAutoCommit(false);
			sql = "UPDATE clientes SET nombre =?, correo_electronico =?, numero_telefono =?, contrasena =? WHERE  id_cliente =?";
			sentencia = connection.prepareStatement(sql);
			sentencia.setString(1,cliente.getNombreCliente());
                        sentencia.setString(2, cliente.getCorreoElectronico());
                        sentencia.setString(3, cliente.getNumeroTelefono());
                        sentencia.setString(4, cliente.getPassword());
			sentencia.setInt(5, id);	
                        
		} catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();
		}

		estadoOP = sentencia.executeUpdate()>0;
		connection.commit();
		sentencia.close();
		connection.close();

		return true;
	}
        public boolean actualizarUsuario(String correo, Cliente cliente) throws SQLException {
		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();
                System.out.println("DATOS A ACTUALIZAR: "+ cliente.toString());
		
		
		try {
			connection.setAutoCommit(false);
			sql = "UPDATE clientes SET nombre =?, numero_telefono =?, contrasena =? WHERE  correo_electronico =?";
			sentencia = connection.prepareStatement(sql);
			sentencia.setString(1,cliente.getNombreCliente());
                        sentencia.setString(2, cliente.getNumeroTelefono());
                        sentencia.setString(3, cliente.getPassword());
			sentencia.setString(4, correo);	
                        
		} catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();
		}

		estadoOP = sentencia.executeUpdate()>0;
		connection.commit();
		sentencia.close();
		connection.close();

		return true;
	}
	//-------------------------------------------------
	//-------------------TIPOSALONES--------------------
	public boolean actualizarTipoSalo(String nombre, TipoSalon menu) throws SQLException {
		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();
		
		
		try {
			connection.setAutoCommit(false);
			sql = "UPDATE tipoSalones SET id_salon=?, nombre=?, descripcion=?, precio=?, otras_caracteristicas = ? WHERE nombre =?";
			sentencia = connection.prepareStatement(sql);
			
			sentencia.setInt(1, menu.getIdSalon());
                        sentencia.setString(2, menu.getNombre());
                        sentencia.setString(3, menu.getDescripcion());
                        sentencia.setDouble(4, menu.getPrecio());
                        sentencia.setString(5, menu.getOtraInformacion());
                        sentencia.setString(6, nombre);
	
		} catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();
		}

		estadoOP = sentencia.executeUpdate()>0;
		connection.commit();
		sentencia.close();
		connection.close();

		return true;
	}
	//-------------------------------------------------
	//-------------------ESPACIO-------------------------
	public boolean actualizarEspacio(String estado, Espacio espacio) throws SQLException {
		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();
		
		try {
			connection.setAutoCommit(false);
			sql = "UPDATE espacios SET id_salon =?, capacidad =?, estado =? WHERE estado =?";
			sentencia = connection.prepareStatement(sql);
			sentencia.setInt(1, espacio.getIdSalon());
                        sentencia.setInt(2, espacio.getCapacidad());
                        sentencia.setString(3, espacio.getEstado());
                        sentencia.setString(4, estado);
			
		} catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();
		}

		estadoOP = sentencia.executeUpdate()>0;
		connection.commit();
		sentencia.close();
		connection.close();

		return true;
	}
	//-------------------------------------------------
	//-------------------PEDIDOS-----------------------
	public boolean actualizarPedido(int id_cliente, Pedido pedido) throws SQLException {
		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();
		
		
		try {
			connection.setAutoCommit(false);
			sql = "UPDATE pedidos SET id_cliente =?, id_salon =?, fecha_pedido =?, hora_pedido =?, total_precio =?, estado_pedido =? WHERE id_cliente =?";
			sentencia = connection.prepareStatement(sql);
			
                        sentencia.setInt(1, pedido.getIdCliente());
                        sentencia.setInt(2,pedido.getIdSalon());
                        sentencia.setDate(3, java.sql.Date.valueOf(pedido.getFechaPedido()));
                        sentencia.setTime(4, java.sql.Time.valueOf(pedido.getHoraPedido()));
                        sentencia.setDouble(5, pedido.getTotalPedido());
                        sentencia.setString(6, pedido.getEstadoPedido());
                        sentencia.setInt(7, id_cliente);
		} catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();
		}

		estadoOP = sentencia.executeUpdate()>0;
		connection.commit();
		sentencia.close();
		connection.close();

		return true;
	}
	//-------------------------------------------------
        //-------------------RESERVAS-----------------------
	public boolean actualizarReserva(int id_cliente, Reserva reserva) throws SQLException {
		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();
		
		
		try {
			connection.setAutoCommit(false);
			sql = "UPDATE reservas SET id_cliente =?, id_restaurante =?, fecha =?, hora =?, numero_personas =?, observaciones =? WHERE id_cliente =?";
			sentencia = connection.prepareStatement(sql);
			
                        sentencia.setInt(1, reserva.getIdCliente());
                        sentencia.setInt(2,reserva.getIdSalon());
                        sentencia.setDate(3, java.sql.Date.valueOf(reserva.getFecha()));
                        sentencia.setTime(4, java.sql.Time.valueOf(reserva.getHora()));
                        sentencia.setInt(5, reserva.getNumeroPersonas());
                        sentencia.setString(6, reserva.getObservacion());
                        sentencia.setInt(7, id_cliente);
		} catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();
		}

		estadoOP = sentencia.executeUpdate()>0;
		connection.commit();
		sentencia.close();
		connection.close();

		return true;
	}
	//-------------------------------------------------
        //-------------------SALONES-----------------------
	public boolean actualizarSalones(String nombre, Salon salon) throws SQLException {
		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();
		
		
		try {
			connection.setAutoCommit(false);
			sql = "UPDATE salones SET nombre =?, direccion =?, horario_atencion =?, tipo_cocina =?, otras_caracteristicas =? WHERE nombre =?";
			sentencia = connection.prepareStatement(sql);
			
                        sentencia.setString(1, salon.getNombreSalon());
                        sentencia.setString(2, salon.getDireccionSalon());
                        sentencia.setString(3, salon.getHorarioAtencion());
                        sentencia.setString(4, salon.getTipoEspacio());
                        sentencia.setString(5, salon.getOtraCaracteristica());
                        sentencia.setString(6, nombre);
		} catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();
		}

		estadoOP = sentencia.executeUpdate()>0;
		connection.commit();
		sentencia.close();
		connection.close();

		return true;
	}
	//-------------------------------------------------
        
	//DELETE:
	//-------------USUARIO----------------------------
public boolean eliminarUsuario(int id) throws SQLException {
		
		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();

		
		try {
			connection.setAutoCommit(false);
			sql = "DELETE FROM clientes WHERE id_cliente =?";
			sentencia = connection.prepareStatement(sql) ;

			sentencia.setInt(1, id);
		} catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();
		}

		estadoOP = sentencia.executeUpdate()>0;
		connection.commit();
		sentencia.close();
		connection.close();

		return estadoOP;
	}
	//------------------------------------------------
	//-------------MENUS-------------------------
public boolean eliminarTipoSalon(int id_salon) throws SQLException {
	
	String sql = null;
	estadoOP = false;
	connection = obtenerConexion();

	
	try {
		connection.setAutoCommit(false);
		sql = "DELETE FROM salones WHERE id_salon =?";
		sentencia = connection.prepareStatement(sql) ;
                sentencia.setInt(2, id_salon);
	} catch (SQLException e) {
		connection.rollback();
		e.printStackTrace();
	}

	estadoOP = sentencia.executeUpdate()>0;
	connection.commit();
	sentencia.close();
	connection.close();

	return estadoOP;
}
	//------------------------------------------------
	//-------------MESAS------------------------------
public boolean eliminarEspacio(int id_espacio) throws SQLException {
	
	String sql = null;
	estadoOP = false;
	connection = obtenerConexion();

	
	try {
		connection.setAutoCommit(false);
		sql = "DELETE FROM espacios WHERE id_espacio =?";
		sentencia = connection.prepareStatement(sql) ;
                sentencia.setInt(1, id_espacio);
	} catch (SQLException e) {
		connection.rollback();
		e.printStackTrace();
	}

	estadoOP = sentencia.executeUpdate()>0;
	connection.commit();
	sentencia.close();
	connection.close();

	return estadoOP;
}
	//------------------------------------------------
	//-------------PEDIDOS----------------------------
public boolean eliminarPedido(int id_cliente) throws SQLException {
	
	String sql = null;
	estadoOP = false;
	connection = obtenerConexion();

	
	try {
		connection.setAutoCommit(false);
		sql = "DELETE FROM pedidos WHERE id_cliente =?";
		sentencia = connection.prepareStatement(sql) ;

		sentencia.setInt(2, id_cliente);
	} catch (SQLException e) {
		connection.rollback();
		e.printStackTrace();
	}

	estadoOP = sentencia.executeUpdate()>0;
	connection.commit();
	sentencia.close();
	connection.close();

	return estadoOP;
}
	//------------------------------------------------
//-------------RESERVAS----------------------------
public boolean eliminarReserva(int id_cliente) throws SQLException {
	
	String sql = null;
	estadoOP = false;
	connection = obtenerConexion();

	
	try {
		connection.setAutoCommit(false);
		sql = "DELETE FROM reservas WHERE id_cliente =?";
		sentencia = connection.prepareStatement(sql) ;

		sentencia.setInt(2, id_cliente);
	} catch (SQLException e) {
		connection.rollback();
		e.printStackTrace();
	}

	estadoOP = sentencia.executeUpdate()>0;
	connection.commit();
	sentencia.close();
	connection.close();

	return estadoOP;
}
	//------------------------------------------------
//-------------RESTAURANTES----------------------------
public boolean eliminarSalon(String nombre) throws SQLException {
	
	String sql = null;
	estadoOP = false;
	connection = obtenerConexion();

	
	try {
		connection.setAutoCommit(false);
		sql = "DELETE FROM salones WHERE nombre =?";
		sentencia = connection.prepareStatement(sql) ;

		sentencia.setString(2, nombre);
	} catch (SQLException e) {
		connection.rollback();
		e.printStackTrace();
	}

	estadoOP = sentencia.executeUpdate()>0;
	connection.commit();
	sentencia.close();
	connection.close();

	return estadoOP;
}
	//------------------------------------------------
	

}
