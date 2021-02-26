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
public class CEO {
    private String nombre,num_registro,apellido,nacionalidad,titulo_universitario;
    private int edad,años_experiencia,años_labor;

    public CEO() {
    }
    
    public CEO(String nombre, String num_registro, String apellido, String nacionalidad, String titulo_universitario, int edad, int años_experiencia, int años_labor) {
        this.nombre = nombre;
        this.num_registro = num_registro;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.titulo_universitario = titulo_universitario;
        this.edad = edad;
        this.años_experiencia = años_experiencia;
        this.años_labor = años_labor;
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTitulo_universitario() {
        return titulo_universitario;
    }

    public void setTitulo_universitario(String titulo_universitario) {
        this.titulo_universitario = titulo_universitario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAños_experiencia() {
        return años_experiencia;
    }

    public void setAños_experiencia(int años_experiencia) {
        this.años_experiencia = años_experiencia;
    }

    public int getAños_labor() {
        return años_labor;
    }

    public void setAños_labor(int años_labor) {
        this.años_labor = años_labor;
    }

    @Override
    public String toString() {
        return "CEO{" + "nombre=" + nombre + '}';
    }
    
}
