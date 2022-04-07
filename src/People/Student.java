package People;

import java.util.ArrayList;

public class Student extends Person {

    String subject = "";
    String university="";
    ArrayList<String[]> booksBarrowed=new ArrayList<>();


    Student(String name, int id, String subject, String university) {
        super(name, id);
        this.subject=subject;
        this.university=university;
    }

    void setBooksBarrowed(String[] bookAndDeadLine) {
        this.booksBarrowed.add(bookAndDeadLine);
    }

    void Info() {
        System.out.println("Name: "+this.name);
        System.out.println("ID: "+this.id);
        System.out.println("Subject: "+this.subject);
        System.out.println("University: "+this.university);
        System.out.println(".............................");
        for (String[] bookLog : booksBarrowed) {
            System.out.println(bookLog[1]+" "+bookLog[2]);
        }
    }

}
