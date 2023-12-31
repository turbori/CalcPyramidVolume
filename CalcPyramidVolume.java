/*
Define a method pyramidVolume with double data type parameters baseLength, baseWidth, and pyramidHeight, that returns as a double the volume of a pyramid with a rectangular base. Relevant geometry equations:
Volume = base area x height x 1/3
Base area = base length x base width.
(Watch out for integer division).
 */



import java.util.Scanner;

public class CalcPyramidVolume {

    /* Your solution goes here  */
    public static double pyramidVolume(double baseLength, double baseWidth, double pyramidHeight){
        double baseArea = baseLength * baseWidth;
        return baseArea * pyramidHeight / 3;
    }

    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        double userLength;
        double userWidth;
        double userHeight;

        userLength = scnr.nextDouble();
        userWidth = scnr.nextDouble();
        userHeight = scnr.nextDouble();

        System.out.println("Volume: " + pyramidVolume(userLength, userWidth, userHeight));
    }
}