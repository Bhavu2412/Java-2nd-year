public class overloadfunc{
    public int area(int l,int b){
        return l*b;
    }
    public int area(int l){
        return l*l;
    }
    public static void main(String args[]){
        int a=5;
        int b=10;
        overloadfunc o=new overloadfunc();
        System.out.println(o.area(a,b)+" "+o.area(a));
    }
}