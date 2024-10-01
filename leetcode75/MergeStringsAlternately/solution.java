class Solution {
    public String mergeAlternately(String word1, String word2) {

        /*
        My first thought is to write a for loop that will take the shorter word, loop through each index of both words, then add them to the mergedString. After the words are merged, we need to loop through the remainder of the words

        How can we do that?

        compare the words, keep track of the two with an if statement, we can make a function to loop through the words and add them to the string
         */
        String mergedString = "";

        int word1count = word1.length();
        int word2count = word2.length();
        int i;

        for (i = 0; i < word1count && i < word2count; i++){
            mergedString += word1.charAt(i) + "" + word2.charAt(i);
        }

        if (i < word1count){
            mergedString += word1.substring(i);
        }
        else if (i < word2count){
            mergedString += word2.substring(i);
        }

        return mergedString;
    }
}
