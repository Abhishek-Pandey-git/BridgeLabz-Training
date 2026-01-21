package com.collections.queue;

import java.util.*;

class StackUsingQueues {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // Push operation
    void push(int x) {
        q2.add(x);

        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }

        // swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Pop operation
    int pop() {
        return q1.poll();
    }

    // Top operation
    int top() {
        return q1.peek();
    }

    boolean isEmpty() {
        return q1.isEmpty();
    }
}

