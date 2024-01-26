package builderPattern;

public class MainClient {
    public static void main(String[] args) {
        User user= new User.UserBuilder().setUserId("ksh123").setUsername("Kshitiz").setEmailId("kshitiz1309@gmail.com").build();
        User user2= User.UserBuilder.builder().setUserId("ch123").setUsername("chimpu").setEmailId("brokenh574@gmail.com").build();

        System.out.println(user);
        System.out.println(user2);
    }
}
