package com.kuranado.decorator;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * 测试继承和组合的差异
 *
 * @Author: Xinling Jing
 * @Date: 2019-02-02 12:57
 */
public class MyHashSet<E> extends HashSet<E> {

    private static final long serialVersionUID = 5494755578709917564L;

    private HashSet<E> hashSet = new HashSet<>();

    private int count;

    @Override
    public boolean add(E e) {
        this.count++;
        //return super.add(e);
        return hashSet.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        this.count += c.size();
        //return super.addAll(c);
        return hashSet.addAll(c);
    }

    public static void main(String[] args) {
        MyHashSet<String> myHashSet = new MyHashSet<>();
        myHashSet.addAll(Arrays.asList("a", "b", "c"));
        System.out.println(myHashSet.count);
    }

}
