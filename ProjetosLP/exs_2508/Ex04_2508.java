import java.util.Scanner;
public class Ex04_2508 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[100];
		int soma = 0;
		
		for (int i=0; i < 100; i++) {
			array[i] = sc.nextInt();
			
			if (i % 2 != 0) {
				soma += array[i];
			}
		}
		System.out.println("Soma: " + soma);
	}
	
}