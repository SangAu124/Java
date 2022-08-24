package kr.hs.dgsw.java.dept2.d0413;

public class Queue {
	
	public static final int SIZE = 3;
	
	private final String[] buffer;
	private int inputIndex;
	private int outputIndex;
	private boolean full;
	
	public Queue() {
		this.buffer = new String[SIZE];
		this.inputIndex = 0;
		this.outputIndex = 0;
		this.full = false;
	}

	public void add(String value) {
		if (this.isFull()) {
			throw new RuntimeException("Full");
		}
		
		this.buffer[this.inputIndex] = value;
		this.inputIndex = (this.inputIndex + 1) % SIZE;
		
		this.full = (this.inputIndex == this.outputIndex);
	}
	
	public String poll() {
		if (this.isEmpty()) {
			throw new RuntimeException("Empty");
		}
		
		String value = this.buffer[this.outputIndex];
		this.outputIndex = (this.outputIndex + 1) % SIZE;
		
		this.full = false;
		
		return value;
	}
	
	public int getSize() {
		
		if(this.inputIndex == this.outputIndex) {
			if(this.full) {
				return SIZE;
			}else {
				return 0;
			}
		}
		
		if (this.full) {
			return SIZE;
		} else if (this.inputIndex > this.outputIndex) {
			return this.inputIndex - this.outputIndex;
		}else {
			return SIZE - (this.outputIndex - this.inputIndex);
		}
	}
	
	public boolean isFull() {
		return this.full;
	}
	
	public boolean isEmpty() {
		return ((!this.full) && (this.inputIndex == this.outputIndex));
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue();

		queue.add("Dog");
		queue.add("Mouse");
		queue.add("Dragonfly");
		
		System.out.println(queue.poll() + "   " + queue.getSize());
		System.out.println(queue.poll() + "   " + queue.getSize());
		System.out.println(queue.poll() + "   " + queue.getSize());
	}
}