package algorithms;

import metrics.PerformanceTracker;

public class HeapSort {

    public static <T extends Comparable<T>> void sort(T[] arr, PerformanceTracker mt) {
        if (arr == null || arr.length < 2) return;
        int n = arr.length;

        // 1. Построение max-heap
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i, mt);

        // 2. Извлечение элементов из кучи
        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i, mt);
            heapify(arr, i, 0, mt);
        }
    }

    private static <T extends Comparable<T>> void heapify(T[] arr, int n, int i, PerformanceTracker mt) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && cmp(arr[left], arr[largest], mt) > 0)
            largest = left;

        if (right < n && cmp(arr[right], arr[largest], mt) > 0)
            largest = right;

        if (largest != i) {
            swap(arr, i, largest, mt);
            heapify(arr, n, largest, mt);
        }
    }

    private static <T> void swap(T[] arr, int i, int j, PerformanceTracker mt) {
        mt.arrayAccesses += 4;
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        mt.moves++;
    }

    private static <T extends Comparable<T>> int cmp(T a, T b, PerformanceTracker mt) {
        mt.comparisons++;
        return a.compareTo(b);
    }
}
