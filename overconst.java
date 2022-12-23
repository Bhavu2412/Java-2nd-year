import java.util.*;
class Shape{
    int s1,s2;
         Shape(int s){
             s1=s;
             s2=s;
        }
         Shape(int a,int b){
            s1=a;
            s2=b;
        }
        float area(){
            return s1*s2;
        }
}

public class overconst{
    public static void main(String args[]){
        Shape squ=new Shape(6);
        Shape rec=new Shape(12,6);
        System.out.println(squ.area());
        System.out.println(rec.area());

    }
}