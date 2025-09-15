package DesafiosHeadFirst.PolimorfismoNaPrática;

public class MyDogList {
   private Dog[] dogs = new Dog[5];
   private int nextIndex = 0;


   public void add(Dog d) {
       if (nextIndex < dogs.length) {
           dogs[nextIndex] = d;
           System.out.println("Dog adicionado em " + nextIndex);
           nextIndex++;
       }

       //Opa, boa ideia, mas agora preciso de gatos. Então eu teria que fazer isso para cada? Não, podemos usar polimorfismo.
   }
}
