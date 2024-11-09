import java.util.LinkedHashMap;
import java.util.Map;

public class Linked_HashMap {
    public static void main(String[] args) {
        System.out.println("Implementing Linked HashMap");
        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
        map.put(101,"Aman");
        map.put(102,"Naman");
        map.put(103,"Anshuman");
        map.put(104,"Gaurav");
        map.put(105,"Sandeep");
        //Displaying The Linked HashMap
        System.out.println(map);
        //Iterating Linked HashMap
        for(Map.Entry<Integer,String> e : map.entrySet()){
            System.out.println(e.getKey()+" - "+e.getValue());
        }

        System.out.println("The Value Of ID 101 is "+map.get(101));
        System.out.println("Removing The Sandeep Data ");
        map.remove(105);
        System.out.println("Is ID 102 Present "+map.containsKey(102));
        System.out.println("Is Gaurav Name Present "+map.containsValue("Gaurav"));
        System.out.println("The Size Of The Linked Hash Map Is "+map.size());
        System.out.println("Clearing Whole Linked HashMap");
        map.clear();
        System.out.println(map);
    }
}
