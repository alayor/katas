package katas.codility.counting_elements.frog_river_one;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionSpec
{
    @Test
    public void test1()
    {
        Solution solution = new Solution();
        int result = solution.solution(new int[] { 1, 3, 6, 4, 1, 2 });

        assertEquals(5, result);
    }

    @Test
    public void test2()
    {
        Solution solution = new Solution();
        int result = solution.solution(new int[] { 1, 3, -6, 4, 1, 2 });

        assertEquals(5, result);
    }

    @Test
    public void test3()
    {
        Solution solution = new Solution();
        int result = solution.solution(new int[] { 1, -3 });

        assertEquals(2, result);
    }

    @Test
    public void test4()
    {
        Solution solution = new Solution();
        int result = solution.solution(new int[] { 1, 2, 3, -2 });

        assertEquals(4, result);
    }

    @Test
    public void test5()
    {
        Solution solution = new Solution();
        int result = solution.solution(new int[] { 1 });

        assertEquals(2, result);
    }

    @Test
    public void test6()
    {
        Solution solution = new Solution();
        int result = solution.solution(new int[] { 1, 200000 });

        assertEquals(2, result);
    }

    @Test
    public void test7()
    {
        Solution solution = new Solution();
        int result = solution.solution(new int[] { 200000, 200002 });

        assertEquals(1, result);
    }

    @Test
    public void test8()
    {
        Solution solution = new Solution();
        int result = solution.solution(new int[] { 0 });

        assertEquals(1, result);
    }

    @Test
    public void test9()
    {
        Solution solution = new Solution();
        int result = solution.solution(new int[] { -2, -3, -4 });

        assertEquals(1, result);
    }

    @Test
    public void test10()
    {
        Solution solution = new Solution();
        int result = solution.solution(new int[] { 0, 2, 3, 4, 5, 6, 100, 102, 200 });

        assertEquals(1, result);
    }

    @Test
    public void test11()
    {
        Solution solution = new Solution();
        int result = solution.solution(new int[] { 20000000 });

        assertEquals(1, result);
    }
}
