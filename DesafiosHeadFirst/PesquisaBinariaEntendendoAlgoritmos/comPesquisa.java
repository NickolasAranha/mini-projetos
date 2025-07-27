package DesafiosHeadFirst.PesquisaBinariaEntendendoAlgoritmos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class comPesquisa {
    long start;
    long end;
    void exec(Random rand, int valor, Pessoa population[]) {
         start = System.nanoTime();
        String nomeAProcurar = population[rand.nextInt(population.length)].name;

        int low = 0;
        int high = population.length - 1;
        int shoot;
        while (low <= high) {
            shoot = (low + high) / 2;
            int compare = nomeAProcurar.compareTo(population[shoot].name);
            if (compare == 0) {
                System.out.println("Achei o nome, era " + nomeAProcurar);
                System.out.println(population[shoot].name + " estava na posição: " + shoot);
                break;
            } else if (compare > 0) {
                System.out.println("Não é esse: " + population[shoot].name + " estava na posição: " + shoot);
                low = shoot + 1;
            } else {
                System.out.println("Não é esse: " + population[shoot].name + " estava na posição: " + shoot);
                high = shoot - 1;
            }
        }
         end = System.nanoTime();
    }
}
