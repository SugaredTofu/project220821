public class example3_10
{
    public static void main(String[] args)
    {
        double score[][] = {{3.3, 3.4}, {3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2}}; //각 학년 평점 순서대로 1,2,3,4학년 1,2 학기
        double sum=0;
        for(int year=0; year<score.length; year++) // 각 학년별로 반복
            for(int term=0; term<score[year].length; term++) // 각 학년의 학기별로 반복
                sum += score[year][term];
        int n=score.length;
        int m=score[0].length;
        System.out.println("4년 전체 평점 평균은 " + sum/(n*m));
    }
}
