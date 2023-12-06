import javax.swing.plaf.LabelUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prac1 {
    public static List<Integer> func(List<List<Integer>> input){
        List<Integer> op = new ArrayList<>();
        int maxSize = 0;
        for(int i=0; i<input.size(); i++){
           if(maxSize < input.get(i).size()){
               maxSize = input.get(i).size();
           }
        }
        for(int i=0; i<maxSize; i++){
            op.add(0);
        }
        for(int i=0; i<input.size(); i++){
            for(int j=0; j<input.get(i).size(); j++){
                op.set(j, op.get(j)+input.get(i).get(j));
            }
        }
        return op;
    }

    public static void main(String[] args) {
        List<List<Integer>> input = new ArrayList<List<Integer>>();
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        input.add(l1);
        List<Integer> l2 = new ArrayList<>();
        l2.add(3);
        l2.add(6);
        l2.add(1);
        l2.add(6);
        input.add(l2);
        List<Integer> l3 = new ArrayList<>();
        l3.add(8);
        l3.add(5);
        l3.add(1);
        l3.add(3);
        l3.add(6);
        input.add(l3);
        List<Integer> l4 = new ArrayList<>();
        l4.add(3);
        input.add(l4);
        List<Integer> op = new ArrayList<>();
        op = func(input);
        System.out.println(input);
        System.out.println(op);
    }
}
