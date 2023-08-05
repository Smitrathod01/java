import java.util.*;
//in queue u can insert and delete elements from both the end.
public class ArrayDequee {
    public static void main(String[] args) {
        ArrayDeque<Integer> a = new ArrayDeque<>();
        a.add(3);
        a.add(56);
        a.addFirst(45);
        a.addLast(67);
        //System.out.println(a.getFirst());
       System.out.println(a);
    }
}
