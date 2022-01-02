package day7;

public class User {

    private String username;
    private String password;
    private String retypePassword;

    public boolean comparePassword () {
        return this.password.equals(this.retypePassword);
    }

}
