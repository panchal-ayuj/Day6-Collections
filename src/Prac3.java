import java.util.*;

public class Prac3 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(15);
        l.add(11);
        l.add(7);
        l.add(4);
        l.add(6);
        int sum = 13;
        boolean bool = true;
        List<Integer> l2 = new ArrayList<>();
        for(int i = 0; i<l.size(); i++){
            int remain = sum - l.get(i);
            for(int j=i; j<l.size(); j++){
                if(remain == l.get(j) && i!=j){
                    l2.add(l.get(i));
                    l2.add(l.get(j));
                    bool = false;
                }
            }
//            if(bool == false){
//                break;
//            }
        }
        System.out.println("list: " + l2);
    }
}
