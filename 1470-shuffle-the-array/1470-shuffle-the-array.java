class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res=new int[nums.length];
        int x=0;
       for(int i=0;i<res.length;i+=2){
           res[i]=nums[x];
           res[i+1]=nums[n];
               x++;n++;
       }
        return res;
    }
}