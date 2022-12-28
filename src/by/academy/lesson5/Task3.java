package by.academy.lesson5;

import java.util.Locale;

public class Task3 {
    public static void main(String[] args) {
        String string = "Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";
        String indexString = string.toLowerCase();
        String searchString = "Object-oriented programming".toLowerCase();
         StringBuilder sb = new StringBuilder(string);
        //System.out.println(sb);
        int countOOP = 0;
        int indexOOP = 0;
        while (indexOOP != -1) {
            indexOOP = indexString.indexOf(searchString, indexOOP + 1);
            countOOP++;
        }
        System.out.println(countOOP);
        int counter = 0;
        int sizeText = searchString.length();
        int index = indexString.lastIndexOf(searchString);
     //   while (index != -1) {
   // index=indexString.lastIndexOf(searchString, index-1);
   // sb.replace(index, index+sizeText, "OOP");
        }
       // System.out.println(sb);
    }
//}


