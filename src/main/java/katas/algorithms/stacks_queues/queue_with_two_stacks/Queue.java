package katas.algorithms.stacks_queues.queue_with_two_stacks;

import java.util.Optional;

class Queue<T> {

    private Stack<T> inbox = new Stack<>();
    private Stack<T> outbox = new Stack<>();

    void enqueue(T value) {
        inbox.push(value);
    }

    Optional<T> dequeue() {
        passInboxToOutbox();
        return outbox.pop();
    }

    private void passInboxToOutbox() {
        Optional<T> value = inbox.pop();
        if (value.isPresent()) {
            while (value.isPresent()) {
                outbox.push(value.get());
                value = inbox.pop();
            }
        }
    }

}
