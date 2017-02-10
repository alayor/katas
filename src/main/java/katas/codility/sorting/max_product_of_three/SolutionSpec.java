package katas.codility.sorting.max_product_of_three;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionSpec
{
    @Test
    public void test1()
    {
        int result = new Solution().solution(new int[] {1, 2, 3});
        assertEquals(6, result);
    }

    @Test
    public void test2()
    {
        int result = new Solution().solution(new int[] {-3, 1, 2, -2, 5, 6});
        assertEquals(60, result);
    }

    @Test
    public void test3()
    {
        int[] array = new int[1001];
        for (int i = 0; i < 1001; i++)
        {
            array[i] = i;
        }
        int result = new Solution().solution(array);
        assertEquals(997002000, result);
    }

    @Test
    public void test4()
    {
        int result = new Solution().solution(new int[] {-10, -2, -4});
        assertEquals(-80, result);
    }

    @Test
    public void test5()
    {
        int result = new Solution().solution(new int[] {-5, 5, -5, 4});
        assertEquals(125, result);
    }
}
