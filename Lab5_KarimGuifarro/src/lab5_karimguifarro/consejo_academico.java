/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_karimguifarro;


public class consejo_academico {
   private String nombre,num_registro,apellido,cargo,puesto,area_segundotrabajo,cargo_segundotrabajo,nombre_acuerdoU;
   private int cantidad_becados,numerode_personasacargo;

    public consejo_academico() {
    }

    public consejo_academico(String nombre, String num_registro, String apellido, String cargo, String puesto, String area_segundotrabajo, String cargo_segundotrabajo, String nombre_acuerdoU, int cantidad_becados, int numerode_personasacargo) {
        this.nombre = nombre;
        this.num_registro = num_registro;
        this.apellido = apellido;
        this.cargo = cargo;
        this.puesto = puesto;
        this.area_segundotrabajo = area_segundotrabajo;
        this.cargo_segundotrabajo = cargo_segundotrabajo;
        this.nombre_acuerdoU = nombre_acuerdoU;
        this.cantidad_becados = cantidad_becados;
        this.numerode_personasacargo = numerode_personasacargo;
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

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getArea_segundotrabajo() {
        return area_segundotrabajo;
    }

    public void setArea_segundotrabajo(String area_segundotrabajo) {
        this.area_segundotrabajo = area_segundotrabajo;
    }

    public String getCargo_segundotrabajo() {
        return cargo_segundotrabajo;
    }

    public void setCargo_segundotrabajo(String cargo_segundotrabajo) {
        this.cargo_segundotrabajo = cargo_segundotrabajo;
    }

    public String getNombre_acuerdoU() {
        return nombre_acuerdoU;
    }

    public void setNombre_acuerdoU(String nombre_acuerdoU) {
        this.nombre_acuerdoU = nombre_acuerdoU;
    }

    public int getCantidad_becados() {
        return cantidad_becados;
    }

    public void setCantidad_becados(int cantidad_becados) {
        this.cantidad_becados = cantidad_becados;
    }

    public int getNumerode_personasacargo() {
        return numerode_personasacargo;
    }

    public void setNumerode_personasacargo(int numerode_personasacargo) {
        this.numerode_personasacargo = numerode_personasacargo;
    }

    @Override
    public String toString() {
        return "consejo_academico{" + "nombre=" + nombre + '}';
    }
   
}
