## Data Structures Definitions
---

## Data Structures Definitions

| Data Structure           | Definition                                                                                      |
|--------------------------|--------------------------------------------------------------------------------------------------|
| Array                    | A collection of elements identified by index, stored in contiguous memory locations.            |
| Linked List              | A linear collection of nodes where each node points to the next, allowing efficient insertions and deletions. |
| Stack                    | A collection that follows Last In First Out (LIFO) principle, supporting push and pop operations. |
| Queue                    | A collection that follows First In First Out (FIFO) principle, supporting enqueue and dequeue operations. |
| Hash Table               | A data structure that maps keys to values using a hash function for efficient lookups.          |
| Tree                     | A hierarchical structure with nodes connected by edges, with one root node and child nodes.     |
| Binary Tree              | A tree where each node has at most two children, referred to as left and right child.           |
| Binary Search Tree (BST) | A binary tree where left child nodes contain smaller values and right child nodes contain larger values. |
| Heap                     | A specialized tree-based structure that satisfies the heap property (max-heap or min-heap).     |
| Graph                    | A collection of nodes (vertices) connected by edges, which can be directed or undirected.       |
| Trie                     | A tree-like data structure used to store dynamic sets of strings, often for prefix searching.   |


---

| Sorting Algorithm | Definition | Sample Java Code |
|-------------------|------------|------------------|
| **Bubble Sort** | Repeatedly swaps adjacent elements if they are in the wrong order. Simple but inefficient for large datasets. | ```java\nvoid bubbleSort(int[] arr) {\n  int n = arr.length;\n  for (int i = 0; i < n - 1; i++) {\n    for (int j = 0; j < n - i - 1; j++) {\n      if (arr[j] > arr[j + 1]) {\n        int temp = arr[j];\n        arr[j] = arr[j + 1];\n        arr[j + 1] = temp;\n      }\n    }\n  }\n} ``` |
| **Selection Sort** | Selects the minimum element from the unsorted part and places it at the beginning. | ```java\nvoid selectionSort(int[] arr) {\n  int n = arr.length;\n  for (int i = 0; i < n - 1; i++) {\n    int minIdx = i;\n    for (int j = i + 1; j < n; j++) {\n      if (arr[j] < arr[minIdx]) {\n        minIdx = j;\n      }\n    }\n    int temp = arr[minIdx];\n    arr[minIdx] = arr[i];\n    arr[i] = temp;\n  }\n} ``` |
| **Insertion Sort** | Builds the sorted array one item at a time by inserting elements into their correct position. | ```java\nvoid insertionSort(int[] arr) {\n  for (int i = 1; i < arr.length; i++) {\n    int key = arr[i];\n    int j = i - 1;\n    while (j >= 0 && arr[j] > key) {\n      arr[j + 1] = arr[j];\n      j--;\n    }\n    arr[j + 1] = key;\n  }\n} ``` |
| **Merge Sort** | A divide-and-conquer algorithm that splits the array, sorts each half, and merges them. | ```java\nvoid mergeSort(int[] arr, int l, int r) {\n  if (l < r) {\n    int m = (l + r) / 2;\n    mergeSort(arr, l, m);\n    mergeSort(arr, m + 1, r);\n    merge(arr, l, m, r);\n  }\n}\nvoid merge(int[] arr, int l, int m, int r) {\n  int n1 = m - l + 1;\n  int n2 = r - m;\n  int[] L = new int[n1];\n  int[] R = new int[n2];\n  for (int i = 0; i < n1; i++) L[i] = arr[l + i];\n  for (int j = 0; j < n2; j++) R[j] = arr[m + 1 + j];\n  int i = 0, j = 0, k = l;\n  while (i < n1 && j < n2) {\n    arr[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];\n  }\n  while (i < n1) arr[k++] = L[i++];\n  while (j < n2) arr[k++] = R[j++];\n} ``` |
| **Quick Sort** | Picks a pivot and partitions the array around it, recursively sorting the partitions. | ```java\nvoid quickSort(int[] arr, int low, int high) {\n  if (low < high) {\n    int pi = partition(arr, low, high);\n    quickSort(arr, low, pi - 1);\n    quickSort(arr, pi + 1, high);\n  }\n}\nint partition(int[] arr, int low, int high) {\n  int pivot = arr[high];\n  int i = low - 1;\n  for (int j = low; j < high; j++) {\n    if (arr[j] < pivot) {\n      i++;\n      int temp = arr[i];\n      arr[i] = arr[j];\n      arr[j] = temp;\n    }\n  }\n  int temp = arr[i + 1];\n  arr[i + 1] = arr[high];\n  arr[high] = temp;\n  return i + 1;\n} ``` |
| **Heap Sort** | Builds a heap and repeatedly extracts the maximum element to sort the array. | ```java\nvoid heapSort(int[] arr) {\n  int n = arr.length;\n  for (int i = n / 2 - 1; i >= 0; i--) heapify(arr, n, i);\n  for (int i = n - 1; i > 0; i--) {\n    int temp = arr[0];\n    arr[0] = arr[i];\n    arr[i] = temp;\n    heapify(arr, i, 0);\n  }\n}\nvoid heapify(int[] arr, int n, int i) {\n  int largest = i;\n  int l = 2 * i + 1;\n  int r = 2 * i + 2;\n  if (l < n && arr[l] > arr[largest]) largest = l;\n  if (r < n && arr[r] > arr[largest]) largest = r;\n  if (largest != i) {\n    int temp = arr[i];\n    arr[i] = arr[largest];\n    arr[largest] = temp;\n    heapify(arr, n, largest);\n  }\n} ``` |
