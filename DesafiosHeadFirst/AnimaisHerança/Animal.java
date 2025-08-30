package DesafiosHeadFirst.AnimaisHerança;

public class Animal {
    private String picture;
    private String food;
    private int hunger;
    private int boundaries[] = new int[2];
    private  int location[] = new int[2];

    public void makeNoise() {

    }

    public void eat(String food) {
        if (food == this.food) {
            hunger += 20;
        }
    }

    public void sleep() {
    }

    public void roam() {
        
    }
}
