package exerciciosLP;
import java.util.Scanner;
// 2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("Insira um número: ");
            int a = sc.nextInt();

            if (a % 2 == 0) {
                System.out.print("Seu número é um número par");
            } else {
                System.out.print("Seu número é um número ímpar");
            }

            if(a > 0) {
                System.out.println(" e positivo");
            } else if (a < 0) {
                System.out.println(" e negativo");
            } else {
                System.out.println("e é o número zero");
            }

            System.out.println("Deseja continuar? Digite 1 para sim e 0 para não");
            a = sc.nextInt();

            if (a != 1) {
                return;
            }
            System.out.println();
        }
    }
}
