package cursoNelio.files.application.writer;

import java.io.File;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);
        System.out.println("getName: " + path.getName()); // somente nome
        System.out.println("getParent: " + path.getParent()); //somente caminho
        System.out.println("getPath: " + path.getPath());
    }
}
