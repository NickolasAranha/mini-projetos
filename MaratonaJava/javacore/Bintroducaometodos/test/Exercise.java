package nickolasaranha.javacore.Bintroducaometodos.test;
import nickolasaranha.javacore.Bintroducaometodos.dominio.Employee;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Employee empregado = new Employee();
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é o seu nome: ");
        empregado.setName(sc.nextLine());

        System.out.print("Qual é a sua idade: ");
        empregado.setAge(sc.nextInt());

        System.out.print("Qual foi seu primeiro salário: ");
        empregado.setSalary(sc.nextDouble());
        System.out.print("Qual foi seu segundo salário: ");
        empregado.setSalary(sc.nextDouble());

        System.out.print("Qual foi seu terceiro salário: ");
        empregado.setSalary(sc.nextDouble());

        System.out.println("________________________");
        empregado.imprimir();
        System.out.println("________________________");
        empregado.media();

    }
}
