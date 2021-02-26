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
public class estudiante {

    private String nombre, num_registro, apellido, carrera, facultad;
    private int clases_cursar;
    private boolean beca, auomovil,deporte;

    public estudiante() {
    }

    public estudiante(String nombre, String num_registro, String apellido, String carrera, String facultad, int clases_cursar, boolean beca, boolean auomovil, boolean deporte) {
        this.nombre = nombre;
        this.num_registro = num_registro;
        this.apellido = apellido;
        this.carrera = carrera;
        this.facultad = facultad;
        this.clases_cursar = clases_cursar;
        this.beca = beca;
        this.auomovil = auomovil;
        this.deporte = deporte;
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

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public int getClases_cursar() {
        return clases_cursar;
    }

    public void setClases_cursar(int clases_cursar) {
        this.clases_cursar = clases_cursar;
    }

    public boolean isBeca() {
        return beca;
    }

    public void setBeca(boolean beca) {
        this.beca = beca;
    }

    public boolean isAuomovil() {
        return auomovil;
    }

    public void setAuomovil(boolean auomovil) {
        this.auomovil = auomovil;
    }

    public boolean isDeporte() {
        return deporte;
    }

    public void setDeporte(boolean deporte) {
        this.deporte = deporte;
    }

    @Override
    public String toString() {
        return "estudiante{" + "nombre=" + nombre + '}';
    }
    
}
