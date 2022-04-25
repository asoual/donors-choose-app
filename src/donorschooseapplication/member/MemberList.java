package donorschooseapplication.member;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MemberList implements Comparator<Member> {

    List<Member> members;

    public MemberList() {
        this.members = new LinkedList<>();
    }

    public boolean addMember(Member memb) {
        return members.add(memb);

    }

    public boolean removeMember(Member memb) throws EmptyArrayException {
        try {
            return members.remove(memb);
        } catch (NullPointerException e) {
            throw new EmptyArrayException();

        }
    }

    public void modifyMember(Member search, Member newMemb) {
        int index = members.indexOf(search);
        if (index >= 0) {
            members.set(index, newMemb);
        }
    }

    public ArrayList<Member> findMemberWithUsername(String username) {
        ArrayList<Member> List = new ArrayList<>();
        ListIterator<Member> it = members.listIterator();

        while (it.hasNext()) {
            Member temp = (Member) it.next();
            if (temp.getUsername().equals(username)) {
                List.add(temp);
            }
        }
        return List;
    }

    @Override
    public int compare(Member s1, Member s2) {
        return (s1.getUsername().compareToIgnoreCase(s2.getUsername()));
    }

    public void sort(Comparator comp) {
        Collections.sort(members, comp);
    }

    @Override
    public String toString() {
        String str = "";
        ListIterator<Member> iter = members.listIterator();
        while (iter.hasNext()) {
            Member memb = iter.next();
            str +=package donorschooseapplication.member;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MemberList implements Comparator<Member> {

    List<Member> members;

    public MemberList() {
        this.members = new LinkedList<>();
    }

    public boolean addMember(Member memb) {
        return members.add(memb);

    }

    public boolean removeMember(Member memb) throws EmptyArrayException {
        try {
            return members.remove(memb);
        } catch (NullPointerException e) {
            throw new EmptyArrayException();

        }
    }

    public void modifyMember(Member search, Member newMemb) {
        int index = members.indexOf(search);
        if (index >= 0) {
            members.set(index, newMemb);
        }
    }

    public ArrayList<Member> findMemberWithUsername(String username) {
        ArrayList<Member> List = new ArrayList<>();
        ListIterator<Member> it = members.listIterator();

        while (it.hasNext()) {
            Member temp = (Member) it.next();
            if (temp.getUsername().equals(username)) {
                List.add(temp);
            }
        }
        return List;
    }

    @Override
    public int compare(Member s1, Member s2) {
        return (s1.getUsername().compareToIgnoreCase(s2.getUsername()));
    }

    public void sort(Comparator comp) {
        Collections.sort(members, comp);
    }

    @Override
    public String toString() {
        String str = "";
        ListIterator<Member> iter = members.listIterator();
        while (iter.hasNext()) {
            Member memb = iter.next();
            str += memb.toString();
        }
        return str;
    }
    public ListIterator<Member> getMembers(){
        return members.listIterator();
    }
}
