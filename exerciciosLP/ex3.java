package exerciciosLP;
import java.util.Scanner;
/*3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
imprimir seu valor na tela.
 */

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Insira dois números iguais: ");
            System.out.print("Primeiro termo: ");
            int a = sc.nextInt();
            System.out.print("Segundo termo: ");
            int b = sc.nextInt();
            int c = 0;

            if (a == b) {
                c = a + b;
                System.out.print("Soma: ");
            } else {
                c = a * b;
                System.out.print("Multiplicação:" );
            }
            System.out.println(c);

            System.out.println("Deseja continuar? Digite 1 para sim e 0 para não");
            a = sc.nextInt();

            if (a != 1) {
                return;
            }
        }
    }
}
