package nickolasaranha.introducao;

public class Aula08ArraysMultiDImensionais02 {
    public static void main (String[] args) {
        int[][] arrayInt = new int[3][];

        for (int i = 0; i < arrayInt.length; i++) {
            for (int j=0; j < arrayInt[i].length; j++) {
                System.out.println(arrayInt[i][j] + " ");
            }
        }
    }
}
