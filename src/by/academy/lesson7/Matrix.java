package by.academy.lesson7;

public class Matrix {
    int[][] array;
    int columnArray;
    int lineArray;

    public Matrix() {
    }

    public Matrix(int[][] array, int columnArray, int lineArray) {
        this.array = array;
        this.columnArray = columnArray;
        this.lineArray = lineArray;
    }

    public int[][] sumArray(int[][] array1) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = array[i][j] + array1[i][j];
            }
        }
        return array;
    }
}
