class addnum{
    int sum=0;
    public int addn(int a){
        if(a==1)
        return 1;
        else 
        return a+addn(a-1);
    }
    public static void main(String args[]){
        addnum as=new addnum();
        int a=as.addn(10);
        System.out.println(a);
    }
}