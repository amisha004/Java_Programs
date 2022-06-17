import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main (String[] args){
        //Create a array deque
        ArrayDeque<String> adq= new ArrayDeque<String>();

        //Use an Array deque like stack
        adq.push("S");
        adq.push("D");
        adq.push("R");
        adq.push("E");
        adq.push("Y");
        adq.push("A");

        System.out.println("Popping the stack: ");
        while (adq.peek()!= null)
            System.out.println(adq.pop() + " ");
        System.out.println();
    }
}
