package donorschooseapplication.project;
import java.util.Calendar;
import java.util.GregorianCalendar; 

import donorschooseapplication.member.Donor;

public class Donation {

    private double amount;
    private Calendar date;
    public Donor donor;
    public Project project;

    public Donation (double amount){
        this.amount = amount;
        this.date = GregorianCalendar.getInstance();
    }
    //setters & getters

    public double getAmount() {
        return amount;
    }

    public voipackage donorschooseapplication.project;
import java.util.Calendar;
import java.util.GregorianCalendar; 

import donorschooseapplication.member.Donor;

public class Donation {

    private double amount;
    private Calendar date;
    public Donor donor;
    public Project project;

    public Donation (double amount){
        this.amount = amount;
        this.date = GregorianCalendar.getInstance();
    }
    //setters & getters

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public Calendar getDate(){
        return this.date;
    }
    public void setDate(Calendar date){
        this.date = date;
    }
    
    public String toString(){
        return "the amount donated is : " + this.amount + ", it was donated at : " + this.date.getTime() ;
    }
}
