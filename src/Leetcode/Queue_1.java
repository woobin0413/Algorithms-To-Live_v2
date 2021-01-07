package Leetcode;

public class Queue_1 {

	private int arr[];
	private int front;
	private int rear;
	private int capacity;
	private int queueCount;

	Queue_1(int size) {

		arr = new int[size];
		capacity = size;
		front = 0;
		rear = -1;
		queueCount = 0;

	}

	public void dequeue() {
		if(isEmpty()) {
		    System.out.println("UnderFlow\nProgram Terminated");
            System.exit(1);
		}
		System.out.println("Removing " + arr[front]);
		
		front = (front + 1) % capacity;
		queueCount--;
		
	}
    
	public void enqueue(int item) {
		if (isFull()) {
			System.out.println("OverFlow\nProgram Terminated");
            System.exit(1);
		}
		System.out.println("Inserting " + item);
		
		rear = (rear + 1) % capacity;
		arr[rear] = item;
		queueCount++;
	}
	
	public int peek() {
		if (isEmpty()) {
			System.out.println("OverFlow\nProgram Terminated");
            System.exit(1);
		}
		return arr[front];
	}
	
	public Boolean isFull()
    {
        return (size() == capacity);
    }
    
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return (size() == 0);
	}

	private int size() {
		// TODO Auto-generated method stub
		return queueCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue_1 q = new Queue_1(5);
		 
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        
        System.out.println("Front element is: " + q.peek());
        q.dequeue();
        System.out.println("Front element is: " + q.peek());
 
        System.out.println("Queue size is " + q.size());
 
        q.dequeue();
        
        
        if (q.isEmpty())
            System.out.println("Queue Is Empty");
        else
            System.out.println("Queue Is Not Empty");
    }
	

}
