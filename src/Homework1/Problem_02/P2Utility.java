package Homework1.Problem_02;


import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class P2Utility
{
    private List<Integer> frequencyList = new ArrayList<>();

    public P2Utility()
    {
        for (int i = 0; i < 10; i++) {
            frequencyList.add(0);
        }
    }

    private void clearFrequencyList()
    {
        for (int i = 0; i < frequencyList.size(); i++)
        {
            frequencyList.set(i,0);
        }
    }


    private void splitNumberIntoDigits(Integer number)
    {
        Integer temporaryDigit;
        while(number>0)
        {
            temporaryDigit=number%10;
            frequencyList.set(temporaryDigit, frequencyList.get(temporaryDigit)+1);
            number = number/10;
        }
    }

    private void createFrequencyDigitsFrom(List<Integer> numbers)
    {
        for (int i = 0; i < numbers.size(); i++)
        {
            splitNumberIntoDigits(numbers.get(i));
        }
    }

    private Integer getMaxFrequency()
    {
        return frequencyList.stream().max(Integer::compareTo).get();
    }

    private Integer getMinFrequency()
    {
        return frequencyList.stream().min(Integer::compareTo).get();
    }

    public List<Integer> getMostAppearedDigits(@NotNull List<Integer> numbers)
    {
        if (numbers.isEmpty())
        {
            throw new ArrayIsEmptyException("Array is empty!");
        }
        List<Integer> result = new ArrayList<>();
        createFrequencyDigitsFrom(numbers);
        Integer maxFreq = getMaxFrequency();
        for (int i = 0; i < frequencyList.size(); i++)
        {
            if (frequencyList.get(i)==maxFreq)
            {
                result.add(i);
            }
        }
        clearFrequencyList();
        return result;
    }

    public List<Integer> getLeastAppearedDigits(@NotNull List<Integer> numbers)
    {
        if (numbers.isEmpty())
        {
            throw new ArrayIsEmptyException("Array is empty!");
        }
        List<Integer> result = new ArrayList<>();
        createFrequencyDigitsFrom(numbers);
        Integer minFreq =getMinFrequency();
        for (int i = 0; i < frequencyList.size(); i++)
        {
            if (frequencyList.get(i)==minFreq)
            {
                result.add(i);
            }
        }
        clearFrequencyList();
        return result;
    }

}
