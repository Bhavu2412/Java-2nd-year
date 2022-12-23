import java.util.*;
class gcdlcm{
    public static void main(String args[]){
        int a,b,i,gcd=1,lcm;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number :");
        a=sc.nextInt();
        System.out.println("Enter the second number :");
        b=sc.nextInt();
        for(i=1;i<=a && i<=b ;i++){
            if(a%i==0 && b%i==0){
              gcd=i;
            }
        }
        System.out.println("Gcd is :"+gcd);
        lcm=(a*b)/gcd;
        System.out.println("Lcm is :"+lcm);
    }
}