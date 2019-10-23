import models.Book;

public class BookRunner {

    public static void main(String[] args) {

        Book book1 = new Book();
        book1.setTitle("THW art");


        Book book2 = new Book();
        book2.setTitle("ola art");

        Book book3 = new Book();
        book3.setTitle("ola");

        System.out.println("O nome do livro é "+ book1.getTitle());
        System.out.println("O nome do livro é "+ book2.getTitle());
        System.out.println("O nome do livro é "+ book3.getTitle());
    }
}
