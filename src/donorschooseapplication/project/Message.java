package donorschooseapplication.project;

import java.util.Calendar;
import java.util.GregorianCalendar;

import donorschooseapplication.member.Member;

public class Message {

    private String text;
    private Calendar date;
    public Member member;

    //constructor
    public Message(String text) {
        this.text = text;
        this.date = GregorianCalendar.getInstance();
    }

    //setters & getters
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Calendar getDate() {
        return this.date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String toString() {
        return "your text is : " + this.text + ", it was posted at : " + this.date.getTime();
    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          package donorschooseapplication.project;

import java.util.Calendar;
import java.util.GregorianCalendar;

import donorschooseapplication.member.Member;

public class Message {

    private String text;
    private Calendar date;
    public Member member;

    //constructor
    public Message(String text) {
        this.text = text;
        this.date = GregorianCalendar.getInstance();
    }

    //setters & getters
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Calendar getDate() {
        return this.date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String toString() {
        return "your text is : " + this.text + ", it was posted at : " + this.date.getTime();
    }
}
