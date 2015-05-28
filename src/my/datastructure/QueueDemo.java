package my.datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void doQueue() {
		Queue<String> queue = new LinkedList<String>();
		String strArray[] = {"First", "Second", "Third"};
		for (String str : strArray) {
			queue.offer(str);
		}
		
		String str;
		while((str = (String)queue.poll()) != null) {
			System.out.println(str);
		}
		
	}
	
	public static void main(String args[]) {
		doQueue();
	}
	
}
