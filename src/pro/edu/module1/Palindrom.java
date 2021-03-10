package pro.edu.module1;
/*
  @author   george
  @project   vsem
  @class  Palindrom
  @version  1.0.0 
  @since 08.03.2021 - 18.14
*/

public class Palindrom {

    public static boolean isPalindrom1(String text){
        text = text.replaceAll("[^A-Za-zА-Яа-я]",""); // remove garbage
        text = text.toLowerCase();

        boolean result = true;
        for (int i = 0; i < text.length() ; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)){
                result = false;
                break;
            }
        }
        return result;
    }

    // build a  reverse string
    public static boolean isPalindrom2(String text){
        text = text.replaceAll("[^A-Za-zА-Яа-я]",""); // remove garbage
        text = text.toLowerCase();
        String reversed = "";
        for (int i = text.length() -1 ; i >= 0 ; i--) {
            reversed = reversed + text.charAt(i);
        }
        return reversed.equals(text);
    }
    // use StringBuilder
    public static boolean isPalindrom3(String text){
        text = text.replaceAll("[^A-Za-zА-Яа-я]",""); // remove garbage
        text = text.toLowerCase();
        StringBuilder sb = new StringBuilder(text);
        String reversed = sb.reverse().toString();
        boolean result;
        if (text.equals(reversed)) {
            result = true;
        }else {
            result = false;
        }
        return result;
    }



    public static void main(String[] args) {
        String text = "abcdcbaq";

        System.out.println(" The first way");
        System.out.println(   text + " is a palindrom   - " + isPalindrom1(text));

        System.out.println(" The second way");
        System.out.println(   text + " is a palindrom   - " + isPalindrom2(text));

        System.out.println(" The third way");
        System.out.println(   text + " is a palindrom   - " + isPalindrom3(text));

    }
}
