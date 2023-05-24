package at.htl.lego.solution;

public class ConvertBsp04 {

    public static void main(String[] args) {
        System.out.println(convertDigitCharToInt('4'));
    }

    static int convertDigitCharToInt(char c) {

        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        return -1;
    }


}
