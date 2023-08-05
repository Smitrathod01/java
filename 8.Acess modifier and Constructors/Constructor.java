class Employee
{
    int id;//u can private this also it wont affect the constructor
    String name;

    public Employee()//it is constuctor same name as class
    {
        id=23;//directly invoke this values while creating object of this
        name="smit";
    }
}
//imp--u can pass arguments in constructor 
public class Constructor {
    public static void main(String[] args) {
        Employee s = new Employee();
        System.out.println(s.id);//due to constructor no need to assign id and name
        System.out.println(s.name);
    }
//u can overload constructor also means u can create many constructors just change te parameters values 
}
