package exerciciosLP;

import java.util.Scanner;

// Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.
public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valor1 = sc.nextBoolean();
        boolean valor2 = sc.nextBoolean();

        if(valor1 && valor2) {
            System.out.println("VERDADEIRO");
        } else {
            System.out.println("Falso");
        }

        sc.close();
        System.out.println("Fim do programa!");
    }
}
