class RodCut{
    public static void main(String[] args){
        int[] price = {0,1,5,8,9,10,17,17,20,24,30};
        System.out.println("Max price is: "+cutRod(price, 10));
    }
    
    static int cutRod(int[] p, int n){
        int q;
        int[] r = new int[p.length];
        r[0] = 0;
        for(int j = 1; j <= n; j++){
            q = -1;
            for(int i = 1; i <= j; i++){
                q = Math.max(q,p[i]+r[j-i]); //the essential line here!
            }
            r[j] = q;
            System.out.println("j is: "+j+". r[j] is: "+r[j]);
        }
        return r[n];   
    }
}