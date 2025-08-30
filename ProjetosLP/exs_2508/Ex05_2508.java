import java.util.Scanner;
public class Ex05_2508 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[50];
		
		for(int i=0; i < 50; i++) {
			array[i] = sc.nextInt();
		}
		
		for(int numero : array) {
			if (numero > 0) {
				System.out.print(numero);
			}
		}
	}

}