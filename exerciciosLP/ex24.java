package exerciciosLP;
import java.util.Scanner;
/*
  Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem, sabendo que o carro faz 12 km por litro.
  O usuário deve informar o tempo gasto na viagem e a velocidade média.
  O algoritmo deve calcular e exibir a distância percorrida e a quantidade de litros utilizados.
 */

//Falta exceções
public class ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora de litros e distância!");
        while(true) {
            System.out.print("Insira o tempo que durou a viagem em minutos: ");
            Integer time = sc.nextInt();
            System.out.print("Insira a velocidade média que o carro estava na viagem: ");
            Integer speed = sc.nextInt();
            calcular(time, speed);

            System.out.print("Deseja inserir novos valores? Se sim digite 1 ou digite qualquer outro caso deseja fechar");
            if (sc.nextInt() != 1) {
                break;
            }
        }

        System.out.println("Fim do programa!");
        sc.close();
    }

    public static void calcular(Integer tempo, Integer velocidade) {
        Integer distancia = tempo * velocidade;
        Double quantidadeLitros = (double) distancia / 12;
        System.out.println("Distância: " + distancia);
        System.out.print("Quantidade de litros utilizados: " + quantidadeLitros);


    }
}

