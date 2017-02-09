package katas.codility.arrays.cyclic_rotation;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class SolutionSpec
{

    @Test
    public void test1()
    {
        int[] result = new Solution().solution(new int[] {3, 8, 5}, 2);
        assertTrue(Arrays.equals(new int[] { 8, 5, 3 }, result));
    }

    @Test
    public void test2()
    {
        int[] result = new Solution().solution(new int[] {3, 8, 9, 7, 6}, 1);
        assertTrue(Arrays.equals(new int[] {6, 3, 8, 9, 7}, result));
    }

    @Test
    public void test3()
    {
        int[] result = new Solution().solution(new int[] {3, 8, 9, 7, 6}, 3);
        assertTrue(Arrays.equals(new int[] {9, 7, 6, 3, 8}, result));
    }
}
