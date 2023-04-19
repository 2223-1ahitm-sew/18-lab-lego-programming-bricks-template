package at.htl.lego;

public class ConvertBsp01 {

    public static void main(String[] args) {
        System.out.println(convertDigitStringToInteger("123"));
    }

    static int convertDigitStringToInteger(String numberAsString) {
        int number = 0;

        for (int i = 0; i < numberAsString.length(); i++) {
            number = number * 10;
            number = number + (numberAsString.charAt(i)-'0');
        }
        return number;
    }

}
