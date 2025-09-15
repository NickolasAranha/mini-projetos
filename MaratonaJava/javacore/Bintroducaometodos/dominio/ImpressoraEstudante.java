package nickolasaranha.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprimir(Estudante estudante) {
        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.gender);
    }
}
