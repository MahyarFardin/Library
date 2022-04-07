package People;

import java.util.Scanner;

public class Worker{
    Scanner scanner=new Scanner(System.in);
    String role="";
    String password="";
    
    Worker(){
        super();

        System.out.println("\nWhat is the role: ");
        this.role=scanner.next();

        System.out.println("\nPassword:");
        this.password=scanner.next();
    }

    public void giveBook() {
        Student.setBooksBarrowed();
    }
    
}
