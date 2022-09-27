import java.util.Random;
import java.util.Scanner;

public class practice_open_challenge
{
    public static void main(String args[])
    {
        Random r = new Random(); //난수
        int k = r.nextInt(100); //0 - 99
        Scanner scan = new Scanner(System.in);
        int num = 0;
        int min = 0;
        int max = 99;
        while(true)
        {
            int current = 1; //시행 횟수

            System.out.println("수를 결정하였습니다. 맞추어 보세요");
            System.out.println(min + "-" + max);
            System.out.print(current + ">> ");
            num = scan.nextInt();

            while (k != num) //사용자가 입력한 수를 맞출때 까지 반ㅂㄱ
            {
                if(k< num) //입력한 수가 크면
                {
                    System.out.println("더 낮게");
                    max = num;
                }
                else //입력한 수가 작으면
                {
                    System.out.println("더 높게");
                    min = num;
                }
                current++;
                System.out.println(min + "-" + max);
                System.out.print(current + ">> ");
                num = scan.nextInt();
            }
            System.out.println("맞았습니다");
            System.out.print("다시 하시겠습니까? (y/n) >>");
            String text = scan.next();
            if (text.equals("n")) //n 입력시 반복종료
            {
                break;
            }
        }
    }
}
