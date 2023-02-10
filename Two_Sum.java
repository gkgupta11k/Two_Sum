import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> Map = new HashMap<>();   
        
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (Map.containsKey(diff)) {
                return new int[]{Map.get(diff), i};
            }
            Map.put(nums[i], i);
        }
        return new int[]{};
    }
}