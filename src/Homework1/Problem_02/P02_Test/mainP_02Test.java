package Homework1.Problem_02.P02_Test;

import Homework1.Problem_02.ArrayIsEmptyException;
import Homework1.Problem_02.P2Utility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class mainP_02Test {
    private final P2Utility p2Utility = new P2Utility();
    private final List<Integer> numbers = Arrays.asList(12, 231, 9012, 34, 8123, 22, 51107);

    @Test
    public void getMostAppearedDigits()
    {
        assertEquals(Arrays.asList(1,2), p2Utility.getMostAppearedDigits(numbers));
    }

    @Test
    public void getLeastAppearedDigits()
    {
        assertEquals(Arrays.asList(6),p2Utility.getLeastAppearedDigits(numbers));
    }

    @Test
    public void shouldGetArrayIsEmptyException() {
        List<Integer> emptyNumbers = new ArrayList<>();
        Assertions.assertThrows(ArrayIsEmptyException.class, () -> p2Utility.getLeastAppearedDigits(emptyNumbers), "Array is Empty, should throw");
    }

    @Test
    public void shouldGetIllegalArgumentExceptionForNullList() {
        List<Integer> nullList = null;
        Assertions.assertThrows(IllegalArgumentException.class, () -> p2Utility.getMostAppearedDigits(nullList), "Arrays is NULL, should throw");
    }
}