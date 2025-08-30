/* Crie um programa para armazenar os valores Os e 1s em uma matriz quadrada de ordem 3. Em seguida verificar se a matriz é uma matriz identidade.
Obs: uma matriz identidade é aquela em que os elementos da diagonal principal são iguais a 1 e os demais elementos são iguais a zero.*/
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = 3;
		int[][] matriz = new int[value][value];
		int contador0 = 0;
		int contador1 = 0; 
		for(int i = 0; i < value; i++) {
			for(int j = 0; j < value; j++) {
			System.out.print("Matriz " + (i+1) + "x" + (j+1) + ": ");
			int valor = sc.nextInt();
			while(valor != 0 && valor != 1) {
				System.out.print("Valor errado, insira 0 ou 1: ");
				valor = sc.nextInt();
			}
			matriz[i][j] = valor;
			}
		}
		
		for(int i=0; i < value; i++) {
			for(int j=0; j < value; j++) {
				if (i == j) {
					if (matriz[i][j] == 1) { 
					contador1++;
					}
				} else {
					if (matriz[i][j] == 0) {
						contador0++;
					}
				}
			}
		}
		
		if(contador1 == value && contador0 == (value * value) - value) {
			System.out.println("É Matriz identidade");
		} else {
			System.out.print("Não é matriz identidade");
		}
	}
}