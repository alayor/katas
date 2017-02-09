package katas.codility.time_complexity.tape_equilibrium;

import static java.lang.Math.abs;
import static java.math.BigDecimal.valueOf;

public class Solution
{
    public int solution(int[] A)
    {
        int[] sums = new int[A.length];
        fillSums(A, sums);
        return getMin(A, sums);
    }

    private int getMin(int[] A, int[] sums)
    {
        int accumulator = 0;
        int min = Integer.MAX_VALUE;
        for (int i = A.length - 1; i > 0; i--)
        {
            accumulator += A[i];
            int subtract = abs(valueOf(sums[i]).subtract(valueOf(accumulator)).intValue());
            if (subtract < min)
            {
                min = subtract;
            }
        }
        return min;
    }

    private void fillSums(int[] A, int[] sums)
    {
        for(int i = 0; i < A.length; i++)
        {
            if(i == 0)
            {
                sums[0] = 0;
            } else {
                sums[i] = A[i - 1] + sums[i - 1];
            }
        }
    }
}
