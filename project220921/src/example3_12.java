public class example3_12
{
    static int[] makeArray() // 정수형 배열을 리턴하는 메소드
    {
        int temp[] = new int[4]; // 배열 생성
        for (int i=0; i<temp.length; i++)
            temp[i] = i;
        return temp; // 배열 리턴
    }
    public static void main (String[] args)
    {
        int intArray[]; // 배열 레퍼런스 변수 선언
        intArray = makeArray(); // 메소드로부터 배열 전달받음
        for (int i=0; i<intArray.length; i++)
            System.out.print(intArray[i] + " ");
    }
}
