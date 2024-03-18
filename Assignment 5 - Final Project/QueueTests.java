import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class QueueTests {
    @Test 
    public void queueConstructorTest()
    {
       Queue<Integer> queue = new Queue<>();
       queue.enqueue(6);
       queue.enqueue(25);
       queue.enqueue(10);
       assertEquals("6\n25\n10\n", queue.toString());
    }

    @Test 
    public void sizeTest()
    {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(10);
        queue.enqueue(60);
        queue.enqueue(100);
        assertEquals(3, queue.size());
    }

    @Test 
    public void enqueueTest()
    {
        //same test as constructor due enqueue not returning anything, would come out false if enqueue wasn't functional. 
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(3);
        queue.enqueue(256);
        queue.enqueue(132);
        assertEquals("3\n256\n132\n", queue.toString());
    }

    @Test 
    public void dequeueTest()
    {
        //checks if dequeue returns the correct value, then checks if it's removed
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(3);
        queue.enqueue(256);
        queue.enqueue(132);
        int num = queue.dequeue();
        assertEquals(3, num);
        assertEquals("256\n132\n", queue.toString());
    }

    @Test 
    public void isEmptyTest()
    {
        //checks empty queue, then checks one that isn't empty
        Queue<Integer> q = new Queue<>();
        assertEquals(true, q.isEmpty());
        q.enqueue(3);
        q.enqueue(256);
        q.enqueue(132);
        assertEquals(false, q.isEmpty());
    }

    @Test 
    public void peekTest()
    {
        //same as dequeue test but doesn't remove anything, and therefore we don't need to check the tostring
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(3);
        queue.enqueue(256);
        queue.enqueue(132);
        int peek = queue.peek();
        assertEquals(3, peek);
    }    

   
}
