package exerciciosLP;
import java.util.Scanner;
// 1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Insira três números: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println("Soma: "  + (a+b));

            if (c > (a+b)) {
                System.out.println("Soma: "  + (a+b));
                System.out.println("A soma entre " + a + " e " + b + " é menor que " + c);
            }

            System.out.print("Deseja continuar? Digite 1 para sim e 0 para não");
            a = sc.nextInt();

            if (a != 1) {
                return;
            }
        }
    }
}
