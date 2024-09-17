public class App {
    public static void main(String[] args) throws Exception {
        // Tableau de test
        int[] tableau1 = { 64, 34, 25, 12, 22, 11, 90 };

        // Créer une instance de BubbleSort avec le tableau
        // BubbleSort bubbleSort1 = new BubbleSort(tableau1);
        QuickSort quickSort = new QuickSort(tableau1, 0, tableau1.length - 1);

        System.out.println("Le tableau initial");
        // bubbleSort1.afficherTableau();
        quickSort.afficherTableau();

        // Trier le tableau
        // bubbleSort1.sort();
        quickSort.sort();

        System.out.println("Le tableau trié");
        // bubbleSort1.afficherTableau();
        quickSort.afficherTableau();

    }
}
