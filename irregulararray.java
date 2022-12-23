import java.util.*;
class irregulararray{

    public static void main(String args[]){
        int i=2;
      int[][] arr=new int [2][];
      arr[0]=new int[2];
      arr[1]=new int[3];
      arr[0][0]=i;
      i++;
      arr[0][1]=i;
      i++;
      arr[1][0]=i;
      i++;
      arr[1][1]=i;
      i++;
      arr[1][2]=i;
      for(int k=0;k<2;k++){
          for(int j=0;j<2;j++){
              System.out.println(arr[i][j]);
          }
      }
    

    }
    
    
}