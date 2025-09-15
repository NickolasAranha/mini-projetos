package DesafiosHeadFirst.Sobrecarga;

public class Overload {

    public int addNums (int a, int b) {
        return a + b;
    }

    // Por mais que seja o mesmo do metodo, como ele recebe outros argumentos e retorna outro número acaba sendo que são metodos diferentes com o mesmo nome
    public double addNums(double a, double b) {
        return a + b;
    }
}
