# 8 Core DSA Pattern Examples
## 🧠 1. Sliding Window

Problem: Longest Substring Without Repeating Characters

Input: "abcabcbb"Output: 3 ("abc")


```java

public class SlidingWindowExample {
    public static int lengthOfLongestSubstring(String s) {
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

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // Output: 3
    }
}
```


##  🔁 2. Two Pointers

Problem: Remove Duplicates from Sorted Array

Input: [1,1,2]Output: 2 (Array becomes [1,2,_])
```java
public class TwoPointersExample {
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                nums[++i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int len = removeDuplicates(nums);
        System.out.println(len); // Output: 2
        System.out.println(Arrays.toString(Arrays.copyOf(nums, len))); // Output: [1, 2]
    }
}


```

## 🔄 3. Fast & Slow Pointers

Problem: Detect Cycle in Linked List

Input: 3 → 2 → 0 → -4 → (points back to 2)Output: true
```java
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class CycleDetectionExample {
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(3);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(0);
        ListNode d = new ListNode(-4);
        a.next = b; b.next = c; c.next = d; d.next = b; // cycle

        System.out.println(hasCycle(a)); // Output: true
    }
}



```

## 📚 4. Merge Intervals

Problem: Merge Overlapping Intervals

Input: [[1,3],[2,6],[8,10],[15,18]]Output: [[1,6],[8,10],[15,18]]
```java
public class MergeIntervalsExample {
    public static int[][] merge(int[][] intervals) {
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

    public static void main(String[] args) {
        int[][] input = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = merge(input);
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
        // Output: [1, 6], [8, 10], [15, 18]
    }
}


```
## 📈 5. Binary Search

Problem: Search Target in Sorted Array

Input: nums = [1,3,5,7,9], target = 5
Output: 2
```java

public class BinarySearchExample {
    public static int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9};
        System.out.println(binarySearch(nums, 5)); // Output: 2
    }
}

```
## 🌲 6. Depth-First Search (DFS)

Problem: Path Sum in Binary Tree

Input: Tree with path 5 → 4 → 11 → 2, target = 22
Output: true
```java

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

public class DFSExample {
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        if (root.left == null && root.right == null) return root.val == targetSum;
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        System.out.println(hasPathSum(root, 22)); // Output: true
    }
}



```
## 🌊 7. Breadth-First Search (BFS)

Problem: Minimum Depth of Binary Tree

Input: Tree with root 3, left 9, right 20 → 15, 7
Output: 2


```java


public class BFSExample {
    public static int minDepth(TreeNode root) {
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

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(minDepth(root)); // Output: 2
    }
}


```
## 🧩 8. Dynamic Programming (DP)

Problem: Climbing Stairs

Input: n = 5
Output: 8 (ways to climb)

```java

public class DPExample {
    public static int climbStairs(int n) {
        if (n <= 2) return n;
        int[] dp = new int[n + 1];
        dp[1] = 1; dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5)); // Output: 8
    }
}

```
