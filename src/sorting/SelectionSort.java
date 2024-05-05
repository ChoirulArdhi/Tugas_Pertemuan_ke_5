package sorting;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        
        // Iterasi melalui seluruh elemen array
        for (int i = 0; i < n - 1; i++) {
            // menemukan indeks elemen terkecil yang tersisa
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Menukar elemen terkecil dengan elemen pertama yang belum terurut
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    
    // Fungsi untuk menampilkan isi array
    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Array sebelum menggunakan Selection Sort:");
        printArray(arr);
        
        // Memanggil fungsi Selection Sort
        selectionSort(arr);
        
        System.out.println("Array setelah menggunakan Selection Sort:");
        printArray(arr);
    }
}
