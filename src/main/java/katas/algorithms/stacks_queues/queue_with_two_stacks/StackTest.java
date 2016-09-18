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
        //given
        stack.push(1);
        //when
        Optional<Integer> value = stack.pop();
        //then
        assertTrue(value.isPresent());
        assertEquals(1, value.get().intValue());
    }

    @Test
    public void pushed_values_should_be_kept() {
        //given
        stack.push(1);
        stack.push(2);
        //when
        Optional<Integer> value1 = stack.pop();
        Optional<Integer> value2 = stack.pop();
        //then
        assertTrue(value1.isPresent());
        assertTrue(value2.isPresent());
        assertEquals(2, value1.get().intValue());
        assertEquals(1, value2.get().intValue());
    }

    @Test
    public void given_empty_stack_pop_should_return_not_present() {
        //when
        Optional<Integer> value = stack.pop();
        //then
        assertFalse(value.isPresent());
    }

    @Test
    public void given_empty_stack_then_size_should_be_0() {
        assertEquals(1, stack.getSize());
    }

    @Test
    public void given_1_push_then_size_should_be_2() {
        //when
        stack.push(1);
        //then
        assertEquals(2, stack.getSize());
    }

    @Test
    public void given_2_pushes_then_size_should_be_4() {
        //when
        stack.push(1);
        stack.push(2);
        //then
        assertEquals(4, stack.getSize());
    }

    @Test
    public void given_3_pushes_then_size_should_be_6() {
        //when
        pushTimes(3);
        //then
        assertEquals(4, stack.getSize());
    }

    @Test
    public void given_4_pushes_then_size_should_be_8() {
        //when
        pushTimes(4);
        //then
        assertEquals(8, stack.getSize());
    }

    private void pushTimes(int times) {
        while (times-- > 0) {
            stack.push(times);
        }
    }
}
