package nickolasaranha.javacore.Aintroducaoclasses.test;

import nickolasaranha.javacore.Aintroducaoclasses.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.name = "Junior";
        estudante.age = 18;
        estudante.gender = 'M';

        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.gender);

    }
}
