package at.htl.lego.solution;

public class ArrayBsp07 {

    public static void main(String[] args) {

        String[][] funkalphabet = {
                {"Anton", "Berta", "Cäsar", "Dora", "Emil"},
                {"Friedrich", "Gustav", "Heinrich", "Ida", "Julius"},
                {"Konrad", "Ludwig", "Martha", "Nepomuk", "Otto"},
                {"Paula", "Quelle", "Richard", "Samuel", "Theodor"}
        };

        printStringArray(funkalphabet);

        funkalphabet[2][3] = "Nordpol";

        System.out.println();
        printStringArray(funkalphabet);
    }

    private static void printStringArray(String[][] funkalphabet) {
        int maxLengthOfWords = 0;
        for (int i = 0; i < funkalphabet.length; i++) {
            for (int j = 0; j < funkalphabet[0].length; j++) {
                maxLengthOfWords = Math.max(maxLengthOfWords, funkalphabet[i][j].length());
            }
        }


        for (int i = 0; i < funkalphabet.length; i++) {
            for (int j = 0; j < funkalphabet[0].length; j++) {
                System.out.printf("|%-" + maxLengthOfWords + "s", funkalphabet[i][j]);
            }
            System.out.println("|");
        }
    }


}
