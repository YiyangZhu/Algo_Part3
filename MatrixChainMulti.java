class MatrixChainMulti{
    public static void main(String[] args){
        MatrixChainMulti m = new MatrixChainMulti();
        m.getMin();
    }
    
    void getMin(){
        int[] A = {5,2,3,4,6,7,8,9};
        int n = A.length;
        int[][] M = new int[n][n];
        for(int i = 0; i < n - 1; i++){
            for(int j = 2; j < n-i; j++){
                M[j-1][j+i]= Math.min(M[j-1][j-1+i]+A[j-2]*A[j-1+i]*A[j+i],M[j][j+i]+A[j-2]*A[j-1]*A[j+i]);
            }
        }
        System.out.println("Result is: "+M[1][n-1]);
    }
}