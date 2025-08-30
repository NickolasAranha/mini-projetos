package nickolasaranha.introducao;
import java.util.Scanner;
public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean

        char initial = 'N';
        int age = (int) 18000000000L;
        long numeroExtenso = 10000L;
        double tax = 20.00F;
        float salary = (float) 2500.0D;
        byte agebyte = 10;
        short ageShort = 10;
        boolean bornInBrazil = true;
        String nome = "Goku";


        System.out.println("A inicial do empregado é " + initial + ", ele tem " + age + ", seu salário bruto é de " + salary + " e " + (salary - tax) + " líquido.");
        // ou //

        System.out.println("A inicial é " + initial);
        System.out.println("A idade é " + age + " anos");
        System.out.println("Oi meu nome é " + nome);











    }
}
