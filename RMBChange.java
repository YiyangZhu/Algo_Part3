class RMBChange{
     int[] RMBType;
     String[] displayRMB;
    
    int[] makeChange(double change){
        RMBType = new int[]{10000,5000,1000,500,200,100,50,20,10,1};
        displayRMB = new String[]{"一百块","五十块","十块","五块","两块","一块","五毛","两毛","一毛","一分"};
        int l = RMBType.length;
        int[] counts = new int[l];
        int num = (int)(change*100);
        int i;
        for(i = 0; i < l; i++){
            if(RMBType[i] <= num){
                break;
            }
        }
        while(num > 0 && i < l){
            if(num >= RMBType[i]){
                num -= RMBType[i];
                counts[i]++;
                //System.out.println("Give "+displayRMB[i]+" "+counts[i]+"个"+"剩下"+num);
            } else {
                i++;
                //System.out.println("Give "+displayRMB[i]+"剩下"+num);
            }
        }
        return counts;
    }
    
    void display(int[] counts){
        for(int i = 0; i < displayRMB.length; i++){
            System.out.println("Give "+displayRMB[i]+" "+counts[i]+"个");
        }
        System.out.println();
    }
    
}