class RMBChangeDemo{
    public static void main(String[] args){
        RMBChange r = new RMBChange();
        double change = 11.8;
        System.out.println("找钱："+change);
        r.display(r.makeChange(change));
    }
}