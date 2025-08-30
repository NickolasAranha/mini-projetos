package nickolasaranha.javacore.Aintroducaoclasses.test;

import nickolasaranha.javacore.Aintroducaoclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Soul";
        professor.age = 15;
        professor.gender = 'M';
        System.out.println(professor.name +", " + professor.age + ", " + professor.gender);
    }
}
