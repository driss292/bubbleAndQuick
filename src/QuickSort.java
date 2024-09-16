import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    // int[] tableau;

    // // Constructeur pour initialiser le tableau
    // public QuickSort(int[] tableau) {
    // this.tableau = tableau;
    // }

    // // Méthode pour effectuer le quick sort
    // public void sort() {
    // int length = tableau.length;
    // int pivot = tableau.length - 1;
    // ArrayList<Integer> arrayLeft = new ArrayList<>();
    // ArrayList<Integer> arrayRight = new ArrayList<>();

    // if (length == 1) {
    // return;
    // }
    // for (int i = 0; i < length; i++) {
    // if (tableau[i] < pivot) {
    // arrayLeft.add(tableau[i]);
    // } else {
    // arrayRight.add(tableau[i]);
    // }
    // }
    // }

    // // Méthode pour afficher le tableau
    // public void afficherTableau() {
    // for (int element : tableau) {
    // System.out.println(element + " ");
    // }
    // System.out.println();
    // }

    public static List<Integer> quickSort(List<Integer> tableau) {
        if (tableau.size() == 1) {
            return tableau;
        }

        // Choix du pivot
        int pivot = tableau.get(tableau.size() - 1);

        // Création des deux partitions
        List<Integer> arrayLeft = new ArrayList<>();
        List<Integer> arrayRight = new ArrayList<>();

        return tableau;
    }

}
