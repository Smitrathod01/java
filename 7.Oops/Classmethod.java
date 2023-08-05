class Employee//only one public class exists in java
{
    int id;
    String name;
    public void getdetails()//u can make no of methods u want, public bcz we are making object
    {
        System.out.println(id);
        System.out.println(name);//u can change the name directly in method by passing string 
    }                       //string argument in a method and call it
}

public class Classmethod
{
    public static void main(String[] args) {
        Employee smit = new Employee();
        Employee thor = new Employee();

        smit.id=12;
        smit.name="Smit rathod";

        thor.id=15;
        thor.name="thor odinson";

        smit.getdetails();
        thor.getdetails();
    }
}