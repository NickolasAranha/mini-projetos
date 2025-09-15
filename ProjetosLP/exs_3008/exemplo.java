import java.util.Scanner;
public class exemplo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next(); //1
		char[] nameChar = name.toCharArray(); // 2
			int contador = 0;
	
		//lê abaixo: para cada posição do nameChar atribua o valor dela a letra
		for (char letra : nameChar) {
			contador++;
		}
		System.out.print("Número de letras: " + contador);
	}
}