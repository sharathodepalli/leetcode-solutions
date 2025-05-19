class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];

        prefix[0] = 1;

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            prefix[i] *= suffix;
            suffix *= nums[i];
        }

        return prefix;
    }
}
// Time Complexity: O(n)
// Space Complexity: O(1) (excluding the output array)
// The algorithm uses two passes to calculate the prefix and suffix products.
// The first pass calculates the prefix product for each element, and the second pass calculates the suffix product while updating the result in place.
// This approach avoids using division and handles the case where the input array contains zeros.
// The algorithm runs in linear time O(n) and uses constant space O(1) (excluding the output array).
// The output array is created to store the final result, which is the product of all elements except the current one.
// The algorithm is efficient and works well for large input sizes.