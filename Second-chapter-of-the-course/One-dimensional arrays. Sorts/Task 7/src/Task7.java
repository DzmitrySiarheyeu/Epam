import java.util.*;

public class Task7 {

        public static void main (String[]args){

            int n1, n2;
            List<Integer> in, from, indexes;

            Scanner input = new Scanner(System.in);
            Random random = new Random();

            System.out.println("Forming a new sequence from two sequences");
            System.out.println("Input n1 and n2:");

            n1 = input.nextInt();
            n2 = input.nextInt();

           in = new ArrayList<>();
           from = new ArrayList<>();

           for(int i = 0; i<n1; i++){
               in.add(random.nextInt(100));
           }

            for(int i = 0; i<n2; i++){
                from.add(random.nextInt(100));
            }

            Collections.sort(in);
            Collections.sort(from);

           System.out.println(in);
           System.out.println(from);

            indexes = getIndexes(in, from);
            System.out.println("Where you want to insert " + indexes);

            for (int i = 0; i < indexes.size(); i++) in.add(indexes.get(i)-1, from.get(i));
            System.out.println("After inserting " + in);

            input.close();

        }

        private static List<Integer> getIndexes (List < Integer > in, List < Integer > from){
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < from.size(); i++) {
                int dex = Collections.binarySearch(in, from.get(i));
                if (dex < 0) result.add(-(dex + 1) + i+1);
                else result.add(dex + i);
            }
            return result;
        }

}
