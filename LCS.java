class LCS{
    public static void main(String[] args){
        LCS l = new LCS();
        char[] c = {'A','B','C','B','D','A','B'};
        char[] d = {'B','D','C','A','B','A'};
        String[][] b = l.getB(c,d);
        l.print(b, b.length -1,b[0].length-1,c);
        int[] e ={1,0,0,1,0,1,0,1};
        int[] f ={0,1,0,1,1,0,1,1,0};
        String[][] b2 = l.getB(e,f);
        l.print(b2, b2.length -1,b2[0].length-1,e);
    }
    
    void print(String[][] b,int i, int j, char[] a){
        if(i == -1 || j == -1){
            return;
        }
        if(b[i][j].equals("↖")){
            print(b,i-1,j-1,a);
            System.out.print(a[i]+" ");
        } else if(b[i][j].equals("↑")){
            print(b, i-1, j, a);
        } else {
            print(b, i, j-1, a);
        }
    }
    
    String[][] getB(char[] x, char[] y){
        int[][] c = new int[x.length+1][y.length+1];
        String[][] b = new String[x.length][y.length];
       
        for(int i = 0; i < x.length; i++){
            for(int j = 0; j < y.length; j++){
                if(x[i] == y[j]){
                    c[i+1][j+1] = 1 + c[i][j];
                    b[i][j] = "↖";
                } else if(c[i][j+1] >= c[i+1][j]){
                    c[i+1][j+1] = c[i][j+1];
                    b[i][j] = "↑";
                } else{
                    c[i+1][j+1] = c[i+1][j];
                    b[i][j] = "←";
                }
            }
        }
//        for(int i = 0; i <= b.length; i++){
//            for(int j = 0; j <= b[0].length;j++){
//                System.out.print(c[i][j]+" ");
//            }
//            System.out.println();
//        }
//        for(int i = 0; i < b.length; i++){
//            for(int j = 0; j < b[0].length;j++){
//                System.out.print(b[i][j]+" ");
//            }
//            System.out.println();
//        }
        return b;
    }
    
    void print(String[][] b,int i, int j, int[] a){
        if(i == -1 || j == -1){
            return;
        }
        if(b[i][j].equals("↖")){
            print(b,i-1,j-1,a);
            System.out.print(a[i]+" ");
        } else if(b[i][j].equals("↑")){
            print(b, i-1, j, a);
        } else {
            print(b, i, j-1, a);
        }
    }
    
    String[][] getB(int[] x, int[] y){
        int[][] c = new int[x.length+1][y.length+1];
        String[][] b = new String[x.length][y.length];
       
        for(int i = 0; i < x.length; i++){
            for(int j = 0; j < y.length; j++){
                if(x[i] == y[j]){
                    c[i+1][j+1] = 1 + c[i][j];
                    b[i][j] = "↖";
                } else if(c[i][j+1] >= c[i+1][j]){
                    c[i+1][j+1] = c[i][j+1];
                    b[i][j] = "↑";
                } else{
                    c[i+1][j+1] = c[i+1][j];
                    b[i][j] = "←";
                }
            }
        }
        return b;
    }
}