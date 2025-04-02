import java.util.Scanner;

public class Main {
    // Creating class
    public static class Book {
        // private properties
        private String title;
        private String author;
        private int numberOfPages;

        // getters and setters go here
        // Remember: 
        // 1. They must not allow empty string for 'title' and 'author'.
        // 2. They must not allow negative or zero value for 'numberOfPages'.
        // 3. If such values are attempted to be set, the property should remain unchanged.
        public String getTitle(){
            return this.title;
        }

        public String getAuthor(){
            return this.author;
        }

        public int getNumberOfPages(){
            return this.numberOfPages;
        }

        public void setTitle(String title){
            if(title != null)
                this.title = title;
        }

        public void setAuthor(String author){
            if(author != null)
                this.author = author;
        }

        public void setNumberOfPages(int numberOfPages){
            if(numberOfPages > 0)
                this.numberOfPages = numberOfPages;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an object of the Book class
        Book book = new Book();

        // Take Title, Author and numberOfPages as next inputs and set them using the mutator methods
        // Your code here
        book.setTitle(scanner.nextLine());
        book.setAuthor(scanner.nextLine());
        book.setNumberOfPages(scanner.nextInt());

        // Then use the accessor methods to get and print these values.
        System.out.println(book.getTitle()); // Your code here
        System.out.println(book.getAuthor());
        System.out.println(book.getNumberOfPages());

        scanner.close();
    }

}