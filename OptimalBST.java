class OptimalBST{
    public static void main(String[] args){
        NodeOBST[] array = {new NodeOBST(10,4),new NodeOBST(12,2),
            new NodeOBST(16,6),new NodeOBST(21,3)};
        System.out.println("Min is: "+min(array));
    }
    
    static int min(NodeOBST[] a){
        int n = a.length;
        int[][] m = new int[n][n];
        int[][] w = new int[n][n];
        for(int i = 0; i < n; i++){
            m[i][i] = a[i].f;
            w[i][i] = a[i].f;
        }
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                w[i][j] = w[i][j-1]+w[j][j];
            }
        }
        for(int i = 0; i < n - 1; i++){
            m[i][i+1] = w[i][i+1]+Math.min(w[i][i],w[i+1][i+1]);
        }
        int minResult;
        for(int i = 0; i < n; i++){
            for(int j = i+2; j < n; j++){
                m[i][j] = 10000;
                for(int k = i+1; k < j; k++){                    
                    minResult = m[i][k-1]+m[k+1][j]+w[i][j];
                    if(minResult < m[i][j]){
                        m[i][j] = minResult;
                    }
                }
            }
        }
        return m[0][a.length-1];
    }
}
    