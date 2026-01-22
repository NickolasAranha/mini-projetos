package exerciciosLP;
import java.util.InputMismatchException;
import java.util.Scanner;
// 9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição
public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double peso, altura;


            while (true) {
                try {
                    System.out.print("Insira sua altura em metros (Ex: 1,72): ");
                    altura = sc.nextDouble();
                    System.out.print("Insira seu peso em kgs (Ex: 58): ");
                    peso = sc.nextDouble();
                    break;

                } catch (InputMismatchException e) {
                    System.out.println("Erro: Utilize vírgula e digite apenas números");
                    sc.nextLine();
                }
            }

        System.out.println("Seu condição hoje é de " + calcularImc(altura, peso));
        sc.close();
    }

    public static String calcularImc(Double altura, Double peso) {
        String classificação = "";
        Double imc = peso / Math.pow(altura, 2);

        if (imc < 18.5) {
            classificação = "baixo peso";
        } else if (imc < 25) {
            classificação = "peso ideal, parabéns!";
        } else if (imc < 30) {
            classificação = "sobre peso";
        } else if (imc < 35) {
            classificação = "obesidade grau 1";
        } else if (imc < 40) {
            classificação = "obesidade grau 2 (severa)";
        } else {
            classificação = "obsesidade grau 3 (mórbida)";
        }
        return classificação;
    }

}
