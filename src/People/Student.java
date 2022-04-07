package People;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {

    Scanner scanner = new Scanner(System.in);
    String subject = "";
    String university="";
    ArrayList<String[]> booksBarrowed=new ArrayList<>();


    public Student() {
        super();
        
        System.out.println("\nSubject:");
        this.subject=scanner.next();

        System.out.println("\nUniversity: ");
        this.university=scanner.next();
    }

    public void setBooksBarrowed() {
        String [] information= new String[2];

        System.out.println("\nBook name:");
        information[0]=scanner.next();

        System.out.println("\nExpire date:");
        information[1]=scanner.next();

        this.booksBarrowed.add(information);
    }

    public void getBooksBarrowed() {
        for (String[] bookLog : this.booksBarrowed) {
            System.out.println(bookLog[1]+" "+bookLog[2]);
        }
    }

    public void Info() {
        System.out.println("Name: "+this.name);
        System.out.println("\nID: "+this.id);
        System.out.println("\nSubject: "+this.subject);
        System.out.println("\nUniversity: "+this.university);
        System.out.println(".............................");
    }

}
