import java.util.Scanner;
public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o custo do carro?");
			
		int custo = sc.nextInt();
		int percDistribuidor = 32;
		int percImposto = 41;
		
		custo += (custo / 100) * percDistribuidor)) + ((custo / 100) * percImposto);
		System.out.println(custo);
	}
}
