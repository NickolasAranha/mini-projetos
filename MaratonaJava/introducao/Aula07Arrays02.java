package nickolasaranha.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, long, float e double = 0
        // char '\u0000' ' '
        // boolean false
        // String null
        String[] names = new String[3];
        names[0] = "Naruto";
        names[1] = "Goku";
        names[2] = "Luffy";

        for (int i=0; i<3; i++) {
            System.out.println(names[i]);
        }

        names = new String[3];
        for (int i=0; i<3; i++) {
            System.out.println(names[i]);
        }


    }
}
