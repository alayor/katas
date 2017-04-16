package katas.hackerrank.project_euler;

import org.junit.Before;
import org.junit.Test;

import java.util.Queue;

import static org.junit.Assert.*;

public class Problem175Test
{
    private Problem175 problem175;
    private Problem175.PowerOfTwoSumCounter powerOfTwoSumCounter;

    @Before
    public void setUp() throws Exception
    {
        problem175 = new Problem175();
         powerOfTwoSumCounter = new Problem175.PowerOfTwoSumCounter();
    }

    @Test
    public void testPowerOfTwoSumFor1() {
        int sum = powerOfTwoSumCounter.getSum(1);
        assertEquals(1, sum);
    }

    @Test
    public void testPowerOfTwoSumFor2() {
        int sum = powerOfTwoSumCounter.getSum(2);
        assertEquals(2, sum);
    }

    @Test
    public void testPowerOfTwoSumFor3() {
        int sum = powerOfTwoSumCounter.getSum(3);
        assertEquals(1, sum);
    }

    @Test
    public void testPowerOfTwoSumFor4() {
        int sum = powerOfTwoSumCounter.getSum(4);
        assertEquals(3, sum);
    }

    @Test
    public void testPowerOfTwoSumFor5() {
        int sum = powerOfTwoSumCounter.getSum(5);
        assertEquals(2, sum);
    }

    @Test
    public void testPowerOfTwoSumFor6() {
        int sum = powerOfTwoSumCounter.getSum(6);
        assertEquals(3, sum);
    }

    @Test
    public void testPowerOfTwoSumFor7() {
        int sum = powerOfTwoSumCounter.getSum(7);
        assertEquals(1, sum);
    }

    @Test
    public void testPowerOfTwoSumFor8() {
        int sum = powerOfTwoSumCounter.getSum(8);
        assertEquals(4, sum);
    }

    @Test
    public void testPowerOfTwoSumFor10() {
        int sum = powerOfTwoSumCounter.getSum(10);
        assertEquals(5, sum);
    }

    @Test
    public void testPowerOfTwoSumFor241() {
        int sum = powerOfTwoSumCounter.getSum(241);
        assertEquals(13, sum);
    }

    @Test
    public void testPowerOfTwoSumFor240() {
        int sum = powerOfTwoSumCounter.getSum(240);
        assertEquals(17, sum);
    }

    @Test
    public void testGetSmallestN() {
        int smallestN = problem175.getSmallestN(17, 0);
        assertEquals(76, smallestN);
    }

    @Test
    public void testGetSmallestNOfRelation() {
        int smallestN = problem175.getSmallestNOfRelation(13, 17);
        assertEquals(241, smallestN);
    }

    @Test
    public void testGetBinaryExpansion() {
        Queue<Integer> expansion = problem175.getBinaryExpansion(241);
        assertEquals(4, expansion.poll().intValue());
        assertEquals(3, expansion.poll().intValue());
        assertEquals(1, expansion.poll().intValue());
    }

    @Test
    public void testGetBinaryExpansionOf10() {
        Queue<Integer> expansion = problem175.getBinaryExpansion(10);
        assertEquals(1, expansion.poll().intValue());
        assertEquals(1, expansion.poll().intValue());
        assertEquals(1, expansion.poll().intValue());
        assertEquals(1, expansion.poll().intValue());
    }

    @Test
    public void testGetBinaryExpansionOf20() {
        Queue<Integer> expansion = problem175.getBinaryExpansion(20);
        assertEquals(1, expansion.poll().intValue());
        assertEquals(1, expansion.poll().intValue());
        assertEquals(1, expansion.poll().intValue());
        assertEquals(2, expansion.poll().intValue());
    }
}
