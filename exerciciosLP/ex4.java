package exerciciosLP;

import java.util.Scanner;

// 4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
public class ex4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int a = sc.nextInt();
        System.out.println("Antecessor: " + (a-1));
        System.out.println("Valor inserido: " + a);
        System.out.println("Sucessor: " + (a+1));

        System.out.println("Deseja continuar? Digite 1 para sim e 0 para não");
        a = sc.nextInt();

        if (a != 1) {
            System.out.println("Encerrando sessão!");
            return;
        }
    }
}
