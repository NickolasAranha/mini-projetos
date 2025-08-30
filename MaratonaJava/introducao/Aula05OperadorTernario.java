package nickolasaranha.introducao;

public class Aula05OperadorTernario {
    public static void main(String[] args) {
        double salario = 5000;
        String mensagemDoar = "";
        String mensagemNaoDoar = "Não tenho dinheiro agora, mas vou conseguir!";
        // condicao ? verdadeiro : falso
        String resultado = salario > 5000 ? "Eu vou doar 500 pro DevDojo" : mensagemNaoDoar;
    }
}
