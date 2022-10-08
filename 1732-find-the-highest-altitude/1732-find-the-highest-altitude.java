class Solution {
    public int largestAltitude(int[] gain) {
        int i = 0;
        int max = 0;
        int[] altitude = new int[gain.length+1];
        while( i < gain.length){
            altitude[i+1] = altitude[i] + gain[i];
                i++;
        }
        for(int j = 0 ; j < altitude.length ;j++){
            if(max < altitude[j])
                max = altitude[j];
        }
        return max;
    }
}