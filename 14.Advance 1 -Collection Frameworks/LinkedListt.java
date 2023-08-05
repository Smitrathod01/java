import java.util.*;
//in Linkedlist the addition and deletion is way faster than arraylist
class LinkedListt//same as arraylist only internal functions are different
{
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();//format
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(13);
        l2.add(10);
        l2.add(14);
        l2.add(17);

        l1.add(3);
        l1.add(8);
        l1.add(4);
        l1.addFirst(6);//different from array extra
        l1.addLast(4);
        l1.add(0,3);
        l1.add(0,5);
        l1.set(1, 0);//will replace that element
        //first 3 will add and then 5 
        l2.clear(); // will clear the array 
        l1.addAll(0, l2);//will add l2 from index 0
        for(int i=0;i<l1.size();i++)
        {
            System.out.println(l1.get(i));
        }
        System.out.println(l1.contains(4));//will return boolean
        System.out.println(l1.indexOf(4));//will return -1 if element is not present
        System.out.println(l1.lastIndexOf(4));//if same value is present in array then from last it will search 
    }
}