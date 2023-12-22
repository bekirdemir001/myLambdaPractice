package lambdaPractice;

public class Utilities {

    public static void printElementsOnTheSameLineWithSpace (Object obj){
        System.out.print(obj + " ");
    }

    public static boolean getEvenNumbers(int a){
        return (a%2 == 0);
    }
    public static boolean getEvenPositiveNumbers(int a){
        return (a > 0 && a%2 == 0);
    }

    public static int getSquareOfNumbers (int a){
        return a*a;
    }

    public static int getCubeOfNumbers (int a){
        return a*a*a;
    }

    public static boolean getPositiveNumbers (int a){
        return a>0;
    }




}