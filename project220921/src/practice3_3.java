import java.util.Scanner;
public class practice3_3
{
    public static void main(String[] args)
    {
        Scanner scan  = new Scanner(System.in);
        System.out.print("정수를 입력하시오>>");
        int n = scan.nextInt();
        if (n <=0) //0보다 작을시 경고문
        {
            System.out.println("0보다 커야 합니다.");
            scan.close();
            return;
        }
        for (int i=n; i>0; i--)
        {
            for (int j=0; j<i; j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }
        scan.close();
    }
}
