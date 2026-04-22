public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = { 10, 0, -5, 5, 15, 2 };
        runBubbleSort();
        runBubbleSortAvz();
    }

    public static void runBubbleSort() {
        System.out.println("Metodo Burbuja: ");
        int[] numeros = { -5, 10, 2, 0, 7 };
        // Instancia de la clase
        BubbleSort bubbleSort = new BubbleSort();
        // bubbleSort.printArreglos(numeros);
        // System.out.println("");
        // System.out.println("Ascendente:");
        // bubbleSort.sortAscendente(numeros);
        // bubbleSort.printArreglos(numeros);
        // System.out.println("");
        // System.out.println("Descendente:");
        // bubbleSort.sortDescendente(numeros);
        // bubbleSort.printArreglos(numeros);
        System.out.println("");
        System.out.println("ANTES");
        bubbleSort.printArreglos(numeros);
        System.out.println("");
        System.out.println("Descendente");
        bubbleSort.sort(numeros, true);
        bubbleSort.printArreglos(numeros);
        System.out.println("");
        System.out.println("Ascendente");
        bubbleSort.sort(numeros, false);
        bubbleSort.printArreglos(numeros);
        System.out.println("");
        System.out.println("");
    }

    public static void runBubbleSortAvz() {
        int[] array = new int[] { 9, 2, 3, 0, 8, 5, 10, 50, 100 };
        // Instanciar clase
        BubbleSortAvz bSortAvz = new BubbleSortAvz(array);
        System.out.println("Metodo Burbuja Avanzado");
        bSortAvz.printArray(array);
        bSortAvz.sort(true);
        bSortAvz.printArray(array);

    }
}