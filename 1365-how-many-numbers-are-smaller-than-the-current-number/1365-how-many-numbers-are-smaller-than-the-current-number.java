class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++ ){
            int count=0;
            for (int num : nums) {
                if (nums[i] > num)
                    count++;
            }
            ans[i]=count;
        }
        return ans;
    }
}