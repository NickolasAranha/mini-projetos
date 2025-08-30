import java.util.Scanner;
public class Ex2_2508 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array1 = new int[15];
		int[] array2 = new int[15];
		
		for(int i=0; i < 15; i++) {
			array1[i] = sc.nextInt();
		}
		
		for(int i=0; i < 15; i++) {
			array2[i] = array1[i] * 3;
		}
		
		System.out.println("Vetor 1: ");
		for(int i=0; i < 15; i++) {
			System.out.print(array1[i] + " ");
		}
		
		System.out.println("Vetor 2: ");
		for(int i=0; i < 15; i++) {
			System.out.print(array2[i] + " ");
		}
	}
	
}	