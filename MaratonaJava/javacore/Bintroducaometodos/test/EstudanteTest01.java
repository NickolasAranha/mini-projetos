package nickolasaranha.javacore.Bintroducaometodos.test;
import nickolasaranha.javacore.Bintroducaometodos.dominio.Estudante;
import nickolasaranha.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante.name = "Junior";
        estudante.age = 18;
        estudante.gender = 'M';
        impressora.imprimir(estudante);
    }
}
