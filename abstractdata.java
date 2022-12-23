abstract class area{
    abstract void area();
}
class rect extends area{
    int a=7,b=5,area;
   void area(){
       area=a*b;
    System.out.println(area);
    }
}
class squ extends area{
    int a=7,b=5,area;
   void area(){
       area=a*a;
    System.out.println(area);
    }
}
class tri extends area{
    int a=7,b=5,area;
    void area(){
        area=(a*b)/2;
     System.out.println(area);
     }
}
class abstractdata{
    public static void main(String args[]){
        rect r=new rect();
        area s=new squ();
        area t=new tri();
        r.area();
        s.area();
        t.area();
    }
}