 eight patterns discussed:

---

🧠 1. Sliding Window

• Use case: Problems involving contiguous sequences (subarrays, substrings).

• Key idea: Maintain a window of elements and slide it across the input to optimize time complexity.

• Examples: Maximum sum subarray of size k, longest substring without repeating characters.


---

🔁 2. Two Pointers

• Use case: Sorted arrays, linked lists, or problems involving pair comparisons.

• Key idea: Use two pointers moving at different speeds or directions to find relationships.

• Examples: Merge two sorted arrays, remove duplicates, reverse a string in-place.


---

🔄 3. Fast & Slow Pointers (Cycle Detection)

• Use case: Detecting cycles in linked lists or arrays.

• Key idea: One pointer moves faster than the other; if they meet, a cycle exists.

• Examples: Linked list cycle detection, finding cycle length or entry point.


---

📚 4. Merge Intervals

• Use case: Interval scheduling, overlapping ranges.

• Key idea: Sort intervals and merge overlapping ones.

• Examples: Insert interval, merge overlapping meetings, employee free time.


---

📈 5. Binary Search

• Use case: Sorted arrays or search space problems.

• Key idea: Divide and conquer by halving the search space.

• Examples: Search in rotated array, peak element, kth smallest number.


---

🌲 6. Depth-First Search (DFS)

• Use case: Tree traversal, graph exploration, backtracking.

• Key idea: Explore as deep as possible before backtracking.

• Examples: Permutations, combinations, path sum in trees.


---

🌊 7. Breadth-First Search (BFS)

• Use case: Shortest path, level-order traversal.

• Key idea: Explore neighbors level by level using a queue.

• Examples: Minimum depth of binary tree, shortest path in grid.


---

🧩 8. Dynamic Programming (DP)

• Use case: Optimization problems with overlapping subproblems.

• Key idea: Break problems into subproblems and store results to avoid recomputation.

• Examples: Fibonacci, knapsack, edit distance, longest common subsequence.


---

```java
// 1. Sliding Window: Longest Substring Without Repeating Characters
public int lengthOfLongestSubstring(String s) {
    Set<Character> seen = new HashSet<>();
    int left = 0, maxLen = 0;

    for (int right = 0; right < s.length(); right++) {
        while (seen.contains(s.charAt(right))) {
            seen.remove(s.charAt(left++));
        }
        seen.add(s.charAt(right));
        maxLen = Math.max(maxLen, right - left + 1);
    }
    return maxLen;
}
```
```java
// 2. Two Pointers: Remove Duplicates from Sorted Array
public int removeDuplicates(int[] nums) {
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
        if (nums[j] != nums[i]) {
            nums[++i] = nums[j];
        }
    }
    return i + 1;
}



```
```java
// 3. Fast & Slow Pointers: Linked List Cycle Detection
public boolean hasCycle(ListNode head) {
    ListNode slow = head, fast = head;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) return true;
    }
    return false;
}



```
```java
// 4. Merge Intervals: Merge Overlapping Intervals
public int[][] merge(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
    List<int[]> merged = new ArrayList<>();

    for (int[] interval : intervals) {
        if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
            merged.add(interval);
        } else {
            merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
        }
    }
    return merged.toArray(new int[merged.size()][]);
}



```

```java
// 5. Binary Search: Search in Sorted Array
public int binarySearch(int[] nums, int target) {
    int left = 0, right = nums.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (nums[mid] == target) return mid;
        else if (nums[mid] < target) left = mid + 1;
        else right = mid - 1;
    }
    return -1;
}


```
```java
// 6. DFS: Path Sum in Binary Tree
public boolean hasPathSum(TreeNode root, int targetSum) {
    if (root == null) return false;
    if (root.left == null && root.right == null) return root.val == targetSum;
    return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
}


```
```java
// 7. BFS: Minimum Depth of Binary Tree
public int minDepth(TreeNode root) {
    if (root == null) return 0;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    int depth = 1;

    while (!queue.isEmpty()) {
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            TreeNode node = queue.poll();
            if (node.left == null && node.right == null) return depth;
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
        depth++;
    }
    return depth;
}

```
```java
// 8. Dynamic Programming: Climbing Stairs
public int climbStairs(int n) {
    if (n <= 2) return n;
    int[] dp = new int[n + 1];
    dp[1] = 1; dp[2] = 2;

    for (int i = 3; i <= n; i++) {
        dp[i] = dp[i - 1] + dp[i - 2];
    }
    return dp[n];
}

```


