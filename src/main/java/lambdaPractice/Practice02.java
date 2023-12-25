package lambdaPractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Practice02 {

    public static void main(String[] args) {

        List<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Orange");
        fruitList.add("Strawberry");
        fruitList.add("Banana");
        fruitList.add("Watermelon");
        fruitList.add("Grape");
        fruitList.add("Pomegranate");
        fruitList.add("Pear");
        fruitList.add("Apple");
        fruitList.add("Banana");

        //Example 1: Type the code that prints the list elements on the same line with a space between them.
        fruitList.
                forEach(Utilities::printElementsOnTheSameLineWithSpace);//Apple Orange Strawberry Banana Watermelon Grape Pomegranate Pear Apple Banana

        System.out.println();

        //Example 2: Type the code that prints the list elements on the same line without repetition, with a space between them.
        fruitList.
                stream().
                distinct().
                forEach(Utilities::printElementsOnTheSameLineWithSpace);//Apple Orange Strawberry Banana Watermelon Grape Pomegranate Pear

        System.out.println();

        //Example 3: Type the code that prints the character numbers of the list elements on the same line with a space
        //between them.
        fruitList.
                stream().
                map(String::length).
                forEach(Utilities::printElementsOnTheSameLineWithSpace);//5 6 10 6 10 5 11 4 5 6

        System.out.println();

        //Example 4: Type the code that prints the list elements with the odd number of characters on the same line with
        //a space between them.
        fruitList.
                stream().
                map(String::length).
                filter(Utilities::getOddNumbers).
                forEach(Utilities::printElementsOnTheSameLineWithSpace);//5 5 11 5

        System.out.println();

        //Example 5: Type the code that prints the list elements in uppercase letters on the same line without repetition,
        //with a space between them.
        fruitList.
                stream().
                distinct().
                map(String::toUpperCase).
                forEach(Utilities::printElementsOnTheSameLineWithSpace);//APPLE ORANGE STRAWBERRY BANANA WATERMELON GRAPE POMEGRANATE PEAR

        System.out.println();

        //Example 6: Type the code that prints the list elements whose first letter is 'a' or 'p' on the same line without
        //repetition, with a space between them.
        fruitList.
                stream().
                distinct().
                filter(t -> t.startsWith("A") || t.startsWith("P")).
                forEach(Utilities::printElementsOnTheSameLineWithSpace);//Apple Pomegranate Pear

        System.out.println();

        //Example 7: Type the code that prints the list elements whose last letter is 'a' or 'e' on the same line without
        //repetition, with a space between them.
        fruitList.
                stream().
                distinct().
                filter(t -> t.endsWith("a") || t.endsWith("e")).
                forEach(Utilities::printElementsOnTheSameLineWithSpace);//Apple Orange Banana Grape Pomegranate

        System.out.println();

        //Example 8: Type the code that prints the list elements by adding asterisks at the beginning and end.
        fruitList.
                stream().
                map(t -> "*" + t + "*").
                forEach(Utilities::printElementsOnTheSameLineWithSpace);//*Apple* *Orange* *Strawberry* *Banana* *Watermelon* *Grape* *Pomegranate* *Pear* *Apple* *Banana*

        System.out.println();

        //Example 9: Type the code that sorts the list elements from largest to smallest according to the number of characters
        //without repetition.
        fruitList.
                stream().
                distinct().
                sorted(Comparator.comparing(String::length).reversed()).
                forEach(Utilities::printElementsOnTheSameLineWithSpace);//Pomegranate Strawberry Watermelon Orange Banana Apple Grape Pear

        System.out.println();

        //Example 10: Type the code that sorts the list elements with the even number of characters from largest to smallest
        //according to the number of characters.
        fruitList.
                stream().
                distinct().
                filter(t -> t.length()%2 == 0).
                sorted(Comparator.comparing(String::length).reversed()).
                forEach(Utilities::printElementsOnTheSameLineWithSpace);//Strawberry Watermelon Orange Banana Pear

    }

}