package itratorPattern;

import java.util.ArrayList;

public class UserManagement {
    private ArrayList<User> userList = new ArrayList();

    public void addUser(User user){
        userList.add(user);
    }

    public MyIterator getIterator(){
        return new MyIteratorImpl(userList);
    }
}
