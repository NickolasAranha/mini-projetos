package nickolasaranha.javacore.Bintroducaometodos.test;

import nickolasaranha.javacore.Bintroducaometodos.dominio.Calculator;

import java.util.Scanner;

public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.print("Soma: ");
        calculator.somaDoisNumeros(x, y);
        System.out.print("Subtrai: ");
        calculator.subtraiDoisNumeros(x, y);
        System.out.print("Multiplica: ");
        calculator.multiplicaDoisNumeros(x, y);
        System.out.print("Divide: ");
        double z = calculator.divideDoisNumeros(x, y);
        System.out.println(z);

    }
}
