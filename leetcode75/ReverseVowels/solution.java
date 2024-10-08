class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> vowels = new HashSet<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;

        while (left < right){
            char leftChar = chars[left];
            char rightChar = chars[right];

            if(!vowels.contains(leftChar)){ left++; }
            if(!vowels.contains(rightChar)){ right--; }
            
            if(vowels.contains(leftChar) && vowels.contains(rightChar)){
                chars[left] = rightChar;
                chars[right] = leftChar;
                
                left++;
                right--;
            }
        }

        return new String(chars);
    }
}
