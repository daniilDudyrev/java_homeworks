package homework4.homework4_2;

import java.util.Random;
import java.util.Scanner;

class Matrix<T extends Number> {
    private T[][] matrix;
    private int rows;
    private int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        matrix = (T[][]) new Number[rows][columns];
    }

    public void fillFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = (T) Double.valueOf(scanner.nextDouble());
            }
        }
    }

    public void fillWithRandomValues(int min, int max) {
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (T) Integer.valueOf(random.nextInt(max - min + 1) + min);
            }
        }
    }

    public void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public Matrix<T> add(Matrix<T> otherMatrix) {
        if (rows != otherMatrix.rows || columns != otherMatrix.columns) {
            throw new IllegalArgumentException("Matrix dimensions do not match");
        }

        Matrix<T> resultMatrix = new Matrix<>(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix.matrix[i][j] = (T) Double.valueOf(matrix[i][j].doubleValue() + otherMatrix.matrix[i][j].doubleValue());
            }
        }
        return resultMatrix;
    }

    public Matrix<T> subtract(Matrix<T> otherMatrix) {
        if (rows != otherMatrix.rows || columns != otherMatrix.columns) {
            throw new IllegalArgumentException("Matrix dimensions do not match");
        }

        Matrix<T> resultMatrix = new Matrix<>(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix.matrix[i][j] = (T) Double.valueOf(matrix[i][j].doubleValue() - otherMatrix.matrix[i][j].doubleValue());
            }
        }
        return resultMatrix;
    }

    public Matrix<T> multiply(Matrix<T> otherMatrix) {
        if (columns != otherMatrix.rows) {
            throw new IllegalArgumentException("Matrix dimensions do not match");
        }

        Matrix<T> resultMatrix = new Matrix<>(rows, otherMatrix.columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < otherMatrix.columns; j++) {
                double sum = 0;
                for (int k = 0; k < columns; k++) {
                    sum += matrix[i][k].doubleValue() * otherMatrix.matrix[k][j].doubleValue();
                }
                resultMatrix.matrix[i][j] = (T) Double.valueOf(sum);
            }
        }
        return resultMatrix;
    }

    public T findMax() {
        T max = matrix[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j].doubleValue() > max.doubleValue()) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    public T findMin() {
        T min = matrix[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j].doubleValue() < min.doubleValue()) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    public double calculateAverage() {
        double sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += matrix[i][j].doubleValue();
            }
        }
        return sum / (rows * columns);
    }
}
