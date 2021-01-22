import com.sun.istack.internal.NotNull;

import java.util.Scanner;

public class Task3 {

    private static Student student[] = new Student[255];
    private static Scanner input = new Scanner(System.in);
    private static String lastName, initials;
    private static int grade, group, count = 0;

    public static void main(String[] args) {

        System.out.print("Output list all students and students with good grades");

        while (true){
            System.out.print("\nSelect an action" +
                    "\n1 - Set student" +
                    "\n2 - Set grade" +
                    "\n3 - Get all students" +
                    "\n4 - Get good student" +
                    "\n0 - Exit\n");

            switch (input.nextInt()){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    setStudent();
                    break;
                case 2:
                    setGrade();
                    break;
                case 3:
                    getAllStudent();
                    break;
                case 4:
                    getGoodStudent();
                    break;
            }

        }
    }

    private static void getGoodStudent() {
        System.out.println("Good student:\n");
        for (int i = 0; i < count; ++i) {
            if (student[i].isGood()) student[i].print();
        }
    }

    private static void getAllStudent() {
        System.out.println("All student:\n");
        for (int i = 0; i < count; i++){
            student[i].print();
        }
    }

    private static void setGrade() {
        System.out.println("Input grade");

        for(int i = 1; i <= 5; i++){
            System.out.println("Input " + i + " greade");
            grade = input.nextInt();
            try{
            student[count].addGrade(grade);
            }catch(NullPointerException e){

            }

        }
        count++;
    }

    private static void setStudent() {

        System.out.println("Input last name");
        lastName = input.next();

        System.out.println("Input initials");
        initials = input.next();

        System.out.println("Input group");
        group = input.nextInt();

        student[count] = new Student(lastName, initials, group);
    }
}
