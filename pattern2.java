class pattern2 {
    public static void main(String args[]){
        int a=7,i,k,j,g=1;
        for(i=1;i<=a;i++){
            for(j=a-i;j>=1;j--){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print((char)(g+64));
                g++;
            }
            System.out.println();
        }

            
        }
    }
 