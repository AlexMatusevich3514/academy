package by.academy.lesson10;

import by.academy.homework3.Produсt;

import java.io.Serializable;

public class Task6_Generic <T extends Comparable,V extends Produсt & Serializable,K extends Number>{
    private T t;
    private V v;
    private K k;

    public Task6_Generic(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }
    public void print(){
        System.out.println(t.getClass());
        System.out.println(v.getClass());
        System.out.println(k.getClass());
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }
}
