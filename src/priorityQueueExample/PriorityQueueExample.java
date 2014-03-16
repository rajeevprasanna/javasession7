package priorityQueueExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class PriorityQueueExample {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<Integer>();
		l.add(new Integer(1));
		
		int ii = l.get(0);
		
		// natural ordering example of priority queue
		Queue<Integer> integerPriorityQueue = new PriorityQueue<Integer>(7);
				 		
		Random rand = new Random();
		for (int i = 0; i < 7; i++) {
			integerPriorityQueue.add(new Integer(rand.nextInt(100)));
		}
		
		for (int i = 0; i < 7; i++) {
			Integer in = integerPriorityQueue.poll();
			//System.out.println("Processing Integer:" + in);
		}
		  
		// PriorityQueue example with Comparator
		Queue<Customer> customerPriorityQueue = new PriorityQueue<>(7, idComparator);
		addDataToQueue(customerPriorityQueue);

		pollDataFromQueue(customerPriorityQueue);
	}
	// utility method to add random data to Queue
	private static void addDataToQueue(Queue<Customer> customerPriorityQueue) {
		Random rand = new Random();
		for (int i = 0; i < 7; i++) {			 
			customerPriorityQueue.add(new Customer(i, "Rajeev " + i));
		}
	}

	// Comparator anonymous class implementation
	public static Comparator<Customer> idComparator = new Comparator<Customer>() {
		@Override
		public int compare(Customer c1, Customer c2) {
			return (-1) * (int) (c1.getId() - c2.getId());
		}
	};

	

	// utility method to poll data from queue
	private static void pollDataFromQueue(Queue<Customer> customerPriorityQueue) {
		while (true) {
			Customer cust = customerPriorityQueue.poll();
			if (cust == null)
				break;
			System.out.println("Processing Customer with ID=" + cust.getId());
		}
	}

}
