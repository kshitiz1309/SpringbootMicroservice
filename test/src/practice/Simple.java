package practice;

public class Simple extends A{

    public void msg(){System.out.println("child Hello java");}

    public static void main(String args[]){
        Simple obj=new Simple();
        obj.msg();
    }
}

class A{
    protected void msg(){System.out.println("Parent Hello java");}
}