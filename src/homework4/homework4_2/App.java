package homework4.homework4_2;

public class App {
    public static void main(String[] args) {
        Matrix<Integer> matrix1 = new Matrix<>(3, 3);
        Matrix<Integer> matrix2 = new Matrix<>(3, 3);

        System.out.println("Fill matrix 1 from keyboard:");
        matrix1.fillFromKeyboard();
        System.out.println("Matrix 1:");
        matrix1.display();

        System.out.println("Fill matrix 2 with random values:");
        matrix2.fillWithRandomValues(1, 10);
        System.out.println("Matrix 2:");
        matrix2.display();

        System.out.println("Matrix 1 + Matrix 2:");
        Matrix<Integer> additionResult = matrix1.add(matrix2);
        additionResult.display();

        System.out.println("Matrix 1 - Matrix 2:");
        Matrix<Integer> subtractionResult = matrix1.subtract(matrix2);
        subtractionResult.display();

        System.out.println("Matrix 1 * Matrix 2:");
        Matrix<Integer> multiplicationResult = matrix1.multiply(matrix2);
        multiplicationResult.display();

        System.out.println("Max value in Matrix 1: " + matrix1.findMax());
        System.out.println("Min value in Matrix 2: " + matrix2.findMin());
        System.out.println("Average value in Matrix 1: " + matrix1.calculateAverage());
        System.out.println("Average value in Matrix 2: " + matrix2.calculateAverage());
    }
}
