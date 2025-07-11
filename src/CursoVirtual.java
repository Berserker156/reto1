public class CursoVirtual extends Curso{

    public CursoVirtual(String nombre) {
        super(nombre);
    }

    @Override
    public String getTipo() {
        return "Virtual";
    }
}
