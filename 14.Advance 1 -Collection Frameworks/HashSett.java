import java.util.*;

public class HashSett {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>();
        a.add(8);
        a.add(6);
        a.add(5);
        a.add(5);//here duplicate values are not allowed.
        System.out.println(a);
        System.out.println(a.size());

    }
}
