class Solution {
    public int[][] generateMatrix(int n) {
         
        int[][] arr = new int [n][n];
        int minr=0,maxr=n-1;
        int minc=0,maxc=n-1;
        int val=1;

        while(minr<=maxr && minc<=maxc){

            for(int j=minc;j<=maxc;j++){
                arr[minr][j]=val++; 
            }
             minr++;
                if(minr>maxr || minc>maxc) break;
            for(int i=minr;i<=maxr;i++){
                arr[i][maxc]=val++;
            }
            maxc--;

             if(minr>maxr || minc>maxc) break;
            for(int j=maxc;j>=minc;j--){
                arr[maxr][j]=val++;
            }
              maxr--;
            
           if(minr>maxr || minc>maxc) break;
             for(int i=maxr;i>=minr;i--){
                arr[i][minc]= val++;
            }
            minc++;

        }
        return arr;
    }
}