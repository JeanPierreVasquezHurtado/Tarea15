package Tarea15;

import java.util.Date;

public class Alumno extends Persona{

    private int codigo;


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void listarAl(){
        System.out.println("----Alumno----");
        System.out.println("Nombres: "+getNombres());
        System.out.println("Apellidos: "+getApellidos());
        System.out.println("DNI: "+getDni());
        System.out.println("Fecha de Nacimiento: "+getFechaNacimiento());
        System.out.println("Codigo: "+getCodigo());
        System.out.println("Edad: ");
        System.out.println(" ");

    }



    @Override
    public Date calcularEdad() {

        return null;
    }
}
