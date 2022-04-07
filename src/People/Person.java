package People;

import java.util.Scanner;

public class Person {
    Scanner scanner=new Scanner(System.in);
    String name="";
    int id=0;

    Person(){
        System.out.println("\nName with -:");
        this.name=scanner.next();

        System.out.println("\nid:");
        this.id=scanner.nextInt();;
    }    
}
