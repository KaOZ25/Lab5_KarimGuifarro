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
public class tutores extends estudiante{
    private String clases_tutorias;
    private boolean tutor_lab;

    public tutores() {
    }

    public tutores(String clases_tutorias, boolean tutor_lab, String nombre, String num_registro, String apellido, String carrera, String facultad, int clases_cursar, boolean beca, boolean auomovil, boolean deporte) {
        super(nombre, num_registro, apellido, carrera, facultad, clases_cursar, beca, auomovil, deporte);
        this.clases_tutorias = clases_tutorias;
        this.tutor_lab = tutor_lab;
    }
    public String getClases_tutorias() {
        return clases_tutorias;
    }

    public void setClases_tutorias(String clases_tutorias) {
        this.clases_tutorias = clases_tutorias;
    }

    public boolean isTutor_lab() {
        return tutor_lab;
    }

    public void setTutor_lab(boolean tutor_lab) {
        this.tutor_lab = tutor_lab;
    }

    @Override
    public String toString() {
        return "tutores{" + "clases_tutorias=" + clases_tutorias + ", tutor_lab=" + tutor_lab + '}';
    }
    
}
