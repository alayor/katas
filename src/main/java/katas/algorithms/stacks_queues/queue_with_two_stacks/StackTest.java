package katas.algorithms.stacks_queues.queue_with_two_stacks;

import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StackTest {

    private Stack<Integer> stack;

    @Before
    public void setUp() throws Exception {
        stack = new Stack<>();
    }

    @Test
    public void should_have_a_push_method() {
        stack.push(1);
    }

    @Test
    public void pop_should_return_pushed_value() {
        stack.push(1);
        Optional<Integer> value = stack.pop();
        assertTrue(value.isPresent());
        assertEquals(1, value.get().intValue());
    }

    @Test
    public void pushed_values_should_be_kept() {
        stack.push(1);
        stack.push(2);
        Optional<Integer> value1 = stack.pop();
        Optional<Integer> value2 = stack.pop();
        assertTrue(value1.isPresent());
        assertTrue(value2.isPresent());
        assertEquals(2, value1.get().intValue());
        assertEquals(1, value2.get().intValue());
    }

    @Test
    public void given_empty_stack_pop_should_return_not_present() {
        Optional<Integer> value = stack.pop();
        assertFalse(value.isPresent());
    }
}
