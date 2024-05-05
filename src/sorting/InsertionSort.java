package sorting;


public class InsertionSort {
    public static void main(String[] args) {
        // Array awal sebelum pengurutan
        int[] arr = {12, 11, 13, 5, 6};

        System.out.println("Array sebelum pengurutan:");
        printArray(arr);

        // Memanggil metode untuk melakukan Insertion Sort
        insertionSort(arr);

        System.out.println("\nArray setelah pengurutan:");
        printArray(arr);
    }

    // Metode untuk melakukan Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Metode untuk mencetak array
    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
