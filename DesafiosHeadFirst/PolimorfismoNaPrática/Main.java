package DesafiosHeadFirst.PolimorfismoNaPrática;
//Criar um ArrayList só que a mão para guardar DOG.
public class Main {
    public static void main(String[] args) {
        MyAnimalList list = new MyAnimalList();
        Dog dog = new Dog();
        Cat cat = new Cat();
        list.add(dog);
        list.add(cat);

    }
}
