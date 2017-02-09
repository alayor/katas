package katas.codility.counting_elements.max_counters;

public class Solution
{
    public int[] solution(int N, int[] A)
    {
        int[] result = new int[N];
        int currentMax = 0;
        int maxAccumulator = 0;
        for (int number : A)
        {
            int i = number - 1;
            if (i < result.length)
            {
                if(result[i] < maxAccumulator)
                    result[i] = maxAccumulator;

                result[i]++;

                if (result[i] > currentMax)
                    currentMax = result[i];
            } else
                maxAccumulator =+ currentMax;
        }
        for (int i = 0; i < result.length; i++)
            if(result[i] < maxAccumulator)
                result[i] = maxAccumulator;
        return result;
    }
}
