package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Bag<T> implements Container<T> {

    ArrayList<T> bag;


    public Bag() {
        this.bag = new ArrayList<>();
    }


    @Override
    public Iterator<T> iterator() {
        return this.bag.iterator();
    }

    @Override
    public boolean isEmpty() {
        return this.bag.isEmpty();
    }

    @Override
    public int size() {
        return this.bag.size();
    }

    @Override
    public void add(T item) {
        this.bag.add(item);
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        this.bag.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return this.bag.spliterator();
    }

}
