

import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;

import org.apache.commons.collections4.MyArrayStack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MyArrayStackTest {

    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test()
    public void testPush() {
        MyArrayStack as = new MyArrayStack();
        as.push(0.1);
        as.push(0.2);
        as.push(0.3);
        as.push(0.4);
        assertEquals(4, as.size());
    }

    @Test
    public void testPop() {
        MyArrayStack as = new MyArrayStack();
        as.push(0.1);
        as.push(0.2);
        assertEquals(0.2, as.pop());
        assertEquals(0.1, as.pop());
        assertEquals(0, as.size());
    }

    @Test
    public void testPeek() {
        MyArrayStack as = new MyArrayStack();
        as.push(0.1);
        as.push(0.2);
        as.push(0.3);
        as.push(0.4);
        as.push(0.5);
        as.push(0.6);
        assertEquals(0.6, as.peek());
        assertEquals(0.2, as.peek(4));
    }

    @Test
    public void testSearch() {
        MyArrayStack as = new MyArrayStack();
        as.push(0.1);
        as.push(0.2);
        as.push(0.3);
        as.push(0.4);
        as.push(0.5);
        as.push(0.6);
        assertEquals(as.search(0.6), 1);
        assertEquals(as.search(0.2), 5);
        assertEquals(as.search(0.1), 6);
    }


}
