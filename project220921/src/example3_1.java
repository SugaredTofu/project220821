public class example3_1
{
    public static void main(String[] args)
    {
        int sum=0;
        for(int i=1; i<=10; i++)
        {
            sum += i;
            System.out.print(i);
            if(i<=9)
                System.out.print("+");
            else // i가 10인 경우
            {
                System.out.print("=");
                System.out.print(sum); // 덧셈 결과 출력
            }
        }
    }
}
