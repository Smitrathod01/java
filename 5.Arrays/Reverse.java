public class Reverse {
    public static void main(String[] args) {
        int temp;
        int [] arr = {1,2,3,4,5,6};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);//will divide arr by 2 without decimal point

        for(int i=0;i<n;i++) 
        {
            temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i] = temp;
        }

        for(int element:arr)
        {
            System.out.println(element);
        }
    }
    
}
