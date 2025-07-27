package DesafiosHeadFirst.PesquisaBinariaEntendendoAlgoritmos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        int valor = 10000000;
        Random rand = new Random();
        Pessoa[] population = new Pessoa[valor];
        String[] names = {
                "Ana", "Bruno", "Carlos", "Daniela", "Eduardo", "Fernanda", "Gabriel", "Helena", "Igor", "Juliana",
                "Kleber", "Larissa", "Marcelo", "Nathalia", "Otávio", "Patrícia", "Quésia", "Rafael", "Sabrina", "Tiago",
                "Úrsula", "Vanessa", "Wesley", "Xênia", "Yasmin", "Zeca", "Alice", "Bernardo", "Clara", "Diego",
                "Elisa", "Felipe", "Gustavo", "Heloísa", "Isabela", "João", "Karen", "Lucas", "Marta", "Nícolas",
                "Olívia", "Paulo", "Queila", "Renato", "Sofia", "Talita", "Ulisses", "Valentina", "William", "Yuri",
                "Aline", "Beatriz", "Cauã", "Débora", "Enzo", "Fabiana", "Giovana", "Henrique", "Iara", "Jéssica",
                "Kaio", "Lívia", "Maurício", "Nicole", "Orlando", "Priscila", "Quintino", "Rodrigo", "Simone", "Tainá",
                "Uriel", "Vitória", "Wellington", "Xavier", "Yago", "Zuleica", "Amanda", "Breno", "Camila", "Davi",
                "Elen", "Flávio", "Gisele", "Hugo", "Ingrid", "José", "Kátia", "Leandro", "Manuela", "Natanael",
                "Odete", "Pedro", "Quitéria", "Ruan", "Sandra", "Túlio", "Ubirajara", "Vera", "Wanderson", "Ximena",
                "Yohana", "Zilda", "Abner", "Bianca", "Caio", "Daiane", "Elias", "Fabio", "Graziella", "Heitor",
                "Ilana", "Joaquim", "Kelly", "Leonardo", "Milena", "Nicolas", "Oscar", "Pamela", "Quésia", "Rita",
                "Samuel", "Tatiane", "Ursula", "Vinícius", "Weslley", "Xuxa", "Yuri", "Zenaide", "André", "Bruna",
                "Cristiano", "Denise", "Esther", "Fernando", "Giovanni", "Hélio", "Isis", "Júlio", "Kamila", "Luana",
                "Miguel", "Naiara", "Otávia", "Patrício", "Raquel", "Sérgio", "Tereza", "Vagner", "Washington", "Yanca"
        };

        String[] surnames = {
                "Silva", "Souza", "Oliveira", "Santos", "Pereira", "Lima", "Ferreira", "Alves", "Gomes", "Costa",
                "Ribeiro", "Carvalho", "Rodrigues", "Martins", "Rocha", "Almeida", "Barbosa", "Cardoso", "Moura", "Teixeira",
                "Correia", "Castro", "Fernandes", "Azevedo", "Araújo", "Freitas", "Pinto", "Nascimento", "Mendes", "Monteiro",
                "Cavalcanti", "Vieira", "Machado", "Assis", "Farias", "Soares", "Ramos", "Barros", "Tavares", "Peixoto",
                "Sales", "Coelho", "Bezerra", "Cunha", "Aguiar", "Queiroz", "Amaral", "Batista", "Dias", "Neves",
                "Antunes", "Figueiredo", "Simões", "Macedo", "Rezende", "Melo", "Borges", "Pacheco", "Andrade", "Moura",
                "Vasconcelos", "Braga", "Nogueira", "Siqueira", "Valentim", "Prado", "Xavier", "Lopes", "Barreto", "Beltrão",
                "Duarte", "Rezende", "Torres", "Lacerda", "Gonçalves", "Porto", "Mesquita", "Toledo", "Bittencourt", "Trindade",
                "Abreu", "Camargo", "Cordeiro", "Passos", "Furtado", "Lacerda", "Salazar", "Meireles", "Parente", "Macedo",
                "Arruda", "Leal", "Fontes", "Cordeiro", "Santiago", "Milani", "Fonseca", "Navarro", "Sarmento", "Teles",
                "Pimentel", "Ayres", "Ottoni", "Braz", "Bonfim", "Valle", "Figueira", "Coutinho", "Morais", "Guimarães",
                "Serra", "Franco", "Marques", "Lourenço", "Lacerda", "Alencar", "Sabino", "Severino", "Maranhão", "Campos",
                "Diniz", "Noronha", "Penha", "Neiva", "Moreira", "Teles", "Cavalcante", "Lobato", "Gurgel", "Reis",
                "Galvão", "Barroso", "Filho", "Garcia", "Pinheiro", "Bernardes", "Bastos", "Maia", "Mendes", "Linhares",
                "Silveira", "Brandão", "Loureiro", "Viana", "Ávila", "Aquino", "Vianna", "Moraes", "Estrela", "Torrado"
        };

       population = createPopulation(names, surnames, valor, rand);

        System.out.println("Este é o método sem Pesquisa Binária");
        semPesquisa p1 = new semPesquisa();
        p1.exec(rand, valor, population);
        time(p1.end, p1.start);

        System.out.println("Este é o método com Pesquisa Binária");
        comPesquisa p2 = new comPesquisa();
        p2.exec(rand, valor, population);
        time(p2.end, p2.start);
    }
    public static void time(long end, long start) {
        long time = (end - start) / 1_000_000;
        System.out.println("Tempo de execução: " + time + " milissegundos");
    }

    public static Pessoa[] createPopulation(String[] names, String[] surnames, int valor, Random rand) {
        Pessoa[] population = new Pessoa[valor];
        for (int i=0; i< population.length; i++) {
            int number = rand.nextInt(names.length);
            population[i] = new Pessoa();
            population[i].name = names[number];
            number = rand.nextInt(surnames.length);
            population[i].name = population[i].name + " " + surnames[number];
        }
        Arrays.sort(population, Comparator.comparing(Pessoa::getName));
        return population;
    }
}


