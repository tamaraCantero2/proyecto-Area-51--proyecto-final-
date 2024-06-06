package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Categoria;

public class CategoriaData {
    //Atributos
//CRUD, create, read, update, delete
    private static Connection con = Conexion.getConexion();
    private static String sql;
    private static PreparedStatement ps;
    private static ResultSet rs;

    //metodos
    //int idCategoria,nombre, String tipoDeCamas, int cantidadPersonas, int cantidadCamas, precioNoche) {
    public static void subirCategoria(Categoria categoria) {
        sql = "INSERT INTO categoria (tipoDeCamas,nombre, cantidadPersonas, cantidadCamas, precioNoche) VALUES (?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setString(1, categoria.getTipoDeCamas());
            ps.setString(2, categoria.getNombre());
            ps.setInt(3, categoria.getCantidadPersonas());
            ps.setInt(4, categoria.getCantidadCamas());
            ps.setDouble(5, categoria.getPrecioNoche());
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();

            if (rs.next()) {
                categoria.setIdCategoria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Categoria agregada con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al subir la categoria");
            System.out.println("Error clase CategoriaData metodo subirCategoria " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al subir la categoria");
            System.out.println("Error clase CategoriaData metodo subirCategoria " + ex.getMessage());
        }
        
    }

    public static void actualizarCategoria(Categoria categoria) {
        sql = "UPDATE categoria SET tipoDeCamas = ?,nombre=?, cantidadPersonas = ?, cantidadCamas= ?, precioNoche=?  WHERE  idCategoria = ?";
        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, categoria.getTipoDeCamas());
            ps.setString(2, categoria.getNombre());
            ps.setInt(3, categoria.getCantidadPersonas());
            ps.setInt(4, categoria.getCantidadCamas());
            ps.setDouble(5, categoria.getPrecioNoche());


            ps.setInt(6, categoria.getIdCategoria());

            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Categoria actualizada con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar Categoria");
            System.out.println("Error clase CategoriaData metodo actualizarCategoria " + ex.getMessage());
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Error al actualizar Categoria");
            System.out.println("Error clase CategoriaData metodo actualizarCategoria " + ex.getMessage());
        }
    }

    public static void eliminarCategoria(int idCategoria) {
        sql = "DELETE FROM categoria  WHERE idCategoria= ?";
        try {
          ps =con.prepareStatement(sql);
          ps.setInt(1,idCategoria);
          
          int filasAfectadas = ps.executeUpdate();
           if (filasAfectadas > 0){ 
          JOptionPane.showMessageDialog(null, "Categoria eliminada con exito");
           }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al eliminar Categoria");  
            System.out.println("Error clase CategoriaData metodo elimiarCategoria " + ex.getMessage());
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, "Error al eliminar Categoria");  
            System.out.println("Error clase CategoriaData metodo elimiarCategoria " + ex.getMessage());
        }
    }
//int idCategoria, String tipoDeCamas, int cantidadPersonas, int cantidadCamas, precioNoche) {    
   public static ArrayList<Categoria> listaCategoriaesActivas(){
  ArrayList <Categoria> lista =  new ArrayList<>();
  sql = "SELECT * FROM categoria";
  try{
    ps = con.prepareStatement(sql);
    rs = ps.executeQuery();
    
     while(rs.next()){
     Categoria categoria = new Categoria();
     categoria.setIdCategoria(rs.getInt(1));
     categoria.setNombre(rs.getString(2));
     categoria.setTipoDeCamas(rs.getString(3));
     categoria.setCantidadPersonas(rs.getInt(5));
     categoria.setCantidadCamas(rs.getInt(4));
     categoria.setPrecioNoche(rs.getDouble(6));
     
     lista.add(categoria);
   }
    
  }catch(SQLException ex){
    JOptionPane.showMessageDialog(null, "Error al cargar la lista de categorias");
      System.out.println("Error en las clase CategoriaData metodo listaCategorias() "+ex.getMessage());
  }catch(Exception ex){
    JOptionPane.showMessageDialog(null, "Error al cargar la lista de categorias");
      System.out.println("Error en las clase CategoriaData metodo listaCategorias() "+ex.getMessage());
  }
    
 return lista;   
} 
        //int idCategoria, String tipoDeCamas, int cantidadPersonas, int cantidadCamas, precioNoche) {    

    public static ArrayList<Categoria> listarTodasLasCategorias() {
        ArrayList<Categoria> lista = new ArrayList<>();
        sql = "SELECT * FROM categoria";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Categoria categoria = new Categoria();
                categoria.setIdCategoria(rs.getInt(1));
                categoria.setNombre(rs.getString(2));
                categoria.setTipoDeCamas(rs.getString(3));
                categoria.setCantidadCamas(rs.getInt(4));
                categoria.setCantidadPersonas(rs.getInt(5));
                categoria.setPrecioNoche(rs.getDouble(6));
                

                lista.add(categoria);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la lista de categorias");
            System.out.println("Error en las clase CategoriaData metodo listarTodasLasCategorias() " + ex.getMessage());
        }

        return lista;
    }
    /**hecho por tam*/
       public static Categoria obtenerCategoriaXId(int id) {
        Categoria c = new Categoria();
        sql = "SELECT * FROM categoria WHERE idCategoria=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            rs = ps.executeQuery();

            while (rs.next()) {

                c.setIdCategoria(rs.getInt(1));
                c.setNombre(rs.getString(3));
                c.setTipoDeCamas(rs.getString(2));
                c.setCantidadCamas(rs.getInt(4));
                c.setCantidadPersonas(rs.getInt(5));
                c.setPrecioNoche(rs.getDouble(6));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudieron obtener los datos de la categoria");
            System.out.println("Error en la Clase CategoriaData, metodo obtenerCategoriaXId " + ex.getMessage());
        }catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudieron obtener los datos de la categoria");
            System.out.println("Error en la Clase CategoriaData, metodo obtenerCategoriaXId " + ex.getMessage());
        }
        return c;
    }
    /**hecho por tam*/
    public static void cambiarPrecioCategoria(double precio,String nombreCategoria){
        sql="UPDATE categoria SET precioNoche=? WHERE nombre=?";
        
        try {
            ps=con.prepareStatement(sql);
            ps.setDouble(1, precio);
            ps.setString(2, nombreCategoria);
            
            int f=ps.executeUpdate();
            
            if(f>0){
                JOptionPane.showMessageDialog(null, "se ha cambiado el precio");
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "No se pudo cambiar el precio de la categoria");
           System.out.println("Error en la Clase CategoriaData, metodo cambiarPrecioCategoria " + ex.getMessage());
        }catch(Exception ex) {
           JOptionPane.showMessageDialog(null, "No se pudo cambiar el precio de la categoria");
           System.out.println("Error en la Clase CategoriaData, metodo cambiarPrecioCategoria " + ex.getMessage());
        }
    }

}
