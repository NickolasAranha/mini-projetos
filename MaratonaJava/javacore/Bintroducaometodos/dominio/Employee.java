package nickolasaranha.javacore.Bintroducaometodos.dominio;

import java.util.ArrayList;

public class Employee {
   private String name;
   private int age;
   private ArrayList<Double> salary = new ArrayList();

    public void imprimir() {
        System.out.println("Seu nome: " + name);
        System.out.println("Sua idade: " + age);
        for(int i=0; i < salary.size(); i++) {
            System.out.println((i+1) + " salário: " + salary.get(i));
        }
    }

    public void media() {
        double media = 0;
        for(int i=0; i < salary.size(); i++) {
            media += salary.get(i);
        }
        media /= salary.size();
        System.out.println("A média é: " + media);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary.add(salary);
    }
}
