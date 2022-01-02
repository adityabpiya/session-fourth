package day7;

public class User {

    String username;
    String password;
    String retypePassword;

    public boolean comparePassword () {
        return this.password.equals(this.retypePassword);
    }

}
