package exerciciosLP;
import java.util.Scanner;
/* Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.621,00). */
public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float salMin = 1612;
        System.out.print("Insira seu salário atual: ");
        float sal = sc.nextFloat();

        float qnts = sal / salMin;
        System.out.println(qnts);

    }
}
