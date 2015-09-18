package org.sopt.data.structure.s_matrix.model;

public class Record<T> {

    private int x;
    private int y;

    private T t;

    public Record(int x, int y, T t) {

        this.x = x;
        this.y = y;

        this.t = t;
    }

    public int x() { return x; }
    public void x(int x) { this.x = x; }

    public int y() { return y; }
    public void y(int y) { this.y = y; }

    public T t() { return t; }
    public void t(T t) { this.t = t; }
}
