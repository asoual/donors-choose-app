package donorschooseapplication.member;

public class Profile {

    private String first_name;
    private String last_name;
    private String email;
    private String address;
    private String phone;

    // constructor
    public Profile(String first_name, String last_name, String email,
            String address, String phone) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.address = address;
        this.phone = phone;

    }

    // setters & getters
    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return "your first name is : " + this.first_name + ", your last name is : " + this.last_name
                + ", enter your email : " + this.email + ", enter your address : " + this.address
                + ", enter you phone number : " + this.phone;
    }
}
                                                                                                                                                                                                                                                                                                               package donorschooseapplication.member;

public class Profile {

    private String first_name;
    private String last_name;
    private String email;
    private String address;
    private String phone;

    // constructor
    public Profile(String first_name, String last_name, String email,
            String address, String phone) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.address = address;
        this.phone = phone;

    }

    // setters & getters
    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return "your first name is : " + this.first_name + ", your last name is : " + this.last_name
                + ", enter your email : " + this.email + ", enter your address : " + this.address
                + ", enter you phone number : " + this.phone;
    }
}
