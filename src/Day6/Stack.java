package Day6;

import java.util.LinkedList;
import java.util.Queue;


public class Stack {

	Queue<Integer> q1 = new LinkedList<>();
	Queue<Integer> q2 = new LinkedList<>();

	void push(int x) {
		q1.add(x);
	}

	void pop() {
		if (q1.isEmpty()) {
			return;
		}
		while (q1.size() != 1) {
			q2.add(q1.remove());
		}
		q1.remove();
		while (!q2.isEmpty()) {
			q1.add(q2.remove());
		}
	}

	int top() {
		if (q1.isEmpty()) {
			return -1;
		}
		while (q1.size() != 1) {
			q2.add(q1.remove());
		}
		int temp = q1.remove();
		q2.add(temp);
		while (!q2.isEmpty()) {
			q1.add(q2.remove());
		}
		return temp;
	}

	int size() {
		return q1.size();
	}

	public static void main(String[] args) {
     Stack s=new Stack();
     s.push(1);
     s.push(2);
     s.push(3);
     s.push(4);
     System.out.println("current size: " + s.size());
     System.out.println(s.top());
     s.pop();
     System.out.println(s.top());
     s.pop();
     System.out.println(s.top());
     System.out.println("current size: " + s.size());
     s.push(5);
     System.out.println(s.top());

	}

}
