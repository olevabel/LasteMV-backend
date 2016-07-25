package spordiklubi.ato.dto;


import com.fasterxml.jackson.annotation.JsonRootName;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by olevabel on 7/18/16.
 */
@Entity
@JsonRootName(value = "competitor")
public class Competitor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstname;
    private String lastname;
    private int age;
    private String gender;
    private String county;
    private String parentPhone;
    private String parentEmail;
    private long refereeId;

    protected Competitor() {
    }

    public Competitor(String firstname, String lastname, int age, String gender, String county, String parentPhone, String parentEmail, long refereeId) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
        this.county = county;
        this.parentPhone = parentPhone;
        this.parentEmail = parentEmail;
        this.refereeId = refereeId;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getParentPhone() {
        return parentPhone;
    }

    public void setParentPhone(String parentPhone) {
        this.parentPhone = parentPhone;
    }

    public String getParentEmail() {
        return parentEmail;
    }

    public void setParentEmail(String parentEmail) {
        this.parentEmail = parentEmail;
    }

    public long getRefereeId() {
        return refereeId;
    }

    public void setRefereeId(long refereeId) {
        this.refereeId = refereeId;
    }

    @Override
    public String toString() {
        return "Competitor{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", county='" + county + '\'' +
                ", parentPhone='" + parentPhone + '\'' +
                ", parentEmail='" + parentEmail + '\'' +
                ", refereeId=" + refereeId +
                '}';
    }
}
