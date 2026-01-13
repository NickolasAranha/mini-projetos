package exerciciosLP;
import java.util.Scanner;
// 8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.
public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();
        int valor3 = sc.nextInt();
        int maior = 0;
        int meio = 0;
        int menor = 0;


        if(valor1 > valor2 && valor1 > valor3) {
            maior = valor1;
            if(valor2 < valor3) {
                menor = valor2;
                meio = valor3;
            } else {
                menor = valor3;
                meio = valor2;
            }
        } else if (valor2 > valor1 && valor2 > valor3) {
            maior = valor2;
            if(valor1 > valor3) {
                meio = valor1;
                menor = valor3;
            } else {
                meio = valor3;
                maior = valor1;
            }
        } else {
            maior = valor3;
            if (valor1 > valor2) {
                meio = valor1;
                menor = valor2;
            } else {
                meio = valor2;
                menor = valor1;
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Meio: " + meio);
        System.out.println("Menor: " + menor);



    }
}