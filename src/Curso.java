import java.util.ArrayList;
import java.util.List;

abstract class Curso {

    protected String nombre;
    protected List<Estudiantes> estudiantes;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void registrarEstudiante(Estudiantes estudiante) {
        estudiantes.add(estudiante);
    }

    public List<Estudiantes> getEstudiantes() {
        return estudiantes;
    }

    public abstract String getTipo();
}
