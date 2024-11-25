package designPattern.LLD.behavioural.Iterator;

/**
 * <Class Name>: IteratorApp
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 18/11/24
 */
public class IteratorApp {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();

        bookCollection.addBook(new Book("java 51"));
        bookCollection.addBook(new Book("Orange"));
        bookCollection.addBook(new Book("The Champion Mind"));

        Iterator<Book> iterator = bookCollection.createIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next().getTitle());
        }
    }
}
