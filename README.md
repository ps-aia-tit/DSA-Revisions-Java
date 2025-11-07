## Data Structures Definitions
---

Data Structure

Definition

Array

A fixed-size, indexed collection of elements of the same type. Allows fast access via indices but has static size and costly insertions/deletions.

Linked List

A linear collection of nodes where each node points to the next. Supports dynamic memory allocation and efficient insertions/deletions.

Doubly Linked List

A variation of linked list where each node points to both its previous and next node. Enables bidirectional traversal.

Stack

A LIFO (Last-In, First-Out) structure where elements are added and removed from the top. Used in recursion, parsing, and undo operations.

Queue

A FIFO (First-In, First-Out) structure where elements are added at the rear and removed from the front. Used in scheduling and buffering.

Deque

A double-ended queue that allows insertion and deletion from both front and rear. Combines stack and queue capabilities.

Hash Table / HashMap

Stores key-value pairs with fast access using a hash function. Ideal for constant-time lookups, insertions, and deletions.

Set

A collection of unique elements with no particular order. Useful for membership testing and eliminating duplicates.

Tree

A hierarchical structure with nodes connected by edges. Each node has a parent and zero or more children.

Binary Tree

A tree where each node has at most two children (left and right). Forms the basis for many advanced trees.

Binary Search Tree (BST)

A binary tree where left child < parent < right child. Enables efficient searching, insertion, and deletion.

AVL Tree

A self-balancing BST that maintains height balance after insertions/deletions to ensure O(log n) operations.

Red-Black Tree

A self-balancing BST with color-coded nodes to maintain balance. Guarantees O(log n) time for operations.

Heap

A complete binary tree used to implement priority queues. Max-heap and min-heap variants maintain order based on root value.

Trie (Prefix Tree)

A tree used to store strings where each node represents a character. Efficient for prefix-based search and autocomplete.

Graph

A set of nodes (vertices) connected by edges. Can be directed/undirected, weighted/unweighted. Used in network modeling.

Adjacency Matrix

A 2D array representation of a graph where cell (i,j) indicates edge presence. Space-intensive but fast edge lookup.

Adjacency List

A space-efficient graph representation where each vertex stores a list of adjacent vertices. Ideal for sparse graphs.

Union-Find / Disjoint Set

A structure to track a set of elements partitioned into disjoint subsets. Supports efficient union and find operations.


---

| Sorting Algorithm | Definition | Sample Java Code |
|-------------------|------------|------------------|
| **Bubble Sort** | Repeatedly swaps adjacent elements if they are in the wrong order. Simple but inefficient for large datasets. | ```java\nvoid bubbleSort(int[] arr) {\n  int n = arr.length;\n  for (int i = 0; i < n - 1; i++) {\n    for (int j = 0; j < n - i - 1; j++) {\n      if (arr[j] > arr[j + 1]) {\n        int temp = arr[j];\n        arr[j] = arr[j + 1];\n        arr[j + 1] = temp;\n      }\n    }\n  }\n} ``` |
| **Selection Sort** | Selects the minimum element from the unsorted part and places it at the beginning. | ```java\nvoid selectionSort(int[] arr) {\n  int n = arr.length;\n  for (int i = 0; i < n - 1; i++) {\n    int minIdx = i;\n    for (int j = i + 1; j < n; j++) {\n      if (arr[j] < arr[minIdx]) {\n        minIdx = j;\n      }\n    }\n    int temp = arr[minIdx];\n    arr[minIdx] = arr[i];\n    arr[i] = temp;\n  }\n} ``` |
| **Insertion Sort** | Builds the sorted array one item at a time by inserting elements into their correct position. | ```java\nvoid insertionSort(int[] arr) {\n  for (int i = 1; i < arr.length; i++) {\n    int key = arr[i];\n    int j = i - 1;\n    while (j >= 0 && arr[j] > key) {\n      arr[j + 1] = arr[j];\n      j--;\n    }\n    arr[j + 1] = key;\n  }\n} ``` |
| **Merge Sort** | A divide-and-conquer algorithm that splits the array, sorts each half, and merges them. | ```java\nvoid mergeSort(int[] arr, int l, int r) {\n  if (l < r) {\n    int m = (l + r) / 2;\n    mergeSort(arr, l, m);\n    mergeSort(arr, m + 1, r);\n    merge(arr, l, m, r);\n  }\n}\nvoid merge(int[] arr, int l, int m, int r) {\n  int n1 = m - l + 1;\n  int n2 = r - m;\n  int[] L = new int[n1];\n  int[] R = new int[n2];\n  for (int i = 0; i < n1; i++) L[i] = arr[l + i];\n  for (int j = 0; j < n2; j++) R[j] = arr[m + 1 + j];\n  int i = 0, j = 0, k = l;\n  while (i < n1 && j < n2) {\n    arr[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];\n  }\n  while (i < n1) arr[k++] = L[i++];\n  while (j < n2) arr[k++] = R[j++];\n} ``` |
| **Quick Sort** | Picks a pivot and partitions the array around it, recursively sorting the partitions. | ```java\nvoid quickSort(int[] arr, int low, int high) {\n  if (low < high) {\n    int pi = partition(arr, low, high);\n    quickSort(arr, low, pi - 1);\n    quickSort(arr, pi + 1, high);\n  }\n}\nint partition(int[] arr, int low, int high) {\n  int pivot = arr[high];\n  int i = low - 1;\n  for (int j = low; j < high; j++) {\n    if (arr[j] < pivot) {\n      i++;\n      int temp = arr[i];\n      arr[i] = arr[j];\n      arr[j] = temp;\n    }\n  }\n  int temp = arr[i + 1];\n  arr[i + 1] = arr[high];\n  arr[high] = temp;\n  return i + 1;\n} ``` |
| **Heap Sort** | Builds a heap and repeatedly extracts the maximum element to sort the array. | ```java\nvoid heapSort(int[] arr) {\n  int n = arr.length;\n  for (int i = n / 2 - 1; i >= 0; i--) heapify(arr, n, i);\n  for (int i = n - 1; i > 0; i--) {\n    int temp = arr[0];\n    arr[0] = arr[i];\n    arr[i] = temp;\n    heapify(arr, i, 0);\n  }\n}\nvoid heapify(int[] arr, int n, int i) {\n  int largest = i;\n  int l = 2 * i + 1;\n  int r = 2 * i + 2;\n  if (l < n && arr[l] > arr[largest]) largest = l;\n  if (r < n && arr[r] > arr[largest]) largest = r;\n  if (largest != i) {\n    int temp = arr[i];\n    arr[i] = arr[largest];\n    arr[largest] = temp;\n    heapify(arr, n, largest);\n  }\n} ``` |
