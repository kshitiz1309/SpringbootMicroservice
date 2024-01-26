package prototypePattern;

public class MainClient {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Creating object using prototype");

        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("192.168.0.1");
        networkConnection.loadVeryImpData();



        try {

            NetworkConnection networkConnection1 = (NetworkConnection)networkConnection.clone();
            NetworkConnection networkConnection2 = (NetworkConnection)networkConnection.clone();
            System.out.println(networkConnection);

            networkConnection.getDomain().remove(0);
            System.out.println(networkConnection);
            System.out.println(networkConnection1);
            System.out.println(networkConnection2);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
