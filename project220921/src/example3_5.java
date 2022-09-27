import java.util.Scanner;
public class example3_5
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 5개 입력하세요.");
        int sum=0;
        for(int i=0; i<5; i++)
        {
            int n = scanner.nextInt();
            if(n<=0) // 양수가 아닌 경우
                continue;
            else // 양수인 경우 덧셈
                sum += n;
        }
        System.out.println("양수의 합은 " + sum);
        scanner.close();
    }
}