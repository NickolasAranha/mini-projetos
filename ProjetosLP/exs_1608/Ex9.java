public class Ex9 {
	public static void main(String[] args) {
		double arvore1 = 1.50;
		double arvore2 = 1.10;
		int anos = 0;
		while (arvore1 > arvore2) {
			arvore1 += 0.02;
			arvore2 += 0.03;
			anos++;
		}
		System.out.println(anos);
	}
	
}