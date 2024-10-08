class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        /* approach 1: give one kid all the candies, then check if each kid would have the greatest amount of candies. This would require 2 for 
        loops making this solution O(N^2) time and 0(1) space */
       
        List<Boolean> willHaveMost = new ArrayList<Boolean>();
        int mostCandies = highestNumberInArray(candies);

        for (int numCandies : candies){
            if (numCandies + extraCandies >= mostCandies){ willHaveMost.add(true); }
            else { willHaveMost.add(false); }
        }

        return willHaveMost;
    }

    public int highestNumberInArray(int[] array){
        int highestNumber = 0;

        for(int number : array){
            if (number > highestNumber){ highestNumber = number; }
        }

        return highestNumber;
    }

    
}
