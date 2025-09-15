package nickolasaranha.javacore.Bintroducaometodos.dominio;

public class Calculator {
    public void somaDoisNumeros(int x, int y) {
        int z = x + y;
        System.out.println(z);
    }
    public void subtraiDoisNumeros(int x, int y) {
        int z = x - y;
        System.out.println(z);
    }

    public void multiplicaDoisNumeros(int x, int y) {
        int z = x * y;
        System.out.println(z);
    }

    public double divideDoisNumeros(double x, double y) {
        return x / y;
    }
}