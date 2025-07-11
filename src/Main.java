import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final GestorCursos gestor = new GestorCursos();
    public static void main(String[] args) {

        int opcion;

        do {
            mostrarMenu();
            opcion = leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1:
                    crearCurso();
                    break;
                case 2:
                    registrarEstudiante();
                    break;
                case 3:
                    gestor.listarEstudiantesPorCurso();
                    break;
                case 0:
                    System.out.println("👋 Saliendo del sistema...");
                    break;
                default:
                    System.out.println("⚠️ Opción inválida.");
            }
        } while (opcion != 0);
    }

    private static void mostrarMenu() {
        System.out.println("\n===== GESTOR DE CURSOS =====");
        System.out.println("1. Crear nuevo curso");
        System.out.println("2. Registrar estudiante");
        System.out.println("3. Ver estudiantes por curso");
        System.out.println("0. Salir");
    }

    private static void crearCurso() {
        System.out.print("Ingrese el nombre del curso: ");
        String nombre = scanner.nextLine();
        System.out.print("Tipo de curso (Presencial/Virtual): ");
        String tipo = scanner.nextLine();
        gestor.crearCurso(nombre.trim(), tipo.trim());
    }

    private static void registrarEstudiante() {
        System.out.print("Nombre del curso: ");
        String nombreCurso = scanner.nextLine();
        System.out.print("Nombre del estudiante: ");
        String nombreEstudiante = scanner.nextLine();
        System.out.print("Correo electrónico: ");
        String correo = scanner.nextLine();
        gestor.registrarEstudiante(nombreCurso.trim(), nombreEstudiante.trim(), correo.trim());
    }

    private static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }


}