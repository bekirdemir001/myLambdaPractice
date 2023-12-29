package lambdaPractice;

import java.util.stream.IntStream;

public class Practice03 {

    public static void main(String[] args) {

        int n = 10;

        //Example 1: Type a code that finds the sum of integer values from 1 to n (including n).
        int result1 = IntStream.rangeClosed(1, n).sum();
        System.out.println(result1);//55

        //Example 2: Type a code that finds the sum of odd integer values from 1 to n (including n).
        int result2 =IntStream.rangeClosed(1, n).filter(Utilities::getOddNumbers).sum();
        System.out.println(result2);//25

        //Example 3: Type a code that finds the sum of even integer values from 1 to n (including n).
        int result3 =IntStream.rangeClosed(1, n).filter(Utilities::getEvenNumbers).sum();
        System.out.println(result3);//30

        //Example 4: Type a code that finds the sum of integer values from 1 to n (including n) that are divisible by 5.
        int result4 =IntStream.rangeClosed(1, n).filter(t -> t%5 == 0).sum();
        System.out.println(result4);//15

        //Example 5: Type a code to find the factorial of a number.
        int result5 =IntStream.rangeClosed(1, n).reduce(Math::multiplyExact).getAsInt();
        System.out.println(result5);//3628800

        //Example 6: Type a code to find the product of odd integers from 1 to n.
        int result6 =IntStream.rangeClosed(1, n).filter(Utilities::getOddNumbers).reduce(Math::multiplyExact).getAsInt();
        System.out.println(result6);//945

        //Example 7: Type a code to find the product of even integers from 1 to n.
        int result7 =IntStream.rangeClosed(1, n).filter(Utilities::getEvenNumbers).reduce(Math::multiplyExact).getAsInt();
        System.out.println(result7);//3840

        //Example 8: Type a code to find the product of integer values from 1 to n (including n) that are divisible by 4.
        int result8 =IntStream.rangeClosed(1, n).filter(t -> t%4 == 0).reduce(Math::multiplyExact).getAsInt();
        System.out.println(result8);//32

        //Example 9: Type a code that adds the first n of the odd numbers in a number sequence that continues from 1 to infinity.
        int result9 = IntStream.iterate(1, t -> t+2).limit(n).sum();
        System.out.println(result9);//100

        //Example 10: Type a code that adds the first n of the odd numbers in a number sequence that continues from 1 to infinity.
        int result10 = IntStream.iterate(2, t -> t+2).limit(n).sum();
        System.out.println(result10);//110

        //Example 11: Type a code that prints the first n powers of 5 to the console.
        IntStream.iterate(1, t -> t*5).limit(n).forEach(Utilities::printElementsOnTheSameLineWithSpace);

        System.out.println();

        //Example 12: Type a code that finds the sum of the first n powers of 5.
        int result11 = IntStream.iterate(1, t -> t*5).limit(n).sum();
        System.out.println(result11);//2441406

        //Example 13: Type a code that finds the product of the first n powers of 5.
        int n2 = 5;
        int result12 = IntStream.iterate(1, t -> t*5).limit(n2).reduce(Math::multiplyExact).getAsInt();
        System.out.println(result12);//9765625
    }
}