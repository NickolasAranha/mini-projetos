package exerciciosLP;

import java.util.InputMismatchException;
import java.util.Scanner;

// 13 - Faça algoritmo que leia o nome e a idade de uma pessoa e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.
public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer age;
        String texto;

        System.out.println("Seja bem-vindo!");
        System.out.print("Por favor insira seu nome: ");
        String name = sc.nextLine();

        System.out.print("Por favor insira sua idade: ");
        while (true) {
            try {
                age = Integer.valueOf(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        if (age < 18) {
            texto = "menor de idade";
        } else {
            texto = "maior de idade";
        }

        System.out.printf("%s tem " + age + " anos e é %s", name, texto);
        System.out.println("Fim do programa!");
    }
}
