import java.util.*;
class main1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter");
        double a=sc.nextDouble();
        System.out.println("Enter");
        double b=sc.nextDouble();
        System.out.println("Enter");
        double c=sc.nextDouble();
        double d=(b*b)-(4*a*c);
        
        if(d<0){
            double e=Math.sqrt(-d);
            double x=(-b-e)/(2*a);
            double y=(-b+e)/(2*a);
            System.out.println("The roots are : "+(-b/(2*a))+(-e/(2*a))+"i"+" and "+(-b/(2*a))+"+"+(e/(2*a))+"i");
        
        }
        else{
            double e=Math.sqrt(d);
            double x=(-b-e)/(2*a);
            double y=(-b+e)/(2*a);
            System.out.println("The roots are : "+x+" and "+y);
        }

    }
}