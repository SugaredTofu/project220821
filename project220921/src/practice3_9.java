public class practice3_9
{
    public static void main(String[] args)
    {
        int iarray[][] = new int[4][4];

        for (int i = 0; i < iarray.length; i++)
        {
            for (int j = 0; j < iarray[i].length; j++)
            {
                iarray[i][j] = (int) (Math.random() * 10 + 1); //난수로 배열을 생성
            }
        }
        for (int i = 0; i < iarray.length; i++)
        {
            for (int j = 0; j < iarray[i].length; j++)
            {
            System.out.print(iarray[i][j] + "\t"); //탭만큼
            }
            System.out.println();
        }
    }
}


