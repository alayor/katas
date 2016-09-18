package katas.algorithms.stacks_queues.queue_with_two_stacks;

import java.util.Optional;

import static java.util.Optional.empty;
import static java.util.Optional.of;

class Stack<T> {
    private T[] value = (T[]) new Object[2];
    int n;

    void push(T object) {
        value[n++] = object;
    }

    Optional<T> pop() {
        if(n < 1)
            return empty();
        return of(value[--n]);
    }
}
