package donorschooseapplication.member;

public class Teacher extends Member {

    private String school;
    private String position;
    private String contact_info;

    public Teacher(String username, String password, String school, String position, String contact_info) {
        super(username, password);
        this.school = school;
        this.position = position;
        this.contact_info = contact_info;
    }

    // setters & getters
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getContact_info() {
        return contact_info;
    }

    public void setContact_info(String contact_info) {
        this.contact_info = contact_info;
    }

    @Override
    public String toString() {
        return super.toString() + "your school is : " + this.school + "your position is : " + this.position
                + "your contact information : " + this.contact_info;
    }

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                              package donorschooseapplication.member;

public class Teacher extends Member {

    private String school;
    private String position;
    private String contact_info;

    public Teacher(String username, String password, String school, String position, String contact_info) {
        super(username, password);
        this.school = school;
        this.position = position;
        this.contact_info = contact_info;
    }

    // setters & getters
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getContact_info() {
        return contact_info;
    }

    public void setContact_info(String contact_info) {
        this.contact_info = contact_info;
    }

    @Override
    public String toString() {
        return super.toString() + "your school is : " + this.school + "your position is : " + this.position
                + "your contact information : " + this.contact_info;
    }

}
