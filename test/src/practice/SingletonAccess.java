package practice;

public class SingletonAccess {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s==s1);
        System.out.println(s==s2);
    }
}
