#Time complexity tells us how the runtime of an algorithm grows as the input size (n) increases.
We usually express it in Big-O notation.
**Common Time Complexities:
O(1) → Constant time → Independent of input size.
Example: Accessing an element in an array by index.

O(log n) → Logarithmic time → Input size shrinks rapidly.
Example: Binary Search.

O(n) → Linear time → Runtime grows directly with input size.
Example: Traversing an array.

O(n log n) → Log-linear time.
Example: Merge Sort, Quick Sort (average).

O(n²) → Quadratic time.
Example: Nested loops (Bubble Sort).

O(2^n) → Exponential time.
Example: Recursive solutions for Fibonacci without DP.

O(n!) → Factorial time.
Example: Solving Traveling Salesman Problem via brute force.

Space Complexity

Space complexity measures the amount of extra memory an algorithm uses, relative to input size n.

It includes:

Fixed part → Memory for constants, program code, etc.

Variable part → Memory for input, variables, data structures, recursion stack.

Common Space Complexities:
O(1) → Constant space.
Example: Simple variables, swapping numbers.

O(n) → Linear space.
Example: Storing an array, recursion stack in DFS.

O(n²) → 2D matrices (like adjacency matrix in graphs).

O(n log n) → Merge Sort (due to auxiliary arrays).

