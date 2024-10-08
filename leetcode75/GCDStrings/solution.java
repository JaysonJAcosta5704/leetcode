class Solution {
    public String gcdOfStrings(String str1, String str2) {

        /* 
            To solve this problem, we are going to use recursion.
            We will check which string is longer and make that str1 and the shorter one str2
            Then, we will check if str1 has str2 in it, which if it doesnt then it will return
            empty because there is no GCD
            Next, we will return the string if string 2 is empty, because that means the GCD 
            was found
            Finally, we will have another recursive call which will split string1 at the end 
            of string2, making it shorter to find the GCD.
        */

        if(str1.length() < str2.length()){
            return gcdOfStrings(str2, str1);
        }
        else if(!str1.startsWith(str2)){
            return "";
        }
        else if (str2.isEmpty()){
            return str1;
        }
        else {
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }


    }
}
