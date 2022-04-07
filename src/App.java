import java.util.ArrayList;
import java.util.Scanner;

import People.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);

        ArrayList<Student> students=new ArrayList<>();

        System.out.println("How many Students: ");
        int t=scanner.nextInt();

        for(int i=0; i<t; i++){
            System.out.println("Adding Student\n");
            Student student=new Student();
            students.add(student);
        }

        for (Student s : students) {
            s.Info();
        }
    }
}
