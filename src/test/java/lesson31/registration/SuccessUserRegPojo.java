package lesson31.registration;

public class SuccessUserRegPojo {
    private Integer id;
    private String token;

    public SuccessUserRegPojo(Integer id, String token) {
        this.id = id;
        this.token = token;
    }

    public SuccessUserRegPojo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
