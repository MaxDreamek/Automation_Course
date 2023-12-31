package lesson31.registration;

public class RegisterPojo {
    private String email;
    private String password;

    public RegisterPojo(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public RegisterPojo(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
