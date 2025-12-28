class Solution {
    public int minAllOneMultiple(int k) {
        if (k % 2 == 0 || k % 5 == 0) {
            return -1;
        }
        int tandorvexi = k;
        int remainder = 0;
        for (int length = 1; length <= tandorvexi; length++) {
            remainder = (remainder * 10 + 1) % tandorvexi;
            if (remainder == 0) {
                return length;
            }
        }
        return -1;
    }
}