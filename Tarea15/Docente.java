package Tarea15;

import java.util.Date;

public class Docente extends Persona{

    private String grado;
    private String titulo;


    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    @Override
    public Date calcularEdad() {
        return null;
    }
}
