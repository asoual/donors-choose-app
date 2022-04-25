package donorschooseapplication;

import donorschooseapplication.member.*;
import donorschooseapplication.project.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DonorsChooseApplication {

    public static void main(String[] args) {
        System.out.println("welcome to our new project Donors Choose.");
        System.out.println("First, you need to create your account.");
        //username
        Scanner scanner = new Scanner(System.in);
     package donorschooseapplication;

import donorschooseapplication.member.*;
import donorschooseapplication.project.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DonorsChooseApplication {

    public static void main(String[] args) {
        System.out.println("welcome to our new project Donors Choose.");
        System.out.println("First, you need to create your account.");
        //username
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter username :");
        String username = scanner.nextLine();
        //password
        System.out.println("enter password ");
        String password = scanner.nextLine();
        // print username & password
        Member member = new Member(username, password);
        System.out.println(member.toString());
        // memberlist
        MemberList memb = new MemberList();
        Member m2 = new Member("hamza", "hamza123");
        Member m3 = new Member("achraf", "achraf123");
        Member m4 = new Member("ayoub", "ayoub123");
        //add
        memb.addMember(member);
        memb.addMember(m2);
        memb.addMember(m3);
        memb.addMember(m4);
        // toString 
        System.err.println("print members" + memb.toString());
        //modify
        m2.setPassword("hamzachanged");
        m3.setPassword("achrafchanged");
        m4.setPassword("ayoubchanged");
        //toString after modification
        System.err.println("print members after modifications. " + memb.toString());
        // modify members
        memb.modifyMember(m2, m3);
        System.err.println("print members after modifications. " + memb.toString());
        // search for username
        ArrayList<Member> members = memb.findMemberWithUsername("achraf");
        for (Member m : members) {
            System.err.println("here is what we found : " + m.toString());
        }
        //sorting
        memb.sort(memb);
        // toString
        System.err.println("members sorted   " + memb.toString());
        //remove
        try {
            memb.removeMember(m4);

        } catch (EmptyArrayException a) {
            System.err.println(a.getMessage());
        }
        System.err.println("print remaining members" + memb.toString());

        //changepass behavior
        System.out.println("do you want to change your password ? ");
        String Answer = "yes";
        String answer = scanner.nextLine();
        if (answer.equals(Answer)) {
            System.out.println("enter your new password.");
            password = scanner.nextLine();
            if (member.changePassword(password) == (false)) {
                System.out.println("INVALID! the new password is the same as the old password. ");
            } else {
                System.out.println("your password has been changed.");
            }
        }
        //print password and username
        System.out.println(member.toString());

        // reset password behavior
        System.out.println("do want to reset your password ?");
        String answe = scanner.nextLine();
        if (answe.equals(Answer)) {
            System.out.println("enter your username");
            String useername = scanner.nextLine();
            System.out.println("enter your password");
            String passwoord = scanner.nextLine();
            if (username.equals(useername) && password.equals(passwoord)) {
                if (member.resetPassword(useername, passwoord) == (true)) {
                    System.out.println("you are able to reset your password");
                    System.out.println("enter your new password");
                    password = scanner.nextLine();
                    System.out.println("your password has been reset to " + password);
                }
            } else {
                System.out.println("we cannot reset password when both username and"
                        + " password are not correct.");
            }
        }
        //print password and username
        System.out.println(member.toString());
        //enter firstname
        System.out.println("enter your first name");
        String first_name = scanner.nextLine();
        //enter lastname
        System.out.println("enter your last name");
        String last_name = scanner.nextLine();
        //enter email
        System.out.println("enter your email");
        String email = scanner.nextLine();
        //enter address
        System.out.println("enter your address");
        String address = scanner.nextLine();
        //enter phonenumber
        System.out.println("enter your phone number");
        String phone = scanner.nextLine();
        // display profile
        Profile profile = new Profile(first_name, last_name, email, address, phone);
        System.out.println(profile.toString());

        //ask if its teacher or donor
        System.out.println("are you a teacher or a donor ?");
        String question = scanner.nextLine();
        if (question.equals("teacher")) {
            // enter teacher details
            System.out.println("Which school are you in?");
            String school = scanner.nextLine();
            System.out.println("What is your position?");
            String position = scanner.nextLine();
            System.out.println("input your contact information. ");
            String contact_info = scanner.nextLine();
            // display teacher details
            member = new Teacher(username, password, school, position, contact_info);
            System.out.println(member.toString());// polymorphic call to teacher

            // enter project details
            System.out.println("what is the title of the project you want to post");
            String title_description = scanner.nextLine();
            System.out.println("how much is your funding goal? ");
            double funding_goal = scanner.nextDouble();
            System.out.println("What type of project it is? ");
            String type = scanner.nextLine();
            System.out.println("what is the average grade of your student? ");
            double student_grade = scanner.nextDouble();
            System.out.println("what school will this project take place? ");
            String schooll = scanner.nextLine();
            System.out.println("how many student will this project impact?");
            int nb_student_impacted = scanner.nextInt();
            System.out.println("here are the categories :");
            for (Category cat : Category.values()) {
                System.out.println(cat);
            }
            System.out.println("choose one of these categories : ");
            try {
                Category category = Category.valueOf(scanner.next().toUpperCase());
                Project project = new Project(title_description, funding_goal,
                        type, student_grade, schooll, nb_student_impacted, category);
                System.out.println("the money donated is ");
                double money_donated = scanner.nextDouble();
                project.donate(money_donated);
                System.out.println("left to go : " + project.left_to_go());
                System.out.println("enter you message :");
                String text = scanner.nextLine();
                System.out.println(project.toString());
                System.out.println("the message posted is :  " + project.Post_message(text));
                Message message = new Message(text);
                System.out.println(message.toString());
                Donation donation = new Donation(money_donated);
                System.out.println(donation.toString());
                // projectList
                ProjectList proj = new ProjectList();
                Project p1 = new Project("eventful", 1000, "website",
                        3.4, "aui", 23,
                        category);
                Project p2 = new Project("bank System", 2000, "website",
                        3.6, "aui", 19,
                        category);
                //add
                proj.addProject(project);
                proj.addProject(p1);
                proj.addProject(p2);
                // toString 
                System.err.println("print projects" + proj.toString());
                // modify projcets
                proj.modifyProject(p1, p2);
                System.err.println("print projects after modifications. " + proj.toString());
                // search 
                ArrayList<Project> projects = proj.findprojectwithCategory("math_science");
                for (Project p : projects) {
                    System.err.println("here is what we found : " + p.toString());
                }
                //sorting
                proj.sort(proj);
                // toString
                System.err.println("projects sorted   " + proj.toString());
                //remove
                try {
                    proj.removeProject(p2);

                } catch (EmptyArrayException a) {
                    System.err.println(a.getMessage());
                }
                System.err.println("print remaining projects" + proj.toString());

                // enter material attributes
                System.out.println("enter the reference : ");
                String reference = scanner.nextLine();
                System.out.println("enter the description : ");
                String description = scanner.nextLine();
                System.out.println("enter the unit_price : ");
                String unit_price = scanner.nextLine();
                System.out.println("enter the quantity needed : ");
                String needed_quantity = scanner.nextLine();
                Material material = new Material(reference, description, unit_price, needed_quantity);
                System.out.println(material.toString());

            } catch (InputMismatchException m) {
                System.out.println("wrong input!");
            } catch (IllegalArgumentException e) {
                System.out.println("this category does not exist  ! ");
            }

        } else if (question.equals("donor")) {
            System.out.println("the project added is ");
            String add_project = scanner.nextLine();
            System.out.println("the amount donated to the added project is : ");
            double amount_donated = scanner.nextDouble();
            System.out.println("the project deleted is ");
            String delete_project = scanner.nextLine();
            member = new Donor(username, password, amount_donated, add_project, delete_project);
            System.out.println(member.toString());//polymorphic call to donor
            Donation donation = new Donation(amount_donated);
            System.out.println(donation.toString());
        } else {
            System.out.println("wrong input!");
        }

    }
}
