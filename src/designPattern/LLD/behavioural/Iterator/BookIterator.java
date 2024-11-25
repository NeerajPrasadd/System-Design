package designPattern.LLD.behavioural.Iterator;

import java.util.List;

/**
 * <Class Name>: BookIterator
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 18/11/24
 */
public class BookIterator implements Iterator<Book> {

    private final List<Book> books;
    private int position = 0;

    public BookIterator(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return position < books.size();
    }

    @Override
    public Book next() {
        return hasNext() ? books.get(position++) : null;
    }
}
