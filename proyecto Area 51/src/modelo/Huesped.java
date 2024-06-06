
package modelo;

public class Huesped {
    private int idHuesped;
    private String nombre;
    private String apellido;
    private int DNI;
    private String domicilio;
    private String correo;
    private int celular;
    private boolean estado;

    /**CONTRUCTOR CON TODOS LOS ATRIBUTOS DE HUESPED*/
    public Huesped(int idHuesped, String nombre, String apellido, int DNI, String domicilio, String correo, int celular, boolean estado) {
        this.idHuesped = idHuesped;
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.domicilio = domicilio;
        this.correo = correo;
        this.celular = celular;
        this.estado = estado;
    }

    /**CONSTRUCTOR SIN ID DE HUESPED*/
    public Huesped(String nombre, String apellido, int DNI, String domicilio, String correo, int celular, boolean estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.domicilio = domicilio;
        this.correo = correo;
        this.celular = celular;
        this.estado = estado;
    }
    
    /**CONSTRUCTOR VACIO*/
    public Huesped(){}

    
    /**GETTERS Y SETTERS*/
    
    public int getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(int idHuesped) {
        this.idHuesped = idHuesped;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
    /**TOSTRING() DE HUESPEDES*/
    @Override
    public String toString(){
        return "N°: "+idHuesped+", Nombre: "+nombre+", Apellido: "+apellido+" D.N.I: "+DNI;
    }
}
