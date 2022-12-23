import java.util.*;

class meta{
    public static void main(String args[]){
        int count=0;
        String sc1=new String();
        String sc2=new String();
        sc1="Bhavya";
        sc2="yhavBa";
        if(sc1.length()==sc2.length()){
            System.out.println("Same length");
            for(int i=0;i<sc1.lenght();i++){
                    if(sc1.get(i)!=sc2.get(i)){
                        count++;  
                        char a=sc1.get(i);
                        
                }
            }
            if(count==2){
                System.out.println("They are Meta String.");
            }
            else{
                System.out.println("They are not Meta String.");
            }
        }
        else{
            System.out.println("They are of diffrent length.");
        }
    }
}