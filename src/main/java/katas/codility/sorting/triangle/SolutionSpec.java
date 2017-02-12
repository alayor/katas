package katas.codility.sorting.triangle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionSpec
{
    @Test
    public void test()
    {
        int result = new Solution().solution(new int[] { 3, 4, 5 });
        assertEquals(1, result);
    }

    @Test
    public void test2()
    {
        int result = new Solution().solution(new int[] { 10, 2, 5, 1, 8, 20 });
        assertEquals(1, result);
    }

    @Test
    public void test3()
    {
        int result = new Solution().solution(new int[] { 10, 50, 5, 1 });
        assertEquals(0, result);
    }

    @Test
    public void test4()
    {
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = i;
        }
        int result = new Solution().solution(array);
        assertEquals(1, result);
    }

    @Test
    public void test5()
    {
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = i + 2047483647;
        }
        int result = new Solution().solution(array);
        assertEquals(1, result);
    }

    @Test
    public void test6()
    {
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.MAX_VALUE;
        }
        int result = new Solution().solution(array);
        assertEquals(1, result);
    }

    @Test
    public void test7()
    {
        int result = new Solution().solution(new int[] { -1, -1, -1 });
        assertEquals(0, result);
    }

    @Test
    public void test8()
    {
        int result = new Solution().solution(new int[] { 2 });
        assertEquals(0, result);
    }

    @Test
    public void test9()
    {
        int result = new Solution().solution(new int[] { 1, 2 });
        assertEquals(0, result);
    }

    @Test
    public void test10()
    {
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = 0;
        }
        int result = new Solution().solution(array);
        assertEquals(0, result);
    }

    @Test
    public void test11()
    {
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = -1;
        }
        int result = new Solution().solution(array);
        assertEquals(0, result);
    }

    @Test
    public void test12()
    {
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.MIN_VALUE;
        }
        int result = new Solution().solution(array);
        assertEquals(0, result);
    }

    @Test
    public void test13()
    {
        int result = new Solution().solution(new int[] { 1, 1, 2, 3, 5 });
        assertEquals(0, result);
    }
}
