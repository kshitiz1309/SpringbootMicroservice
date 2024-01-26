package adapterPattern;

public class Iphone13 {
    private AppleCharger appleCharger;

    public Iphone13(AppleCharger appleCharger) {
        this.appleCharger = appleCharger;
    }

    public void chargesIphone(){
        appleCharger.chargePhone();
    }
}
