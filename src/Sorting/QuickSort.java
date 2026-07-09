package Sorting;
public class QuickSort{
    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }
    public int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int left = low;
        int right = high;
        while (left < right) {
            while (left < high && arr[left] <= pivot) {
                left++;
            }
            while (right > low && arr[right] > pivot) {
                right--;
            }
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[right];
        arr[right] = temp;

        return right;
    }
}