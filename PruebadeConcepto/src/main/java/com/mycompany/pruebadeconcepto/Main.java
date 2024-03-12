/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebadeconcepto;

/**
 *
 * @author diazs
 */
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Crear instancias de clases
        comerciante comerciante = new comerciante(1, "NombreComerciante", "ApellidoComerciante", "correo@comerciante.com", "contraseñaComerciante", "Productos y Servicios");
        administradorSistema admin = new administradorSistema(2, "NombreAdmin", "ApellidoAdmin", "correo@admin.com", "contraseñaAdmin");
        espacioComercial espacio = new espacioComercial(1, "EspacioDemo", "TipoDemo", 100, true);
        evento evento = new evento(1, "EventoDemo", 20240315, "Descripción del evento", 1);

        // Asignar el evento al espacio comercial
        List<evento> eventosEspacio = new ArrayList<>();
        eventosEspacio.add(evento);
        espacio.setEventos(eventosEspacio);

        // Simular acciones
        comerciante.gestionarProductosServicios();
        admin.asignarEspacios();
        admin.gestionarUsuarios();
        espacio.reservarEspacio();

        // Mostrar detalles del evento y espacio comercial
        evento.obtenerDetalles();
        System.out.println("Estado del espacio después de la reserva:");
        espacio.verificarDisponibilidad();
    }
}
