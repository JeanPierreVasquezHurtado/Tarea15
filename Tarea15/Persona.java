package Tarea15;

import java.util.Date;

public abstract class Persona {
    protected String nombres;
    protected int dni;
    protected String apellidos;
    protected Date fechaNacimiento;

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombres() {
        return nombres;
    }

    public int getDni() {
        return dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public abstract Date calcularEdad();
}
