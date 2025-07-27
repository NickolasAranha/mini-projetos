package DesafiosHeadFirst.PesquisaBinariaEntendendoAlgoritmos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class semPesquisa {
    long start;
    long end;
    public void exec(Random rand, int valor, Pessoa population[]) {
         start = System.nanoTime();
        String nomeAProcurar = population[rand.nextInt(population.length)].name;

        for(int i=0; i < population.length; i++) {

            if (population[i].name.equals(nomeAProcurar)) {
                System.out.println("Achei o nome, era " + nomeAProcurar);
                System.out.println(population[i].name + " estava na posição: " + i);
                break;
            }
        }
         end = System.nanoTime();
    }

}
