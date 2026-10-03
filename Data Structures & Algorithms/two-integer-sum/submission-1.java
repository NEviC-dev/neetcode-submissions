class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int left = 0; left<n; left++){
            for(int right = left + 1; right<n; right++){
                if(nums[left] + nums[right] == target){
                    return new int[]{left, right};
                }
            }
        }
        return new int[]{};   
    }
}
