package leetcode.homework4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

/**
 * Name:MyCircularQueue
 * Description:
 * <p>
 * Date: 2024/10/30下午5:03
 * Author:Daisy
 */
public class MyCircularQueue {
    public static void main(String[] args) {
        MyCircularQueue circularQueue = new MyCircularQueue(8);
        circularQueue.enQueue(3);
        circularQueue.enQueue(9);
        circularQueue.enQueue(5);
        circularQueue.enQueue(0);
        circularQueue.deQueue();
        circularQueue.deQueue();
        System.out.println(circularQueue.isEmpty());
        System.out.println(circularQueue.isEmpty());
        System.out.println(circularQueue.Rear());
        System.out.println(circularQueue.Rear());
        circularQueue.deQueue();
    }

    Integer[] queue;
    int len = 0;
    int index = 0;
    int start = 0;

    public MyCircularQueue(int k) {
        queue = new Integer[k];
        len = k;
    }

    public boolean enQueue(int value) {
        if (this.isFull()) {
            return false;
        }
        queue[index] = value;
        index++;
        if (index == len) {
            index = 0;
        }
        return true;
    }

    public boolean deQueue() {
        if (this.isEmpty()) {
            return false;
        }
        queue[start] = null;
        start++;
        if (start == len) {
            start = 0;
        }
        return true;
    }

    public int Front() {
        if (this.isEmpty()) {
            return -1;
        }
        return queue[start];
    }

    public int Rear() {
        if (this.isEmpty()) {
            return -1;
        }
        if (index == 0) {
            return queue[len-1];
        }
        return queue[index - 1];

    }

    public boolean isEmpty() {
        for (Integer i : queue) {
            if (null != i) {
                return false;
            }
        }
        return true;
    }

    public boolean isFull() {
        for (Integer i : queue) {
            if (null == i) {
                return false;
            }
        }
        return true;
    }
}
