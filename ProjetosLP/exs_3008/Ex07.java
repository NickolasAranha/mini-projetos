import java.util.Scanner;
public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = 3;
		int[][][] matriz3d = new int[value][value][value];
		
		for(int i=0; i < matriz3d.length; i++) {
			for(int j=0; j < matriz3d.length; j++) {
				for(int z=0; z < matriz3d.length; z++) {
					System.out.print("[" + i + "]" + "[" + j + "]" + "[" + z + "]=");							
					matriz3d[i][j][z] = sc.nextInt();

				}
			}
		}		

		
		for(int i=0; i < matriz3d.length; i++) {
			for(int j=0; j < matriz3d.length; j++) {
				for(int z=0; z < matriz3d.length; z++) {
					System.out.print("[" + i + "]" + "[" + j + "]" + "[" + z + "]=" + matriz3d[i][j][z] + " | ");
				}
				System.out.println();
			}
			System.out.println();

		}
		
	}
}