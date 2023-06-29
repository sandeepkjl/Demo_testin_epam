package designpatterns.behaviouraldesignpattern.iterator;

/**
 * Iterator design pattern is used to iterate group of objects stored in som form of data structure,
 * like in java collection listIterator, LinkedListIterator etc.
 *
 *see the implementation below.
 * **/


public class IteratorTest {

    public static void main(String args[]){
        Integer integer[] = {4,5,1,7,8,9};
        Iterator iterator = new ArrayIterator(integer);
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
