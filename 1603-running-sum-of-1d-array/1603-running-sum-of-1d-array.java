class Solution {
    public int[] runningSum(int[] nums) {
        int[] resultArr = new int[nums.length];
        resultArr[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            resultArr[i] = nums[i] + resultArr[i-1];
        }

        return resultArr;
    }
}