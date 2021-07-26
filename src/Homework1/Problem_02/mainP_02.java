/**
 * Consider a numbers vector that contains natural numbers. Let's see what
 * which of the digits 0 to 9 appears most often in the vector and how many times it appears.
 * Example: numbers = 12; 231; 9012; 34; 8123; 22; 51107. Then the figure that
 * it occurs most often is 2 and occurs 6 times
 **/

package Homework1.Problem_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mainP_02 {
    public static void main(String[] args) {
        P2Utility p2Utility = new P2Utility();

        List<Integer> numbers = Arrays.asList(12, 231, 9012, 34, 8123, 22, 51107);
        List<Integer> numbers2 = null;
        List<Integer> numbers3 = new ArrayList<>();

        try {
            System.out.println(p2Utility.getMostAppearedDigits(numbers));
            System.out.println(p2Utility.getLeastAppearedDigits(numbers));
//          System.out.println(p2Utility.getMostAppearedDigits(numbers2));
            System.out.println(p2Utility.getLeastAppearedDigits(numbers3));
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
        } catch (ArrayIsEmptyException e) {
            System.out.println(e.toString());
        }
    }
}
