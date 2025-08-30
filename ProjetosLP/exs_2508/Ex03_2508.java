import java.util.Scanner;
public class Ex03_2508 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[50];
		int maior = 0;
		
		for (int i=0; i < 50; i++) {
			array[i] = sc.nextInt();
			
			if(array[i] > maior) {
				maior = array[i];
			}
		}
	
		System.out.println(maior);
	}

}