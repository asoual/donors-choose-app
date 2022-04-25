package donorschooseapplication.project;

import donorschooseapplication.member.Teacher;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Project {

    private String title_description;
    private double funding_goal;
    private String type;
    private double student_grade;
    private String school;
    private int nb_student_impacted;
    private Category category;
    private double money_donated;
    public Teacher teacher;
    private String text;
    private Calendar date_posted;
    private Calendar expiration_date;

    // we still need to implement date posted, and expiration date,
    // constructor
    public Project(String title_description, double funding_goal, String type,
            double student_grade, String schooll, int nb_student_impacted,
            Category category) {

        this.title_description = title_description;
        this.funding_goal = funding_goal;
        this.type = type;
        this.student_grade = student_grade;
        this.school = schooll;
        this.nb_student_impacted = nb_student_impacted;
        this.category = category;
        this.date_posted = new GregorianCalendar();
        this.expiration_date = new GregorianCalendar();
    }
    // setters & getters

    public String getTitle_description() {
        return title_description;
    }

    public void setTitle_description(String title_description) {
        this.title_description = title_description;
    }

    public double getFunding_goal() {
        return funding_goal;
    }

    public void setFunding_goal(double funding_goal) {
        this.funding_goal = funding_goal;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getStudent_grade() {
        return student_grade;
    }

    public void setStudent_grade(double student_grade) {
        this.student_grade = student_grade;
  package donorschooseapplication.project;

import donorschooseapplication.member.Teacher;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Project {

    private String title_description;
    private double funding_goal;
    private String type;
    private double student_grade;
    private String school;
    private int nb_student_impacted;
    private Category category;
    private double money_donated;
    public Teacher teacher;
    private String text;
    private Calendar date_posted;
    private Calendar expiration_date;

    // we still need to implement date posted, and expiration date,
    // constructor
    public Project(String title_description, double funding_goal, String type,
            double student_grade, String schooll, int nb_student_impacted,
            Category category) {

        this.title_description = title_description;
        this.funding_goal = funding_goal;
        this.type = type;
        this.student_grade = student_grade;
        this.school = schooll;
        this.nb_student_impacted = nb_student_impacted;
        this.category = category;
        this.date_posted = new GregorianCalendar();
        this.expiration_date = new GregorianCalendar();
    }
    // setters & getters

    public String getTitle_description() {
        return title_description;
    }

    public void setTitle_description(String title_description) {
        this.title_description = title_description;
    }

    public double getFunding_goal() {
        return funding_goal;
    }

    public void setFunding_goal(double funding_goal) {
        this.funding_goal = funding_goal;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getStudent_grade() {
        return student_grade;
    }

    public void setStudent_grade(double student_grade) {
        this.student_grade = student_grade;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getNb_student_impacted() {
        return nb_student_impacted;
    }

    public void setNb_student_impacted(int nb_student_impacted) {
        this.nb_student_impacted = nb_student_impacted;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getMoney_donated() {
        return money_donated;
    }

    public void setMoney_donated(double money_donated) {
        this.money_donated = money_donated;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Calendar getDate_posted() {
        return date_posted;
    }

    public void setDate_posted(Calendar date_posted) {
        this.date_posted = date_posted;
    }

    public Calendar getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(Calendar expiration_date) {
        this.expiration_date = expiration_date;
    }
    // behaviors

    public double left_to_go() {
        return this.funding_goal - this.money_donated;
    }

    public void donate(double money_donated) {
        this.money_donated += money_donated;
    }

    public String Post_message(String text) {
        Message message = new Message(text);
        return text;
    }

    public String toString() {
        return "the title is" + this.title_description + ", it needs" + this.funding_goal + "to reach "
                + "its goal" + ", the type of the project is" + this.type + ", the average"
                + " student grade is : " + this.student_grade + ", the school where the project"
                + " will take place is : " + this.school + ", number of student impacted"
                + this.nb_student_impacted + ", the category : " + this.category + "the date"
                + " the project was posted " + this.getDate_posted() + ", the expiration date is :"
                + this.getExpiration_date();
    }

}
