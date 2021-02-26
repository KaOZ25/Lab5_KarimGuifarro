/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_karimguifarro;

/**
 *
 * @author Karim Ozael
 */
public class administrativo {
    private String nombre,num_registro,apellido,cargo,area_asignada,nombre_asistente,nombre_jefe;
    private int cantidad_subordinados;

    public administrativo(String nombre, String num_registro, String apellido, String cargo, String area_asignada, String nombre_asistente, String nombre_jefe, int cantidad_subordinados) {
        this.nombre = nombre;
        this.num_registro = num_registro;
        this.apellido = apellido;
        this.cargo = cargo;
        this.area_asignada = area_asignada;
        this.nombre_asistente = nombre_asistente;
        this.nombre_jefe = nombre_jefe;
        this.cantidad_subordinados = cantidad_subordinados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNum_registro() {
        return num_registro;
    }

    public void setNum_registro(String num_registro) {
        this.num_registro = num_registro;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getArea_asignada() {
        return area_asignada;
    }

    public void setArea_asignada(String area_asignada) {
        this.area_asignada = area_asignada;
    }

    public String getNombre_asistente() {
        return nombre_asistente;
    }

    public void setNombre_asistente(String nombre_asistente) {
        this.nombre_asistente = nombre_asistente;
    }

    public String getNombre_jefe() {
        return nombre_jefe;
    }

    public void setNombre_jefe(String nombre_jefe) {
        this.nombre_jefe = nombre_jefe;
    }

    public int getCantidad_subordinados() {
        return cantidad_subordinados;
    }

    public void setCantidad_subordinados(int cantidad_subordinados) {
        this.cantidad_subordinados = cantidad_subordinados;
    }

    @Override
    public String toString() {
        return "administrativo{" + "nombre=" + nombre + '}';
    }
    
}
