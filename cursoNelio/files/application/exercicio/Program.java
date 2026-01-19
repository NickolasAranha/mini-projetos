package cursoNelio.files.application.exercicio;
import java.io.*;

public class Program {
    public static void main(String[] args) {
        File path = new File("c:\\tmp\\in.csv");
        new File(path.getParent() + "//out").mkdir();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                String[] item = line.split(";");
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(path.getParent() + "\\out\\out.csv", true))) {
                    String name = item[1];
                    bw.write(item[0]);
                    bw.write(",");
                    Double value = Double.parseDouble(item[1]) * Double.parseDouble(item[2]);
                    bw.write(String.valueOf(value));
                    bw.newLine();
                }
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
