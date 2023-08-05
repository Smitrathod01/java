class Arraymthd
{
    public static void main(String[] args) {
        String [] student = {"smnit","skjrghy"};
        int [] marks = {1,2};
        //for(int i=1;i<student.length;i--)
        for(int i=student.length -1;i>=0;i--)//printing in reverse order
        {
            System.out.println(student[i]);
        }

        for(int element: marks)
        {
            System.out.println(element);;
        }
        for(String name:student)
        {
            System.out.println(name);
        }
    }
}