public class Book {
    int pages;

    public Book(int pages) {
        this.pages = pages;
    }

    public static void main(String[] args) {
        Book myBook = new Book(300);
        System.out.println("Number of pages = " + myBook.pages);
    }
}
