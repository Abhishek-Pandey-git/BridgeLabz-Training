package com.collections.queue;

import java.util.*;

class CircularBuffer {
    private Queue<Integer> queue;
    private int capacity;

    CircularBuffer(int capacity) {
        this.capacity = capacity;
        queue = new ArrayDeque<>(capacity);
    }

    void insert(int x) {
        if (queue.size() == capacity) {
            queue.poll(); // remove oldest
        }
        queue.add(x);
    }

    void printBuffer() {
        System.out.println(queue);
    }
}

