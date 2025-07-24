package DesafiosHeadFirst.JogoAdivinhação;
import java.util.Random;
public class Player {
   private int number;

    public boolean guess(int targetNumber, Random rand) {
        number = rand.nextInt(10);
        if (number == targetNumber) {
            return true;
        }
        else {
            return false;
        }
    }

    public int getNumber() {
        return number;
    }

}
