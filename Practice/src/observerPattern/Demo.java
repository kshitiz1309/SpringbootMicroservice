package observerPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) throws IOException {
        YoutubeChannel channel = new YoutubeChannel();

        Subscriber kshitiz = new Subscriber("kshitiz");
        Subscriber Atul = new Subscriber("Atul");
        Subscriber Pankaj = new Subscriber("Pankaj");
        channel.subscriber(kshitiz);
        channel.subscriber(Atul);
        channel.subscriber(Pankaj);
        channel.newVideoUploaded("Learn Design Pattern");
        channel.newVideoUploaded("Learn Angular Pattern");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            System.out.println("Press 1 to upload video");
            System.out.println("Press 2 to create new Subscriber");
            System.out.println("Press 3 to unSubscriber");
            System.out.println("Press 4 to exit");

            int c = Integer.parseInt(bufferedReader.readLine());
            if(c==1){
                System.out.println("Enter Video Title");
                String videoTitle = bufferedReader.readLine();
                channel.newVideoUploaded(videoTitle);
            } else if (c==2) {
                System.out.println("Enter name of Subscriber");
                String subsName = bufferedReader.readLine();
                Subscriber subscriber = new Subscriber(subsName);
                channel.subscriber(subscriber);
            } else if (c==3) {
                System.out.println("Enter the name for unSubscriber");
                String subsName = bufferedReader.readLine();
                Subscriber subscriber = new Subscriber(subsName);
                channel.unSubscriber(subscriber);
            }else if (c==4) {
                System.out.println("Thanks for using app");
                break;
            }else {
                System.out.println("Wrong input");
            }
        }
    }
}
