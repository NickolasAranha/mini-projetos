import java.util.Scanner;
public class Ex5 {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int idade = sc.nextInt();
	 System.out.println("Qual a sua idade?");

	 String texto = "";
	 
	 if(idade < 16) {
		 texto = "Não pode votar";
	 } else if (idade < 18) {
		 texto = "Voto opcional";
	 } else if (idade < 65) {
		texto = "Voto obrigatório";
	 } else {
		 texto = "Voto opcional";
	 }
	 
	 System.out.println(texto);
 } 
}