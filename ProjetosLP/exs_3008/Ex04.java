import java.util.Scanner;
public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j;
		int value = 5;
		int[][] matriz = new int[value][value];

		System.out.println("Adicione os valores da matriz: ");
		for(i = 0; i < value; i++) {
			for(j=0; j < value; j++) {
				System.out.print("Matriz "+ i + "x" + j + ": ");
				matriz[i][j] = sc.nextInt();
			}
		}
	
		for(i=0; i < value; i++) {
			for(j=0; j < value; j++) {
				if (i==j) {
					System.out.println(matriz[i][j]);
				}
			}
		} 
		for(i=0; i < value; i++){
			for(j=0; j < value; j++) {	
				if(i+j == value - 1) {
					System.out.print(matriz[i][j] + " ");
				}
			}
		}
	} 	
}