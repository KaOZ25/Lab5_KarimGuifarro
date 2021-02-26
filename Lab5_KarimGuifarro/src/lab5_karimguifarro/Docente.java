/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_karimguifarro;

public class Docente {

    private String nombre, num_registro, apellido, clase_asginda, facultad, area_conocimiento;
    private boolean otra_facultad, clase_lab;

    public Docente() {
    }

    public Docente(String nombre, String num_registro, String apellido, String clase_asginda, String facultad, String area_conocimiento, boolean otra_facultad, boolean clase_lab) {
        this.nombre = nombre;
        this.num_registro = num_registro;
        this.apellido = apellido;
        this.clase_asginda = clase_asginda;
        this.facultad = facultad;
        this.area_conocimiento = area_conocimiento;
        this.otra_facultad = otra_facultad;
        this.clase_lab = clase_lab;
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

    public String getClase_asginda() {
        return clase_asginda;
    }

    public void setClase_asginda(String clase_asginda) {
        this.clase_asginda = clase_asginda;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getArea_conocimiento() {
        return area_conocimiento;
    }

    public void setArea_conocimiento(String area_conocimiento) {
        this.area_conocimiento = area_conocimiento;
    }

    public boolean isOtra_facultad() {
        return otra_facultad;
    }

    public void setOtra_facultad(boolean otra_facultad) {
        this.otra_facultad = otra_facultad;
    }

    public boolean isClase_lab() {
        return clase_lab;
    }

    public void setClase_lab(boolean clase_lab) {
        this.clase_lab = clase_lab;
    }

    @Override
    public String toString() {
        return "Docente{" + "nombre=" + nombre + '}';
    }
    
}
