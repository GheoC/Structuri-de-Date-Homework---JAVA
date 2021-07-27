/**
 Consider two sets of natural numbers A and B, stored in two vectors
 distinct (in a lot every element is unique!). Construct a third vector, which contains the elements from A to B.
 **/


package Homework1.Problem_03;

import java.util.*;

public class mainP_03
{
    public static void main(String[] args)
    {
        List<Integer> list1 = Arrays.asList(1,5,9,11);
        List<Integer> list2 = Arrays.asList(1,9,15,37);
        List<Integer> list3 = null;

        try {
            System.out.println(VectorUtility.doReunion(list1, list2));
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.toString());
        }

    }
}
