package DesafiosHeadFirst.JogoAdivinhação;

import java.util.Random;

public class Game {
    Player p1;
    Player p2;
    Player p3;
    Random rand = new Random();
    public void playGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        int targetNumber = rand.nextInt(10);

        while (true) {
            boolean p1Guess = p1.guess(targetNumber, rand);
            boolean p2Guess = p2.guess(targetNumber, rand);
            boolean p3Guess = p3.guess(targetNumber, rand);
            System.out.println("Os valores sorteados em ordem númerica são: " + p1.getNumber() + " " + p2.getNumber() + " " + p3.getNumber());

            if (p1.getNumber() == targetNumber || p2.getNumber() == targetNumber || p3.getNumber() == targetNumber) {
                System.out.println("Temos um vencedor, vamos ver quem é...");
                System.out.println("É o p1? " + p1Guess);
                System.out.println("É o p2? " + p2Guess);
                System.out.println("É o p3? " + p3Guess);
                System.out.println("O jogo acabou!");
                break;
            } else {
                System.out.println("Não temos um ganhador, sorteie novamente!");
            }
        }
    }
}
