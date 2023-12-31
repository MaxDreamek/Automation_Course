package homeworks.homework31;

import lesson31.registration.RegisterPojo;
import lesson31.registration.SuccessUserRegPojo;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static lesson31.Specification.*;

public class SuccessRegPojo {
    private String name;
    private String job;
    private String id;
    private String createdAt;

    public SuccessRegPojo(String name, String job, String id, String createdAt) {
        this.name = name;
        this.job = job;
        this.id = id;
        this.createdAt = createdAt;
    }

    public SuccessRegPojo() {
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "SuccessRegPojo" +
                " name = " + name +
                ", job =" + job +
                ", id = " + id +
                ", createdAt= " + createdAt;
    }
}
