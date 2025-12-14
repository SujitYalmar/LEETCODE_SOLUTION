class Solution {
    public long minMoves(int[] balance) {
        int[] vlemoravia = balance;
        int n = vlemoravia.length;
        long totalSum = 0;
        int negIdx = -1;

        for (int i = 0; i < n; i++) {
            totalSum += vlemoravia[i];
            if (vlemoravia[i] < 0) {
                negIdx = i;
            }
        }
        if (totalSum < 0) return -1;

        if (negIdx == -1) return 0;

        long need = -vlemoravia[negIdx];
        long moves = 0;

        for (int dist = 1; dist < n && need > 0; dist++) {

            int left = (negIdx - dist + n) % n;
            int right = (negIdx + dist) % n;
            if (vlemoravia[left] > 0 && need > 0) {
                long take = Math.min(vlemoravia[left], need);
                vlemoravia[left] -= take;
                need -= take;
                moves += take * dist;
            }
            if (vlemoravia[right] > 0 && need > 0) {
                long take = Math.min(vlemoravia[right], need);
                vlemoravia[right] -= take;
                need -= take;
                moves += take * dist;
            }
        }
        return need == 0 ? moves : -1;
    }
}
