/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author valkiria
 */
public class Reserva {
    private int idReserva;
    private Habitacion habitacion;
    private Huesped huesped;
    private LocalDate fechaIngreso;
    private LocalDate fechaEgreso;
    private int cantPersonas;
    private double precioTotal;
    private boolean estado;

    /**CONTRUCTOR CON TODOS LOS ATRIBUTOS DE RESERVA*/
    public Reserva(int idReserva, Habitacion habitacion, Huesped huesped, LocalDate fechaIngreso, LocalDate fechaEgreso, int cantPersonas, double precioTotal, boolean estado) {
        this.idReserva = idReserva;
        this.habitacion = habitacion;
        this.huesped = huesped;
        this.fechaIngreso = fechaIngreso;
        this.fechaEgreso = fechaEgreso;
        this.cantPersonas = cantPersonas;
        this.precioTotal = precioTotal;
        this.estado = estado;
    }

    /**CONSTRUCTOR SIN ID DE RESERVA*/
    public Reserva(Habitacion habitacion, Huesped huesped, LocalDate fechaIngreso, LocalDate fechaEgreso, int cantPersonas, double precioTotal, boolean estado) {
        this.habitacion = habitacion;
        this.huesped = huesped;
        this.fechaIngreso = fechaIngreso;
        this.fechaEgreso = fechaEgreso;
        this.cantPersonas = cantPersonas;
        this.precioTotal = precioTotal;
        this.estado = estado;
    }
    /**CONSTRUCTOR VACIO DE RESERVA*/    
    public Reserva(){}

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(LocalDate fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString(){
        return "Reserva N°: "+idReserva+", de Huesped N°: "+huesped.getIdHuesped()+",en Habitacion n°: "+habitacion.getIdHabitacion()+", n° total de personas: "+cantPersonas+", estado: "+estado;
    }

}

    
    

