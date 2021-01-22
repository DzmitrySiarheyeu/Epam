import java.util.Scanner;

public class Task7 {

    private static Scanner input = new Scanner(System.in);
    private static Point a = new Point(),
                         b = new Point(),
                         c = new Point();

    private static Triangle triangle;


    public static void main(String[] args) {

        System.out.println("Creating objects, calculating the area, perimeter, and intersection point of the triangle medians");

        while (true){
            System.out.print("\nSelect an action" +
                    "\n1 - Set points" +
                    "\n2 - Get square" +
                    "\n3 - Get perimeter" +
                    "\n4 - Get median crossing" +
                    "\n5 - Get points" +
                    "\n0 - Exit\n");

            switch (input.nextInt()){
                case 0:
                    input.close();
                    System.exit(0);
                    break;
                case 1:
                    setPoints();
                    break;
                case 2:
                    getSquare();
                    break;
                case 3:
                    getPerimeter();
                    break;
                case 4:
                    getMedianCrossing();
                    break;
                case 5:
                    getPoints();
                    break;
            }
        }

    }

    private static void getPoints() {
        System.out.println("The points: ");
        triangle.print();
    }

    private static void getMedianCrossing() {
        System.out.print("The point of intersection of the meridians: ");
        triangle.median_crossing().print();
    }

    private static void getPerimeter() {
        System.out.println("The perimeter of the triangle is equal to " + triangle.perimeter());
    }

    private static void getSquare() {
        System.out.println("The area of the triangle is equal to " + triangle.square());
    }

    private static void setPoints() {

        System.out.println("Input A:");
        a.read(input);

        System.out.println("Input B:");
        b.read(input);

        System.out.println("Input C:");
        c.read(input);

        triangle = new Triangle(a, b, c);
    }
}
