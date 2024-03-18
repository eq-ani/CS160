public class CarRequests {
    Queue<Integer> carReq;

    public CarRequests()
    {
        carReq = new Queue<>();
    }

    public void addRequest(int x)
    {
        carReq.enqueue(x);
    }

    public int getRequest()
    {
        return carReq.dequeue();
    }

    public boolean hasPendingRequests()
    {
        if (carReq.isEmpty())
        {
            return false;
        }
        return true;
    }

    
}
