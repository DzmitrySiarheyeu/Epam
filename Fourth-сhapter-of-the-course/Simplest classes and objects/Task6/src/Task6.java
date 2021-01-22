import java.util.Scanner;

public class Task6 {

    private static Scanner input = new Scanner(System.in);

    public static Time time = new Time();

     public static void main(String[] args) {

         System.out.println("Creating objects, calculating the area, perimeter, and intersection point of the triangle medians");

         while (true) {
             System.out.print("\nSelect an action" +
                     "\n1 - Set time" +
                     "\n2 - Get time" +
                     "\n3 - Add seconds" +
                     "\n4 - Add minutes" +
                     "\n5 - Add hours" +
                     "\n6 - Get second" +
                     "\n7 - Get minutes" +
                     "\n8 - Get hours" +
                     "\n0 - Exit\n");

             switch (input.nextInt()){
                 case 0:
                     input.close();
                     System.exit(0);
                     break;
                 case 1:
                     setTime();
                     break;
                 case 2:
                     getTime();
                     break;
                 case 3:
                     addSeconds();
                     break;
                 case 4:
                     addMinutes();
                     break;
                 case 5:
                     addHours();
                     break;
                 case 6:
                     getSeconds();
                     break;
                 case 7:
                     getMinutes();
                     break;
                 case 8:
                     getHours();
             }
         }
     }

    private static void getHours() {

        System.out.print("Hours: " + time.hours());
    }

    private static void getMinutes() {

        System.out.print("Minutes: " + time.minutes());
    }

    private static void getSeconds() {

         System.out.print("Seconds: " + time.seconds());
    }

    private static void addHours() {

        System.out.println("Input hours");

        time.add_hours(input.nextInt());
    }

    private static void addMinutes() {

        System.out.println("Input minutes");

        time.add_minutes(input.nextInt());
    }

    private static void addSeconds() {

         System.out.println("Input seconds");

         time.add_seconds(input.nextInt());
    }

    private static void getTime() {

         System.out.print("Time: ");

         time.print();
    }

    private static void setTime() {

         System.out.println("Input time");
         time.read(input);
    }
}
