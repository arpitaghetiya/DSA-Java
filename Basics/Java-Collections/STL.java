import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.HashSet;
import java.util.HashMap;

public class STL {
    public static void main(String[] args) {
        //ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);            
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("List: " + list);
        list.remove(2);
        System.out.println("List after removal: " + list);
        System.out.println("Size of the list: " + list.size());
        System.out.println("Element at index 2: " + list.get(2));
        list.set(2,10);
        System.out.println("List after setting element at index 2: " + list);
        System.out.println("Contains 10: " + list.contains(10));
        Collections.sort(list);
        System.out.println("List after sorting: " + list);
        Collections.reverse(list);
        System.out.println("List after reversing: " + list);  
        System.out.println();
        System.out.println(); 

        //LinkedList
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);   
        list2.add(3);
        list2.add(4);
        list2.add(5);
        System.out.println("LinkedList: " + list2);
        list2.add(0,0);
        System.out.println("LinkedList after adding element at index 0: " + list2);
        list2.addLast(6);
        System.out.println("LinkedList after adding element at last: " + list2);
        list2.removeFirst();
        System.out.println("LinkedList after removing first element: " + list2);
        list2.removeLast();
        System.out.println("LinkedList after removing last element: " + list2);
        System.out.println("Element at index 2 in LinkedList: " + list2.get(2));
        list2.remove(Integer.valueOf(3));
        System.out.println("LinkedList after removing element with value 3: " + list2);
        System.out.println("Contains 4: " + list2.contains(4));
        System.out.println();
        System.out.println(); 


        //Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack: " + stack);
        System.out.println("Top element of the stack: " + stack.peek());
        stack.pop();
        System.out.println("Stack after popping top element: " + stack);
        System.out.println("Is stack empty: " + stack.isEmpty());
        System.out.println();
        System.out.println();

        //Queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);   
        queue.add(3);
        System.out.println("Queue: " + queue);
        System.out.println("Front element of the queue: " + queue.peek());  
        System.out.println("Removing front element of the queue: " + queue.poll());
        System.out.println("Queue after removing front element: " + queue);
        System.out.println("Is queue empty: " + queue.isEmpty());
        System.out.println();
        System.out.println();
    
        //PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(2);
        pq.add(3);
        System.out.println("PriorityQueue: " + pq);
        System.out.println("Head of the priority queue: " + pq.peek());
        System.out.println("Removing head of the priority queue: " + pq.poll());
        System.out.println("PriorityQueue after removing head: " + pq);
        System.out.println("Is priority queue empty: " + pq.isEmpty());
        System.out.println();
        System.out.println();
    
        //HashSet
        HashSet<Integer> set = new HashSet<>();
        set.add(1); 
        set.add(2);
        set.add(3);
        System.out.println("HashSet: " + set);
        System.out.println("Contains 2: " + set.contains(2));
        set.remove(2);
        System.out.println("HashSet after removing 2: " + set);
        System.out.println("Size of the HashSet: " + set.size());
        System.out.println();
        System.out.println();

        //HashMap
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        System.out.println("HashMap: " + map);
        System.out.println("Value for key 2: " + map.get(2));
        map.remove(2);
        System.out.println("HashMap after removing key 2: " + map);
        System.out.println("Size of the HashMap: " + map.size());
    }

}
