import java.util.ArrayList;
import java.util.List;

public class Main {


    public static List<Integer> removeElement(List<Integer> al,int elm){
        int l = al.size();
//        for(int i = 0; i<l; i++){
//            if(al.get(i).equals(elm)){
//                al.remove(i);
//                l--;
//                i--;
//            }
//        }
//        List<Integer> remove = new ArrayList<>();
//        for(Integer a: al){
//            if(a == elm){
//                remove.add(a);
//            }
//        }
//        al.removeAll(remove);

        List<Integer> remove = new ArrayList<>();
        remove.add(3);
        al.removeAll(remove);
        return al;
    }

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(3);
        al.add(3);
        al.add(4, 5);
        al.add(1, 2);
        al.set(1, 1);
        al.remove(1);
//        al.remove(new Integer(5));
//        al.remove(Integer.valueOf(3));
        System.out.println("ArrayList: " + al);
        al = removeElement(al, 3);
        System.out.println("ArrayList: " + al);
    }
}