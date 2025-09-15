public class Ex08 {
	public static void main(String[] args) {
		int value = 3;
		int[][][] matriz3d = new int[value][value][value];
		int somaPar = 0;
		int somaImpar = 0;
		
		for(int i=0; i < matriz3d.length; i++) {
			for(int j=0; j < matriz3d.length; j++) {
				for(int z=0; z < matriz3d.length; z++) {
					matriz3d[i][j][z] = i + j + z;
				}
			}
		}
		for(int i=0; i < matriz3d.length; i++) {
			for(int j=0; j < matriz3d.length; j++) {
				for(int z=0; z < matriz3d.length; z++) {
					if (matriz3d[i][j][z] % 2 == 0) {
						somaPar += matriz3d[i][j][z];
					} else {
						somaImpar += matriz3d[i][j][z];
					}
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
		System.out.println("Valores da Soma de Par: " + somaPar);
		System.out.println("Valores da Soma de Impar: " + somaImpar);
	}
}