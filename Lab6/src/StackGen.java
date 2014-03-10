public interface StackGen <T> 
{
    public void push(T o);
    
    public T pop();
    
    public T top();
   
    public boolean isEmpty();
}