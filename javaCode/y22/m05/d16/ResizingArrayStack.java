package y22.m05.d16;

import java.util.Iterator;

public class ResizingArrayStack<Item> implements Iterable{
    private Item[] a = (Item[]) new Object[1];
    private int N = 0;
    public boolean isEmpty(){
        return N == 0;
    }
    public int size(){
        return N;
    }
    public void push(Item item){
        a[N] = item;
        N++;
    }


    @Override
    public Iterator<Item> iterator() {
        return null;
    }
    private class ReverseArrayIterator implements Iterator<Item>{
        private int i = N;
        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            return a[--i];
        }
    }
}
