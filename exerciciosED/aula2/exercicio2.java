package exerciciosED.aula2;

public class exercicio2 {
    public static void main(String[] args) {
        int[] sizes = {10, 100, 500, 1000, 2000, 5000};
        System.out.printf("%-10s %-20s %-20s\n", "N", "Ordenado(ns)", "Desordenado(ns)");
        for (int n : sizes) {
            Integer[] sortedArray = {10,100,500,1000,2000,5000};
            Integer[] randomArray = {100,5000,2000,1000,500,10};

            // Mede tempo para o array ordenado
            long timeSorted = measureInsertionSortTime(sortedArray);

            // Mede tempo para o array aleatório
            long timeRandom = measureInsertionSortTime(randomArray);

            System.out.printf("%-10d %-20d %-20d\n", n, timeSorted, timeRandom);
        }
    }

    public static void insertSort(Integer[] array) {
        for(int i=1; i< array.length; i++) {
            int chave = array[i];
            int j = i - 1;
            while (j >= 0 && chave < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = chave;
        }
    }

    public static long measureInsertionSortTime(Integer[] array) {
    long start = System.nanoTime();
    insertSort(array);
    long end = System.nanoTime();
    return end - start;
    }
}

