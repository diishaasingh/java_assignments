package Day6;

import java.util.Stack;

class EmptyQueueException extends Exception{
	EmptyQueueException(String message){
		super(message);
	}
	
}
public class Queue {
	static Stack<Integer> s1 = new Stack<>();
	static Stack<Integer> s2 = new Stack<>();

	 void add(int x) {
		s1.push(x);
	}

	 int remove throws EmptyQueueException (){
		 if (s1.isEmpty()) {
			throw new Exception("Queue is empty");
			}
		while (s1.size() != 1) {
			s2.push(s1.pop());
		}
		s1.pop();
		while (!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}

	 int peek() {
		if (s1.isEmpty()) {
			return -1;
		}
		while (s1.size() != 1) {
			s2.push(s1.pop());
		}
		int temp = s1.pop();
		s2.push(temp);
		while (!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		return temp;

	}

	int size() {
		return s1.size();
	}

	public static void main(String[] args) {

		 Queue q = new Queue(); 
		    q.remove();
		    q.add(1); 
		    q.add(4); 
		    q.add(3); 
		    q.poll();
		    
		    System.out.println(q.peek()); 
		    System.out.println(q.size());
	}

}
