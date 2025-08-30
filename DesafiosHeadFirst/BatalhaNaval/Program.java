package DesafiosHeadFirst.BatalhaNaval;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Game game = new Game();
        Scanner sc = new Scanner(System.in);
        int numOfGuesses = 0;
        game.createStartup();

        while (game.getContinueGame()) {
                System.out.print("Por favor chute um número de 1 a 7: ");
                int guessNum = sc.nextInt();
                while (guessNum > 7 || guessNum < 0) {
                    System.out.println("Número acima de 7 ou menor que 0, chute um número válido: ");
                    guessNum = sc.nextInt();
                }
            game.shootPosition(guessNum);
            numOfGuesses++;
            System.out.println();
            game.setContinueGame();
        }
        System.out.println("Oh, você terminou o jogo e foi necessário: " + numOfGuesses + " acertos");
    }
}
