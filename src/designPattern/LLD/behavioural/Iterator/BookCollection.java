package designPattern.LLD.behavioural.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * <Class Name>: BookCollection
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 18/11/24
 */
public class BookCollection implements Aggregate<Book> {

    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public Iterator<Book> createIterator() {
        return new BookIterator(books);
    }
}
