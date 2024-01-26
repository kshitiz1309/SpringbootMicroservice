package singletonPattern;

import java.lang.reflect.Constructor;

public class CheckSingleton {
    public static void main(String[] args) throws Exception {
        /*lazySingleton singleton = lazySingleton.getInstance();
        System.out.println(singleton.hashCode());
        lazySingleton singleton1 = lazySingleton.getInstance();
        System.out.println(singleton1.hashCode());

        System.out.println(EagerSingleton.getInstance().hashCode());
        System.out.println(EagerSingleton.getInstance().hashCode());*/
        lazySingleton singleton = lazySingleton.getInstance();
        System.out.println(singleton.hashCode());
        Constructor<lazySingleton> constructor = lazySingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        lazySingleton singleton1 = constructor.newInstance();
        System.out.println(singleton1.hashCode());
    }
}
