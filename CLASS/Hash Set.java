import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args){
        //Create a hash set
        HashSet<String> hs=new HashSet<String>();

        //Add elements to the hash set
        hs.add("Orange");
        hs.add("Apple");
        hs.add("Dog");
        hs.add("Cat");
        hs.add("Banana");

        System.out.println(hs);
    }
}
