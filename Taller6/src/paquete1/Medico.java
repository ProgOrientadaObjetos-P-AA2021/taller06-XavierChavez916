/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author xavierchavez
 */
public class Medico {

    private String nomDoctor;
    private String especialidad;
    private double sueldoMensual;

    public Medico(String nombre, String espec, double sueldo) {
        nomDoctor = nombre;
        especialidad = espec;
        sueldoMensual = sueldo;
    }

    public void establecerNomDoctor(String n) {
        nomDoctor = n;
    }

    public void establecerEspecialidad(String n) {
        especialidad = n;
    }

    public void establecerSueldoMensual(double n) {
        sueldoMensual = n;
    }

    public String obtenerNomDoctor() {
        return nomDoctor;
    }

    public String obtenerEspecialidad() {
        return especialidad;
    }

    public double obtenerSueldoMensual() {
        return sueldoMensual;
    }

}
