package at.htl.lego.solution;

public class ArrayBsp09 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = j+1;
            }
        }

        printIntArray(matrix);
    }

    static void printIntArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("| %5d  ", matrix[i][j]);
            }
            System.out.println("|");
        }
    }
}
