import java.util.*;
class switchcase{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,op,c=0;
        System.out.println("Enter the first number :");
        a=sc.nextInt();
        System.out.println("Enter the second");
        b=sc.nextInt();
        System.out.println("Enter the operation");
        op=sc.nextInt();
        switch(op){
            case 1:
            c=a+b;
            break;
            case 2:
            c=a-b;
            break;
            case 3:
            c=a*b;
            break;
            case 4:
            c=a/b;
            break;
            case 5:
            c=a%b;
            break;
            default :
            System.out.println("Operation cannot be performed.");
        }
        System.out.println("The value is " + c);
    }
}
