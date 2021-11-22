import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.commons.collections4.MyArrayStack;

public class TestMyArrayStack {
    public static void main(String []args) {
        TestMyArrayStack myTest = new TestMyArrayStack();
        myTest.testPush();
        myTest.testPeek();
        myTest.testPop();
        myTest.testSearch();
    }

    public void testPush() {
        MyArrayStack<Double> as = new MyArrayStack();
        as.push(0.8);
        as.push(0.9);
        as.push(1.5);
        if(3 == as.size())
            System.out.println("OK");
        else
            System.out.println("NO");
    }

    public void testPop() {
        MyArrayStack<Double> as = new MyArrayStack();
        as.push(0.1);
        as.push(0.2);
        if(as.pop() == 0.2 && as.pop() == 0.1)
            System.out.println("OK");
        else
            System.out.println("NO");
    }

    public void testPeek() {
        MyArrayStack<Double> as = new MyArrayStack();
        as.push(1.2);
        as.push(2.3);
        as.push(3.4);
        as.push(4.5);
        if(as.peek() == 4.5 && as.peek(2) == 2.3)
            System.out.println("OK");
        else
            System.out.println("NO");
    }

    public void testSearch() {
        MyArrayStack<Double> as = new MyArrayStack();
        as.push(1.2);
        as.push(1.5);
        as.push(1.8);
        as.push(2.1);
        as.push(2.4);
        if(as.search(1.5) == 4 )
            System.out.println("OK");
        else
            System.out.println("NO");

    }
}
