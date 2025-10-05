README.md
# DAA Assignment 2 – Heap Sort

## Student Information
- **Student B:** Muslim  
- **Partner (Student A):** Dinmukhamed  
- **Course:** Algorithms and Data Structures  
- **Pair Number:** 2  
- **Algorithm Implemented:** Heap Sort  

---

## Project Overview
This repository contains the implementation and analysis of the **Heap Sort** algorithm as part of Assignment 2.  
The main goal of this assignment was to:
1. Implement Heap Sort in Java.
2. Measure and analyze its performance using different input sizes and distributions.
3. Compare its performance with my partner’s **Shell Sort** algorithm.

Heap Sort was implemented using three main Java classes:
- `HeapSort.java` – core algorithm and heapify operations  
- `PerformanceTracker.java` – tracks comparisons, moves, and memory accesses  
- `BenchmarkRunner.java` – command-line interface for performance testing  

---

## Repository Structure
DAA2ASSIG/
├── src/
│ └── main/java/
│ ├── algorithms/HeapSort.java
│ ├── metrics/PerformanceTracker.java
│ └── cli/BenchmarkRunner.java
├── docs/
│ ├── heap-sort-report.pdf
│ ├── analysis-report.pdf
│ ├── comparison-summary.pdf
│ └── performance-plots/
│ ├── HeapSort_Time_vs_n.png
│ ├── HeapSort_Time_vs_Distribution.png
│ └── HeapSort_Comparisons_vs_n.png
├── pom.xml
└── README.md


---

## How to Run
To compile and run Heap Sort manually from the terminal:
```bash
javac -d out src/main/java/algorithms/*.java src/main/java/metrics/*.java src/main/java/cli/*.java
java -cp out cli.BenchmarkRunner -n 10000 -dist random

Parameters:

-n → input size (e.g., 100, 1000, 10000)

-dist → input distribution (random, sorted, reversed, nearly)

Example:

java -cp out cli.BenchmarkRunner -n 10000 -dist sorted

Reports

All reports and performance plots are located in the /docs/ folder.

heap-sort-report.pdf → Report on my implementation of Heap Sort

analysis-report.pdf → My analysis of my partner’s algorithm (Shell Sort)

comparison-summary.pdf → Joint comparison of Heap Sort and Shell Sort

performance-plots/ → Folder containing benchmark charts

Performance Summary
## 📊 Heap Sort Results Table

![Heap Sort Results](docs/performance-plots/results-table.png)


Heap Sort shows consistent O(n log n) performance for all inputs.
It runs slightly faster on nearly sorted data and slower on reversed arrays,
but remains stable and memory-efficient in all cases.

Comparison with Shell Sort

Heap Sort provides predictable O(n log n) performance and low memory usage.

Shell Sort performs better on small or partially sorted datasets.

For large datasets, Heap Sort is faster and more scalable.

Conclusion

This project successfully implemented and analyzed Heap Sort in Java.
The algorithm achieved stable performance across all input types and matched theoretical complexity expectations.
Compared to Shell Sort, Heap Sort is more consistent and reliable for large-scale data processing.
