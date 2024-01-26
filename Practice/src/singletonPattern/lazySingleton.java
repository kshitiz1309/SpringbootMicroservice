package singletonPattern;

public class lazySingleton {

    private static lazySingleton singleton;

    private lazySingleton(){
        if(singleton!=null){
            throw new RuntimeException("You are breaking singleton pattern");
        }
    }
    public static lazySingleton getInstance(){
        if (singleton==null) {
            synchronized (lazySingleton.class) {
                if (singleton==null) {
                    singleton = new lazySingleton();
                }
            }
        }
        return singleton;
    }
}
