package katas.algorithms.stacks_queues.queue_with_two_stacks;

import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class QueueTest {

    private Queue<Integer> queue;

    @Before
    public void setUp() throws Exception {
        queue = new Queue<>();
    }

    @Test
    public void touch_enqueue_method() {
        queue.enqueue(1);
    }

    @Test
    public void given_enqueue_value_then_we_may_dequeue_it() {
        queue.enqueue(1);
        assertEquals(1, queue.dequeue().get().intValue());
    }

    @Test
    public void given_enqueue_2_should_dequeue_2() {
        queue.enqueue(2);
        Optional<Integer> value = queue.dequeue();
        assertTrue(value.isPresent());
        assertEquals(2, value.get().intValue());
    }

    @Test
    public void given_enqueue_1_2_should_dequeue_1_2() {
        queue.enqueue(1);
        queue.enqueue(2);
        Optional<Integer> value1 = queue.dequeue();
        Optional<Integer> value2 = queue.dequeue();
        assertTrue(value1.isPresent());
        assertTrue(value2.isPresent());
        assertEquals(1, value1.get().intValue());
        assertEquals(2, value2.get().intValue());
    }
}
