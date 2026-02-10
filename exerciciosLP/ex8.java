package exerciciosLP;
import java.util.Scanner;
// 8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.
public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int maior = 0;
        int meio = 0;
        int menor = 0;

        if(a > b && a > c) {
            maior = a;
            if(b < c) {
                menor = b;
                meio = c;
            } else {
                menor = c;
                meio = b;
            }
        } else if (b > a && b > c) {
            maior = b;
            if(a > c) {
                meio = a;
                menor = c;
            } else {
                meio = c;
                menor = a;
            }
        } else {
            maior = c;
            if (a > b) {
                meio = a;
                menor = b;
            } else {
                meio = b;
                menor = a;
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Meio: " + meio);
        System.out.println("Menor: " + menor);

        sc.close();
        System.out.println("Fim do programa!");
    }
}