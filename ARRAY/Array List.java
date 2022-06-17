import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList <String> al=new ArrayList<String>();
        System.out.println("Initial size of al: " + al.size());
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add(1, "A2");
        System.out.println("size of al after additions: " +al.size());

        System.out.println("Content of al: " +al);
        al.remove("A");
        al.remove(2);

        System.out.println("Size of al after deletion: " +al.size());
        System.out.println("Content of al: " +al);
    }
}
