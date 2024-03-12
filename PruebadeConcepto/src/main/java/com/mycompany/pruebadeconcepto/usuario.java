/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebadeconcepto;

/**
 *
 * @author diazs
 */

public class usuario {
    private int idUsuario;
    private String nombre;
    private String apellido;
    private String correo;
    private String contraseña;

    // Constructor
    public usuario(int idUsuario, String nombre, String apellido, String correo, String contraseña) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    // Métodos getters y setters
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public boolean iniciarSesion(String correo, String contraseña) {
        // Lógica para verificar las credenciales y autenticar al usuario
        if (this.correo.equals(correo) && this.contraseña.equals(contraseña)) {
            System.out.println("Inicio de sesión exitoso para " + this.nombre);
            return true;
        } else {
            System.out.println("Error: Credenciales incorrectas");
            return false;
        }
    }
    
    public void cerrarSesion() {
        // Lógica para cerrar la sesión del usuario
        System.out.println("Sesión cerrada para " + this.nombre);
    }
    
    public void actualizarPerfil(String nuevoNombre, String nuevoApellido, String nuevoCorreo, String nuevaContraseña) {
        // Lógica para actualizar los datos del perfil
        this.nombre = nuevoNombre;
        this.apellido = nuevoApellido;
        this.correo = nuevoCorreo;
        this.contraseña = nuevaContraseña;

        System.out.println("Perfil actualizado para " + this.nombre);
    }
    
}
