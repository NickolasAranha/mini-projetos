package exerciciosLP;

/* 18 - Francisco tem 1,10m e cresce 3 centímetros por ano, enquanto Sara tem 1,50m e cresce 2 centímetros por ano.
Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Francisco seja maior que Sara.
 */

public class ex18 {
    public static void main(String[] args) {
        int i;
        Double heightFrancisco = 1.10;
        Double heightMaria = 1.50;

        for(i=0; heightFrancisco <= heightMaria;) {
            heightFrancisco += 0.03;
            heightMaria += 0.02;
            i++;
        }
        System.out.println("Serão necessários " + i + " anos para que Francisco seja maior que Sara");
        System.out.printf("Altura de Francisco no fim: %.2f\n", heightFrancisco);
        System.out.printf("Altura de Maria no fim: %.2f",heightMaria);
    }
}
