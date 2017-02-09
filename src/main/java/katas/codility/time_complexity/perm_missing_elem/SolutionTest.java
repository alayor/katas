package katas.codility.time_complexity.perm_missing_elem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest
{

    @Test
    public void test1()
    {
        long result = new Solution().solution(new int[] {2, 3, 1, 5});
        assertEquals(4, result);
    }

    @Test
    public void test2()
    {
        long result = new Solution().solution(new int[] {1, 2, 3, 4, 5, 7, 8, 9, 10});
        assertEquals(6, result);
    }

    @Test
    public void test3()
    {
        int[] numbers = new int[999999];
        for (int i = 0; i < 999999; i++)
        {
            numbers[i] = i + 2;
        }
        long result = new Solution().solution(numbers);
        assertEquals(1, result);
    }
}
