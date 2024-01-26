package prototypePattern;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable{
    private String ip;
    private String impData;
    private List<String> domain = new ArrayList<>();

    public List<String> getDomain() {
        return domain;
    }

    public void setDomain(List<String> domain) {
        this.domain = domain;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImpData() {
        return impData;
    }

    public void setImpData(String impData) {
        this.impData = impData;
    }

    public void loadVeryImpData() throws InterruptedException {
        this.impData="very very important data";
        domain.add("www.learnwithme.com");
        domain.add("www.facebook.com");
        domain.add("www.google.com");
        domain.add("www.youtube.com");
        Thread.sleep(5000);
    }

    @Override
    public String toString() {
        return " : " + ip + '\'' +
                " : " + impData +" : " + domain;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp(this.getIp());
        networkConnection.setImpData(this.getImpData());

        for (String d : domain){
            networkConnection.getDomain().add(d);
        }

        return networkConnection;
    }
}
