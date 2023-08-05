import javax.lang.model.element.Element;

public class Maxmin {
    public static void main(String[] args) {
        int [] arr ={1,34,567,543,45};
        int max=0;
        for(int element : arr)
        {
            if(element>max)
            {
                max = element;
            }
            
        }
        System.out.println(max);
        //similiarly for min just change the condition ...
    
    }
    
}
