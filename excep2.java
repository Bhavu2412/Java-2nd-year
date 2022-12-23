import java.util.*;
class marksoutofboundexception extends Exception{
    marksoutofboundexception(String err){
        System.out.println("Error MarksOutOfBound.");
    }
    
}
class excep2{
    
        static void validate (int marks) throws marksoutofboundexception{    
            if(marks < 0 || marks > 100){  
       
             // throw an object of user defined exception  
             throw new marksoutofboundexception("Error marks out of bound.");    
         }  
            else {   
             System.out.println("Registered.");   
             }   
          } 
          public static void main(String args[]){

        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your name :");
            String name=sc.nextLine();
            System.out.println("Enter your seatno :");
            String seatno=sc.nextLine(); 
            System.out.println("Enter your date :");
            String date=sc.nextLine();
            System.out.println("Enter your marks :");
            int marks=sc.nextInt();
            System.out.println("Enter your centerno :");
            String centerno=sc.nextLine();
            validate(marks);
        }
        catch(marksoutofboundexception ex){
            System.out.println("Caught the exception");  
            System.out.println("Program has't crashed.");
            System.out.println("Number is not valid");

           
        }

    }
}