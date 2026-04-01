package study.ch10;

public class Array05 {
    public static void main(String[] args) {
        // 구구단을 배열에 시작 단부터 끝 단까지 자동으로 저장하여 출력하는 프로그램을
        // 작성하시오.
        int danStart = 3;
        int danEnd = 6;
        int danCur = danStart;
        int num = 0;

        int[][] gugudan = new int[danEnd - danStart + 1][9];
        for(int i =0 ; i < gugudan.length; i++)
        {
            for(int j = 0 ; j < gugudan[i].length; j++)
            {
                num = j + 1;
                gugudan[i][j] = danCur * num;
            }
            danCur++;
        }

        for(int[] arr : gugudan)
        {
            System.out.print("[ ");
            for(int n : arr)
            {
                System.out.print(n +" ");
            }
            System.out.println("]");
        }
    }

}
