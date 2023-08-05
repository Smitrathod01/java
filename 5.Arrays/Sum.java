public class Sum {
    public static void main(String[] args) {
        int [] marks = {12,34,56,76,78};
        int sum = 0;
        for(int element : marks)
        {
            sum = sum+element;
        }
        System.out.println(sum);
    }
    
}
