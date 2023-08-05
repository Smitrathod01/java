public class TryCatch
{
    public static void main(String[] args) {
        int a=16;
        int b=0;
        //int c=a/b;//will throw an error
        try {
            int c =a/b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("End of program");
        //without try catch last line wont be printed bcoz java is hybrid language ie interpret..
    }
}