package pro.edu.module1;
/*
  @author   george
  @project   vsem
  @class  Exercises
  @version  1.0.0 
  @since 12.03.2021 - 19.00
*/

import java.util.Arrays;
import java.util.Collections;

public class Exercises {
    public static void main(String[] args) {
        String string = "Hello, world!";
        //  #   - hash     &  - ampersand      *  - asterix
        System.out.println(string.hashCode());
        String str2 = "Hello, world!!";
        System.out.println(str2.hashCode());

        String message = "Hello world!!!!!!!!!!!!!!!!!!!!!!!!";

        int   a = 567;
        String s = String.valueOf(a);
        System.out.println(s + 10);

        Integer b = 567;
        String str3 = " 1234";
         int d = Integer.valueOf(str3);

         int[]  arrInt = {4,8,9,3,11};
        Arrays.sort(arrInt);
        for (int i = 0; i < arrInt.length ; i++) {
            System.out.println(arrInt[i]);
        }
        // ASC -   по возрастанию
        // DESC -  по убыванию
        Integer[] arrInt2 = {5,9,33,90,11};
        Arrays.sort(arrInt2, Collections.reverseOrder());

        byte b1 = 2;
        Byte b2 = 2;
        Short sh = 7;
        Long lo = 777l;
        Double dd2 = 89.0;
        Boolean bb2 = true;
        char ch1 = '&';
        Character ch2 = '?';
        sh = null;
        bb2 = null;


    }

}
