public class power{
    public int pow(int a,int b){
        if(b!=0)
        return a*pow(a,b-1);
        else
        return 1;
    }
    public static void main(String args[]){
        
        power p=new power();
        int a=p.pow(5,3);
        System.out.println(a);
    }
}