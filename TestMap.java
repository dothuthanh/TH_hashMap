import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);

        Map<String, Integer> linkesHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkesHashMap.put("Smith",30);
        linkesHashMap.put("Anderson",31);
        linkesHashMap.put("Lewis",29);
        linkesHashMap.put("Cook",29);
        System.out.println("\n The age for " + "Lewis is" + linkesHashMap.get("Lewis"));


    }

}
