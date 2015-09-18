package org.sopt.data.structure.s_matrix.usage;

import org.sopt.data.structure.s_matrix.model.SparseMatrix;

public class Program {

    public static void main(String[] args) {

        SparseMatrix<Integer> matrix = new SparseMatrix<>(6, 6);

        matrix.add(0, 1, 10);
        matrix.add(4, 1, 8);
        matrix.add(5, 4, 5);

        matrix.display();

        matrix.remove(0, 1);
        matrix.display();
    }
}
