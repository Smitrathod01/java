public class addof2darrry {
    public static void main(String[] args) {
        int [][] mark = {{1,2,3},
                         {2,3,4}};

        int [][] mark1 = {{1,2,3},
                         {2,3,4}};

        int [][] result= {{0,0,0},
                         {0,0,0}};


        for(int i =0;i<mark.length;i++)
        {
            for(int j =0;j<mark[i].length;j++)
            {
                result[i][j] = mark[i][j] + mark1[i][j];
            }
        }
        for(int i =0;i<mark.length;i++)
        {
            for(int j =0;j<mark[i].length;j++)
            {
                System.out.println(result[i][j]);
            }
        }



        
    }
    
}
