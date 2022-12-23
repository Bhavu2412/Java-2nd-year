public class pattern {
    public static void main(String args[]){
        int a=7,i,k;
        for(i=1;i<=a;i++){
            if(i%2!=0){
            for(k=1;k<=i;k++){
            System.out.print(k);   
                }
            }
            else{
                for(k=i;k>=1;k--){
                    System.out.print(k);   
                    } 
                }
                System.out.println();
        }

            
        }
    }
 