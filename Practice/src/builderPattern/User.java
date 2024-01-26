package builderPattern;

public class User {

    private String username;
    private String userId;
    private String emailId;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", userId='" + userId + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    private User(UserBuilder userBuilder){
        this.userId=userBuilder.userId;
        this.username=userBuilder.username;
        this.emailId=userBuilder.emailId;

    }
    public String getUsername() {
        return username;
    }

    public String getUserId() {
        return userId;
    }

    public String getEmailId() {
        return emailId;
    }

    static class UserBuilder{
        private String username;
        private String userId;
        private String emailId;

        public UserBuilder(){

        }

        public static UserBuilder builder(){
            return new UserBuilder();
        }
        public UserBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public User build(){
            User user = new User(this);
            return user;
        }
    }
}
