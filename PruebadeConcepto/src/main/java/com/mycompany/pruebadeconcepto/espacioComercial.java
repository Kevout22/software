/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebadeconcepto;

import java.util.List;

/**
 *
 * @author diazs
 */
public class espacioComercial {
    private int idEspacio;
    private String nombre;
    private String tipo;
    private int capacidad;
    private boolean estadoDisponibilidad;
    private List<evento> eventos; // Asociación con la clase Evento

    // Constructor
    public espacioComercial(int idEspacio, String nombre, String tipo, int capacidad, boolean estadoDisponibilidad) {
        this.idEspacio = idEspacio;
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.estadoDisponibilidad = estadoDisponibilidad;
    }

    // Getters y Setters
    public int getIdEspacio() {
        return idEspacio;
    }

    public void setIdEspacio(int idEspacio) {
        this.idEspacio = idEspacio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isEstadoDisponibilidad() {
        return estadoDisponibilidad;
    }

    public void setEstadoDisponibilidad(boolean estadoDisponibilidad) {
        this.estadoDisponibilidad = estadoDisponibilidad;
    }

    // Getter y Setter para la lista de eventos
    public List<evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<evento> eventos) {
        this.eventos = eventos;
    }

    // Método para reservar el espacio
    public void reservarEspacio() {
        if (estadoDisponibilidad) {
            System.out.println("Espacio " + nombre + " reservado con éxito.");
            estadoDisponibilidad = false;
        } else {
            System.out.println("Error: El espacio " + nombre + " no está disponible para reservar.");
        }
    }

    // Método para liberar el espacio
    public void liberarEspacio() {
        if (!estadoDisponibilidad) {
            System.out.println("Espacio " + nombre + " liberado.");
            estadoDisponibilidad = true;
        } else {
            System.out.println("Error: El espacio " + nombre + " ya está disponible.");
        }
    }

    // Método para verificar la disponibilidad del espacio
    public void verificarDisponibilidad() {
        if (estadoDisponibilidad) {
            System.out.println("El espacio " + nombre + " está disponible.");
        } else {
            System.out.println("El espacio " + nombre + " no está disponible.");
        }
    }

    // Otros métodos según sea necesario
}