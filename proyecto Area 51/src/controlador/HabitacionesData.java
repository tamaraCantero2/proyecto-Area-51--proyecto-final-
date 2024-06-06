//package controlador;
//
//import java.util.ArrayList;
//import modelo.Habitacion;
//import java.util.List;
//
//public class HabitacionesData {
//    //BRIAN LO TUYO ESTA DEPUES DE ESTE METODO; DISCULPA ES QUE NO ME TOMABA ALGUNAS COSAS Y LO TUVE QUE PONER ACA
//        /**
//         * hecho por tam
//         */
//        private static Connection con = Conexion.getConexion();
//        private static String sql;
//        private static PreparedStatement ps;
//         static ResultSet rs;
//
//        public static Habitacion obtenerHabitacionXId(int id) {
//            Habitacion h = new Habitacion();
//            sql = "SELECT * FROM habitacion WHERE idHabitacion=?";
//            try {
//                ps = con.prepareStatement(sql);
//                ps.setInt(1, id);
//
//                rs = ps.executeQuery();
//
//                while (rs.next()) {
//
//                    h.setIdHabitacion(rs.getInt(1));
//                    int idC=CategoriaData.obtenerCategoriaXId(rs.getInt(2)).getIdCategoria();
//                    h.setIdCategoria(idC);
//                    h.setPiso(rs.getInt(3));
//                    h.setEstado(rs.getInt(4));
//                    System.out.println("habitacion obtenida exitosamente");
//                }
//            } catch (SQLException ex) {
//                JOptionPane.showMessageDialog(null, "No se pudieron obtener los datos de la habitacion");
//                System.out.println("Error en la Clase HabitacionesData, metodo obtenerHabitacionXId " + ex.getMessage());
//            }
//            return h;
//
//        }
//    
//    public void actualizarHabitacion() {
//
//        ArrayList<String> iniciarEstado = new ArrayList<>();
//        iniciarEstado.add("Ocupada");
//
//        Habitacion Habitacion = new Habitacion(, ,, iniciarEstado);
//
//        System.out.println("Iniciarl Habitacion detallado: " + Habitacion.getIdHabitacion()
//                + "," + Habitacion.getIdCategoria() + "," + Habitacion.getPiso() + ","
//                + Habitacion.getEstado());
//
//        ArrayList<String> updatedEstado = new ArrayList<>();
//        updatedEstado.add("Libre");
//        Habitacion.actualizar(.. , ... , updatedEstado
//        );
//
//     
//        System.out.println("Actualizar Habitacion detallado " + Habitacion.getIdHabitacion()
//                + "," + Habitacion.getIdCategoria() + "," + Habitacion.getPiso() + ","
//                + Habitacion.getEstado());
//    }
//
//    static {
//        GestionHabitaciones gestionHabitaciones = new GestionHabitaciones();
//
//        Habitacion habitacion1 = new Habitacion();
//        habitacion1.setIdHabitaciones(1);
//        habitacion1.setIdCategoria(101);
//        habitacion1.setPiso(1);
//        habitacion1.setEstado("Disponible");
//        gestionHabitaciones.agregarHabitacion(habitacion1);
//
//        Habitacion habitacion2 = new Habitacion();
//        habitacion2.setIdHabitaciones(2);
//        habitacion2.setIdCategoria(202);
//        habitacion2.setPiso(2);
//        habitacion2.setEstado("Ocupada");
//        gestionHabitaciones.agregarHabitacion(habitacion2);
//
//        List<Habitacion> listaHabitaciones = gestionHabitaciones.getHabitaciones();
//        for (Habitacion habitacion : listaHabitaciones) {
//            System.out.println(habitacion);
//        }
//    }

//    private static class GestionHabitaciones {
//
//    
//
//        public GestionHabitaciones() {
//        }
//
//        private List<Habitacion> getHabitaciones() {
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//        }
//
//        private void agregarHabitacion(Habitacion habitacion) {
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//        }
//
//        private void altaHabitacion(int i, int i0, String disponible) {
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//        }
//
//        private void altaHabitacion(int i, int i0, int i1, String disponible) {
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//        }
//
//    }

//    static {
//        GestionHabitaciones gestionHabitaciones = new GestionHabitaciones();
//
//        gestionHabitaciones.altaHabitacion(1, 101, 1, "Disponible");
//        gestionHabitaciones.altaHabitacion(2, 202, 2, "Ocupada");
//
//        List<Habitacion> listaHabitaciones = gestionHabitaciones.getHabitaciones();
//        for (Habitacion habitacion : listaHabitaciones) {
//            System.out.println(habitacion);
//        }
//    }
//
//    public class GestionHabitaciones {
//
//        private List<Habitacion> habitaciones;
//
//        public GestionHabitaciones() {
//            this.habitaciones = new ArrayList<>();
//        }
//
//        public void altaHabitacion(int idHabitaciones, int idCategoria, int piso, String estado) {
//            Habitacion habitacion = new Habitacion();
//            habitacion.setIdHabitaciones(idHabitaciones);
//            habitacion.setIdCategoria(idCategoria);
//            habitacion.setPiso(piso);
//            habitacion.setEstado(estado);
//            habitaciones.add(habitacion);
//        }
//
//        public void bajaHabitacion(int idHabitaciones, int idCategoria, int piso, String estado) {
//            Iterator<Habitacion> iterator = habitaciones.iterator();
//            while (iterator.hasNext()) {
//                Habitacion habitacion = iterator.next();
//                if (habitacion.getIdHabitaciones() == idHabitaciones
//                        && habitacion.getIdCategoria() == idCategoria
//                        && habitacion.getPiso() == piso
//                        && habitacion.getEstado().equals(estado)) {
//                    iterator.remove();
//                    System.out.println("Habitación con ID " + idHabitaciones + " eliminada");
//                    return;
//                }
//            }
//            System.out.println("No se encontró una habitación que coincida detalladamente");
//        }
//
//        public List<Habitacion> getHabitaciones() {
//            return habitacion;
//        }
//
//    }
