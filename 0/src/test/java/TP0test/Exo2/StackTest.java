package TP0test.Exo2;
import TP0.Exo2.Stack;

import TP0.Exo2.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void pushPopTest() {
        Stack stack =new Stack();
        stack.push(2);
        assertEquals(2,stack.pop(),"equales mnumbers");
    }
    @Test
    void popPushTest(){
        Stack stack = new Stack();
        stack.push(56);
        int value = stack.pop();
        assertEquals(56, value);
        assertTrue(stack.isEmpty());

    }
    @Test
    void popEmpty(){
        Stack stack =new Stack();
        stack.push(2);
        stack.pop();

        IllegalStateException e = assertThrows(IllegalStateException.class, stack::pop);
        assertEquals("Stack is empty", e.getMessage());

    }




    @Test
    void peekEmpty() {
        Stack stack = new Stack();
        stack.push(2);
        stack.pop();

        IllegalStateException e = assertThrows(IllegalStateException.class, stack::peek);
        assertEquals("Stack is empty", e.getMessage());
    }

    @Test
    void isEmpty() {
        Stack stack = new Stack();
        stack.push(2);
        Stack stack1=new Stack();
        stack1.push(4);
        stack.pop();
        assertTrue(stack.isEmpty());
        assertFalse(stack1.isEmpty());


    }

    @Test
    void size() {
        Stack stack = new Stack();
        stack.push(2);
        stack.push(2);
        stack.push(2);
        stack.push(2);
        stack.push(2);
        stack.push(2);
        assertEquals(6,stack.size());

    }
}