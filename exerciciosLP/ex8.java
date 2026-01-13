package exerciciosLP;
import java.util.Scanner;
// 8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.
public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();
        int valor3 = sc.nextInt();

        int menor = valor1;
        int maior = valor1;
        if (menor > valor2) {
            menor = valor2;
        } else if (menor > valor3) {
            menor = valor3;
        } else if (maior < valor2) {
            maior = valor2;
        }
    }
}
