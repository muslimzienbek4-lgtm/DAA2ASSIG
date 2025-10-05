DAA Assignment 2 – Heap Sort
Student Information

Student B: Muslim
Partner (Student A): Dinmukhamed
Course: Algorithms and Data Structures
Pair Number: 2
Algorithm Implemented: Heap Sort

Project Overview

This repository contains the implementation and analysis of the Heap Sort algorithm as part of Assignment 2 for the Algorithms and Data Structures course.
The goals of the project were:

To implement the Heap Sort algorithm in Java.

To analyze its time and space complexity theoretically and empirically.

To compare its performance with my partner’s Shell Sort algorithm.

Heap Sort was implemented using three main Java classes:

HeapSort.java – contains the algorithm and heapify method.

PerformanceTracker.java – tracks comparisons, array accesses, and moves.

BenchmarkRunner.java – provides the command-line interface for testing.

Repository Structure

The repository includes source code, documentation, and performance plots.

src/ → contains Java source code (algorithms, metrics, cli).

docs/ → contains reports and performance plots.

heap-sort-report.pdf

analysis-report.pdf

comparison-summary.pdf

performance-plots (charts and table image)

pom.xml → Maven configuration file

README.md → project documentation

How to Run

To compile and run Heap Sort manually from the terminal:

javac -d out src/main/java/algorithms/.java src/main/java/metrics/.java src/main/java/cli/*.java
java -cp out cli.BenchmarkRunner -n 10000 -dist random

Parameters:

-n — input size (example: 100, 1000, 10000)

-dist — input distribution (random, sorted, reversed, nearly)

Example:
java -cp out cli.BenchmarkRunner -n 10000 -dist sorted

Reports

All reports are available in the docs/ folder:

heap-sort-report.pdf — my implementation analysis.

analysis-report.pdf — analysis of partner’s algorithm (Shell Sort).

comparison-summary.pdf — joint comparison between Heap Sort and Shell Sort.

Performance Summary

The table below shows the experimental results for Heap Sort on different input types and sizes.

![Heap Sort Results](docs/performance-plots/results-table.png)


Below is the image of the table as used in the report:

Heap Sort Results Table:


Graphical Results

Heap Sort performance plots are located in the docs/performance-plots/ folder.

Time vs n (Random):


Time vs Distribution (n = 10000):


Comparisons vs n:


Comparison with Shell Sort

Heap Sort provides consistent O(n log n) performance and low memory usage.

Shell Sort performs better on smaller or partially sorted datasets.

For large datasets, Heap Sort is faster, more scalable, and stable.

Conclusion

This project successfully implemented and analyzed Heap Sort in Java.
Heap Sort showed consistent O(n log n) performance for all input types and matched theoretical expectations.
Compared to Shell Sort, Heap Sort is more reliable and efficient for large-scale datasets,
while Shell Sort performs better for smaller or nearly sorted arrays.
