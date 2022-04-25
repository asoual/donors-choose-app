package donorschooseapplication.member;

public class Member {

    private String username;
    private String password;
    public Profile profile;// association

    // constructor
    public Member(String username, String password) {
       package donorschooseapplication.member;

public class Member {

    private String username;
    private String password;
    public Profile profile;// association

    // constructor
    public Member(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Member(String username, String password, Profile profile) {
        this(username, password);
        this.profile = profile;
    }

    // setters & getters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // change password behavior
    public boolean changePassword(String password) {
        if (this.password.equals(password)) {
            return false;
        } else {
            this.password = password;
            return true;
        }
    }

    // reset password behavior
    public boolean resetPassword(String username, String password) {
        if (this.username.equals(username)) {
            this.password = password;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String str = "username is : " + this.username + ", password is : " + this.password;
        if (profile != null) {
            str += ", your profile is : " + profile.toString();
        }
        return str;
    }

    @Override
    public boolean equals(Object obj) {
        Member m = (Member) obj;
        return m.username.equals(this.username);
    }
}
