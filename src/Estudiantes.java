public class Estudiantes {

    private String nombre;
    private String correo;

    public Estudiantes(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Correo: " + correo;
    }

}
