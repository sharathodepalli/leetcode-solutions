# LeetCode Solutions

This repository contains my solutions to various LeetCode problems, implemented in Java.

## Structure

Solutions are organized as individual files named after the problem.

## Problems Solved

| #   | Problem                                                                                     | Solution                         | Difficulty | Time Complexity | Space Complexity |
| --- | ------------------------------------------------------------------------------------------- | -------------------------------- | ---------- | --------------- | ---------------- |
| 238 | [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/) | [Java](./ProductExceptSelf.java) | Medium     | O(n)            | O(1)             |

## Solution Approach

Each solution file includes:

- The complete solution code
- Time and space complexity analysis
- Brief explanation of the algorithm

## Example: Product of Array Except Self

This problem requires calculating, for each index i in the array, the product of all elements except the one at index i.

### Approach:

- Use prefix and suffix products to avoid division
- Two-pass algorithm: first to calculate prefix products, second to incorporate suffix products
- Handles arrays that contain zeros
- Implements the solution without using extra space (except for the output array)

## How to Use

1. Clone this repository
2. Open in your preferred Java IDE
3. Each file contains a complete solution class that can be submitted directly to LeetCode

## Contributing

Feel free to suggest improvements to any solution by opening an issue or pull request.

## License

This project is licensed under the MIT License - see the LICENSE file for details.
