package cli;

import algorithms.HeapSort;
import metrics.PerformanceTracker;
import java.util.*;

public class BenchmarkRunner {
    public static void main(String[] args) {
        int n = 10000;
        String dist = "random";

        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-n")) n = Integer.parseInt(args[++i]);
            else if (args[i].equals("-dist")) dist = args[++i];
        }

        Integer[] data = generate(n, dist);
        PerformanceTracker mt = new PerformanceTracker();

        mt.startTimer();
        HeapSort.sort(data, mt);
        mt.stopTimer();

        System.out.printf(
                "n=%d, dist=%s, time=%.3f ms, comps=%d, acc=%d, moves=%d%n",
                n, dist, mt.elapsedMs(), mt.comparisons, mt.arrayAccesses, mt.moves
        );
    }

    static Integer[] generate(int n, String type) {
        Random rnd = new Random(42);
        Integer[] arr = new Integer[n];
        switch (type) {
            case "sorted":
                for (int i = 0; i < n; i++) arr[i] = i;
                break;
            case "rev":
                for (int i = 0; i < n; i++) arr[i] = n - i;
                break;
            case "nearly":
                for (int i = 0; i < n; i++) arr[i] = i;
                for (int k = 0; k < n / 20; k++) {
                    int i1 = rnd.nextInt(n);
                    int i2 = rnd.nextInt(n);
                    int tmp = arr[i1]; arr[i1] = arr[i2]; arr[i2] = tmp;
                }
                break;
            default:
                for (int i = 0; i < n; i++) arr[i] = rnd.nextInt(n);
        }
        return arr;
    }
}
