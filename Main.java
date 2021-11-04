package HashMap_HashSet;

public class Main {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Map myMap = new HashMap();
        myMap.put("1", "Daria");
        myMap.put("2", "Nika");
        myMap.put("3", "Vlad");
        myMap.put("1", "Damir");
        System.out.println(myMap);

        Set set = new HashSet();
        set.add("Daria");
        set.add("Nika");
        set.add("Vlad");
        set.add("Damir");
        System.out.println(set);
    }

}

