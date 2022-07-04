package Tarea15;

public class DocenteController
{

    private Docente docente[];
    private int contador;

    public DocenteController()
    {
        this.docente = new Docente[2];
        this.contador = 0;
    }

    public Docente[] getDocente()
    {
        return docente;
    }

    public void setDocente(Docente docente)
    {
        this.docente[this.contador++] = docente;
    }
}
