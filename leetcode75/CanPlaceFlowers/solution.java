class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // check the flowerbed for open spaces, once you find how many open spaces are compare it to int n
        if (n == 0) { return true; }

        int openSpaces = 0;
        int length = flowerbed.length;

        for (int i = 0; i < length; i++){
            boolean leftEmpty = (i == 0) || (flowerbed[i-1] == 0);
            boolean rightEmpty = (i == length - 1) || (flowerbed[i+1] == 0);

            if (leftEmpty && rightEmpty && flowerbed[i] != 1){
                flowerbed[i] = 1;
                openSpaces++;
            }
        }

        if (openSpaces >= n){ return true; }
        else { return false; }
    }
}
