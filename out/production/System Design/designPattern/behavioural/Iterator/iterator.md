InIterator design pattern

The Iterator design pattern is a behavioral design pattern that provides a way to sequentially access elements of a collection without exposing its underlying representation. It is particularly useful when dealing with complex data structures and you need a standard way to traverse them.
<h5>Key Components of the Iterator Pattern</h5>
<br>Iterator Interface: Defines methods for accessing and traversing elements.
<br>Concrete Iterator: Implements the iterator interface and keeps track of the current position in the traversal.
<br>Aggregate Interface: Defines a method to create an iterator.
<br>Concrete Aggregate: Implements the aggregate interface and returns an instance of the iterator.
we have
<ol>
    <li> Iterator interface
        Method that need for iteration
            hasNext(), Next();
    <li> Aggregate interface
        This method will have such as createIterator Method , which will pass list object of iterator class
    <li>Concrete Iterator
        Implementation of Iterator interface
    <li> Concrete Aggregate interface
</ol>