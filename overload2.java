 class rectrangle{
    rectrangle(){
        System.out.println("This is a default.");
    }
    private int a,b;
    rectrangle(int a,int b){
        this.a=a;
        this.b=b;
    }
    int area(){
        return a*b;
    }
}
 class cube{
     private int size;
    cube(int size){
        this.size=size;
    }
    cube(){
        System.out.println("This is a default.");
    }
   int volume(){
        return size*size*size;
    }

}
    class overload2{
    public static void main(String args[]){
        rectrangle r=new rectrangle(12,34);
        cube c=new cube(2);
        System.out.println(r.area());
        System.out.println(c.volume());
    }
}