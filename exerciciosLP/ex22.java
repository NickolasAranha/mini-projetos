package exerciciosLP;
import java.util.Scanner;

        /*
        22 - Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente e
        o resto da divisão inteira entre eles.
        */

//Falta exceções

public class ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora de Divisão Inteira:");
        while(true) {
            Integer a = sc.nextInt();
            Integer b = sc.nextInt();

            System.out.println("Quociente: " + (a / b));
            System.out.println("Resto: " + (a % b));
            System.out.println();
            System.out.print("Deseja realizar outra divisão? Digite 1 se sim ou outro caso não queira: ");
            if(sc.nextInt() != 1) {
                break;
            }
        }

        sc.close();
    }
}
