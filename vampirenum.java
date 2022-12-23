import java.util.*;
public class vampirenum {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a,i,combo1=0,combo2=0,j;
        
        int arr[] = new int[4];
        System.out.println("Enter a 4 digit number :");
        a=sc.nextInt();
        int bha=a,c=0;
        arr[0]=a%10;
            a=a/10;
        arr[1]=a%10;
            a=a/10;
        arr[2]=a%10;
            a=a/10;
        arr[3]=a%10;
            a=a/10;
            for(i=0;i<4;i++){
                for(j=0;j<4;j++){
                    if(i!=j){
                        combo1=arr[i]*10+arr[j];
                        combo2=arr[3-i]*10+arr[3-j];
                    }
                    if(combo1*combo2==bha){
                        c++;
                        break;
                    }
                }
            }
            if(c==0)
            {
                System.out.println("It is not a vampire number.\n");
            }
            else{
                System.out.println("It is a vampire number.\n");
            }
        }

  }