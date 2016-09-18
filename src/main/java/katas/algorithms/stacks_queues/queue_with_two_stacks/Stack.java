package katas.algorithms.stacks_queues.queue_with_two_stacks;

import java.util.Optional;

import static java.lang.System.arraycopy;
import static java.util.Optional.empty;
import static java.util.Optional.of;

class Stack<T> {
    private T[] array = createArray(1);
    private int n;

    private T[] createArray(int size) {
        return (T[]) new Object[size];
    }

    void push(T object) {
        array[n++] = object;
        if (n == array.length) adjustSize();
    }

    private void adjustSize() {
        T[] newArray = createArray(n * 2);
        arraycopy(array, 0, newArray, 0, n);
        array = newArray;
    }

    Optional<T> pop() {
        if (n < 1)
            return empty();
        Optional<T> value = of(array[--n]);
        if (n == array.length / 4) adjustSize();
        return value;
    }

    int getSize() {
        return array.length;
    }
}
