package at.htl.lego.solution;

import java.util.Arrays;

public class ArrayBsp06 {
    public static void main(String[] args) {
        String[] name = {"Dagobert", "", "Daisy", "Gundel", ""};
        System.out.println(Arrays.toString(name));

        // Durchlaufe das Array und zähle die nicht-leeren Felder
        int anzahlFelder = 0;
        for (int i = 0; i < name.length; i++) {
            if (name[i].length() > 0) {
                anzahlFelder++;
            }
        }

        String[] kopie = new String[anzahlFelder];
        int kopieIndex = 0;
        for (int i = 0; i < name.length; i++) {
            if (name[i].length() > 0) {
                kopie[kopieIndex] = name[i];
                kopieIndex++;
            }
        }
        System.out.println(Arrays.toString(kopie));

        // Anmerkung: man könnte auch .isEmpty() verwenden
    }

}
