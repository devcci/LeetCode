class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> numMap = new HashMap<>();
        
        for (int num : nums) {
            numMap.put(num, numMap.getOrDefault(num, 0) +1);
        }
        
        for (int num : nums) {
            if (numMap.get(num) == 1) {
                return num;
            }
        }
        return nums[0];
    }
}