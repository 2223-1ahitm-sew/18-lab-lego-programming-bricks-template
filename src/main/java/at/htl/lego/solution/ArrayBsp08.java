package at.htl.lego.solution;

import java.sql.SQLOutput;

public class ArrayBsp08 {
    public static void main(String[] args) {

        String[][] funkalphabet = {
                {"Anton", "Berta", "Cäsar", "Dora", "Emil"},
                {"Friedrich", "Gustav", "Heinrich", "Ida", "Julius"},
                {"Konrad", "Ludwig", "Martha", "Nepomuk", "Otto"},
                {"Paula", "Quelle", "Richard", "Samuel", "Theodor"}
        };

        System.out.printf("Breite des Arrays (x) : %d\n", funkalphabet[0].length);
        System.out.printf("Länge des Arrays  (y) : %d", funkalphabet.length);
    }
}
