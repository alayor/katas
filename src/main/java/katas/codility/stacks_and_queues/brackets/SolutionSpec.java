package katas.codility.stacks_and_queues.brackets;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionSpec
{
    @Test
    public void test1()
    {
        int result = new Solution().solution("()");
        assertEquals(1, result);
    }

    @Test
    public void test2()
    {
        int result = new Solution().solution("()]");
        assertEquals(0, result);
    }

    @Test
    public void test3()
    {
        int result = new Solution().solution("{[()()]}");
        assertEquals(1, result);
    }

    @Test
    public void test4()
    {
        int result = new Solution().solution("([)()]");
        assertEquals(0, result);
    }

    @Test
    public void test5()
    {
        int result = new Solution().solution("");
        assertEquals(1, result);
    }

    @Test
    public void test6()
    {
        int result = new Solution().solution("(");
        assertEquals(0, result);
    }

    @Test
    public void test7()
    {
        int result = new Solution().solution("()");
        assertEquals(1, result);
    }

    @Test
    public void test8()
    {
        int result = new Solution().solution("()[");
        assertEquals(0, result);
    }

    @Test
    public void test9()
    {
        int result = new Solution().solution("()[]{}");
        assertEquals(1, result);
    }

    @Test
    public void test10()
    {
        int result = new Solution().solution("{([)]}");
        assertEquals(0, result);
    }

    @Test
    public void test11()
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 200000; i++)
        {
            if (i < 100000)
            {
                sb.append("(");
            } else {
                sb.append(")");
            }
        }
        int result = new Solution().solution(sb.toString());
        assertEquals(1, result);
    }

    @Test
    public void test12()
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 200000; i++)
        {
            if (i < 99999)
            {
                sb.append("(");
            } else {
                sb.append(")");
            }
        }
        int result = new Solution().solution(sb.toString());
        assertEquals(0, result);
    }
}
