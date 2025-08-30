import java.util.Scanner;

public class Ex1 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[20];
		int contador = 0;
		for (int i=0; i < 20; i++) {
			numeros[i] = sc.nextInt(); // você pode guardar todos os números em um vetor e 
									   //dps cria um outro for só pra imprimir tudo
			
			if (numeros[i] < 0) {
				contador++; //ou contador += 1 ou contador = contador + 1;
			}
		}
		
		for (int j=0; j < 20; j++) {
			if (numeros[j] < 0) {
				System.out.println(numeros[j]); // só imprime se o valor guardado no array na posição de j for negativo
			}
		}
		System.out.println(contador); //imprime o contador;
	}
	
	
}