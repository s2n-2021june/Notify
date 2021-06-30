package in.sel2in.ftl.notify.model.doc;

import java.util.Objects;
import org.springframework.data.annotation.Id;
public class User {

    @Id
    private String id;
    private String firstname;
    private String lastName; 
    private String email1;
    private String email2;
     private String phone1; 
     private String phone1CountryCode; private String phone2;
    private String phone1CountryCode2;

    private String pwd;

    public User() {
    }

    public User(String firstname, String lastName, String email1, String email2, String phone1, String phone1CountryCode, String phone2, String phone1CountryCode2, String pwd) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.email1 = email1;
        this.email2 = email2;
        this.phone1 = phone1;
        this.phone1CountryCode = phone1CountryCode;
        this.phone2 = phone2;
        this.phone1CountryCode2 = phone1CountryCode2;
        this.pwd = pwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(email1, user.email1) && Objects.equals(phone1, user.phone1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email1, phone1);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email1='" + email1 + '\'' +
                ", email2='" + email2 + '\'' +
                ", phone1='" + phone1 + '\'' +
                ", phone1CountryCode='" + phone1CountryCode + '\'' +
                ", phone2='" + phone2 + '\'' +
                ", phone1CountryCode2='" + phone1CountryCode2 + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone1CountryCode() {
        return phone1CountryCode;
    }

    public void setPhone1CountryCode(String phone1CountryCode) {
        this.phone1CountryCode = phone1CountryCode;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getPhone1CountryCode2() {
        return phone1CountryCode2;
    }

    public void setPhone1CountryCode2(String phone1CountryCode2) {
        this.phone1CountryCode2 = phone1CountryCode2;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
