package prob5;

public class MyStack<T> {
	
	private int bufferSize;
	private int top = 0;
	private String[] buffer;
	private String[] temp;
	
	public MyStack(int i) {
		this.bufferSize = i;
		this.buffer = new String[bufferSize];
		this.temp = new String[bufferSize+1];
	}
	
	public void push(String string) {
		if(top > bufferSize-1) {
			temp[top++] = string;
			for(int i = 0; i < bufferSize; i++)
				temp[i] = buffer[i];
			bufferSize+=2;
			this.buffer = new String[bufferSize];
			for(int i = 0; i < temp.length; i++)
				buffer[i] = temp[i];
			this.temp = new String[bufferSize+1];
		}
		else {
			buffer[top++] = string;
		}
	}
	
	public boolean isEmpty() {
		if(top == 0)
			return true;
		else
			return false;
	}
	public String pop() throws MyStackException {
		if(isEmpty())
			throw new MyStackException();
		return buffer[--top];
		
	}

	
}