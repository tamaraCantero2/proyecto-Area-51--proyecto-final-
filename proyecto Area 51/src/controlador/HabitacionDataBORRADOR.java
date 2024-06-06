package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Habitacion;

public class HabitacionDataBORRADOR {

    //Atributos
    private static Connection con = Conexion.getConexion();
    private static String sql;
    private static PreparedStatement ps;
    private static ResultSet rs;

    public static void subirHabitacion(Habitacion habitacion) {
        sql = "INSERT INTO habitacion (idCategoria, piso, estado) VALUES (?,?,?)";
        try {
            ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setInt(1, habitacion.getIdCategoria());
            ps.setInt(2, habitacion.getPiso());
            ps.setInt(3, habitacion.getEstado());

            ps.executeUpdate();
            rs = ps.getGeneratedKeys();

            if (rs.next()) {
                habitacion.setIdCategoria(1);
                JOptionPane.showMessageDialog(null, "Habitación agregada con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al subir la habitación");
            System.out.println("Error clase HabitaciónData metodo subirHabitacion " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al subir la habitación");
            System.out.println("Error clase HabitaciónData metodo subirHabitacion " + ex.getMessage());
        }
    }

    public static void actualizarHabitacion(Habitacion habitacion, boolean muestraCartel) {
        sql = "UPDATE habitacion SET idCategoria=?, piso=?, estado=?  WHERE idHabitacion = ?";
        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, habitacion.getIdCategoria());
            ps.setInt(2, habitacion.getPiso());
            ps.setInt(3, habitacion.getEstado());

            ps.setInt(4, habitacion.getIdHabitacion());
            int f = ps.executeUpdate();

            if (f > 0 && muestraCartel) {
                JOptionPane.showMessageDialog(null, "Habitación modificada con exito");
                System.out.println("Filas afectadas: " + f);
            } else {
                System.out.println("Habitacion modificada con exito");
                System.out.println("Filas afectadas: " + f);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la habitación");
            System.out.println("Error en la Clase HabitacionData metodo actualizarHabitacion() " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la habitación");
            System.out.println("Error en la Clase HabitacionData metodo actualizarHabitacion() " + ex.getMessage());
        }
    }

    //int idHabitacion, int idCategoria, int piso, int estado)
    public static void bajarHabitacion(int idHabitacion) {
        sql = "UPDATE habitacion SET estado = 0 WHERE idHabitacion = ? ";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idHabitacion);

            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se ha dado de baja la habitación exitosamente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al dar de baja habitación");
            System.out.println("Error en la clase HabitacionData metodo bajarHabitación() " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al dar de baja habitación");
            System.out.println("Error en la clase HabitacionData metodo bajarHabitación() " + ex.getMessage());
        }

    }

    public static ArrayList<Habitacion> listaHabitaciones() {
        ArrayList<Habitacion> lista = new ArrayList<>();
        sql = "SELECT * FROM habitacion";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Habitacion habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt(1));
                habitacion.setIdCategoria(rs.getInt(2));
                habitacion.setPiso(rs.getInt(3));
                habitacion.setEstado(rs.getInt(4));

                lista.add(habitacion);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener lista de todas las habitaciones");
            System.out.println("Error en la clase HabitacionData metodo listaDeHabitaciones() " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener lista de todas las habitaciones");
            System.out.println("Error en la clase HabitacionData metodo listaDeHabitaciones() " + ex.getMessage());
        }
        return lista;
    }

    public static ArrayList<Habitacion> listaHabitacionesActivas() {
        ArrayList<Habitacion> lista = new ArrayList<>();
        sql = "SELECT * FROM habitacion WHERE estado = 1";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Habitacion habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt(1));
                habitacion.setIdCategoria(rs.getInt(2));
                habitacion.setPiso(rs.getInt(3));
                habitacion.setEstado(rs.getInt(4));

                lista.add(habitacion);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la lista de habitaciones en condiciones");
            System.out.println("Error en las clase HabitacionData metodo listaHabitacionesActivas() " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la lista de habitaciones activas");
            System.out.println("Error en las clase HabitacionData metodo listaHabitacionesActivas() " + ex.getMessage());
        }

        return lista;
    }

    public static ArrayList<Habitacion> listaHabitacionesBajas() {
        ArrayList<Habitacion> lista = new ArrayList<>();
        sql = "SELECT * FROM habitacion WHERE estado = 0";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Habitacion habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt(1));
                habitacion.setIdCategoria(rs.getInt(2));
                habitacion.setPiso(rs.getInt(3));
                habitacion.setEstado(rs.getInt(4));

                lista.add(habitacion);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la lista de las habitaciones en reparacion");
            System.out.println("Error en las clase HabitacionData metodo listaHabitacionesBajas() " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la lista de habitaciones en baja");
            System.out.println("Error en las clase HabitacionData metodo listaHabitacionesBajas() " + ex.getMessage());
        }

        return lista;
    }

    public static ArrayList<Habitacion> listarHabitacionesLibres() {
        ArrayList<Habitacion> lista = new ArrayList<>();

        try {
            for (Habitacion h : listaHabitaciones()) {
                if (isLibre(h)) {
                    lista.add(h);
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al listar las habitaciones libres");
            System.out.println("Error en las clase HabitacionData metodo listarHabitacionesLibres " + ex.getMessage());
        }

        return lista;
    }

    public static ArrayList<Habitacion> listarHabitacionesOcupadas() {
        ArrayList<Habitacion> lista = new ArrayList<>();

        try {
            for (Habitacion h : listaHabitaciones()) {
                if (!isLibre(h)) {
                    lista.add(h);
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al listar las habitaciones ocupadas");
            System.out.println("Error en las clase HabitacionData metodo listarHabitacionesOcupadas " + ex.getMessage());
        }

        return lista;
    }

    public static ArrayList<Habitacion> obtenerHabitacionesXPiso(int piso) {
        ArrayList<Habitacion> lista = new ArrayList<>();
        sql = "SELECT * FROM habitacion WHERE piso=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, piso);
            rs = ps.executeQuery();

            while (rs.next()) {
                Habitacion habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt(1));
                habitacion.setIdCategoria(rs.getInt(2));
                habitacion.setPiso(rs.getInt(3));
                habitacion.setEstado(rs.getInt(4));

                lista.add(habitacion);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar habitaciones por piso");
            System.out.println("Error en las clase HabitacionData metodo listarHabitacionesXPiso() " + ex.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al listar habitaciones por piso");
            System.out.println("Error en las clase HabitacionData metodo listarHabitacionesXPiso() " + e.getMessage());
        }

        return lista;

    }

    public static Habitacion obtenerHabitacionXCategoria(int idCategoria) {
        Habitacion lista = new Habitacion();
        sql = "SELECT * FROM habitacion WHERE idCategoria=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idCategoria);
            rs = ps.executeQuery();

            while (rs.next()) {
                lista.setIdHabitacion(rs.getInt(1));
                lista.setIdCategoria(rs.getInt(2));
                lista.setPiso(rs.getInt(3));
                lista.setEstado(rs.getInt(4));

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar habitacion por categoria");
            System.out.println("Error en las clase HabitacionData metodo listarHabitacionesXCategoria() " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar habitacion por categoria");
            System.out.println("Error en las clase HabitacionData metodo listarHabitacionesXCategoria() " + ex.getMessage());
        }

        return lista;
    }

//    public static Habitacion obtenerHabitacionXCategoria(String categoria) {
//        Habitacion lista=new Habitacion();
//        sql = "SELECT idHabitacion,habitacion.idCategoria,piso,estado FROM habitacion,categoria WHERE categoria.nombre LIKE ? AND categoria.idCategoria=habitacion.idCategoria";
//        try {
//            ps = con.prepareStatement(sql);
//            ps.setString(1, categoria);
//            rs = ps.executeQuery();
//
//            while (rs.next()) {
//                lista.setIdHabitacion(rs.getInt(1));
//                lista.setIdCategoria(rs.getInt(2));
//                lista.setPiso(rs.getInt(3));
//                lista.setEstado(rs.getInt(4));
//
//            }
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al buscar habitacion por categoria");
//            System.out.println("Error en las clase HabitacionData metodo listarHabitacionesXCategoria() " + ex.getMessage());
//        }
//
//        return lista;
//    }
//    
    public static boolean isLibre(Habitacion habitacion) {
        sql = "SELECT h.idHabitacion,piso,idCategoria,h.estado FROM habitacion as h,reserva as r WHERE r.idHabitacion=? and r.estado=1 and h.estado=1;";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, habitacion.getIdHabitacion());

            rs = ps.executeQuery();

            if (rs.next()) {
                return false;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al verificar si la habitacion esta libre");
            System.out.println("Error en las clase HabitacionData metodo isLibre() " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al verificar si la habitacion esta libre");
            System.out.println("Error en las clase HabitacionData metodo isLibre() " + ex.getMessage());
        }
        return true;
    }

    public static Habitacion obtenerHabitacionXId(int id) {
        Habitacion h = new Habitacion();
        sql = "SELECT * FROM habitacion WHERE idHabitacion=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            rs = ps.executeQuery();

            while (rs.next()) {

                h.setIdHabitacion(rs.getInt(1));
                int idC = CategoriaData.obtenerCategoriaXId(rs.getInt(2)).getIdCategoria();
                h.setIdCategoria(idC);
                h.setPiso(rs.getInt(3));
                h.setEstado(rs.getInt(4));
                System.out.println("habitacion obtenida exitosamente");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudieron obtener los datos de la habitacion");
            System.out.println("Error en la Clase HabitacionesDataBORRADOR, metodo obtenerHabitacionXId " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudieron obtener los datos de la habitacion");
            System.out.println("Error en la Clase HabitacionesDataBORRADOR, metodo obtenerHabitacionXId " + ex.getMessage());
        }
        return h;

    }

    public static ArrayList<Integer> buscarHabitacionesXPrecio(double precio) {
        ArrayList<Integer> idHabitaciones = new ArrayList<>();

        sql = "SELECT idHabitacion FROM habitacion,categoria WHERE categoria.idCategoria=habitacion.idCategoria and categoria.precioXnoche<=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setDouble(1, precio);

            rs = ps.executeQuery();

            while (rs.next()) {
                idHabitaciones.add(rs.getInt(1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudieron obtener los ids de las habitaciones");
            System.out.println("Error en la Clase HabitacionesDataBORRADOR, metodo buscarHabitacionesXPrecio " + ex.getMessage());

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudieron obtener los ids de las habitaciones");
            System.out.println("Error en la Clase HabitacionesDataBORRADOR, metodo buscarHabitacionesXPrecio " + ex.getMessage());

        }
        return idHabitaciones;
    }

    public static ArrayList<Integer> buscarHabitacionesXCategoria(String categoria) {
        ArrayList<Integer> idHabitaciones = new ArrayList<>();

        sql = "SELECT idHabitacion FROM habitacion,categoria WHERE categoria.idCategoria=habitacion.idCategoria and categoria.nombre LIKE ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, categoria);

            rs = ps.executeQuery();

            while (rs.next()) {
                idHabitaciones.add(rs.getInt(1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudieron obtener los ids de las habitaciones");
            System.out.println("Error en la Clase HabitacionesDataBORRADOR, metodo buscarHabitacionesXCategoria: " + ex.getMessage());

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudieron obtener los ids de las habitaciones");
            System.out.println("Error en la Clase HabitacionesDataBORRADOR, metodo buscarHabitacionesXCategoria: " + ex.getMessage());

        }
        return idHabitaciones;
    }

    public static ArrayList<Habitacion> buscarHabitacionesXCategoria2(String categoria) {
        ArrayList<Habitacion> habitaciones = new ArrayList<>();
        Habitacion h = new Habitacion();
        sql = "SELECT idHabitacion,habitacion.idCategoria,piso,estado FROM habitacion,categoria WHERE categoria.idCategoria=habitacion.idCategoria and categoria.nombre LIKE ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, categoria);

            rs = ps.executeQuery();

            while (rs.next()) {
                h.setIdHabitacion(rs.getInt(1));
                h.setIdCategoria(rs.getInt(2));
                h.setPiso(rs.getInt(3));
                h.setEstado(rs.getInt(4));

                habitaciones.add(h);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudieron obtener las habitaciones");
            System.out.println("Error en la Clase HabitacionesDataBORRADOR, metodo buscarHabitacionesXCategoria2: " + ex.getMessage());

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudieron obtener las habitaciones");
            System.out.println("Error en la Clase HabitacionesDataBORRADOR, metodo buscarHabitacionesXCategoria2: " + ex.getMessage());

        }
        return habitaciones;
    }

    public static ArrayList<Habitacion> listarHabitacionesXCategoria(int idCategoria) {
        ArrayList<Habitacion> Habitaciones = new ArrayList<>();

        sql = "SELECT idHabitacion,piso,habitacion.estado,habitacion.idCategoria FROM habitacion,categoria WHERE categoria.idCategoria=? AND categoria.idCategoria=habitacion.idCategoria";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idCategoria);

            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("se obtuvieron las habitaciones");
                Habitacion habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt(1));
                habitacion.setIdCategoria(rs.getInt(4));
                habitacion.setPiso(rs.getInt(2));
                habitacion.setEstado(rs.getInt(3));

                Habitaciones.add(habitacion);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudieron obtener las habitaciones");
            System.out.println("Error en la Clase HabitacionesDataBORRADOR, metodo listarHabitacionesXCategoria: " + ex.getMessage());

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudieron obtener las habitaciones");
            System.out.println("Error en la Clase HabitacionesDataBORRADOR, metodo listarHabitacionesXCategoria: " + ex.getMessage());

        }
        return Habitaciones;
    }

    public static ArrayList<Integer> buscarHabitacionesXCantPersonas(int cantPersonas) {
        ArrayList<Integer> idHabitaciones = new ArrayList<>();

        sql = "SELECT idHabitacion FROM habitacion,categoria WHERE  categoria.cantidadPersonas >= ? AND categoria.idCategoria=habitacion.idCategoria";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cantPersonas);

            rs = ps.executeQuery();

            while (rs.next()) {
                idHabitaciones.add(rs.getInt(1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudieron obtener los ids de las habitaciones");
            System.out.println("Error en la Clase HabitacionesDataBORRADOR, metodo buscarHabitacionesXCantidadPersonas: " + ex.getMessage());

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudieron obtener los ids de las habitaciones");
            System.out.println("Error en la Clase HabitacionesDataBORRADOR, metodo buscarHabitacionesXCantidadPersonas: " + ex.getMessage());

        }
        return idHabitaciones;
    }

    public static ArrayList<Habitacion> listarHabitacionesXCategoriaYOcupada(int idCategoria, boolean libre) {
        ArrayList<Habitacion> Habitaciones = new ArrayList<>();

        sql = "SELECT idHabitacion,habitacion.idCategoria,piso,estado FROM habitacion,categoria WHERE habitacion.idCategoria=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idCategoria);

            rs = ps.executeQuery();

            while (rs.next()) {
                if (libre && isLibre(obtenerHabitacionXId(rs.getInt(1)))) {
                    Habitaciones.add(new Habitacion(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4)));
                } else if (!libre && !(isLibre(obtenerHabitacionXId(rs.getInt(1))))) {
                    Habitaciones.add(new Habitacion(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4)));
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudieron obtener los ids de las habitaciones");
            System.out.println("Error en la Clase HabitacionesDataBORRADOR, metodo buscarHabitacionesXCategoriaYOcupada: " + ex.getMessage());

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudieron obtener los ids de las habitaciones");
            System.out.println("Error en la Clase HabitacionesDataBORRADOR, metodo buscarHabitacionesXCategoriaYOcupada: " + ex.getMessage());

        }
        return Habitaciones;

    }

}
