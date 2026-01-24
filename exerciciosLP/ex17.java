package exerciciosLP;

import java.util.Scanner;

/*  17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius.
    Imprima na tela as duas temperaturas. */
public class ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double fahrenheit = 0.0;

        while (true) {
            try {
                fahrenheit = Double.valueOf(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Erro");
            }
        }

        Double celsius = 5 * (fahrenheit - 32) / 9;
        System.out.printf("fahrenheit: %.2f/n", fahrenheit);
        System.out.printf("celsius: %.2f/n ", celsius);
    }
}
