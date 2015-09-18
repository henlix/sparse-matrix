package org.sopt.data.structure.s_matrix.model;

import java.util.ArrayList;

public class SparseMatrix<T> {

    private int x;
    private int y;

    ArrayList<Record<T>> records;

    public SparseMatrix(int x, int y) {

        this.x = x;
        this.y = y;

        records = new ArrayList<>();
    }

    public void add(int x, int y, T t) {

        if (x < 0 || x >= this.x)
            throw new IndexOutOfBoundsException();

        if (y < 0 || y >= this.y)
            throw new IndexOutOfBoundsException();


        records.add(new Record<>(x, y, t));
    }

    public Record<T> get(int x, int y) {

        if (x < 0 || x >= this.x)
            throw new IndexOutOfBoundsException();

        if (y < 0 || y >= this.y)
            throw new IndexOutOfBoundsException();


        for (Record<T> record : records) {

            if (record.x() == x && record.y() == y)
                return record;
        }

        return null;
    }

    public void remove(int x, int y) {

        Record<T> record = get(x, y);

        if (record != null)
            records.remove(record);
    }

    public void display() {

        for (int i = 0; i < x; i++) {

            for (int j = 0; j < y; j++) {

                Record<T> record = get(i, j);

                String message = record != null ? String.format("%-6s", record.t()) : String.format("%-6s", "-");
                System.out.print(message);
            }

            System.out.println();
        }

        for (int i = 0; i < x; i++)
            System.out.print("======");

        System.out.println();
    }

}
