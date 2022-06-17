import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args){
        //Create an array list
        ArrayList<String > al= new ArrayList<String>();

        //Add elements to the array list.
        al.add("C");
        al.add("A");
        al.add("D");
        al.add("E");
        al.add("K");

        //use iterator to display contents of al
        System.out.print("Original content of al: ");
        Iterator<String> itr =al.iterator();
        while (itr.hasNext()){
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        //Modify objects being iterated
        ListIterator<String> litr= al.listIterator();
        while (litr.hasNext()) {
            String element = litr.next();
            litr.set(element + "+");
        }

        System.out.print("Modified contents of al: ");
        itr = al.iterator();
        while (itr.hasNext()){
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        //
    }
}
