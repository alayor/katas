package katas.codility.sorting.max_product_of_three;

import static java.lang.Math.*;
import static java.util.Arrays.sort;

public class Solution
{
    public int solution(int[] A)
    {
        sort(A);
        int firstOption = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
        int secondOption = A[0] * A[1] * A[A.length - 1];
        return max(firstOption, secondOption);
    }
}
