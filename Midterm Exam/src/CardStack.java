import java.util.EmptyStackException;

public class CardStack {
    private Card[] stack;
    private int top;

    public CardStack(int capacity) {
        stack = new Card[capacity];
        top = -1;
    }

    public void push(Card card) {
        if (top == stack.length - 1) {
            Card[] newStack = new Card[stack.length * 2];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }

        stack[++top] = card;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public Card pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        Card card = stack[top];
        stack[top] = null;
        top--;
        return card;
    }

    public Card peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return stack[top];
    }

    public void printStack() {
        System.out.println("Printing stack...");

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}