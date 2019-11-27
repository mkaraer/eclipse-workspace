package day60_Collection;

import java.util.ArrayDeque;
import java.util.Deque;

import java.util.PriorityQueue;
import java.util.Queue;
public class QueuePractice {
public static void main(String[] args) {
	
//	Queue<Integer>que= new PriorityQueue<>();
//	
//	que.add(2);
//	que.add(3);
//	que.add(4);
//	que.add(9);
//	System.out.println(que);           //removes from Array
//	System.out.println(que.remove());
//	System.out.println(que.remove());
//	System.out.println(que.remove());
//	System.out.println(que.remove());
	
Deque<Integer>dq= new ArrayDeque<>();
	
	dq.add(2);
	dq.add(3);
	dq.add(4);
	dq.add(9);
	System.out.println(dq);
	System.out.println(dq.removeLast());
	System.out.println(dq.poll());
	System.out.println(dq.poll());
	System.out.println(dq.poll());
	
}
}
