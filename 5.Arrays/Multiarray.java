public class Multiarray {
    public static void main(String[] args) {
        int [][] flat = new int[2][2];
        //flat = new int [2][2];    //mistake is present
        flat[0][0] = 10;
        flat[0][1] = 20;
        flat[1][0] = 40;
        flat[1][1] = 50;

        for(int i =0;i<flat.length;i++)
        {
            for(int j =0;i<flat[i].length;j++)
            {
                System.out.println(flat[i][j]);
            }
        }
    }
    
}
