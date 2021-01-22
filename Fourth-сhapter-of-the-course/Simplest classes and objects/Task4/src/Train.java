import java.util.Comparator;

class Train {
    private String destination;
    private int number;
    private String departureTime;

    public Train(String destination, int number, String departureTime) {
        this.destination = destination;
        this.number = number;
        this.departureTime = departureTime;
    }

    public static class ByNumberComparator implements Comparator < Train > {
        @Override
        public int compare(Train left, Train right) {
            return left.number - right.number;
        }
    }

    public static class ByDestinationAndTimeComparator implements Comparator < Train > {
        @Override
        public int compare(Train left, Train right) {
            if (left.destination == right.destination)
                return left.departureTime.compareTo(right.departureTime);

            return left.destination.compareTo(right.destination);
        }
    }

    public void print() {
        System.out.println(number + " -> " + destination + " : " + departureTime);
    }
}