package nickolasaranha.javacore.Bintroducaometodos.test;

import nickolasaranha.javacore.Bintroducaometodos.dominio.Calculator;

import java.util.Scanner;

public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        calculator.somaDoisNumeros(x, y);

    }
}
