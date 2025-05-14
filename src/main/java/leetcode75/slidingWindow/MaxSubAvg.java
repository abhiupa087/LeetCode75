package leetcode75.slidingWindow;

public class MaxSubAvg {

    public double findMaxAverage(int[] nums, int k) {
        int windowSum = 0;

        // Step 1: Calculate the sum of the first window of size k
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        // Step 2: Slide the window across the array
        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k]; // Add new, remove old
            maxSum = Math.max(maxSum, windowSum);
        }

        // Step 3: Return the average of the max sum
        return (double) maxSum / k;
    }
}
