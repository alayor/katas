package katas.codility.counting_elements.max_counters;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class SolutionSpec
{
    @Test
    public void test1()
    {
        int[] result  = new Solution().solution(2, new int[]{1});
        assertTrue(Arrays.equals(new int[] { 1, 0 }, result));
    }

    @Test
    public void test2()
    {
        int[] result  = new Solution().solution(2, new int[]{1, 2});
        assertTrue(Arrays.equals(new int[] { 1, 1 }, result));
    }

    @Test
    public void test3()
    {
        int[] result  = new Solution().solution(2, new int[]{1, 2, 1, 3});
        assertTrue(Arrays.equals(new int[] { 2, 2 }, result));
    }

    @Test
    public void test4()
    {
        int[] result  = new Solution().solution(5, new int[]{3, 4, 4, 6, 1, 4, 4});
        assertTrue(Arrays.equals(new int[] { 3, 2, 2, 4, 2 }, result));
    }

    @Test
    public void test5()
    {
        int[] result  = new Solution().solution(10, new int[]{1, 10});
        assertTrue(Arrays.equals(new int[] { 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, result));
    }
}
