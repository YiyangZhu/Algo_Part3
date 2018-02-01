class DynamicProgramming{
    int[] opt;
    
    public static void main(String[] args){
        DynamicProgramming d = new DynamicProgramming();
        d.getOptimal();
    }
    
    void getOptimal(){
        int[] arr = {1,2,4,1,7,8,3};
        opt = new int[arr.length];
        opt[0] = arr[0];
        opt[1] = Math.max(arr[0],arr[1]);
        for(int i = 2; i < arr.length; i++){
            opt[i] = recOptimal(arr, i);
        }
        System.out.println("The optimal is: "+opt[arr.length-1]);
    }
        
    int recOptimal(int[] arr, int j){
        if(j == 0) return arr[0];
        if(j == 1) return Math.max(arr[0],arr[1]);
        int c = opt[j - 1];
        int d = opt[j - 2] + arr[j];
        return Math.max(c,d);
    }
}