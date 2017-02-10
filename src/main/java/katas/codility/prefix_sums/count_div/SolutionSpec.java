package katas.codility.prefix_sums.count_div;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionSpec
{
    @Test
    public void test1()
    {
        int result = new Solution().solution(6, 11, 2);
        assertEquals(3, result);
    }

    @Test
    public void test2()
    {
        int result = new Solution().solution(1, 10, 2);
        assertEquals(5, result);
    }

    @Test
    public void test3()
    {
        int result = new Solution().solution(0, 1, 11);
        assertEquals(1, result);
    }

    @Test
    public void test4()
    {
        int result = new Solution().solution(0, 0, 11);
        assertEquals(1, result);
    }

    @Test
    public void test5()
    {
        int result = new Solution().solution(0, Integer.MAX_VALUE, Integer.MAX_VALUE);
        assertEquals(2, result);
    }

    @Test
    public void test6()
    {
        int result = new Solution().solution(0, 10, 2);
        assertEquals(6, result);
    }

    @Test
    public void test7()
    {
        int result = new Solution().solution(0, 2000000000, 1);
        assertEquals(2000000001, result);
    }

    @Test
    public void test8()
    {
        int result = new Solution().solution(10, 10, 5);
        assertEquals(1, result);
    }

    @Test
    public void test9()
    {
        int result = new Solution().solution(3, 10, 2);
        assertEquals(4, result);
    }
}
