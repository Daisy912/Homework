package leetcode.homework4;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Name:MyQueue
 * Description:
 * <p>
 * Date: 2024/10/30下午4:12
 * Author:Daisy
 */
public class MyQueue {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(4);
        System.out.println(myQueue.pop());
        myQueue.push(5);
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
//        System.out.println(myQueue.empty());
    }
// 法一

//    Stack<Integer> stack;
//    int[] arr;
//
//    public MyQueue() {
//        stack = new Stack<>();
//    }
//
//    public void push(int x) {
//        stack.push(x);
//    }
//
//    public int pop() {
//        int size = stack.size();
//        arr = new int[size - 1];
//
//        int i = 0;
//        while (i < size - 1) {
//            arr[size -2- i] = stack.pop();
//            i++;
//        }
////        System.out.println(Arrays.toString(arr));
//        int pop = stack.pop();
//        Stream.of(arr).forEach(ints -> {
//            for (int i1 : arr) {
//                stack.push(i1);
//            }
//        });
//        return pop;
//    }
//
//    public int peek() {
//        return stack.stream().findFirst().get();
//    }
//
//    public boolean empty() {
//        return stack.empty();
//    }

    // 法二

//    Stack<Integer> stack;
//    Stack<Integer> temp;
//
//    public MyQueue() {
//        stack = new Stack<>();
//        temp = new Stack<>();
//    }
//
//    public void push(int x) {
//        stack.push(x);
//    }
//
//    public int pop() {
//        toTemp();
//        int pop = temp.pop();
//        toStack();
//        return pop;
//    }
//
//    public int peek() {
//        return stack.stream().findFirst().get();
//    }
//
//    public boolean empty() {
//        return stack.empty();
//    }
//
//    public void toTemp() {
//        while (!stack.empty()) {
//            temp.push(stack.pop());
//        }
//    }
//
//    public void toStack() {
//        while (!temp.empty()) {
//            stack.push(temp.pop());
//        }
//    }

    //法三

    Stack<Integer> stack;
    Stack<Integer> temp;

    public MyQueue() {
        stack = new Stack<>();
        temp = new Stack<>();
    }

    public void push(int x) {
        while (!stack.empty()) {
            temp.push(stack.pop());
        }
        stack.push(x);
        while (!temp.empty()) {
            stack.push(temp.pop());
        }
    }

    public int pop() {
        return stack.pop();
    }

    public int peek() {
        return stack.peek();
    }

    public boolean empty() {
        return stack.empty();
    }
}
