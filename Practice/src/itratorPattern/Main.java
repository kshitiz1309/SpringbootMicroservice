package itratorPattern;

public class Main {
    public static void main(String[] args) {
        UserManagement userManagement = new UserManagement();

        userManagement.addUser(new User("kshitiz","13"));
        userManagement.addUser(new User("py","23"));
        userManagement.addUser(new User("Ankit","23"));
        userManagement.addUser(new User("Atul","11"));
        userManagement.addUser(new User("Amit","01"));

        MyIterator myIterator = userManagement.getIterator();
        while (myIterator.hasNext()){
            User user = (User)myIterator.next();
            System.out.println(user.getName()+" : "+user.getUserId());
        }

    }
}
