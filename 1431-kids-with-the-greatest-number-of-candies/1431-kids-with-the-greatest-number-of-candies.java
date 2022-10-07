class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> Candy=new ArrayList<>();
        int maxcandies=0;
        for(int i:candies)
            if(maxcandies<i)
                maxcandies=i;
        for(int i=0;i<candies.length;i++)
            Candy.add(candies[i]+extraCandies>=maxcandies);
        return Candy;
    }
   
}