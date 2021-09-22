package part1;

public class StringReverseTest {


    public static String stringReverseTest(String str) {

        String temp = str;

        String newString = "";

        char[] chars = temp.toCharArray();


        for (int i = 0; i < chars.length; i++) {
            if(Character.isDigit(chars[i]))
                str = str.replace(chars[i], ' ');
        }

        System.out.println(str);

        String[] split = str.split(" ");

        for (String s : split) {
            newString = newString + new StringBuffer(s).reverse().toString() + " ";
        }


        return newString;
    }

    public static void main(String[] args) {
        String s = stringReverseTest("This1is25Testing");

        System.out.println(s);
    }
}
