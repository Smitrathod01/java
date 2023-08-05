//there are 4 types of access modifiers private,public,protected,default
//in  private we cant access privated things of other class...
class Employee
{
    private int id;
    private String name;
//due to private above things cant be accessed directly so we have to intilize getter and setter
    public void setName(String n)//will work as setter
    {
        name=n;
    }
    public String getName()//wil work as a geter
    {
        return name;
    }

}

public class GetterSetter
{
    public static void main(String[] args) {
        Employee s = new Employee();
        s.setName("Smit");
        System.out.println(s.getName());
    }
}