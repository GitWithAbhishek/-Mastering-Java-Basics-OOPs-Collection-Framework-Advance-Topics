import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Program {
    public static void main(String[] args) {
        System.out.println("Implementing The TreeMap");
        TreeMap<Integer,Integer> tmap = new TreeMap<>();
        tmap.put(101,01);
        tmap.put(102,02);
        tmap.put(103,03);
        tmap.put(104,04);
        tmap.put(105,05);
        //Displaying The TreeMap
        System.out.println(tmap);
        //Iterating TreeMap
        for(Map.Entry<Integer,Integer> e : tmap.entrySet()){
            System.out.println(e.getKey()+" - "+e.getValue());
        }

        System.out.println("The Value Of ID 101 is "+tmap.get(101));
        System.out.println("Removing The 105 Data ");
        tmap.remove(105);
        System.out.println("Is ID 102 Present "+tmap.containsKey(102));
        System.out.println("Is Gaurav Name Present "+tmap.containsValue(03));
        System.out.println("The Size Of The Tree Map Is "+tmap.size());
        System.out.println("Clearing Whole Tree Map");
        tmap.clear();
        System.out.println(tmap);
    }
}
