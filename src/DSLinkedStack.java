
public class DSLinkedStack<T> implements DSUnboundedStackInterface<T> 
{
	private DSLLNode<T> top;
	
	public DSLinkedStack()
	{
		top = null;
	}

	
	public void push(T element)
	{
		top = new DSLLNode<T>(element, top);
	}
	
	public void pop() throws StackUnderflowException
	{
		if (!isEmpty())
			top = top.getNext();
		else
			throw new StackUnderflowException("Top attempted on empty stack.");
	}
	
	public T top() throws StackUnderflowException
	{
		if (!isEmpty())
			return top.getData();
		else
			throw new StackUnderflowException("Top attempted on empty stack.");
	}
	
	public boolean isEmpty()
	{
		return (top == null);
	}
}