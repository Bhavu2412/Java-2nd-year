class reversenum{
    public int revnum(int num,int p){
        if(num<=9)
        return p=p+num;
        else{
            p+=(num%10);
            return revnum(num/10,p*10);
        }
    }
        public static void main(String args[]){
        reversenum as=new reversenum();
        int a=as.revnum(123445,0);
        System.out.println(a);
        }
    
}