import db.DBAuthor;
import db.DBBook;
import models.Author;
import models.Book;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Author author1 = new Author("Stephen", "King", 70);
        Author author2 = new Author ("Rhona", "Bryne", 72);
        DBAuthor.save(author1);
        DBAuthor.save(author2);

        List<Author> allAuthors = DBAuthor.getAll();
        DBAuthor.deleteAll();
        List<Author> allAuthorsAfterDelete = DBAuthor.getAll();



        Book book1 = new Book("The Secret", 2006);
        Book book2 = new Book ("The Shining", 1977);
        DBBook.save(book1);
        DBBook.save(book2);


        List<Book> allBooks = DBBook.getAll();
        DBBook.deleteAll();
        List<Book> allBooksAfterDelete = DBBook.getAll();



    }


}

