/*Given an unsorted array, A, of integers and an integer k, write recursive program using Java
for rearranging the elements in A so that all elements less than or equal to k come before
any elements larger than k.*/


public class HAQ4 {
    public static void rearrangeArray(int[] A, int k, int low, int high) {
        if (low >= high) {
            return; 
        }

        int pivotIndex = partition(A, k, low, high);

        rearrangeArray(A, k, low, pivotIndex - 1);
        rearrangeArray(A, k, pivotIndex + 1, high);
    }

    private static int partition(int[] A, int k, int low, int high) {
        int pivot = A[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (A[j] <= k) {
                i++;
                swap(A, i, j);
            }
        }

        swap(A, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = { 9, 4, 7, 2, 5, 1, 8, 6, 3 };
        int k = 5;

        System.out.println("Original array: " + array.toString(array));

        rearrangeArray(array, k, 0, array.length - 1);

        System.out.println("Rearranged array: " + array.toString(array));
    }
}
