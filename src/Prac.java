import java.util.*;


public class Prac {
    public static void main(String[] args) {
//        Queue<Integer> l1 = new LinkedList<Integer>();
//        l1.add(2);
//        l1.add(6);
//        l1.add(7);
//        l1.offer(5); // why offer method???
//        System.out.println("After removing: " + l1);

//        String str = "abcdefssacde";
//        Set<Character> set = new LinkedHashSet<Character>();
//        for(int i=0; i<str.length(); i++){
//            set.add(str.charAt(i));
//        }
//        Iterator<Character> iterator = set.iterator();
//        String st = "";
//        while(iterator.hasNext()){
//            st  += iterator.next();
//        }
//        System.out.println("OP: "+st);
        int n = 3;
        Scanner scan = new Scanner(System.in);
        Set<List<String>> s = new LinkedHashSet<List<String>>();
        for(int i=0; i<n; i++){
            String a = scan.next();
            String b = scan.next();
            List<String> l = new ArrayList<>();
            l.add(a);
            l.add(b);
            s.add(l);
            System.out.println("O/p: " + s);
            System.out.println("Size: " + s.size());
        }
    }
}
