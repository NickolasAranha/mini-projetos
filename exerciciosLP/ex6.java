package exerciciosLP;
import java.util.Scanner;

//6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        System.out.print("Valor: " + (valor + (valor * 0.05)));

    }
}
