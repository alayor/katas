package katas.codility.sorting.triangle;

import java.math.BigInteger;

import static java.math.BigInteger.ZERO;
import static java.math.BigInteger.valueOf;
import static java.util.Arrays.sort;

public class Solution
{
    public int solution(int[] A)
    {
        sort(A);
        for(int i = 2; i < A.length; i++)
        {
            BigInteger sum = valueOf(A[i - 2]).add(valueOf(A[i - 1]));
            if (sum.compareTo(valueOf(A[i])) > 0 && sum.compareTo(ZERO) > 0)
            {
                return 1;
            }
        }
        return 0;
    }
}
