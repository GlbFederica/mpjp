package s090;

public class Exe2 {
	public static void main(String[] args) {
		
		MyIntStack2 mis = new MyIntStack2();
		
		for (int i=0; i<5; i++) {
			mis.push(i+1);
			System.out.println(mis.toString());
		}
		
		for (int i = 0; i<5; i++) {
			System.out.println(mis.pop());
		}
		
	}
}

class MyIntStack2 {

	private Node top;

	public MyIntStack2() {
		this.top = null;
	}

	public void push(int value) {

		Node node = new Node(value);

		if (top == null) {
			this.top = node;
			return;
		} else {
			node.setPrev(this.top);
			this.top = node;
		}
	}

	int pop() {
		
		if(top == null) {
			throw new IllegalArgumentException("Empty stack");
		}
		
		Node current = top;
		top = top.getPrev();		
		return current.getValue();
	}

	@Override
	public String toString() {
		if (top == null) {
			throw new IllegalStateException("Stack is empty");
		}
		
		int value = this.top.getValue();
		return "" + value;
	}

	class Node {
		private int value;
		private Node prev;

		public Node(int value) {
			this.value = value;
			this.prev = null;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}

		@Override
		public String toString() {
			return "Node [value=" + value + ", prev=" + prev + "]";
		}

	}
}