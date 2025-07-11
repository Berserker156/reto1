public class CursoPresencial extends Curso {

    public CursoPresencial(String nombre) {
        super(nombre);
    }

    @Override
    public String getTipo() {
        return "Presencial";
    }
}
