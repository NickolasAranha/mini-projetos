package exerciciosLP;

import java.util.Random;
import java.util.Scanner;

//21 - Faça um algoritmo que mostre um valor aleatório entre 0 e 100.
//Falta exceções

public class ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Gerador de números aleatórios! ");

        while(true) {
            System.out.println("Novo número: " + r.nextInt(101));
            System.out.print("Deseja gerar outro número? Digite 1 se sim ou outro caso não queira: ");
            if(sc.nextInt() != 1) {
                break;
            }
        }
        sc.close();
    }
}
