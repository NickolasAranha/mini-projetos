import java.util.Scanner;
public class Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual a sua altura?");
		System.out.println("Qual o seu gen? 1 - Masc; 2 - Fem");		
		double altura = sc.nextDouble();
		int sexo = sc.nextInt();
		double pesoIdeal = 0;
		if (sexo == 1) {
			pesoIdeal = (72.7 * altura) - 58;
		} else {
			pesoIdeal = (62.1 * altura) - 44.7;
		}
		System.out.println(pesoIdeal);
	}
}