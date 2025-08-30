import java.util.Scanner;
public class Ex6 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int computadores = sc.nextInt();
	int resto = computadores % 2;
	String texto = "";
	if(resto != 0) {
		texto = "Número impar de computadores";
	} else {
		texto = "Número par de computadores";
	}
	System.out.println(texto);
}
}