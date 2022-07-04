package Tarea15;

public class Main {
    public static void main(String[] args) {
        Alumno alum1 = new Alumno();
        alum1.setCodigo(9567814);
        alum1.setNombres("Jean Pierre");
        alum1.setApellidos("vasquez Hurtado");
        alum1.setDni(71240978);



        Alumno alum2 = new Alumno();
        alum2.setCodigo(8765456);
        alum2.setNombres("Rody");
        alum2.setApellidos("Velasquez Acosta");
        alum2.setDni(8764569);


        Docente doc1 = new Docente();
        doc1.setGrado("4to anio Secundaria");
        doc1.setTitulo("Maestria");
        doc1.setNombres("Juan");
        doc1.setApellidos("Valverde Casas");
        doc1.setDni(58762539);

        Docente doc2 = new Docente();
        doc2.setTitulo("Doctorado, Maestria");
        doc2.setGrado("5to anio Secundaria");
        doc2.setNombres("Pedro");
        doc2.setApellidos("Garcia Moron");
        doc2.setDni(86447923);

        DocenteController doccentee = new DocenteController();

        AlumnoController alumnoo = new AlumnoController(2);

        doccentee.setDocente(doc1);
        doccentee.setDocente(doc2);

        alumnoo.setAlumno(alum1);
        alumnoo.setAlumno(alum2);

        for(Alumno alu: alumnoo.getAlumno()){
            System.out.println("----Alumno----");
            System.out.println("Nombres: "+alu.getNombres());
            System.out.println("Apellidos: "+alu.getApellidos());
            System.out.println("DNI: "+alu.getDni());
            System.out.println("Fecha de Nacimiento: "+alu.getFechaNacimiento());
            System.out.println("Codigo: "+alu.getCodigo());
            System.out.println("Edad: ");
            System.out.println(" ");
        }
        for (Docente doce: doccentee.getDocente()){
            System.out.println("----Docente----");
            System.out.println("Nombres: "+doce.getNombres());
            System.out.println("Apellidos: "+doce.getApellidos());
            System.out.println("DNI: "+doce.getDni());
            System.out.println("Fecha de Nacimiento: "+doce.getFechaNacimiento());
            System.out.println("Grado: "+doce.getGrado());
            System.out.println("Titulo: "+doce.getTitulo());
            System.out.println("Edad: ");
            System.out.println(" ");
        }
        AlumnoController alumnoController = new AlumnoController(1);

        alumnoController.create();

        alumnoController.read();

    }
}
