package katas.codility.stacks_and_queues.stone_wall;

import java.util.Stack;

public class Solution
{
    public int solution(int[] H)
    {
        Stack<Integer> stack = new Stack<>();
        int count = 1;
        stack.add(H[0]);
        for (int i = 1; i < H.length; i++)
        {
            if (H[i] == stack.peek())
                continue;
            if(H[i] < stack.peek()) {
                while(!stack.isEmpty() && H[i] < stack.peek())
                    stack.pop();
                if (!stack.isEmpty() && H[i] == stack.peek())
                    continue;
                stack.add(H[i]);
                count++;
            } else if(H[i] > stack.peek()) {
                count++;
                stack.add(H[i]);
            }
        }
        return count;
    }
}
