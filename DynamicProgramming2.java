class DynamicProgramming2{
    public static void main(String[] args){
        DynamicProgramming2 d = new DynamicProgramming2();
        d.getResult();
    }
    
    void getResult(){
        int[] arr = {3,34,4,12,5,2};
        int s = 13;
        int[] judge = new int[s + 1];
        for(int k = 0; k <= s; k++){
            judge[k] = k;
        }
        boolean[][] totalResult = new boolean[arr.length][s+1];
        totalResult[0][arr[0]] = true;
        for(int i = 0; i < arr.length; i++){
            totalResult[i][0] = true;
        }
        for(int i = 1; i < arr.length; i++){
            for(int j = 1; j <= s; j++){
                if(arr[i] > j){
                    totalResult[i][j] = totalResult[i - 1][j];
                } else {
                    boolean c = totalResult[i - 1][j - arr[i]];
                    boolean d = totalResult[i-1][j];
                    totalResult[i][j] = (c || d);
                }
            }
        }
        System.out.println(totalResult[arr.length - 1][s]);
    }
}
            
        