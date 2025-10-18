class Solution {
    public int arrangeCoins(int n) {
        int numOfBlock = 0;
       for (int i = 1; i <= n; i++) {
            numOfBlock = i;
            n = n -  numOfBlock;
       }
       return numOfBlock;
    }
}