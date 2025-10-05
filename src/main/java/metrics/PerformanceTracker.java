package metrics;

public class PerformanceTracker {
    public long comparisons = 0;
    public long arrayAccesses = 0;
    public long moves = 0;
    private long start, end;

    public void startTimer() { start = System.nanoTime(); }
    public void stopTimer() { end = System.nanoTime(); }
    public double elapsedMs() { return (end - start) / 1e6; }

    public void reset() {
        comparisons = arrayAccesses = moves = 0;
        start = end = 0;
    }
}
