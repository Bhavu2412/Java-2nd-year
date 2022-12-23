import java.util.*;
class oddprime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,op,count=0,i,j;
        System.out.println("Enter the start number :");
        a=sc.nextInt();
        System.out.println("Enter the end :");
        b=sc.nextInt();
        System.out.println("Enter 1 for odd 2 for prime :");
        op=sc.nextInt();
        switch(op){
            case 1:
            for(i=a;i<=b;i++){
                if(i%2!=0){
                    System.out.println(i+" ");
                }
                else{}
            }
            break;
            case 2:
            for(i=a;i<=b;i++){
                for(j=1;j<=i;j++){
                    if(i%j==0){
                        count++;
                    }
                }
                if(count<=3){
                    System.out.println(i);
                }
            }
            
           
        }
        
    }
}
