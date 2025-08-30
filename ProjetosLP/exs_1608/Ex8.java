import java.util.Scanner;
public class Ex8 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int contador = 0;
	int soma = 0;
	while (contador < 100) {
		int num = sc.nextInt;
		if (num % 2 == 0) {
			soma += num;
		}
		contador++;
	}
	System.out.println(soma);
	}
}