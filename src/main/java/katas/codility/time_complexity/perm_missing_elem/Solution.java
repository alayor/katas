package katas.codility.time_complexity.perm_missing_elem;

import java.math.BigInteger;

public class Solution
{

    public int solution(int[] A)
    {
        BigInteger sum = new BigInteger(String.valueOf(A.length + 1)).multiply(new BigInteger(String.valueOf(A.length + 2)));
        BigInteger shouldBeSum = sum.divide(new BigInteger("2"));
        BigInteger actualSum = new BigInteger("0");
        for (int i : A)
        {
            actualSum = actualSum.add(BigInteger.valueOf(i));
        }
        return shouldBeSum.subtract(actualSum).intValue();
    }
}
