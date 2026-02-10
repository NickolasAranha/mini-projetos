package exerciciosLP;
import java.util.Scanner;

    /*
    21 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor. As informações fornecidas serão:
    valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS.
    Imprima na tela o salário líquido final.
    */

//Falta exceções

public class ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double valueHour = sc.nextDouble();
        Integer numClasses = sc.nextInt();
        Integer percDesc = sc.nextInt();
        Double salary = (valueHour * numClasses);
        salary-= ((salary / 100) * percDesc);

        System.out.println(salary);
        sc.close();
    }
}
