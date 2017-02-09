package katas.codility.counting_elements.missing_integer;

import static java.lang.Math.max;

public class Solution
{
    public int solution(int X, int[] A)
    {
        int[] times = new int[X + 1];
        for (int i = 1; i <= X; i++)
        {
            times[i] = -1;
        }
        for(int i = 0; i < A.length; i++) {
            if (times[A[i]] == -1)
                times[A[i]] = i;
        }
        int max = 0;
        for (int i = 1; i <= X; i++)
        {
            if(times[i] == -1) return -1;
            max = max(times[i], max);
        }
        return max;
    }
}
