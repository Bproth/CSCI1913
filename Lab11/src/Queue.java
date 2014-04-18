public class Queue <T> implements QGen <T> {

    public Queue () {}

    public void add(T o) {

        if (size == 0) {
          front = new NGen <T> (o, null);
          rear = front;
        }
        else {
          rear.setNext(new NGen <T> (o, null));
          rear = rear.getNext();
        }
        size++;
    }

    public T remove() {

        T answer;

        if (size == 0)
          return null;
        
        answer = front.getData();
        front = front.getNext();
        size--;
        if (size == 0)
          rear = null;
        return answer;
    }

    public int length() {
        return size;
    }

    private int size;
    private NGen <T> front;
    private NGen <T> rear;

	public void concQ(Queue<T> q)
	{
		if (size ==0)
		{
			front = q.front;
			rear = q.rear;
			size = q.size;
		}
		else
		{
			rear.setNext(q.front);
			rear = q.rear;
			size = size + q.size;
		}
	}
	
	public T front()
	{
		if (front == null)
		{
			return null;
		}
		return front.getData();
	}
}  // Q1Gen class
