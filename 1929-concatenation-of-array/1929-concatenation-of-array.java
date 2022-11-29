class Solution {
    public int[] getConcatenation(int[] nums) {
    int[] ans=new int[2*nums.length];
        for(int  i=0;i<ans.length;i++){
            if(i<nums.length){
                ans[i]=nums[i];
                ans[i+nums.length]=nums[i];
                }
        }
       
        return ans;
    }
}