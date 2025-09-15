import java.util.Scanner;
public class ContaEspacos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(sc.nextLine());
		int contador = 0;
		for(int i=0; i < sb.length(); i++) {
			if(sb.charAt(i) == ' ') {
				contador++;
			}
		}		
		System.out.print("Existem " + contador + " palavras");
	}

}