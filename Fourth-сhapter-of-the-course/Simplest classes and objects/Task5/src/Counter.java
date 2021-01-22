import java.util.Random;

class Counter {

    private int min, max, current;
    private static Random random = new Random();

    public Counter(int min, int max, int current) {

        this.min = min;
        this.max = max;
        this.current = current;
        if (this.max < this.min) {
            int tmp = this.max;
            this.max = this.min;
            this.min = tmp;
        }
        if (this.current < this.min)
            this.current = this.min;
        if (this.current > this.max)
            this.current = this.max;
    }

    public Counter(int min, int max) {
        this(min, max, min);
        this.current = this.min;
    }

    public Counter() {
        this(0, 10, 0);
    }

    public Counter(int limit){
            this(random.nextInt(limit), random.nextInt(limit), random.nextInt(limit));
    }

    public void inc() {
        current++;
        if (current > max)
            current = min;
    }

    public void dec() {
        current--;
        if (current < min)
            current = max;
    }

    public int value() {
        return current;
    }
}