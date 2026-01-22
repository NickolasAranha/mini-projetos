package exerciciosLP;

import java.util.InputMismatchException;
import java.util.Scanner;

//  10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.
public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double nota1 = 0.0, nota2 = 0.0, nota3 = 0.0, media = 0.0;

        try {
            System.out.print("Digite a primeira nota: ");
            nota1 = Double.valueOf(sc.nextLine().replace(",", "."));
        } catch (NumberFormatException e) {
            System.out.println("Número Inválido!");
        }

        try {
            System.out.print("Digite a segunda nota: ");
            nota2 = Double.valueOf(sc.nextLine().replace(",", "."));
        } catch (NumberFormatException e) {
            System.out.println("Número Inválido!");
        }

        try {
            System.out.print("Digite a terceira nota: ");
            nota3 = Double.valueOf(sc.nextLine().replace(",", "."));
        } catch (NumberFormatException e) {
            System.out.println("Número Inválido!");
        }

        media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("A média do aluno é %.1f.", media);
    }
}
