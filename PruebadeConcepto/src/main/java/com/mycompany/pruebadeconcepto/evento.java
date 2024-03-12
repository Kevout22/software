/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebadeconcepto;

/**
 *
 * @author diazs
 */
public class evento {
    private int idEvento;
    private String nombre;
    private int fecha;
    private String descripcion;
    private int idEspacio;

    // Constructor
    public evento(int idEvento, String nombre, int fecha, String descripcion, int idEspacio) {
        this.idEvento = idEvento;
        this.nombre = nombre;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.idEspacio = idEspacio;
    }

    // Getters y Setters
    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdEspacio() {
        return idEspacio;
    }

    public void setIdEspacio(int idEspacio) {
        this.idEspacio = idEspacio;
    }

    // Método para programar el evento
    public void programarEvento() {
        // Lógica para programar el evento, como almacenar los detalles en una base de datos
        System.out.println("Evento programado con éxito.");
    }

    // Método para cancelar el evento
    public void cancelarEvento() {
        // Lógica para cancelar el evento, como actualizar el estado en una base de datos
        System.out.println("Evento cancelado correctamente.");
    }

    // Método para obtener detalles del evento
    public void obtenerDetalles() {
        // Lógica para obtener y mostrar los detalles del evento
        System.out.println("Detalles del evento:\nNombre: " + nombre + "\nFecha: " + fecha +
                           "\nDescripción: " + descripcion + "\nID del Espacio: " + idEspacio);
    }

    // Otros métodos según sea necesario
}

