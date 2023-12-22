package lambdaPractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Practice01 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(-5);
        numbers.add(-8);
        numbers.add(-12);
        numbers.add(0);
        numbers.add(1);
        numbers.add(12);
        numbers.add(5);
        numbers.add(5);
        numbers.add(6);
        numbers.add(9);
        numbers.add(15);
        numbers.add(8);

        //Example 1: Print the even and positive elements of the list, spaced between them on the same line.
            //1.Way: With Lambda Expression
        numbers.
                stream().
                filter(t -> t%2 == 0 && t > 0).
                forEach(t -> System.out.print(t + " "));//12 6 8

        System.out.println();

            //2.Way: With Method Reference
        numbers.
                stream().
                filter(Utilities::getEvenPositiveNumbers).
                forEach(Utilities::printElementsOnTheSameLineWithSpace);//12 6 8

        System.out.println();

        //Example 2: Print the squares of the list elements with a space between them on the same line.
            //1.Way: With Lambda Expression
        numbers.
                stream().
                map(t -> t * t).
                forEach(t -> System.out.print(t + " "));//25 64 144 0 1 144 25 25 36 81 225 64

        System.out.println();

            //2.Way: With Method Reference
        numbers.
                stream().
                map(Utilities::getSquareOfNumbers).
                forEach(Utilities::printElementsOnTheSameLineWithSpace);//25 64 144 0 1 144 25 25 36 81 225 64

        System.out.println();

        //Example 3: Print the squares of the list elements on the same line without repetition, with a space between them.
            //1.Way: With Lambda Expression
        numbers.
                stream().
                map(t -> t * t).
                distinct().
                forEach(t -> System.out.print(t + " "));//25 64 144 0 1 36 81 225

        System.out.println();

            //2.Way: With Method Reference
        numbers.
                stream().
                map(Utilities::getSquareOfNumbers).
                distinct().
                forEach(Utilities::printElementsOnTheSameLineWithSpace);//25 64 144 0 1 36 81 225

        System.out.println();

        //Example 4: Print the list elements in order from largest to smallest.
            //1.Way: With Lambda Expression
        numbers.
                stream().
                sorted(Comparator.reverseOrder()).
                forEach(t -> System.out.print(t + " "));//15 12 9 8 6 5 5 1 0 -5 -8 -12

        System.out.println();

            //2.Way: With Method Reference
        numbers.
                stream().
                sorted(Comparator.reverseOrder()).
                forEach(Utilities::printElementsOnTheSameLineWithSpace);//15 12 9 8 6 5 5 1 0 -5 -8 -12

        System.out.println();

        //Example 5: Cube the positive elements of the list and print the ones whose ones' digit is 5.
            //1.Way: With Lambda Expression
        numbers.
                stream().
                filter(t -> t > 0).
                map(t -> t * t * t).
                map(t -> t%10).
                forEach(t -> System.out.print(t + " "));//1 8 5 5 6 9 5 2

        System.out.println();

            //2.Way: With Method Reference
        numbers.
                stream().
                filter(Utilities::getPositiveNumbers).
                map(Utilities::getCubeOfNumbers).
                map(t -> t%10).
                forEach(t -> System.out.print(t + " "));//1 8 5 5 6 9 5 2
        System.out.println();

        //Example 6: Find the sum of List elements and print it.
            //1.Way: With Lambda Expression
        int sum1 = numbers.
                        stream().
                        reduce((t, u) -> t + u).
                        get();
        System.out.println(sum1);//36

            //2.Way: With Method Reference
        int sum2 = numbers.
                        stream().
                        reduce(Integer::sum).
                        get();
        System.out.println(sum2);//36

        //Example 7: Type the code that returns the product of the positive elements of the list.
            //1.Way: With Lambda Expression
        int product1 = numbers.
                            stream().
                            filter(t -> t > 0).
                            reduce((t, u) -> t * u).
                            get();
        System.out.println(product1);//1944000

            //2.Way: With Method Reference
        int product2 = numbers.
                            stream().
                            filter(Utilities::getPositiveNumbers).
                            reduce(Math::multiplyExact).
                            get();
        System.out.println(product2);//1944000

        //Example 8: Type the code that returns the squares of the even elements of the list in order from smallest to largest.
            //1.Way: With Lambda Expression
        List<Integer> list1 = numbers.
                                    stream().
                                    filter(t -> t%2 == 0).
                                    map(t -> t * t).
                                    sorted().
                                    toList();
        System.out.println(list1);//[0, 36, 64, 64, 144, 144]

            //2.Way: With Method Reference
        List<Integer> list2 = numbers.
                                    stream().
                                    filter(Utilities::getEvenNumbers).
                                    map(Utilities::getSquareOfNumbers).sorted().toList();
        System.out.println(list2);//[0, 36, 64, 64, 144, 144]

    }
}