class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            for (int j = 0; j < nums.length; j++) {
                int ta = nums[j];
                if (i == j) {
                    continue;
                } 
                if (cur + ta == target){
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                }
            }
        }
    return answer;
    }
}