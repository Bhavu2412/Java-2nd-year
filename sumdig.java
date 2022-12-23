class sumdig{
    public int sumd(int a){
        if(a<=9){
            return a+0;
        }
        
        else{
            int b=a%10;
            return b+sumd(a/10);   
        }
    }
    public static void main(String args[]){
        sumdig as=new sumdig();
        int a=as.sumd(12345);
        System.out.println(a);
        }
}