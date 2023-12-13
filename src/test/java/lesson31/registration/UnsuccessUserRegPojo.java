package lesson31.registration;

public class UnsuccessUserRegPojo {
    private String error;


    public UnsuccessUserRegPojo(String error) {
        this.error = error;
    }

    public UnsuccessUserRegPojo() {
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
