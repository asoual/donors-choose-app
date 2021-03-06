package donorschooseapplication.project;

import donorschooseapplication.member.EmptyArrayException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ProjectList implements Comparator<Project> {

    List<Project> projects;

    public ProjectList() {
        this.projects = new LinkedList<>();
    }

    public boolean addProject(Project proj) {
        return projects.add(proj);

    }

    public boolean removeProject(Project proj) throws EmptyArrayException {
        try {
            return projects.remove(proj);
        } catch (NullPointerException e) {
            throw new EmptyArrayException();

        }
    }

    public void modifyProject(Project search, Project newProj) {
        int index = projects.indexOf(search);
        if (index >= 0) {
            projects.set(index, newProj);
        }
    }

    public ArrayList<Project> findprojectwithCategory(String categorystr) {
        ArrayList<Project> List = new ArrayList<>();
        ListIterator<Project> it = projects.listIterator();

        while (it.hasNext()) {
            Project temp = (Project) it.next();
            if (temp.getCategory().equals(categorystr)) {
                List.add(temp);
            }
        }

        return List;
    }

    @Override
    public int compare(Project s1, Project s2) {
        return (s1.getTitle_description().compareToIgnoreCase(s2.getTitle_description()));
    }

    public void sort(Comparator comp) {
        Collections.sort(projects, comp);
    }

    @Override
    public String toString() {
        String str = "";
        ListIterator<Project> iter = projects.listIterator();
        while (iter.hasNext()) {
            Project proj = iter.next();
            str += proj.toString();
        }
        return str;
    }

    public ListIterator<Project> getProjects() {
        return projects.listIterator();
    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           package donorschooseapplication.project;

import donorschooseapplication.member.EmptyArrayException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ProjectList implements Comparator<Project> {

    List<Project> projects;

    public ProjectList() {
        this.projects = new LinkedList<>();
    }

    public boolean addProject(Project proj) {
        return projects.add(proj);

    }

    public boolean removeProject(Project proj) throws EmptyArrayException {
        try {
            return projects.remove(proj);
        } catch (NullPointerException e) {
            throw new EmptyArrayException();

        }
    }

    public void modifyProject(Project search, Project newProj) {
        int index = projects.indexOf(search);
        if (index >= 0) {
            projects.set(index, newProj);
        }
    }

    public ArrayList<Project> findprojectwithCategory(String categorystr) {
        ArrayList<Project> List = new ArrayList<>();
        ListIterator<Project> it = projects.listIterator();

        while (it.hasNext()) {
            Project temp = (Project) it.next();
            if (temp.getCategory().equals(categorystr)) {
                List.add(temp);
            }
        }

        return List;
    }

    @Override
    public int compare(Project s1, Project s2) {
        return (s1.getTitle_description().compareToIgnoreCase(s2.getTitle_description()));
    }

    public void sort(Comparator comp) {
        Collections.sort(projects, comp);
    }

    @Override
    public String toString() {
        String str = "";
        ListIterator<Project> iter = projects.listIterator();
        while (iter.hasNext()) {
            Project proj = iter.next();
            str += proj.toString();
        }
        return str;
    }

    public ListIterator<Project> getProjects() {
        return projects.listIterator();
    }
}
