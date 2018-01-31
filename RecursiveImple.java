class RecursiveImple{
    int[] p;
    
    RecursiveImple(){
        p = new int[40];
        p[0] = 1;
        p[1] = 5;
        p[2] = 8;
        p[3] = 9;
        p[4] = 10;
        p[5] = 17;
        p[6] = 17;
        p[7] = 20;
        p[8] = 24;
        p[9] = 30;
        p[10] = 11;
        p[11] = 15;
        p[12] = 18;
        p[13] = 19;
        p[14] = 10;
        p[15] = 117;
        p[16] = 117;
        p[17] = 120;
        p[18] = 124;
        p[19] = 130;
        p[20] = 11;
    }
    
    int cutRod(int n){
        if (n == 0){
            return 0;
        }
        int q = -100000;
        for(int i = 0; i < n; i++){
            q = Math.max(q,p[i]+cutRod(n-i-1));
        }
        return q;
    }
    
    public static void main(String[] args){
        RecursiveImple d = new RecursiveImple();
        for(int j = 0; j < 20; j++){
            System.out.println("The optimal solution to length "+(j+1)+" is "+d.cutRod(j+1));
        }
    }
}