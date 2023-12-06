import java.util.*;

public class PracMap {
    public static void main(String[] args) {
        Map<String, String>  hm = new HashMap<>();
        hm.put("name", "Ayuj");
        hm.put("city", "Ahmedabad");
        System.out.println("HashMap: " + hm);
        Set<Map.Entry<String,String>> entrySet = hm.entrySet();
        for(Map.Entry<String,String> entry : entrySet){
            System.out.println("Key=>"+entry.getKey() + ", Value=>"+entry.getValue());
        }
//        System.out.println("KeySet Example");
//        hm.containsKey("name");
//        hm.containsValue("Ayuj");
//        hm.get("Key");
//        Map<String, String> lhm = new LinkedHashMap<>();
//        Map<String, String> tm = new TreeMap<>();

        String str = "abcdefssacde";
        Map<Character, Integer> map = new HashMap<>();
        List<Character> l = new ArrayList<Character>();
        for(int i=0; i<str.length(); i++) {
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        System.out.println("HashMap: " + map);
    }
}
