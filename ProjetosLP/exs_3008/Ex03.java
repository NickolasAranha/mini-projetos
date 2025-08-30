/* Faça um programa que gere uma matrix 8x8 preenchendo com 1 nas células da diagonal principal pra baixo e 0 no resto*/ 
import java.util.Scanner;

public class Ex03{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j;
		int value = 8;
		int[][] matriz = new int[value][value];
		
		for(i = 0; i < value; i++) {
			for(j=0; j < value; j++) {
				
				if(j <= i) {
					matriz[i][j] = 1;
				} else {
					matriz[i][j] = 0;
				}
			}
		}
		
		System.out.print("Matriz: ");
		for(i=0; i<value; i++) {
			System.out.println();
			for(j=0; j<value; j++){
					System.out.print(matriz[i][j]);
			}
		}
	}
}