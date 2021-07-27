package Homework1.Problem_03;

import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.stream.Collectors;

public class VectorUtility
{

    public static List<Integer> doReunion(@NotNull List<Integer> list1, @NotNull List<Integer> list2)
    {
        SortedSet<Integer> result = new TreeSet<>();

        for (int i = 0; i < list1.size(); i++)
        {result.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++)
        {result.add(list2.get(i));
        }


        return result.stream().collect(Collectors.toList());
    }
}
