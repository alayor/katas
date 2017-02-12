package katas.codility.stacks_and_queues.brackets;

import java.util.Objects;
import java.util.Stack;

import static java.lang.String.valueOf;

public class Solution
{
    public int solution(String S)
    {
        Stack<String> stack = new Stack<>();
        for (char aChar : S.toCharArray())
        {
            if ("({[".indexOf(aChar) > -1)
                stack.add(valueOf(aChar));
            else
                if (aChar == ')' && !closes(stack, "("))
                        return 0;
                else if (aChar == ']' && !closes(stack, "["))
                        return 0;
                else if (aChar == '}' && !closes(stack, "{"))
                        return 0;
        }
        return stack.isEmpty() ? 1 : 0;
    }

    private boolean closes(Stack<String> stack, String bracket)
    {
        if (!stack.isEmpty()
                && Objects.equals(stack.peek(), bracket)) {
            stack.pop();
            return true;
        }
        return false;
    }
}
