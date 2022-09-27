import java.util.Scanner;

public class practice3_5
{
    public static void main(String[] args)
    {
        Scanner scan  = new Scanner(System.in);
        int iarray[] = new int[10];
        System.out.print("양의 정수 10개를 입력하시오>>");
        for (int i=0; i<iarray.length; i++) //배열의 길이만큼 반복
            iarray[i] = scan.nextInt();

        System.out.print("3의 배수는 ");
        for (int i=0; i<iarray.length; i++)
        {
            if (iarray[i] % 3 == 0) //3의 배수일 경우
            {
                System.out.print(iarray[i] + " ");
            }
        }
        scan.close();
    }
}
