package modelo;
/*Hecho por Juan Laspiur*/
public class Habitacion {
//atributos

    private int idHabitacion;
    private int idCategoria;
    private int piso;
    private int estado;
//contructores 

    public Habitacion() {
    }

    public Habitacion(int idCategoria, int piso, int estado) {
        this.idCategoria = idCategoria;
        this.piso = piso;
        this.estado = estado;

    }

    public Habitacion(int idHabitacion, int idCategoria, int piso, int estado) {
        this.idHabitacion = idHabitacion;
        this.idCategoria = idCategoria;
        this.piso = piso;
        this.estado = estado;

    }

    

//metodos
    

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Habitacion nro:" + idHabitacion + ", Categoria nro:" + idCategoria + ", piso nro:" + piso + ", ¿esta libre?:" + estado;
    }
    
    
}
