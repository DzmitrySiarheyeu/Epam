import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        String in;
        int count = 0, co = 0;
        int[] max, id;

        Scanner input = new Scanner(System.in);

        System.out.println("Search for the longest word in the text");
        System.out.println("Input text:");

        in = input.nextLine();
        in = in + " ";

        max = new int[in.length()];
        id = new int[in.length()];

        for(int i = 0; i < in.length(); i++){
            if(in.charAt(i) == ' ') {
                if(count > max[0]) {
                    max[0] = count;
                    id[0] = i - count;
                    co=1;
                }else if(count == max[0]){
                    max[co] = count;
                    id[co] = i - count;
                    co++;
                }
                count = 0;
            }else {
               count++;
            }
        }

        System.out.println("The longest words:");

        for(int i = 0; i <=co; i++){
            for(int j = id[i]; j < id[i]+max[i]; j++){
                System.out.print(in.charAt(j));
            }
            System.out.print("\n");
        }

        input.close();
    }
}
