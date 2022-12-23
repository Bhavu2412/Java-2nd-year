package mypack;
public class User{
    public String name;
    public void msg(){
        System.out.println("Hello "+name);
    }
}
import mypack.User;
class packag{
    public static void main(String args[]){
        User bh=new User();
        bh.name="bhavya";
        bh.msg();
    }
}