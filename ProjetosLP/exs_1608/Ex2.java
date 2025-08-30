import java.util.Scanner;
public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual a base do imóvel?");
		System.out.println("Qual a altura do imóvel?");
		
		int base = sc.nextInt();
		int altura = sc.nextInt();
		int area = base * altura;
		System.out.println(area);
	}
}