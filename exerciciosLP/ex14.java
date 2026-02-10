package exerciciosLP;

import java.util.InputMismatchException;
import java.util.Scanner;

//14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.
public class ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a,b;

        while (true) {
            try {
                System.out.print("Insira o valor A: ");
                a = Integer.valueOf(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Insira um número inteiro, tente novamente!");
            }
        }


        while (true) {
            try {
                System.out.print("Insira o valor B: ");
                b = Integer.valueOf(sc.nextLine());
                break;
            } catch (NumberFormatException e ) {
                System.out.println("Insira um número inteiro, tente novamente!");
            }
        }

        System.out.println();
        imprimeValores("antes", a, b);
        int c;
        c = a;
        a = b;
        b = c;
        imprimeValores("depois", a, b);
        System.out.println("Fim do programa!");
        sc.close();
    }

    public static void imprimeValores(String texto, int a, int b) {
        System.out.println("Valor de A " + texto + ":" + a);
        System.out.println("Valor de B " + texto + ":" + b);
        System.out.println("-------------------------------");
    }
}
