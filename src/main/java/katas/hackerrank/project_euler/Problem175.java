/* Copyright 2017 Sabre Holdings */
package katas.hackerrank.project_euler;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Problem175
{
    private PowerOfTwoSumCounter counter = new PowerOfTwoSumCounter();

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        Queue<Integer> queue = new Problem175().getPowersOsTwoSumBinaryRepresentation(p, q);
        String separator = "";
        while (!queue.isEmpty())
        {
            System.out.print(separator + queue.poll());
            separator = ",";
        }
    }

    private Queue<Integer> getPowersOsTwoSumBinaryRepresentation(int p, int q)
    {
        int powerTwoSum = getSmallestNOfRelation(p, q);
        return getBinaryExpansion(powerTwoSum);
    }

    int getSmallestNOfRelation(int p, int q)
    {
        int smallestOfQ = 0;
        int smallestOfP = 0;
        while (smallestOfP - 1 != smallestOfQ)
        {
            smallestOfP = getSmallestN(p, smallestOfP);
            while (smallestOfP - 1 > smallestOfQ)
            {
                smallestOfQ = getSmallestN(q, smallestOfQ);
            }
        }
        return smallestOfP;
    }

    int getSmallestN(int num, int start)
    {
        for (int i = start + 1; i < Integer.MAX_VALUE; i++)
        {
            if (counter.getSum(i) == num)
            {
                return i;
            }
        }
        return -1;
    }

    public Queue<Integer> getBinaryExpansion(int num)
    {
        char[] chars = Integer.toBinaryString(num).toCharArray();
        Queue<Integer> queue = new LinkedList<>();
        int compareTo = chars[0];
        int count = 0;
        for (char aChar : chars)
        {
            if (aChar == compareTo)
            {
                count++;
            }
            else
            {
                queue.add(count);
                count = 1;
                compareTo = aChar;
            }
        }
        queue.add(count);
        return queue;
    }

    static class PowerOfTwoSumCounter
    {
        private Map<Integer, Integer> cache = new HashMap<>();

        int getSum(int num)
        {
            if (!Objects.isNull(cache.get(num)))
                return cache.get(num);

            Stack<Integer> stack = new Stack<>();
            stack.push(1);
            int currentSum = 1;
            int count = 0;
            while (stack.size() > 1 || (stack.size() == 1 && stack.peek() <= num))
            {
                if (currentSum < num)
                {
                    if (stack.size() > 1 && hasTwoEqualsAtTheTop(stack))
                    {
                        currentSum = incrementAndAddToCurrentTop(stack, currentSum);
                    }
                    else
                    {
                        int peek = stack.peek();
                        stack.push(peek);
                        currentSum += peek;
                    }
                }
                else if (currentSum > num)
                {
                    Integer pop = stack.pop();
                    currentSum -= pop;
                    if (!stack.isEmpty())
                    {
                        currentSum = incrementCurrentTop(stack, currentSum);
                    }
                }
                else if (currentSum == num)
                {
                    count++;
                    Integer pop = stack.pop();
                    currentSum -= pop;

                    if (!stack.isEmpty())
                    {
                        currentSum = incrementCurrentTop(stack, currentSum);
                    }
                }
            }
            cache.put(num, count);
            return count;
        }

        private boolean hasTwoEqualsAtTheTop(Stack<Integer> stack)
        {
            Integer first = stack.pop();
            Integer second = stack.pop();
            stack.push(second);
            stack.push(first);
            return first.equals(second);
        }

        private int incrementCurrentTop(Stack<Integer> stack, int currentSum)
        {
            Integer pop = stack.pop();
            currentSum -= pop;
            pop = pop * 2;
            stack.push(pop);
            currentSum += pop;
            return currentSum;
        }

        private int incrementAndAddToCurrentTop(Stack<Integer> stack, int currentSum)
        {
            Integer peek = stack.peek();
            peek = peek * 2;
            stack.push(peek);
            currentSum += peek;
            return currentSum;
        }
    }
}
