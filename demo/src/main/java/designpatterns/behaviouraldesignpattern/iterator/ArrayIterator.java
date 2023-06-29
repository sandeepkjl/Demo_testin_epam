package designpatterns.behaviouraldesignpattern.iterator;

public class ArrayIterator implements Iterator{

    Integer[] items;
    int cursor;

    public ArrayIterator(Integer[] items) {
        this.items = items;
        this.cursor=-1;
    }

    @Override
    public boolean hasNext() {
        if(cursor<items.length-1){
            cursor++;
            return true;
        }
        return false;
    }

    @Override
    public int next() {
        return items[cursor];
    }
}
