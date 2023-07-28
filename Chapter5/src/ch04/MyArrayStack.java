package Chapter5.src.ch04;

import Chapter5.src.ch02.MyArray;

public class MyArrayStack {

    MyArray arrayStack;
    int top;

    public MyArrayStack() {
        top = 0;
        arrayStack = new MyArray();
    }

    public MyArrayStack(int size) {
        top = 0;
        arrayStack = new MyArray(size);
    }

    public void push(int data) {
        if(isFull()) {
            System.out.println("stack is full");
            return;
        }
        arrayStack.addElement(data);
        top++;
    }

    public int pop() {
        if (arrayStack.isEmpty()) {
            System.out.println("stack is empty");
            return arrayStack.ERROR_NUM;
        }
        return arrayStack.removeElement(--top);
    }

    public int peek() {
        if (arrayStack.isEmpty()) {
            System.out.println("stack is empty");
            return arrayStack.ERROR_NUM;
        }
        return arrayStack.getElement(--top);
    }

    public boolean isFull() {
        return top==arrayStack.ARRAY_SIZE;
    }

    public void printAll() {
        arrayStack.printAll();
    }
}
