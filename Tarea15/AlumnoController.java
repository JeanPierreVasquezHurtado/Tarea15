package Tarea15;

public class AlumnoController implements Crud
{
    private Alumno alumno [];
    private int contado;

    public AlumnoController(int size)
    {
        this.alumno = new Alumno[size];
        this.contado = 0;
    }

    public Alumno[] getAlumno()
    {
        return alumno;
    }

    public void setAlumno(Alumno alumno)
    {
        this.alumno[this.contado++] = alumno;
    }
    @Override
    public void create()
    {
        this.alumno[this.contado++] = new Alumno();
    }
    @Override
    public  void read()
    {
        for (Alumno a: this.alumno){
            a.listarAl();
        }
    }
    @Override
    public int update(int dni)
    {

    return 0;}

    @Override
    public int delete(int dni)
    {

    return 0;}

}