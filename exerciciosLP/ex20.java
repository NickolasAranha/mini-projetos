package exerciciosLP;
import java.util.Scanner;
//19 - Faça um algoritmo que imprima na tela a tabuada de 1 até 10.
//Falta exceções

public class ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bom dia! Digite um número que irei dar sua tabuada: ");
        while(true) {
            System.out.print("Número: ");
            Integer num = sc.nextInt();
            imprimeTabuada(num);
            System.out.println("Deseja tentar novamente? Digite 1 se sim ou qualquer outro caso queira parar");
            if (sc.nextInt() != 1) {
                break;
            }
        }
        sc.close();
        System.out.println("Fim do programa!");
    }

    public static void imprimeTabuada(Integer a) {
        for (int i =1; i <= 10; i++) {
            System.out.println(a + "x" + i + " = " + (a * i));
        }
        System.out.println("------------------");
    }
}
