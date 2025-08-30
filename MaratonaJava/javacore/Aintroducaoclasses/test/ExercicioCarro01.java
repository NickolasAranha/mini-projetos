package nickolasaranha.javacore.Aintroducaoclasses.test;
import nickolasaranha.javacore.Aintroducaoclasses.domain.Carro;

public class ExercicioCarro01 {
    public static void main(String[] args) {
        Carro civic = new Carro();
        civic.marca = "Honda";
        civic.modelo = "Civic";
        civic.ano = 2008;
        civic.cor = "Preto";

        Carro fusca = new Carro();
        fusca.marca = "Volkswagen ";
        fusca.modelo = "Fusca";
        fusca.ano = 1968;
        fusca.cor = "Branco";

        System.out.println("Este é o Civic:");
        System.out.println("Marca e modelo: " + civic.marca + " " + civic.modelo);
        System.out.println("Ano: " + civic.ano);
        System.out.println("Cor: " + civic.cor);
        System.out.println();
        System.out.println("Este é o Fusca: ");
        System.out.println("Marca e modelo: " + fusca.marca + " " + fusca.modelo);
        System.out.println("Ano: " + fusca.ano);
        System.out.println("Cor: " + fusca.cor);

     }
}
