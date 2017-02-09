package katas.codility.time_complexity.tape_equilibrium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest
{
    @Test
    public void test1()
    {
        int result = new Solution().solution(new int[] {3, 1, 2, 4, 3});
        assertEquals(1, result);
    }

    @Test
    public void test2()
    {
        int result = new Solution().solution(new int[] {-1000, 1000, 999});
        assertEquals(999, result);
    }

    @Test
    public void test3()
    {
        int result = new Solution().solution(new int[] {3, 6, 10});
        assertEquals(1, result);
    }

    @Test
    public void test4()
    {
        int result = new Solution().solution(new int[] {0, 2000});
        assertEquals(2000, result);
    }

    @Test
    public void test5()
    {
        int result = new Solution().solution(new int[] {2000, 0});
        assertEquals(2000, result);
    }

    @Test
    public void test6()
    {
        int result = new Solution().solution(new int[] {1000, 3000});
        assertEquals(2000, result);
    }

    @Test
    public void test7()
    {
        int result = new Solution().solution(new int[] {-3000, 4000});
        assertEquals(7000, result);
    }

    @Test
    public void test8()
    {
        int result = new Solution().solution(new int[] {2000});
        assertEquals(2000, result);
    }

    @Test
    public void test9()
    {
        int result = new Solution().solution(new int[] {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,19,20});
        assertEquals(1, result);
    }
}
