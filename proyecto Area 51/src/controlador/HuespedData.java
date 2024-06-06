package controlador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Huesped;

public class HuespedData {
   //Atributos
 private static Connection con = Conexion.getConexion();
 private static String sql; 
 private static PreparedStatement ps;
 private static ResultSet rs;
 
 /**hecho por juan*/
 //metodos
 public static void subirHuesped(Huesped huesped){
    sql="INSERT INTO huesped (nombre, apellido, dni, correo, celular, domicilio, estado) VALUES (?,?,?,?,?,?,?)";
     try {
         ps= con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
         
         ps.setString(1, huesped.getNombre());
         ps.setString(2,huesped.getApellido());
         ps.setInt(3, huesped.getDNI());
         ps.setString(4, huesped.getCorreo());
         ps.setInt(5,huesped.getCelular());
         ps.setString(6,huesped.getDomicilio());
         ps.setBoolean(7, huesped.isEstado());
         
         ps.executeUpdate();
         rs = ps.getGeneratedKeys();
         if(rs.next()){
           huesped.setIdHuesped(rs.getInt(1));  
           JOptionPane.showMessageDialog(null, "Huesped agregado con exito.");
         }
         
         
     } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, "No se pudo subir el huesped");
         System.out.println("Error en la Clase HuespedData, metodo subirHuesped "+ ex.getMessage());
     }catch (Exception e){
         JOptionPane.showMessageDialog(null, "Error, no se pudo subir el huesped");
         System.out.println("Error en la Clase HuespedData, metodo suubirHuesped "+e.getMessage());
     }
 
}
    /**hecho por tam*/
    public static void actualizarHuesped(Huesped huesped){
         sql="UPDATE huesped SET nombre=?,apellido=?,dni=?,correo=?,celular=?,domicilio=?, estado=? WHERE idHuesped=?";
         try {
             ps=con.prepareStatement(sql);
             ps.setString(1, huesped.getNombre());
             ps.setString(2, huesped.getApellido());
             ps.setInt(3, huesped.getDNI());
             ps.setString(4, huesped.getCorreo());
             ps.setInt(5, huesped.getIdHuesped());
             ps.setString(6, huesped.getDomicilio());
             ps.setBoolean(7, huesped.isEstado());
                     
             ps.setInt(8, huesped.getIdHuesped());


             int f=ps.executeUpdate();

             if(f>0){
                 JOptionPane.showMessageDialog(null, "huesped actulizado correctamente");
                 System.out.println("filas afectadas: "+f);
             }
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "No se pudieron actualizar los datos del huesped");
             System.out.println("Error en la Clase HuespedData, metodo actualizarHuesped "+ ex.getMessage());
         }catch (Exception e){
         JOptionPane.showMessageDialog(null, "No se pudieron actualizar los datos del huesped");
             System.out.println("Error en la Clase HuespedData, metodo actualizarHuesped "+ e.getMessage());
         }

     }
    
  //**Hecho por Ariel Lazarte*/
 
 public static void bajarHuesped(int idHuesped) {
     
     try {
         sql = "UPDATE huesped SET estado = 0 WHERE idHuesped = ? ";
         ps  = con.prepareStatement(sql);
         ps.setInt(1, idHuesped);
         int fila = ps.executeUpdate();
         
         if (fila == 1) {
             JOptionPane.showMessageDialog(null, "Se ha dado de baja al huesped de la nave nodri");
         }else{
           JOptionPane.showMessageDialog(null, "No se pudo eliminar el huesped, verifique que exista ese huesped");
         }
     } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "*Error*: no se ha podido dar de baja al huesped, ser humano");
         System.out.println("Error en la Clase HuespedData, metodo bajarHuesped "+ex.getMessage());
     }catch (Exception e){
         JOptionPane.showMessageDialog(null, "*Error*: no se ha podido dar de baja al huesped al ser humano");
         System.out.println("Error en la Clase HuespedData, metodo bajarHuesped "+e.getMessage());
     }
     
 }
 /**hecho por tam*/
     public static Huesped obtenerHuespedXDni(int dni){
     Huesped h=new Huesped();
     sql="SELECT * FROM huesped WHERE dni=?";
     try {
         ps=con.prepareStatement(sql);
         ps.setInt(1, dni);
         
         rs=ps.executeQuery();
         
         while(rs.next()){
	
             h.setIdHuesped(rs.getInt(1));
             h.setNombre(rs.getString(2));
             h.setApellido(rs.getString(3));
             h.setDNI(rs.getInt(4));
             h.setCorreo(rs.getString(5));
             h.setCelular(rs.getInt(6));
             h.setDomicilio(rs.getString(7));
             h.setEstado(rs.getBoolean(8));
         }
     } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, "No se pudieron obtener los datos del huesped");
         System.out.println("Error en la Clase HuespedData, metodo obtenerHuespedXDni "+ ex.getMessage());
    }catch(Exception ex){
         JOptionPane.showMessageDialog(null, "No se pudieron obtener los datos del huesped");
         System.out.println("Error en la Clase HuespedData, metodo obtenerHuespedXDni "+ ex.getMessage());
    }
     return h;
 }
     
  
 //hecho por juan
 public static ArrayList<Huesped> listaCompletaHuespedes(){
   ArrayList<Huesped> lista = new ArrayList<>();
   sql= "SELECT * FROM huesped";
     try {
         ps=con.prepareStatement(sql);   
         rs= ps.executeQuery();
         //idHuesped	nombre	apellido	dni	correo	celular	domicilio	estado
         while(rs.next()){
           Huesped huesped = new Huesped();
           
           huesped.setIdHuesped(rs.getInt(1));
           huesped.setNombre(rs.getString(2));
           huesped.setApellido(rs.getString(3));         
           huesped.setDNI(rs.getInt(4));
           huesped.setCorreo(rs.getString(5));
           huesped.setCelular(rs.getInt(6));
           huesped.setDomicilio(rs.getString(7));
           huesped.setEstado(rs.getBoolean(8));
           
           lista.add(huesped);
         }
 
     } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, "Error, no se pudo devolver la lista");
         System.out.println("Error en la Clase HuespedData, metodo listaCompletaHuespedes "+ex.getMessage());
     }catch (Exception e){
         JOptionPane.showMessageDialog(null, "Error, no se pudo devolver la lista");
         System.out.println("Error en la Clase HuespedData, metodo listaCompletaHuespedes "+e.getMessage());
     }

 
 
   return lista;
 } 
 
 //**Hecho por Ariel Lazarte*/
 
     public static ArrayList<Huesped> listadeHuespedActivos() {
     ArrayList<Huesped> huespedes = new ArrayList<>();
     sql="SELECT * FROM huesped WHERE estado = 1 ";
     
     try {
         ps=con.prepareStatement(sql);
         rs=ps.executeQuery();
         
         while (rs.next()) {
             Huesped huesped = new Huesped();
             
             huesped.setIdHuesped(rs.getInt(1));
             huesped.setNombre(rs.getString(2));
             huesped.setApellido(rs.getString(3));
             huesped.setDNI(rs.getInt(4));
             huesped.setCorreo(rs.getString(5));
             huesped.setCelular(rs.getInt(6));
             huesped.setDomicilio(rs.getString(7));
             huesped.setEstado(rs.getBoolean(8));
             
             huespedes.add(huesped);
             
         }
         
     } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, "*ERROR*: No se pudo obtener los datos de los huespedes activos");
         System.out.println("Error en la clase HuespedData, en el metodo ListadeHuespedActivos()");
         
     }catch (Exception e){
         JOptionPane.showMessageDialog(null, "*ERROR*: No se pudo obtener los datos de los huespedes activos");
         System.out.println("Error en la clase HuespedData, en el metodo ListadeHuespedActivos()");
         
     }
     return huespedes;
     
 }

    //**Hecho por Ariel Lazarte*/ 
     
    public static ArrayList<Huesped> listadeHuespedNoActivos() {
        ArrayList<Huesped> huespedes = new ArrayList<>();
        sql="SELECT * FROM huesped WHERE estado = 0 ";
        
        try {
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while (rs.next()) {
                Huesped huesped = new Huesped();
                
                huesped.setIdHuesped(rs.getInt(1));
                huesped.setNombre(rs.getString(2));
                huesped.setApellido(rs.getString(3));
                huesped.setDNI(rs.getInt(4));
                huesped.setCorreo(rs.getString(5));
                huesped.setCelular(rs.getInt(6));
                huesped.setDomicilio(rs.getString(7));
                huesped.setEstado(rs.getBoolean(8));
                
                huespedes.add(huesped);
                
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "*ERROR*: No se pudo obtener los datos de los huespedes no activos");
            System.out.println("Error en la clase HuespedData, en el metodo ListadeHuespedNoActivos()");
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "*ERROR*: No se pudo obtener los datos de los huespedes no activos");
            System.out.println("Error en la clase HuespedData, en el metodo ListadeHuespedNoActivos()");
            
     }
        return huespedes;
    }
     
/**hecho por tam*/
    public static Huesped obtenerHuespedXid(int id) {
        Huesped h = new Huesped();
        sql = "SELECT * FROM huesped WHERE idHuesped=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            rs = ps.executeQuery();

            while (rs.next()) {

                h.setIdHuesped(rs.getInt(1));
                h.setNombre(rs.getString(2));
                h.setApellido(rs.getString(3));
                h.setDNI(rs.getInt(4));
                h.setCorreo(rs.getString(5));
                h.setCelular(rs.getInt(6));
                h.setDomicilio(rs.getString(7));
                h.setEstado(rs.getBoolean(8));
                System.out.println("huesped obtenido exitosamente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudieron obtener los datos del huesped");
            System.out.println("Error en la Clase HuespedData, metodo obtenerHuespedXDni " + ex.getMessage());
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se pudieron obtener los datos del huesped");
            System.out.println("Error en la Clase HuespedData, metodo obtenerHuespedXDni " + e.getMessage());
     }
        return h;
    }
    
    
}


//**PROYECTO AREA 51*/
//MODELO DE LA TABLA HUESPED EN SQL://idHuesped,nombre,apellido,dni,correo,celular,domicilio,estado
//**PRIMERA REGLA DEL AREA 51: NUNCA HABLAR DEL AREA 51 (solo esta permitido si vas hablar bien de nosotros, nos vas a dar plata o nos vas a dar una empanada de carne)*/
//**Quisiera una milanesa¨*/
//y yo albondigas

//jaja el area 51 es area confidencial
    
//EL SEÑOR DE LA NOCHEEEEEEEEEEEEEEEEEEEEE     

//venimos en son de paz XD