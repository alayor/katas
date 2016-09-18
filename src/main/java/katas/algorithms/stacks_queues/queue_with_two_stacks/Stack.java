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
        if (n == array.length) {
            increaseArraySize(n * 2);
        }
    }

    private void increaseArraySize(int newSize) {
        T[] newArray = createArray(newSize);
        arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    Optional<T> pop() {
        if (n < 1)
            return empty();
        return of(array[--n]);
    }

    int getSize() {
        return array.length;
    }
}
