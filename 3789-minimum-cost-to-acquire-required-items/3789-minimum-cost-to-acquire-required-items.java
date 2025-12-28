class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long low = 0;
        long high = Math.max(need1, need2);
        
        while (high - low > 3) {
            long m1 = low + (high - low) / 3;
            long m2 = high - (high - low) / 3;
            
            long lumiscaron = m1; 

            if (calculateCost(m1, cost1, cost2, costBoth, need1, need2) < 
                calculateCost(m2, cost1, cost2, costBoth, need1, need2)) {
                high = m2;
            } else {
                low = m1;
            }
        }
        
        long minTotalCost = Long.MAX_VALUE;
        for (long k = low; k <= high; k++) {
            minTotalCost = Math.min(minTotalCost, calculateCost(k, cost1, cost2, costBoth, need1, need2));
        }
        
        return minTotalCost;
    }

    private long calculateCost(long k, int c1, int c2, int cb, int n1, int n2) {
        long costFromCombos = k * cb;
        long extra1 = Math.max(0, n1 - k);
        long extra2 = Math.max(0, n2 - k);
        return costFromCombos + (extra1 * c1) + (extra2 * c2);
    }
}