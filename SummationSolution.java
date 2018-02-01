class SummationSolution{
    public static void main(String[] args){
        SummationSolution s = new SummationSolution();
        s.getResult();
    }
    
    void getResult(){
        int[] arr = {3,34,4,12,5,2};
        boolean result1 = recSubset(arr, 5, 9);
        System.out.println(result1);
        boolean result2 = recSubset(arr, 5, 10);
        System.out.println(result2);
        boolean result3 = recSubset(arr, 5, 11);
        System.out.println(result3);
        boolean result4 = recSubset(arr, 5, 12);
        System.out.println(result4);
        boolean result5 = recSubset(arr, 5, 13);
        System.out.println(result5);
    }
    
    boolean recSubset(int[] a, int i, int s){
        if(s == 0) return true;
        if(i == 0){
            if(a[i] == s) return true;
            else return false;
        }
        if(a[i] > s) return recSubset(a, i - 1, s);
        boolean c = recSubset(a, i - 1, s - a[i]);
        boolean d = recSubset(a, i - 1, s);
        return (c || d);
    }
}               