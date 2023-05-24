package at.htl.lego.solution;

public class ArrayBsp10 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[j][i] = j + 1;
            }
        }

        ArrayBsp09.printIntArray(matrix);
    }
}