import java.util.Scanner;
public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x = new int[20];
		int num = 0;
		for(int i=0; i < 20; i++) {
			System.out.println("Digite o número: " + (i+1));
			x[i] = sc.nextInt();
			if (x[i] < 0) {
				num++;
			}
		}
		
		for(int i=0; i<20; i++) {
			if (x[i] < 0) {
				System.out.println(x[i]);
			}
		}
		System.out.println(num);
	}
	}