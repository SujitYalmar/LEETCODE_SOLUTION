class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> neww = new ArrayList<>();
        for(int i=num.length-1; i>=0; i--){
        k+= num[i];
        neww.add(k%10);
       k= k/10;
        }
         while (k > 0) {
            neww.add(k % 10);
            k /= 10;
        }
        Collections.reverse(neww);
        return neww;

    }
}