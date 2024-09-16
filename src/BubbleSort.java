public class BubbleSort {
    int[] tableau;

    // Consrtructeur pour initialiser le tableau
    public BubbleSort(int[] tableau) {
        this.tableau = tableau;
    }

    // Méthode pour effectuer le tri à bulles
    public void sort() {
        int length = tableau.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (tableau[j] > tableau[j + 1]) {
                    // Échanger les éléments
                    int temp = tableau[j];
                    tableau[j] = tableau[j + 1];
                    tableau[j + 1] = temp;
                }
            }
        }
    }

    // Méthode pour afficher le tableau
    public void afficherTableau() {
        for (int element : tableau) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
