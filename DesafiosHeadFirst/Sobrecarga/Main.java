package DesafiosHeadFirst.Sobrecarga;
import java.util.Scanner;
/* Testes para entender como funciona Sobrecarga*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Overload overload = new Overload();

        int int1 = 10, int2 = 12;
        double double1 = 10.0, double2 = 15.0;

        int sumInt = overload.addNums(int1, int2);
        double sumDouble = overload.addNums(double1, double2);
        System.out.println("Soma dos Ints: " + sumInt);
        System.out.println("Soma dos Doubles: " + sumDouble);
    }
}
