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
public class personal_deplanta {
    private String nombre,num_registro,apellido,cargo,facultad,carrera,clase;

    public personal_deplanta() {
    }
    public personal_deplanta(String nombre, String num_registro, String apellido, String cargo, String facultad, String carrera, String clase) {
        this.nombre = nombre;
        this.num_registro = num_registro;
        this.apellido = apellido;
        this.cargo = cargo;
        this.facultad = facultad;
        this.carrera = carrera;
        this.clase = clase;
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

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    @Override
    public String toString() {
        return "personal_deplanta{" + "nombre=" + nombre + '}';
    }
    
}
