package katas.codility.counting_elements.frog_river_one;

public class Solution
{

    public int solution(int[] A)
    {
        boolean[] numbers = new boolean[A.length + 2];
        for (int i = 0; i < A.length; i++)
        {
            if(A[i] < numbers.length && A[i] >= 0)
                numbers[A[i]] = true;
        }

        for (int i = 1; i < numbers.length; i++)
        {
            if (!numbers[i])
            {
                return i;
            }
        }
        return -1;
    }
}
