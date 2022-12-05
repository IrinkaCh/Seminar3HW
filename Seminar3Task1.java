//Задача 1. Реализовать алгоритм сортировки слиянием
import java.util.*;

public class Seminar3Task1 {
    public static void main(String[] args) {

        int[] numbers = new int[] { 1, -69, 346, 11, -13, -346, 7, 999, 45 };
        int[] newNumbers = mergeSort(numbers, 0, numbers.length - 1);
        System.out.println(Arrays.toString(newNumbers));
    }

    private static int[] mergeSort(int[] arr, int start, int finish) {
        if (start == finish) {
            return new int[] { arr[start] };
        }
        int middle = (start + finish) / 2;
        int[] left = mergeSort(arr, start, middle);
        int[] right = mergeSort(arr, middle + 1, finish);
        int[] result = new int[finish - start + 1];

        int leftIndex = 0;
        int rightIndex = 0;
        for (int resultIndex = 0; resultIndex < result.length; resultIndex++) {
            if (leftIndex >= left.length) {
                result[resultIndex] = right[rightIndex];
                rightIndex++;
            } else if (rightIndex >= right.length) {
                result[resultIndex] = left[leftIndex];
                leftIndex++;
            } else if (left[leftIndex] < right[rightIndex]) {
                result[resultIndex] = left[leftIndex];
                leftIndex++;
            } else {
                result[resultIndex] = right[rightIndex];
                rightIndex++;
            }
        }

        return result;
    }
}