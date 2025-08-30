package DesafiosHeadFirst.BatalhaNaval;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private int[] cell = new int[7];
    private int numOfHits;
    private boolean continueGame = true;
    Random r = new Random();
    Scanner sc = new Scanner(System.in);

    public void createStartup() {
    int position = r.nextInt(4) + 1;
        for(int i=0; i <= 2; i++) {
            cell[position] = 1;
            position++;
        }
    }

    public void shootPosition(int shoot) {
        shoot--;
        if (cell[shoot] == 1) {
            numOfHits++;
            System.out.print("Você acertou! ");
            cell[shoot] = 0;
        } else {
            System.out.print("Errou ");
        }

        if (numOfHits == 3 || numOfHits == 6 || numOfHits == 9) {
            System.out.print("Você abateu uma Startup!");
        }
        System.out.println();
    }

    public int getNumOfHits() {
        return numOfHits;
    }

    public boolean getContinueGame() {
        return continueGame;
    }

    public void setContinueGame() {
        if (numOfHits == 3) {
            continueGame = false;
        }
    }
}

