package leetcode.homework4;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Stack;

/**
 * Name:MyStack
 * Description:
 * <p>
 * Date: 2024/10/28下午1:10
 * Author:Daisy
 */
public class MyStack {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.empty());

    }


    Queue<Integer> queue;
    Queue<Integer> temp;

    public MyStack() {
        queue = new LinkedList<>();
        temp = new LinkedList<>();
    }

    public void push(int x) {
        while (!queue.isEmpty()) {
            temp.add(queue.remove());
        }
        queue.add(x);
        while (!temp.isEmpty()) {
            queue.add(temp.remove());
        }
    }


    public int pop() {
        return queue.remove();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }

}
