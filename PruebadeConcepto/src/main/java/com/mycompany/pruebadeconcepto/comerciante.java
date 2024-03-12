package com.mycompany.pruebadeconcepto;

/**
 *
 * @author diazs
 */
public class comerciante extends usuario {
    private String productosServicios;

    // Constructor que llama al constructor de la clase base (Usuario)
    public comerciante(int idUsuario, String nombre, String apellido, String correo, String contraseña, String productosServicios) {
        super(idUsuario, nombre, apellido, correo, contraseña);
        this.productosServicios = productosServicios;
    }

    // Getter y Setter específico para productosServicios
    public String getProductosServicios() {
        return productosServicios;
    }

    public void setProductosServicios(String productosServicios) {
        this.productosServicios = productosServicios;
    }

    // Método específico para el comerciante
    public void gestionarProductosServicios() {
        // Lógica para gestionar los productos y servicios ofrecidos por el comerciante
        System.out.println("Productos y servicios gestionados correctamente.");
    }

    // Otros métodos según sea necesario
}

