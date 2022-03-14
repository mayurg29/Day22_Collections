import java.util.*;

public class JavaCollectionDemo {

    public static void main(String[] args) {
        doListDemo();
        doStackDemo();
        doQueueDemo();
        doSetDemo();
        doMapDemo();
    }

    private static void doListDemo() {
        System.out.println("In doListDemo");
        // Creating List
        List<String> list = new LinkedList<>();
        list.add("Mayur");
        list.add("Ravi");
        list.add("Ajay");
        list.add("Ravi");
        list.add("Vijay");

        // Traversing List through Iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    private static void doStackDemo() {
        System.out.println("\nIn doStackDemo");
        Stack<String> stack = new Stack<>();
        stack.push("Ayush");
        stack.push("Garima");
        stack.push("Amit");
        stack.push("Ashish");
        stack.push("Pranav");
        String pop = stack.pop();
        Iterator<String> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void doQueueDemo() {
        System.out.println("\nIn doQueueDemo");
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Amit");
        queue.add("Vijay");
        queue.add("Ravi");
        queue.add("Shubham");
        System.out.println("head:" + queue.element());
        System.out.println("head:" + queue.peek());
        System.out.println("iterating the queue elements:");
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> iterator1 = queue.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }

    private static void doSetDemo() {
        System.out.println("\nIn doSetDemo");
        Set<String > set = new LinkedHashSet<>();
        set.add("Ravi");
        set.add("Ajay");
        set.add("Ravi");
        set.add("Vijay");
        for (String str : set) {
            System.out.println(str);
        }
    }

    private static void doMapDemo() {
        System.out.println("\nIn doMapDemo");
        Map<Integer, String> map = new HashMap<>();
        map.put(100, "Amit");
        map.put(101, "Rahul");
        map.put(102, "Karan");
        map.put(100, "Kundan");
        // Elements can traverse in any order
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
