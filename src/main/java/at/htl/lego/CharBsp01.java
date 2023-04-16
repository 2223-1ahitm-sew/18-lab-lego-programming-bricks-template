package at.htl.lego;

public class CharBsp01 {

    public static void main(String[] args) {

        System.out.println(toUpperCase('b'));

    }

    /**
     * Konvertiere einen Kleinbuchstaben in einen Großbuchstaben: 'a' -> 'A'.
     * Berechne dies mit dem Asciicode.
     *
     * @param c ... Kleinbuchstabe
     * @return Großbuchstaben
     */
    static char toUpperCase(char c) {

        if (c >= 'a' && c <= 'z') {
            return (char) (c - ('a' - 'A'));
        }
        return c;

    }

}
