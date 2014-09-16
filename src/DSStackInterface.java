
public interface DSStackInterface<T> 
{
	void pop() throws StackUnderflowException;
	//throws stack underflow exception if the stack is empty
	//otherwise, removes the top element from the stack
	
	T top() throws StackUnderflowException;
	//throws stack underflow exception if the stack is empty
	//otherwise, returns top element from the stack
	
	boolean isEmpty();
	//returns true if the stack is empty, otherwise returns false
}