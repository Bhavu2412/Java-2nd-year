import java.util.*;
public class vector {
    public static void main(String[] args){
        int a=1;
        Scanner sc= new Scanner(System.in);
        Vector<String> v = new Vector<String>();
        v.add("Pens");
        v.add("Pencil");
        v.add("Eraser");
        v.add(1,"Bhavya");
        v.remove(0);
       System.out.println(v);
    }
  }