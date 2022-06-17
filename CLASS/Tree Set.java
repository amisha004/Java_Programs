import java.util.TreeSet;
//Create a set with sorting ie, in ascending order
public class TreeSetDemo {
    public static void main (String[] args){
        //Create a tree set
        TreeSet<String> ts=new TreeSet<String>();

        //Add elements to the tree
        ts.add("A");
        ts.add("R");
        ts.add("D");
        ts.add("E");
        ts.add("B");
        ts.add("W");

        System.out.println(ts);
    }
}
