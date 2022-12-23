package Dishant;
public class User {
public String name;
public void msg() { 
    System.out.println("Hello " + name);
}
}
import Dishant.User;
class package1 {
public static void main(String args[]) 
{ 
    User obj = new User(); 
    obj.name="Dishant";
    obj.msg();
}
}