package katas.codility.counting_elements.missing_integer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionSpec
{
    @Test
    public void test1()
    {
        int result  = new Solution().solution(1, new int[] {1});
        assertEquals(0, result);
    }
    @Test
    public void test10()
    {
        int result  = new Solution().solution(2, new int[] {1});
        assertEquals(-1, result);
    }

    @Test
    public void test2()
    {
        int result  = new Solution().solution(5, new int[] {1, 3, 1, 4, 2, 3, 5, 4});
        assertEquals(6, result);
    }

    @Test
    public void test3()
    {
        int result  = new Solution().solution(3, new int[] {1, 3, 1, 3, 2, 1, 2, 3});
        assertEquals(4, result);
    }

    @Test
    public void test4()
    {
        int result  = new Solution().solution(3, new int[] {1, 3, 1, 3, 1, 1});
        assertEquals(-1, result);
    }
}
