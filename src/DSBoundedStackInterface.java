
public interface DSBoundedStackInterface<T> extends DSStackInterface<T>
{
	void push(T element) throws StackOverflowException;
	//throws stack overflow exception if the stack is full
	//otherwise, places element at the top of the stack
	
	boolean isFull();
	//returns true if the stack is full, otherwise, returns false
}