/* Crie um programa para armazenar valores inteiros em duas matrizes quadradas, denominadas A e B, de ordem 2. Em seguida, gerar uma terceira matriz chamada C que é obtida a partir da adição da matriz A e B.	*/
import java.util.Scanner;
public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j = 0;
		int valor = 2;
		int[][] matrizA = new int[valor][valor];
		int[][] matrizB = new int[valor][valor];
		int[][] matrizC = new int[valor][valor];
	


		for(i=0; i < valor; i++) {
			for(j=0; j < valor; j++) {
				System.out.print("Matriz A "+ i + "x" + j + ": ");
				matrizA[i][j] = sc.nextInt();				
			}
		}
		
		for(i=0; i < valor; i++) {
			for(j=0; j < valor; j++) {
				System.out.print("Matriz B "+ i + "x" + j + ": ");
				matrizB[i][j] = sc.nextInt();				
			}
		}
		
		for(i=0; i < valor; i++) {
			for (j=0; j < valor; j++) {
				matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
			}
		}
		
		System.out.print("Valores de A: ");
		for(i=0; i < valor; i++) {
			System.out.println();
			for(j=0; j < valor; j++) {
				System.out.print(matrizA[i][j] + " | ");
			}
		}
		System.out.println();
		System.out.print("Valores de B: ");
		for(i=0; i < valor; i++) {
			System.out.println();
			for(j=0; j < valor; j++) {
				System.out.print(matrizB[i][j] + " | ");
			}
		}
		
		System.out.println();
		System.out.print("Valores de C: ");
		for(i=0; i < valor; i++) {
			for(j=0; j < valor; j++) {
				System.out.print(matrizC[i][j] + " | ");
			}
		}
		
	}
}
