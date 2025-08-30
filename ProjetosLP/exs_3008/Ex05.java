/* Crie um programa em Linguagem Java que armazene dados inteiros em uma matriz de ordem 5 e imprima todos os elementos que se encontram em posições cuja linha mais coluna formem um número par.*/
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j;
		int value = 5;
		int[][] matriz = new int[value][value];
		
		for(i = 0; i < value; i++) {
			for(j=0; j < value; j++) {
				System.out.print("Matriz " + i + " x " + j + ": ");
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Valores: ");
		for(i=0; i < value; i++) {
			for(j=0; j < value; j++) {
				
				if((i+j) % 2 == 0) {
					System.out.print(matriz[i][j] + " | ");
				}
			}
		}
		
		}
		}
	
