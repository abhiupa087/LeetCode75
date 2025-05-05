package leetcode75.arrays;

public class ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        var arrayProduct = 1;
        var zeroCount = 0;

        // prepare the product and count zeros
        for (int num : nums) {
            if (num != 0) {
                arrayProduct *= num;
            } else {
                zeroCount++;
            }
        }
        // Second pass: build the result array
        for (int i = 0; i < nums.length; i++) {
            if (zeroCount > 1) {
                nums[i] = 0;
            } else if (zeroCount == 1) {
                nums[i] = (nums[i] == 0)
                    ? arrayProduct
                    : 0;
            } else {
                nums[i] = arrayProduct / nums[i];
            }
        }
        return nums;
    }
}
