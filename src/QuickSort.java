public class QuickSort {

    private int[] tableau;
    private int lowIndex;
    private int highIndex;

    public QuickSort(int[] tableau, int lowIndex, int highIndex) {
        this.tableau = tableau;
        this.lowIndex = lowIndex;
        this.highIndex = highIndex;
    }

    public int[] sort() {
        return quickSort(tableau, lowIndex, highIndex);
    }

    public static int[] quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
        return array;
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int lowerNumberIndex = (low - 1);
        for (int i = low; i < high; i++) {
            if (array[i] < pivot) {
                lowerNumberIndex++;
                int temp = array[lowerNumberIndex];
                array[lowerNumberIndex] = array[i];
                array[i] = temp;
            }
        }
        int temp = array[lowerNumberIndex + 1];
        array[lowerNumberIndex + 1] = array[high];
        array[high] = temp;
        return lowerNumberIndex + 1;
    }

    // Méthode pour afficher le tableau trié
    public void afficherTableau() {
        for (int element : tableau) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
