import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestorCursos {

    private Map<String, Curso> cursos;

    public GestorCursos() {
        cursos = new HashMap<>();
    }

    public void crearCurso(String nombre, String tipo) {
        if (cursos.containsKey(nombre)) {
            System.out.println("El curso ya existe.");
            return;
        }

        Curso curso;
        switch (tipo.toLowerCase()) {
            case "presencial":
                curso = new CursoPresencial(nombre);
                break;
            case "virtual":
                curso = new CursoVirtual(nombre);
                break;
            default:
                System.out.println("Tipo de curso inválido.");
                return;
        }

        cursos.put(nombre, curso);
        System.out.println("Curso creado con éxito.");
    }

    public void registrarEstudiante(String nombreCurso, String nombreEstudiante, String correo) {
        Curso curso = cursos.get(nombreCurso);
        if (curso == null) {
            System.out.println("El curso no existe.");
            return;
        }
        curso.registrarEstudiante(new Estudiantes(nombreEstudiante, correo));
        System.out.println("Estudiante registrado.");
    }

    public void listarEstudiantesPorCurso() {
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos creados.");
            return;
        }

        for (Curso curso : cursos.values()) {
            System.out.println("Curso: " + curso.getNombre() + " (" + curso.getTipo() + ")");
            List<Estudiantes> estudiantes = curso.getEstudiantes();
            if (estudiantes.isEmpty()) {
                System.out.println("   - No hay estudiantes registrados.");
            } else {
                for (Estudiantes est : estudiantes) {
                    System.out.println("   - " + est);
                }
            }
        }
    }
}
