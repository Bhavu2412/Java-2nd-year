import java.util.*;
class excep{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter your name :");
            int n=sc.nextInt();
            System.out.println("Number is valid.");
            
        }
        catch(Exception e){
            System.out.println("Number is not valid");
            System.out.println("Program has't crashed.");
            sc.close();
        }
    }
}