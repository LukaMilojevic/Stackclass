public class Stack<T> {
    private Object[] elements;
    private int top;
    private int capacity;

    /**
     * Default constructor: creates a stack with a capacity of 10.
     */
    public Stack(){
        this(10);
    }

    /**
     * Constructor with custom capacity.
     * @param capacity The maximum number of elements.
     */
    public Stack(int capacity){
        this.capacity = capacity;
        this.elements = new Object[capacity];
        this.top = -1;
    }

    /**
     * Adds an element to the top of the stack.
     * @param element The item to add.
     * @throws StackFullException if capacity is exceeded.
     */
    public void push(T element) throws StackFullException{
        if (top == capacity -1){
            throw new StackFullException(" Stack is full");
        }
        elements[++top] = element;
    }

    /**
     * Removes and returns the top element.
     * @return The removed element.
     * @throws StackEmptyException if stack is empty.
     */
    public T pop() throws StackEmptyException{
        if(top == -1){
            throw new StackEmptyException(" Stack is empty");
        }
        T element = (T) elements[top];
        elements[top--] = null;
        return element;
    }

    /**
     * Returns the top element without removing it.
     * @return The top element.
     * @throws StackEmptyException if stack is empty.
     */
    public T peek() throws StackEmptyException{
        if(top == -1){
            throw new StackEmptyException(" Stack is Empty");
        }
        return (T) elements[top];
    }

    /**
     *All elements get put into a String separated by semicolons.
     * @return A formatted String of all elements.
     */
    public String list(){
        String list = "";
        for(int i =0;i<=top;i++){
            list += elements[i].toString();
            if(i<top){
                list += ";";
            }
        }
        return list;
    }
}
