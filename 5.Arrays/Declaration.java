class Declaration
{
    public static void main(String[] args) {
        {
            //three ways of declaring
            int [] marks = new int[5];
            int [] marks1;
            marks1 = new int[5];
            int [] marks2 = {12,34,56,78,56};

            //assigning
            marks[0]=10;
            marks1[0]=20;

            System.out.println(marks2[2]);

        }
    }
}