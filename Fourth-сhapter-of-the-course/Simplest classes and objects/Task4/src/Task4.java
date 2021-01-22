import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

    private static String station, departure_time;
    private static int num, count = 0;

    private static Scanner input = new Scanner(System.in);
    private static Train trains[] = new Train[255];

    public static void main(String[] args) {

        System.out.print("Train task");

        while (true){
            System.out.print("\nSelect an action" +
                    "\n1 - Set Train" +
                    "\n2 - Get train information by number" +
                    "\n3 - Get all trains" +
                    "\n4 - Sort by number train" +
                    "\n5 - Sort by destination" +
                    "\n0 - Exit\n");

            switch (input.nextInt()){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    setTrain();
                    break;
                case 2:
                    getTrainInformationByNumber();
                    break;
                case 3:
                    getAllTrains();
                    break;
                case 4:
                    sortTrainByNumber();
                    break;
                case 5:
                    sortByDestination();
                    break;
            }

        }
    }

    private static void sortByDestination() {
       try{
         Arrays.sort(trains, new Train.ByDestinationAndTimeComparator());
       }catch (NullPointerException e){

       }
    }

    private static void sortTrainByNumber() {
        try {
            Arrays.sort(trains, new Train.ByNumberComparator());
        }catch (NullPointerException e){

        }
    }

    private static void getAllTrains() {
        for (int i = 0; i < count; ++i) {
            System.out.print(i + " ");
            trains[i].print();
        }
    }

    private static void getTrainInformationByNumber() {
        System.out.println("Input train number");
        int numberTrain = input.nextInt();
        if (numberTrain < 0 || numberTrain >= count)
            System.out.println("Uncorrected number");
        else
            trains[numberTrain].print();

    }

    private static void setTrain() {
        System.out.println("Input destination");
        station = input.next();

        System.out.println("Input number");
        num = input.nextInt();

        System.out.println("Input departure time");
        departure_time = input.next();

        trains[count] = new Train(station, num, departure_time);

        count++;
    }
}
