class OptimalSolution{
    public static void main(String[] args){
        OptimalSolution o = new OptimalSolution();
        o.getOptimal();
    }
    
    void getOptimal(){
        int[] a = {1,2,4,1,7,8,3};
        System.out.println("The optimal solution is: "+
        recOptimal(a, 6));
    }
    
    int recOptimal(int[] arr, int i){
        if(i == 0){
            return 1;
        } else if (i == 1){
            return 2;
        } else {
            int c = recOptimal(arr, i - 2)+arr[i];
            int d = recOptimal(arr, i - 1);
            return Math.max(c,d);
        }
    }
}
    
    