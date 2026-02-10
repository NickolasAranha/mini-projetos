package exerciciosLP;
import java.util.Scanner;
// 11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seja bem-vindo a Calculadora de Médias da Escola do Rock"); // nome fictício.
        System.out.print("- Você deseja calcular a média de um aluno? (s/n): ");
        while (true) {
            String resp = sc.nextLine();
            if (resp.equalsIgnoreCase("s")) {
                System.out.print("Digite o nome do aluno: ");
                String nome = sc.nextLine();
                imprimeMedia(sc, nome);
                System.out.print("Você deseja calcular a nota de outro aluno? (s/n): ");
            } else {
                break;
            }
        }
        System.out.println("Fim do programa!");
        sc.close();
    }

    public static void imprimeMedia(Scanner sc, String nome) {
        Double media = calculaMedia(sc);
        String status;

        if (media < 7) {
            status = "REPROVADO";
        } else {
            status = "APROVADO";
        }

        System.out.printf("Aluno %s, status: %s. Média: %.1f.%n",nome, status,media);
    }

    public static Double calculaMedia(Scanner sc) {
        Double[] notas = new Double[4];
        Double media = 0.0;
        for (int i=0; i < notas.length; i++) {
            while (true) {
                try {
                    System.out.printf("Digite a " + (i+1) + "a nota: ");
                    notas[i] = Double.valueOf(sc.nextLine().replace(",", "."));
                    if (notas[i] > 10) {
                        throw new RuntimeException("Nota maior que 10");
                    }
                    media += notas[i];
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Erro: Número inválido. Tente novamente.");
                } catch (RuntimeException e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            }
        }

        return media / notas.length;
    }
}

