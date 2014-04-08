public interface List<T>
{
	int length();

	T first();

	T last();
	
	boolean lookup(T obj);
	
	T find(int n);
	
	int find(T obj);
	
	void delete(T obj);
	
	void deleteIndex(int n);
	
	void add(T obj);
	
	T getNext();

	T getPrevious();

	void reset();
}