public class App {
    public static void main(String[] args) throws Exception {
        // Tableau de test
        int[] tableau1 = { 64, 34, 25, 12, 22, 11, 90 };
        int[] tableau2 = { 8, -2, 2, 1, 0, 9, 6 };

        // Créer une instance de BubbleSort avec le tableau
        BubbleSort bubbleSort1 = new BubbleSort(tableau1);
        BubbleSort bubbleSort2 = new BubbleSort(tableau2);
        // QuickSort quickSort = new QuickSort(tableau);

        System.out.println("Le tableau initial");
        bubbleSort1.afficherTableau();
        bubbleSort2.afficherTableau();
        // quickSort.afficherTableau();

        bubbleSort1.sort();
        bubbleSort2.sort();

        System.out.println("Le tableau trié");
        bubbleSort1.afficherTableau();
        bubbleSort2.afficherTableau();
        // quickSort.afficherTableau();

    }
}
