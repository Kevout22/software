/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebadeconcepto;

/**
 *
 * @author diazs
 */
public class administradorSistema extends usuario {
    private int idAdmin;
    private int idUsuario;

    // Constructor
    public administradorSistema(int idUsuario, String nombre, String apellido, String correo, String contraseña) {
        super(idUsuario, nombre, apellido, correo, contraseña);
    }

    // Getters y Setters
    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    // Método para asignar espacios
    public void asignarEspacios() {
        // Lógica para asignar espacios, por ejemplo, gestionar la asignación de espacios en un sistema
        System.out.println("Espacios asignados correctamente.");
    }

    // Método para generar informe de rentabilidad
    public void generarInformeRentabilidad() {
        // Lógica para generar un informe de rentabilidad del sistema
        System.out.println("Informe de rentabilidad generado correctamente.");
    }

    // Método para gestionar usuarios
    public void gestionarUsuarios() {
        // Lógica para gestionar usuarios del sistema, como añadir, modificar o eliminar usuarios
        System.out.println("Usuarios gestionados correctamente.");
    }

    // Otros métodos según sea necesario
}

