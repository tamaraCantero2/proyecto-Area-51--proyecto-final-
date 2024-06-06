package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.*;

public class ReservaData {

    private static Connection con = Conexion.getConexion();
    private static String sql;
    private static PreparedStatement ps;
    private static ResultSet rs;

    //**Hecho por Ariel Lazarte*/
    public static void subirReserva(Reserva r) {
        sql = "INSERT INTO reserva (idReserva, idHabitacion, idHuesped, fechaEntrada, fechaSalida, cantidadPersonas, montoAPagar, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?) ";

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            //revisar las posiciones de cada get para evitar problemas
            ps.setInt(1, r.getIdReserva());
            ps.setInt(2, r.getHabitacion().getIdHabitacion());
            ps.setInt(3, r.getHuesped().getIdHuesped());
            ps.setDate(4, Date.valueOf(r.getFechaIngreso()));
            ps.setDate(5, Date.valueOf(r.getFechaEgreso()));  // Corregido el índice
            ps.setInt(6, r.getCantPersonas());
            ps.setDouble(7, r.getPrecioTotal());
            ps.setBoolean(8, r.isEstado());

            int f = ps.executeUpdate();
            if (f > 0) {
                JOptionPane.showMessageDialog(null, "habitacion reservada con exito");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "*ERROR*: No se a podido 1 guardar/subir la nueva reserva");
            System.out.println("Error: el error se encuentra en el metodo subirReserva(), por favor revise. ");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "*ERROR*: No se a podido 2 guardar/subir la nueva reserva");
            System.out.println("Error: el error se encuentra en el metodo subirReserva(), por favor revise. ");
        }

    }

    //**Hecho por Ariel Lazarte*/
    public static void bajarReserva(int idReserva) {

        try {
            sql = "UPDATE reserva SET estado = 0 WHERE idReserva = ? ";
            ps = con.prepareStatement(sql);
            ps.setInt(1, idReserva);

            int fila = ps.executeUpdate();

            if (fila == 0) {
                System.out.println("Se ha dado de baja la reserva con exito ");

            } else {
                System.out.println("Error, no se pudo dar de baja la reserva ");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "*ERROR*: No se ha podido dar de baja la reserva del humano del area 51 ");
            System.out.println("Error. el error se encuentra en el metodo bajarReserva(), por favor revise. ");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "*ERROR*: No se ha podido dar de baja la reserva del humano del area 51 ");
            System.out.println("Error. el error se encuentra en el metodo bajarReserva(), por favor revise. ");
        }

    }

    //**Hecho por Ariel Lazarte*/
    public static void eliminarReserva(int idReserva) {

        try {
            sql = "DELETE reserva WHERE idReserva = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idReserva);

            int fila = ps.executeUpdate();

            if (fila < 0) {
                System.out.println("Se ha eliminado la reserva, no queda rastros de la abducción del area 51");

            } else {
                System.out.println("No se ha podido eliminar la reserva");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "*ERROR*: No se ha podido eliminar la reserva del humano del area 51");
            System.out.println("Error. el error se encuentra en el metodo eliminarReserva(), por favor revise. ");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "*ERROR*: No se ha podido eliminar la reserva del humano del area 51");
            System.out.println("Error. el error se encuentra en el metodo eliminarReserva(), por favor revise. ");

        }

    }

    //**Hecho por Ariel Lazarte*/
    public static Reserva buscarReservaPorHuesped(int idHuesped) {
        Reserva r = new Reserva();
        sql = "SELECT * FROM reserva WHERE idHuesped = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idHuesped);
            rs = ps.executeQuery();

            if (rs.next()) {
                r.setIdReserva(rs.getInt(1));
                r.setHuesped(HuespedData.obtenerHuespedXid(rs.getInt(2)));
                r.setHabitacion(HabitacionDataBORRADOR.obtenerHabitacionXId(rs.getInt(3)));
                r.setFechaIngreso(rs.getDate(4).toLocalDate());
                r.setFechaEgreso(rs.getDate(5).toLocalDate());
                r.setCantPersonas(rs.getInt(6));
                r.setPrecioTotal(rs.getDouble(7));
                r.setEstado(rs.getBoolean(8));

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "*ERROR*: No se ha podido oobtener la reserva del humano en el area 51");
            System.out.println("Error. el error se encuentra en el metodo obtenerReservaPorHuesped(), por favor revise. ");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "*ERROR*: No se ha podido oobtener la reserva del humano en el area 51");
            System.out.println("Error. el error se encuentra en el metodo obtenerReservaPorHuesped(), por favor revise. ");

        }

        return r;

    }
    public static ArrayList<Reserva> buscarReservaPorHuesped2(int idHuesped) {
        Reserva r = new Reserva();
        ArrayList<Reserva> hs=new ArrayList<>();
        sql = "SELECT * FROM reserva WHERE idHuesped = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idHuesped);
            rs = ps.executeQuery();

            while (rs.next()) {
                r.setIdReserva(rs.getInt(1));
                r.setHuesped(HuespedData.obtenerHuespedXid(rs.getInt(2)));
                r.setHabitacion(HabitacionDataBORRADOR.obtenerHabitacionXId(rs.getInt(3)));
                r.setFechaIngreso(rs.getDate(4).toLocalDate());
                r.setFechaEgreso(rs.getDate(5).toLocalDate());
                r.setCantPersonas(rs.getInt(6));
                r.setPrecioTotal(rs.getDouble(7));
                r.setEstado(rs.getBoolean(8));

                hs.add(r);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "*ERROR*: No se ha podido oobtener la reserva del humano en el area 51");
            System.out.println("Error. el error se encuentra en el metodo obtenerReservaPorHuesped(), por favor revise. ");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "*ERROR*: No se ha podido oobtener la reserva del humano en el area 51");
            System.out.println("Error. el error se encuentra en el metodo obtenerReservaPorHuesped(), por favor revise. ");

        }

        return hs;

    }

    /**
     * hecho por tamara
     */
//idReserva,idHuesped,idHabitacion,fechaEntrada,fechaSalida,
//cantidadPersonas,montoAPagar,estado	
    public static void actualizarReserva(Reserva r) {
        sql = "UPDATE reserva SET idHuesped=?,idHabitacion=?,fechaEntrada=?,fechaSalida=?,cantidadPersonas=?,montoAPagar=?,estado=? WHERE idReserva=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, r.getHuesped().getIdHuesped());
            ps.setInt(2, r.getHabitacion().getIdHabitacion());
            ps.setDate(3, Date.valueOf(r.getFechaIngreso()));
            ps.setDate(4, Date.valueOf(r.getFechaEgreso()));
            ps.setInt(5, r.getCantPersonas());
            ps.setDouble(6, r.getPrecioTotal());
            ps.setBoolean(7, r.isEstado());
            ps.setInt(8, r.getIdReserva());

            int f = ps.executeUpdate();

            if (f > 0) {

                JOptionPane.showMessageDialog(null, "Actualizacion de reserva exitosa");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido actualizar la reserva, error: " + ex.getMessage());
            System.out.println("error en metodo actualizarReserva en reservaData error: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido actualizar la reserva, error: " + ex.getMessage());
            System.out.println("error en metodo actualizarReserva en reservaData error: " + ex.getMessage());
        }

    }

    /**
     * hecho por tam
     */
    public static ArrayList<Reserva> listarReservasActivas() {
        ArrayList<Reserva> reservas = new ArrayList<>();
        sql = "SELECT * FROM reserva WHERE estado=1";
        try {
            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                reservas.add(new Reserva(rs.getInt(1), HabitacionDataBORRADOR.obtenerHabitacionXId(rs.getInt(3)), HuespedData.obtenerHuespedXid(rs.getInt(2)), rs.getDate(4).toLocalDate(), rs.getDate(5).toLocalDate(), rs.getInt(6), rs.getDouble(7), rs.getBoolean(8)));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido listar las reservas activas, error: " + ex.getMessage());
            System.out.println("error en metodo listarReservasActivas en reservaData error: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido listar las reservas activas, error: " + ex.getMessage());
            System.out.println("error en metodo listarReservasActivas en reservaData error: " + ex.getMessage());
        }
        return reservas;
    }

    public static ArrayList<Reserva> listarReservasBajas() {
        ArrayList<Reserva> lista = new ArrayList<>();
        sql = "SELECT * FROM reserva WHERE estado=0";
        try {
            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                lista.add(new Reserva(rs.getInt(1), HabitacionDataBORRADOR.obtenerHabitacionXId(rs.getInt(3)), HuespedData.obtenerHuespedXid(rs.getInt(2)), rs.getDate(4).toLocalDate(), rs.getDate(5).toLocalDate(), rs.getInt(6), rs.getDouble(7), rs.getBoolean(8)));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido cargar la lista de Reservas bajas: " + ex.getMessage());
            System.out.println("error en metodo listarMateriasBajas de la clase Reserva: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido cargar la lista de Reservas bajas: " + ex.getMessage());
            System.out.println("error en metodo listarMateriasBajas de la clase Reserva: " + ex.getMessage());
        }
        return lista;
    }

    public static ArrayList<Reserva> listarTodasLasReservas() {
        ArrayList<Reserva> lista = new ArrayList<>();
        sql = "SELECT * FROM reserva";
        try {
            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                lista.add(new Reserva(rs.getInt(1), HabitacionDataBORRADOR.obtenerHabitacionXId(rs.getInt(3)), HuespedData.obtenerHuespedXid(rs.getInt(2)), rs.getDate(4).toLocalDate(), rs.getDate(5).toLocalDate(), rs.getInt(6), rs.getDouble(7), rs.getBoolean(8)));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido cargar la lista completa de Reservas: " + ex.getMessage());
            System.out.println("error en metodo listarTodasLasReservas en reservaData error: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido cargar la lista completa de Reservas: " + ex.getMessage());
            System.out.println("error en metodo listarTodasLasReservas en reservaData error: " + ex.getMessage());
        }
        return lista;
    }

    /**
     * hecho por tam
     */
    public static Reserva buscarReservaPorHabitacion(int idHabitacion) {
        sql = "SELECT * FROM reserva WHERE idHabitacion=?";
        Reserva reserva = new Reserva();
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idHabitacion);

            rs = ps.executeQuery();

            if (rs.next()) {
                reserva.setIdReserva(rs.getInt(1));
                reserva.setHuesped(HuespedData.obtenerHuespedXid(rs.getInt(2)));
                reserva.setHabitacion(HabitacionDataBORRADOR.obtenerHabitacionXId(rs.getInt(3)));
                reserva.setFechaIngreso(rs.getDate(4).toLocalDate());
                reserva.setFechaEgreso(rs.getDate(5).toLocalDate());
                reserva.setCantPersonas(rs.getInt(6));
                reserva.setPrecioTotal(rs.getDouble(7));
                reserva.setEstado(rs.getBoolean(8));

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar la reserva, error: " + ex.getMessage());
            System.out.println("error en metodo buscarReservaPorHabitacion en reservaData error: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar la reserva, error: " + ex.getMessage());
            System.out.println("error en metodo buscarReservaPorHabitacion en reservaData error: " + ex.getMessage());
        }
        return reserva;
    }
    //idReserva,idHuesped,idHabitacion,fechaEntrada,fechaSalida,
    //cantidadPersonas,montoAPagar,estado	

    public static Reserva buscarReservaXId(int idReserva) {
        Reserva reserva = new Reserva();
        try {
            sql = "SELECT * FROM reserva WHERE idReserva=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, idReserva);
            rs = ps.executeQuery();

            if (rs.next()) {
                reserva.setIdReserva(rs.getInt(1));
                reserva.setHuesped(HuespedData.obtenerHuespedXid(rs.getInt(2)));
                reserva.setHabitacion(HabitacionDataBORRADOR.obtenerHabitacionXId(rs.getInt(3)));
                reserva.setFechaIngreso(rs.getDate(4).toLocalDate());
                reserva.setFechaEgreso(rs.getDate(5).toLocalDate());
                reserva.setCantPersonas(rs.getInt(6));
                reserva.setPrecioTotal(rs.getDouble(7));
                reserva.setEstado(rs.getBoolean(8));

                return reserva;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar Reserva por Id");
            System.out.println("Error CLASE ReservaData METODO buscarReservaXid");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar Reserva por Id");
            System.out.println("Error CLASE ReservaData METODO buscarReservaXid");
        }

        return reserva;

    }

    public static ArrayList<Habitacion> buscarHabitacionPersonalizado(String categoria, int cantidadPersonas, double Precio) {
        ArrayList<Habitacion> habiDisponibles = new ArrayList<>();
        ArrayList<Habitacion> habits = new ArrayList<>();
        ArrayList<Habitacion> habiTodas = HabitacionDataBORRADOR.listaHabitaciones();
        ArrayList<Integer> idsXprecios = HabitacionDataBORRADOR.buscarHabitacionesXPrecio(Precio);
        ArrayList<Integer> idsXcategoria = HabitacionDataBORRADOR.buscarHabitacionesXCategoria(categoria);
        ArrayList<Integer> idsXcantPersonas = HabitacionDataBORRADOR.buscarHabitacionesXCantPersonas(cantidadPersonas);
        for (Habitacion h : habiTodas) {
            if (HabitacionDataBORRADOR.isLibre(h)) {
                habiDisponibles.add(h);

            }
        }

        for (Habitacion hab : habiDisponibles) {
            if (!categoria.equals("")) {
                if (idsXprecios.contains(hab.getIdHabitacion()) && idsXcantPersonas.contains(hab.getIdHabitacion()) && idsXcategoria.contains(hab.getIdHabitacion())) {
                    habits.add(hab);
                }
            } else if (idsXprecios.contains(hab.getIdHabitacion()) && idsXcantPersonas.contains(hab.getIdHabitacion())) {
                habits.add(hab);
            }
        }
        return habits;

    }

    public static double calcularMontoTotal(int idCategoria, LocalDate fInicio, LocalDate fFin) {

        Categoria c = CategoriaData.obtenerCategoriaXId(idCategoria);

        long dias = ChronoUnit.DAYS.between(fInicio, fInicio);

        return c.getPrecioNoche() * dias;
    }

    public static void finReserva(Huesped h,int idReserva) {
        Reserva r=buscarReservaPorHuesped(h.getIdHuesped());
        /*System.out.println("id huesped:"+h.getIdHuesped());
        for (Reserva reserva : buscarReservaPorHuesped2(h.getIdHuesped())) {
            if(reserva.getIdReserva()==idReserva){
                System.out.println("idReserva:"+reserva.getIdReserva());
                System.out.println("id:"+idReserva);
                r=reserva;
                break;
            }
        }*/

        r.setEstado(false);
        actualizarReserva(r);
    }

    public static ArrayList buscarReservaPorFechaDeInicio(LocalDate fechaInicio) {
        ArrayList<Reserva> reservas = new ArrayList<>();
        Reserva reserva = new Reserva();
        try {
            sql = "SELECT * FROM reserva WHERE fechaEntrada=?";
            ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fechaInicio));
            rs = ps.executeQuery();

            while (rs.next()) {
                reserva.setIdReserva(rs.getInt(1));
                reserva.setHuesped(HuespedData.obtenerHuespedXid(rs.getInt(2)));
                reserva.setHabitacion(HabitacionDataBORRADOR.obtenerHabitacionXId(rs.getInt(3)));
                reserva.setFechaIngreso(rs.getDate(4).toLocalDate());
                reserva.setFechaEgreso(rs.getDate(5).toLocalDate());
                reserva.setCantPersonas(rs.getInt(6));
                reserva.setPrecioTotal(rs.getDouble(7));
                reserva.setEstado(rs.getBoolean(8));

                reservas.add(reserva);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar Reserva por fechaInicio");
            System.out.println("Error CLASE ReservaData METODO buscarReservaPorFechaInicio");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar Reserva por fechaInicio");
            System.out.println("Error CLASE ReservaData METODO buscarReservaPorFechaInicio");
        }

        return reservas;

    }

    public static Reserva buscarReservaPorFechaDeFin(LocalDate fechaFin) {
        Reserva reserva = new Reserva();
        try {
            sql = "SELECT * FROM reserva WHERE fechaSalida=?";
            ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fechaFin));
            rs = ps.executeQuery();

            if (rs.next()) {
                reserva.setIdReserva(rs.getInt(1));
                reserva.setHuesped(HuespedData.obtenerHuespedXid(rs.getInt(2)));
                reserva.setHabitacion(HabitacionDataBORRADOR.obtenerHabitacionXId(rs.getInt(3)));
                reserva.setFechaIngreso(rs.getDate(4).toLocalDate());
                reserva.setFechaEgreso(rs.getDate(5).toLocalDate());
                reserva.setCantPersonas(rs.getInt(6));
                reserva.setPrecioTotal(rs.getDouble(7));
                reserva.setEstado(rs.getBoolean(8));

                return reserva;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar Reserva por fechaSalida");
            System.out.println("Error CLASE ReservaData METODO buscarReservaPorFechaFin");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar Reserva por fechaSalida");
            System.out.println("Error CLASE ReservaData METODO buscarReservaPorFechaFin");
        }

        return reserva;

    }
}

//VAMOS BOCAAAAAAAAAAAAAAAAAAAAAAAAAAAA
//¿Existira vida en otros planetas? no se, pero si tendras un buen rato en tu vida si te hospedas en el Hotel Area 51 ;)//
//Hospedarte en el Hotel Area 51 sera una experiencia de otro planeta
