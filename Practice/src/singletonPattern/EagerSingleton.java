package singletonPattern;

public class EagerSingleton {

    private static EagerSingleton singleton = new EagerSingleton();

    public static EagerSingleton getInstance(){
        return singleton;
    }
}
