public class practice3_13
{
    public static void main(String[] args)
    {
        String str[] = {" 박수 짝", " 박수 짝짝"};
        int result, num, number369 = 0;

        for (int i = 1; i < 100; i++)
        {
            num = i;
            for (result = num % 10; num > 0; result = num % 10)
            {
                if (result == 3 || result == 6 || result == 9) // 3,6,9가 포함될 시
                {
                    number369++;
                }
                num = num / 10;
            }
            if (number369 > 0)
            {
                System.out.println(i + str[number369 - 1]);
            }
            number369 = 0;
        }
    }
}



