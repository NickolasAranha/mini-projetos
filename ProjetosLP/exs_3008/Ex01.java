/* Crie um programa para inserir os valores inteiros de uma matriz 4x4. Calcular e imprimir a soma de todos os elementos da matriz*/
import java.util.Scanner;
public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j;
		int valor = 4;
		int[][] matriz = new int[valor][valor];
		
		System.out.println("Adicione os valores da matriz: ");
		for( i=0; i < valor; i++) {
			for (j = 0; j < valor; j++) {
				System.out.print("Matriz "+ i + "x" + j + ": ");
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Valores adicionados: ");
		for(i=0; i<valor; i++) {
			System.out.println();
			for(j=0; j<valor;j++){
				System.out.print(matriz[i][j] + " | ");
			}
		}
		
		

	
	}
}