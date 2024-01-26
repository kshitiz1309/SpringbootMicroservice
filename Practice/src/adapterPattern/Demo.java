package adapterPattern;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Program Started");
        AppleCharger appleCharger = new AdapterCharger(new DkCharger());
        Iphone13 iphone13 = new Iphone13(appleCharger);
        iphone13.chargesIphone();
    }
}
