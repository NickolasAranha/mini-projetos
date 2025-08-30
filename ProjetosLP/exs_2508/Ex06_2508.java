import java.util.Scanner;
public class Ex06_2508 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array1 = new int[20];
		int[] array2 = new int[20];
		int mediador = 0;
		
		for(int i=0; i < 20; i++) {
			array1[i] = sc.nextInt();
		}

		for(int i=0; i < 20; i++) {
			array2[i] = sc.nextInt();
		}		
		
		System.out.print(" Array A antes: " + Arrays.toString(array1));
		System.out.print(" Array B antes: " + Arrays.toString(array2));
		
		for(int i=0; i < 20; i++) {
			mediador = array1[i];
			array1[i] = array2[19 - i];
			array2[19 - i] = mediador;
		}
		
		System.out.print(" Array A depois: " + Arrays.toString(array1));
		System.out.print(" Array B depois: " + Arrays.toString(array2));

	}
}