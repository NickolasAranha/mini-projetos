import java.util.Scanner;
public class Ex07_2508 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[30];
		int contador = 0;
		
		for(int i=0; i < 30; i++) {
			int soma = sc.nextInt();
			
			while(soma % 5 != 0) {
				contador++;
				soma = sc.nextInt();
			}
			array[i] = soma;
		}
		
		System.out.print("Valores do Array: ");
		for(int vetor : array) {
			System.out.print(vetor + " ");
		}
		
		if(contador != 0) {
			System.out.println("O usuario digitou " + contador + " vezes números que não são divisíveis por 5");
		}
	}
}