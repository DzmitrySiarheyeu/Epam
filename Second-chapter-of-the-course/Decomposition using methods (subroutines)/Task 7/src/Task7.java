public class Task7 {

    public static void main(String[] args) {

        int sum;

        System.out.println("Search for the sum of factorials of odd numbers from 1 to 9");

        sum = sumFactOddNum();

        System.out.println("The sum of the factorials of odd numbers is " + sum);


    }

    private static int sumFactOddNum() {

        int i = 1, sum=0;

        while(i<10){
            sum = sum + getFactorial(i);
            i = i + 2;
        }
        return sum;
    }

    public static int getFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }

}
