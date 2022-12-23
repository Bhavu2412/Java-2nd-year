import java.util.*;
interface Sports{
    int score=100;
    void Score();
}
class student{
    int roll;
    void read(int n){
        roll=n;
    }
    void display(){
        System.out.println(roll);
    }
}
class test extends student{
    int sem_1,sem_2;
    void read1(int n){
        sem_1=n;
    }
    void read2(int n){
        sem_2=n;
    }
    void display(){
        System.out.println(sem_1+sem_2);
    }
}
class result extends test implements Sports{
    int total;
    public void Score(){
        total=sem_1+sem_2+score;
        System.out.println("Score is " + total);
    }
}
public class inherinter{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        result r=new result();
        System.out.println("Enter roll no.");
        int roll = sc.nextInt(); 
        System.out.println("Enter sem1.");
        int sem1 = sc.nextInt(); 
        System.out.println("Enter sem2."); 
        int sem2 = sc.nextInt();
        r.read(roll);
        r.read1(sem1);
        r.read2(sem2); 
        r.Score();
    }
}
