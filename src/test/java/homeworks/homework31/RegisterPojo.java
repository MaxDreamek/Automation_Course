package homeworks.homework31;

public class RegisterPojo {
    private String name;
    private String job;

    public RegisterPojo(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public RegisterPojo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "RegisterPojo" +
                " name = " + name +
                ", job = " + job;
    }
}
