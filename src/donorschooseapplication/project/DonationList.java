package donorschooseapplication.project;

import donorschooseapplication.member.EmptyArrayException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class DonationList implements Comparator<Donation> {
List <Donation> donations;

public DonationList(){
    this.donations = new LinkedList<>();
}
public boolean addDonation(Donation dona){
    return donations.add(dona);
    
}
public boolean removeDonation(Donation dona)throws EmptyArrayException{
    try{
    return donations.remove(dona);
    }catch (NullPointerException e ){
    throw new EmptyArrayException();
    
    }
    }

public void modifyDonation (Donation search,Donation newDona){
    int index = donations.indexOf(search);
    if (index >=0){
        donations.set(ipackage donorschooseapplication.project;

import donorschooseapplication.member.EmptyArrayException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class DonationList implements Comparator<Donation> {
List <Donation> donations;

public DonationList(){
    this.donations = new LinkedList<>();
}
public boolean addDonation(Donation dona){
    return donations.add(dona);
    
}
public boolean removeDonation(Donation dona)throws EmptyArrayException{
    try{
    return donations.remove(dona);
    }catch (NullPointerException e ){
    throw new EmptyArrayException();
    
    }
    }

public void modifyDonation (Donation search,Donation newDona){
    int index = donations.indexOf(search);
    if (index >=0){
        donations.set(index,newDona);
    }    
}

public ArrayList<Donation> findMemberWithUsername(double amount){
ArrayList<Donation> List= new ArrayList<>();   
    ListIterator<Donation> it = donations.listIterator();
    
        while (it.hasNext()) {
            Donation temp = (Donation) it.next();
            if(temp.getAmount()==amount){   
               List.add(temp); 
            }                      
        }
        return List;
}
    @Override
    public int compare(Donation s1, Donation s2) {
        return (int)(s1.getAmount() - s2.getAmount());
    }
    
    public void sort(Comparator comp){        
        Collections.sort(donations, comp);
    }
    
    @Override
    public String toString(){
    String str = "";
    ListIterator<Donation> iter = donations.listIterator();
    while(iter.hasNext()){
        Donation dona = iter.next();
        str += dona.toString();
    }
    return str;
    }
    public ListIterator<Donation> getDonations(){
        return donations.listIterator();
    }
}
    

