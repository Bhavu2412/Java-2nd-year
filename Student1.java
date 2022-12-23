public class Student1{
    int i,p,c,m,sum=0;
    String n;
    Student1(String name,int idno,int phy,int math,int chem){
        i=idno;
        p=phy;
        c=chem;
        m=math;
        n=name;
        sum=p+c+m;
    }
    public static void main(String args[]){
        Student1 b=new Student1("Bhavya",141,12,13,14);
        Student1 c=new Student1("Chatur",142,15,15,15);
        Student1 d=new Student1("damru",143,1,10,9);
        System.out.println(b.sum);
    }
}
