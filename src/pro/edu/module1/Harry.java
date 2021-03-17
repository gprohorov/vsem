package pro.edu.module1;
/*
  @author   george
  @project   vsem
  @class  Harry
  @version  1.0.0 
  @since 10.03.2021 - 19.41
*/

import sun.security.util.Length;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;

public class Harry {

    public static void main(String[] args) throws IOException {
/*        int[] arrayInt = {44,87,3,22,60,11};
        arrayInt[3] = 990;
        int[] arr2 = new int[11];
        String[] words = {"abcd", "ajn", "ujht", "rhjo"};

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
*/
        // download a text to string
        String text = new String(Files.readAllBytes(Paths.get("/home/george/Desktop/harry.txt")));
     //   System.out.println(text.substring(0, 100));
       // System.out.println(text.length());

        String[] lines = text.split("\\n");

        System.out.println(lines.length);
        int counter = 0;
        for (int i = 0; i < lines.length ; i++) {
            if (lines[i].contains("Harry")){
                counter++;
            }
        }
        text = text.replaceAll("[^A-Za-z ']","");

        String[] words = text.split(" ");

        int maxLength = 0;
        String maxWord = "";
        for (int i = 0; i < words.length; i++) {
            if(words[i].length() > maxLength){
                maxLength = words[i].length();
                maxWord = words[i];
            }
        }
        System.out.println(maxWord);

        System.out.println("Harry count - " + counter);
        System.out.println(words.length);

        for (int i = 0; i < 100 ; i++) {
        //    System.out.println(words[i]);
        }
         int counter2 = 0;
        for (int i = 0; i < words.length ; i++) {
            if(words[i].length() == 12) {
           //     System.out.println(words[i]);
                counter2++;
            }
        }
     //   System.out.println(counter);

        String stringOfDistincts = "";

        for (int i = 0; i < words.length; i++) {
            if (!stringOfDistincts.contains(words[i])) {
                stringOfDistincts += words[i] + " ";
            }
        }
        String[] distincts = stringOfDistincts.split(" ");

        Arrays.sort(distincts);
        System.out.println(distincts.length);
        for (int i = 0; i < 100 ; i++) {
         //   System.out.println(distincts[i]);
        }
        int[] hashes = new int[distincts.length];
        for (int i = 0; i < hashes.length ; i++) {
            hashes[i] = distincts[i].hashCode();
        }
        String longest = Arrays.stream(distincts).max(Comparator.comparing(String::length)).get();
        System.out.println(longest);

        Arrays.sort(hashes);
        int intersections =0;
        for (int i = 0; i < hashes.length - 1; i++) {
            if (hashes[i] == hashes[i+1]) {
                intersections++;
            }
        }
        System.out.println(intersections);



    }
}
/*
*
* 'Alohomora
'Atta
'Cause
'Course
'Dumbledore
'Harry's
'Jordan
'Mr
'NMat
'Oh
'Pig
'Quiddit
*
*
*
*
*
*
*
*
*
*
*
*
* */
