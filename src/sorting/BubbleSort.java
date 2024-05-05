package Sorting;

public class BubbleSort {

    public static void main(String[] args) {
       // Inisialisasi array yang akan diurutkan
        int[] arr = {5, 2, 9, 1, 5, 6};

        System.out.println("Array sebelum diurutkan:");
        printArray(arr);

        // Memanggil fungsi untuk melakukan Bubble Sort
        bubbleSort(arr);

        System.out.println("\nArray setelah diurutkan:");
        printArray(arr);
    }

    // Fungsi untuk melakukan Bubble Sort
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                // membandingkan dua elemen berturut-turut
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Fungsi untuk mencetak array
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}
