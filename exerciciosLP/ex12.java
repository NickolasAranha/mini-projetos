package exerciciosLP;

import java.util.Scanner;
/* 12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento pelo comprador
e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
     Tabela de Código de Condições de Pagamento
     1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
     2 - À Vista no cartão de crédito, recebe 10% de desconto
     3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
     4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10% */
public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o valor do produto: ");
        Double valor = sc.nextDouble();
        System.out.println("Escolha a forma de pagamento: ");
        System.out.println("1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto");
        System.out.println("2 - À Vista no cartão de crédito, recebe 10% de desconto");
        System.out.println("3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros");
        System.out.println("4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");

        System.out.print("Forma: ");
        int codigo = sc.nextInt();
        switch (codigo) {
            case 1:
                valor = valor * 0.85;
                break;
            case 2:
                valor = valor * 0.90;
                break;
            case 4:
                valor = valor + (valor * 0.10);
                break;
        }

        System.out.printf("Valor final a ser pago %.2f", valor);
        sc.close();
        System.out.println("Fim do programa!");
    }
}
