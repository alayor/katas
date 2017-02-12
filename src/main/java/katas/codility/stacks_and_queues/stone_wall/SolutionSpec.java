package katas.codility.stacks_and_queues.stone_wall;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionSpec
{
    @Test
    public void test1()
    {
        int result = new Solution().solution(new int[] { 8, 8, 5, 7, 9, 8, 7, 4, 8 });
        assertEquals(7, result);
    }

    @Test
    public void test2()
    {
        int result = new Solution().solution(new int[] { 8, 8 });
        assertEquals(1, result);
    }

    @Test
    public void test3()
    {
        int result = new Solution().solution(new int[] { 8, 9 });
        assertEquals(2, result);
    }

    @Test
    public void test4()
    {
        int result = new Solution().solution(new int[] { 8, 9, 8 });
        assertEquals(2, result);
    }

    @Test
    public void test5()
    {
        int result = new Solution().solution(new int[] { 8, 9, 8, 9 });
        assertEquals(3, result);
    }

    @Test
    public void test6()
    {
        int result = new Solution().solution(new int[] { 8, 9, 9, 8 });
        assertEquals(2, result);
    }
}
