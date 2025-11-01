🧮 Basic Sorting Algorithms (Time Complexity: O(n²))

• Bubble Sort: Repeatedly swaps adjacent elements if they are in the wrong order. Simple but inefficient for large datasets.

• Selection Sort: Finds the minimum element and places it at the beginning, repeating for each position.

• Insertion Sort: Builds the sorted array one item at a time by inserting elements into their correct position 

⚡ Efficient Comparison-Based Sorting (Time Complexity: O(n log n))

• Merge Sort: Divides the array into halves, recursively sorts them, and merges the sorted halves. Stable and efficient.

• Quick Sort: Picks a pivot, partitions the array around it, and recursively sorts the partitions. Fast but not stable.

• Heap Sort: Builds a heap from the array and repeatedly extracts the maximum element to sort. Not stable.



🚀 Linear Time Sorting Algorithms (Time Complexity: O(n) — Non-Comparison Based)

• Counting Sort: Counts the frequency of each element and uses it to place elements in order. Works well for integers in a limited range.

• Radix Sort: Sorts numbers digit by digit using a stable sort like counting sort. Ideal for fixed-length integers .

• Bucket Sort: Distributes elements into buckets and sorts each bucket individually. Best for uniformly distributed data .


🧠 Special Sorting Techniques

• Shell Sort: A generalization of insertion sort that allows the exchange of far-apart elements. Uses gap sequences to improve performance TutorialsPoint.

• Tim Sort: Hybrid of merge and insertion sort. Used in Python and Java’s built-in sort functions .

• Bitonic Sort: Parallel sorting algorithm used in hardware implementations. Works on bitonic sequences .


📊 Sorting Properties to Know

Property	Description	

Stable Sort	Maintains relative order of equal elements (e.g., Merge, Bubble, Insertion)	

In-place Sort	Uses constant extra space (e.g., Quick, Heap, Bubble)	

Adaptive Sort	Performs better on partially sorted data (e.g., Insertion, Tim Sort)	
