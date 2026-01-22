package exerciciosLP;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// 10_2 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas. Mesmo desafio, mas outra forma de realizar.
public class ex10_2 {
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Digite a primeira nota: ");
                notas.add(Double.valueOf(sc.nextLine().replace(",", ".")));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Número inválido. Tente novamente.");
            }
        }

        while (true) {
            System.out.print("Você deseja digitar outra nota? (s/n): ");
            String resp = sc.nextLine();
            if (resp.equalsIgnoreCase("s")) {
                while (true) {
                    try {
                        System.out.print("Digite a próxima nota: ");
                        notas.add(Double.valueOf(sc.nextLine().replace(",", ".")));
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Número inválido. Tente novamente.");
                    }
                }
            } else {
                break;
            }
        }

        double media = (notas.stream().mapToDouble(Double::doubleValue).sum()) / notas.size();
        System.out.printf("Média: %.1f", media);

        sc.close();
    }
}