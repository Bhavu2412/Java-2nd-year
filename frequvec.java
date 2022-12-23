import java.util.*;

class main1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       Vector<Integer> v=new Vector();
       int ans=1,ij=0,count=1;
       while(ans==1){
        System.out.println("Enter value :");
        v.add(ij,sc.nextInt());
        ij++;
        System.out.println("Enter 1 :");
        ans=sc.nextInt();
       }
       for(int i=0;i<v.size();i++){
           if(v.get(i)!=-1){
           for(int j=i+1;j<v.size();j++){
               
                if(v.get(i)==v.get(j)){
                    count++;
                    v.set(j,-1);
                    
                }
               
                
            }
            System.out.println("The element "+v.get(i)+" has frequency "+count); 
            count=1;
           }
           
           
       }
    }
}