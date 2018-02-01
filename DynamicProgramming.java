class DynamicProgramming{
    
    public static void main(String[] args){
        DynamicProgramming d = new DynamicProgramming();
        d.getOptimal();
    }
    
    void getOptimal(){
        int[] arr = {1,2,4,1,7,8,3};
        int[] opt = new int[arr.length];
        opt[0] = arr[0];
        opt[1] = Math.max(arr[0], arr[1]);
        for(int i = 2; i < opt.length; i++){
            int c = opt[i - 1];
            int d = opt[i - 2] + arr[i];
            opt[i] = Math.max(c,d);
        }
        System.out.println("The optimal solution is: "+opt[opt.length-1]);
    }           
}