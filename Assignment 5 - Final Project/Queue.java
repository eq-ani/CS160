import java.util.*;
public class Queue<X> 
{
    protected int len;
    protected List<X> Queue;

    public Queue()
    {
        len = 0;
        Queue = new LinkedList<>();
    }

    public int size()
    {
        return len;
    }

    public void enqueue(X y)
    {
        Queue.add(y);
        len++;
    }

    public X dequeue()
    {
        len--;
        return Queue.remove(0);
    }

    public boolean isEmpty()
    {
        if (len == 0)
        {
            return true;
        }
        return false;
    }

    public X peek()
    {
        return Queue.get(0);
    }

    public String toString()
    {
        String retstring = "";
        for (int i = 0; i < len; i++)
        {
            retstring += Queue.get(i) + "\n";
        }
        return retstring;
    }
}
