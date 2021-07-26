/**
 Consider a vector V with n elements natural numbers of at least 2 digits.
 Construct a second vector W, with the same number of elements and which
 at each position i have the average of the digits of the element V [i].
**/

package Homework1.Problem_01;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;
import java.util.stream.Collectors;

public class mainP_01 {
    private static Scanner input = new Scanner(System.in);

    public static Integer countDigits(Integer number) {
        Integer counter = 0;
        while (number > 0) {
            counter++;
            number = number / 10;
        }
        return counter;
    }

    public static Vector<Integer> readVector(Integer length) {
        Vector<Integer> myVector = new Vector<Integer>(length);
        for (int i = 0; i < length; i++) {
            boolean exceptionFound;
            do {
                exceptionFound = false;
                System.out.print("Enter number " + i + ": ");
                try {
                    Integer number = input.nextInt();
                    if (countDigits(number) < 2) {
                        exceptionFound = true;
                        throw new MinimumTwoDigitsNumber("The number must be at least 2 digits long");
                    } else {
                        myVector.add(number);
                    }
                } catch (MinimumTwoDigitsNumber e) {
                    System.out.println(e.getMessage());
                }
            } while (exceptionFound);
        }
        return myVector;
    }

    public static double calculateAverage(Integer number) {
        Integer sum = 0;
        Integer counter = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
            counter++;
        }
        return (double) sum / counter;
    }


    public static void main(String[] args) {

        System.out.print("Input the length of the vector: ");
        Integer length = input.nextInt();

        Vector<Integer> myVector = new Vector<>(length);
        myVector = readVector(length);

        Vector<Double> resultVector = new Vector<Double>(length);
        for (int i = 0; i < length; i++)
        {
         resultVector.add(calculateAverage(myVector.elementAt(i)));
        }

        //or with stream
        List<Double> resultList = myVector.stream()
                .map(number -> calculateAverage(number))
                .collect(Collectors.toList());

        System.out.println(resultVector);
        System.out.println(resultList);
    }
}
