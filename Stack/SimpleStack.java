package Stack;

public class SimpleStack {
    public static void main(String[] args) {
        StackImplementation s = new StackImplementation();

//        s.show();
//        System.out.println(s.pop());
        s.size();
        s.isEmpty();
    }
}

class StackImplementation {
    int[] stack = new int[5];
    int top = 0;

    public void push(int data) {
        stack[top] = data;
        top++;
    }

    public int pop() {
        top--;
        if (top == -1) {
            return -1;
        }
        return stack[top];
    }

    public void size() {
        System.out.println(stack.length);
    }

    public void isEmpty() {
        if (top-- == 0 || top-- == -1) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println(top);
            System.out.println("Stack has elements!");
        }
    }

    public void show() {
        for (int i : stack) {
            System.out.println(i);
        }
    }
}