package designPattern.LLD.behavioural.Iterator;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}
