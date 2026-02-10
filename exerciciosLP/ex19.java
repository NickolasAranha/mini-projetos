package exerciciosLP;
//19 - Faça um algoritmo que imprima na tela a tabuada de 1 até 10.
//Falta exceções

public class ex19 {
    public static void main(String[] args) {
        System.out.println("IMPRESSORA DE TABUADA: ");

        for(int i=1;i <= 10; i++) {
            System.out.println("TABUADA DO " + i + ":");
            for(int j=1; j<= 10; j++) {
                System.out.println(i + "x" + j + " = " + (i * j));
            }
            System.out.println("-------------");
        }
        System.out.println("Fim do programa!");
    }
}
