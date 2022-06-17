import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String [] args){
        LinkedList<String> ll= new LinkedList<String>();
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.addFirst("A");
        ll.addLast("Z");
        ll.add(1, "A2");
        System.out.println("Original content of ll: " +ll);
        ll.remove("F");
        ll.remove(2);
        System.out.println("Content of ll after deletion: " +ll);
    }
}
