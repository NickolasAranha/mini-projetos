package DesafiosHeadFirst.AnimaisHerança;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[4];
        int[] array2 = new int[4];

        for(int i=0; i < 4; i++) {
            array[i] = sc.nextInt();
            array2[i] = array[i] * 3;
        }

        for(int numero : array) {
            System.out.println(numero);
        }

        for(int numero : array2) {
            System.out.println(numero);
        }

    }

}
