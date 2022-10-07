class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int i = 0;
        int[] target = new int[nums.length];
        while(i < nums.length) {
            if(target[index[i]] >= 0 ) {
                int j = i;
                while(j != index[i]) {
                    target[j] = target[j-1];
                    j--;
                }   
                target[index[i]] = nums[i];
            }
            else 
                target[index[i]] = nums[i];
            i++;
        }
        return target;
    }
}