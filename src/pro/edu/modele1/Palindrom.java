package pro.edu.modele1;
/*
  @author   george
  @project   vsem
  @class  Palindrom
  @version  1.0.0 
  @since 08.03.2021 - 18.14
*/

import java.util.Locale;

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
        boolean result = true;
        // write your code here
        return result;
    }
    // use StringBuilder
    public static boolean isPalindrom3(String text){
        text = text.replaceAll("[^A-Za-zА-Яа-я]",""); // remove garbage
        text = text.toLowerCase();
        boolean result = true;
        // write your code here
        return result;
    }



    public static void main(String[] args) {
        String text = "abcdcba";

        System.out.println(" The first way");
        System.out.println(   text + " is a palindrom   - " + isPalindrom1(text));

        System.out.println(" The second way");
        System.out.println(   text + " is a palindrom   - " + isPalindrom1(text));

        System.out.println(" The third way");
        System.out.println(   text + " is a palindrom   - " + isPalindrom1(text));

    }
}
