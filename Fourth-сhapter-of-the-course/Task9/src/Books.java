public class Books {

    private Book[] books;
    private int capacity, size;

    public Books(int capacity) {
        size = 0;
        this.capacity = capacity;
        books = new Book[this.capacity];
    }

    public Books() {
        this(10);
    }

    public void push_back(Book book) {
        if (size < capacity) {
            books[size] = book;
            size++;
        } else {
            Book[] buffer = new Book[capacity * 2];
            for (int i = 0; i < size; ++i) {
                buffer[i] = books[i];
            }
            books = buffer;
            capacity = capacity * 2;
            books[size] = book;
            size++;
        }
    }

}
