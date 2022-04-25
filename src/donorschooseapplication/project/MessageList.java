package donorschooseapplication.project;

import donorschooseapplication.member.EmptyArrayException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MessageList implements Comparator<Message> {

    List<Message> messages;

    public MessageList() {
        this.messages = new LinkedList<>();
    }

    public boolean addMessage(Message mess) {
        return messages.add(mess);

    }

    public boolean remveMessage(Message mess) throws EmptyArrayException {
        try {
            return messages.remove(mess);
        } catch (NullPointerException e) {
            throw new EmptyArrayException();

        }
    }

    public void modifyMessage(Message search, Message newMess) {package donorschooseapplication.project;

import donorschooseapplication.member.EmptyArrayException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MessageList implements Comparator<Message> {

    List<Message> messages;

    public MessageList() {
        this.messages = new LinkedList<>();
    }

    public boolean addMessage(Message mess) {
        return messages.add(mess);

    }

    public boolean remveMessage(Message mess) throws EmptyArrayException {
        try {
            return messages.remove(mess);
        } catch (NullPointerException e) {
            throw new EmptyArrayException();

        }
    }

    public void modifyMessage(Message search, Message newMess) {
        int index = messages.indexOf(search);
        if (index >= 0) {
            messages.set(index, newMess);
        }
    }

    public ArrayList<Message> findMemberWithUsername(String text) {
        ArrayList<Message> List = new ArrayList<>();
        ListIterator<Message> it = messages.listIterator();

        while (it.hasNext()) {
            Message temp = (Message) it.next();
            if (temp.getText().equals(text)) {
                List.add(temp);
            }
        }

        return List;
    }

    @Override
    public int compare(Message s1, Message s2) {
        return (s1.getText().compareToIgnoreCase(s2.getText()));
    }

    public void sort(Comparator comp) {
        Collections.sort(messages, comp);
    }

    @Override
    public String toString() {
        String str = "";
        ListIterator<Message> iter = messages.listIterator();
        while (iter.hasNext()) {
            Message mess = iter.next();
            str += mess.toString();
        }
        return str;
    }
    public ListIterator<Message> getMessages(){
        return messages.listIterator();
    }
}
