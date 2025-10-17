/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return bs(1,n);
    }
    public int bs(int low, int high)
    {
        if(low>high)    return low;
        int mid=low+(high-low)/2;

        if(isBadVersion(mid))   return bs(low,mid-1);
        return bs(mid+1,high);
    }
}