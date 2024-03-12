/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebadeconcepto;

/**
 *
 * @author diazs
 */
public class transaccionFinanciera {
    private int idTransaccion;
    private int fecha;
    private float monto;
    private int idComerciante;
    private int idCliente;

    // Constructor
    public transaccionFinanciera(int idTransaccion, int fecha, float monto, int idComerciante, int idCliente) {
        this.idTransaccion = idTransaccion;
        this.fecha = fecha;
        this.monto = monto;
        this.idComerciante = idComerciante;
        this.idCliente = idCliente;
    }

    // Getters y Setters
    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public int getIdComerciante() {
        return idComerciante;
    }

    public void setIdComerciante(int idComerciante) {
        this.idComerciante = idComerciante;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    // Método para registrar la transacción
    public void registrarTransaccion() {
        // Lógica para registrar la transacción en la base de datos u otro almacenamiento
        System.out.println("Transacción registrada con éxito.");
    }

    // Método para generar informe financiero
    public void generarInformeFinanciero() {
        // Lógica para generar un informe financiero basado en las transacciones
        System.out.println("Informe financiero generado correctamente.");
    }

    // Otros métodos según sea necesario
}

