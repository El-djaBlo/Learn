package DSA_java.Sorting;
import java.util.Arrays;
//the idea behind bubble sort is you have to compare every adjacent element in the array until the array is sorted
// you have to compare and swap every element in the array.
public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 56, 34, 75, 8, 12, 1};
            for (int i = 0; i < arr.length-1; i++) {
                for (int j =0; j < (arr.length) - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        System.out.println(Arrays.toString(arr));
    }
}