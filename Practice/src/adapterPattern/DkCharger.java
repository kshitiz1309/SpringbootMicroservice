package adapterPattern;

public class DkCharger implements AndroidCharger{
    @Override
    public void chargeAndroidPhone() {
        System.out.println("Your Android phone is charging");
    }
}
