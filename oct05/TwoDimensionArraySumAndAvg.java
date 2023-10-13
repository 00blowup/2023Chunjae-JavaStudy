package oct05;

public class TwoDimensionArraySumAndAvg {
    // 2차원 배열에 담긴 모든 값의 총합과 평균을 구하여 출력하는 문제
    public static void main(String[] args) {
        int[][] arr = {
                {5,5,5,5,5},
                {10,10,10,10,10},
                {20,20,20,20,20},
                {30,30,30,30,30}
        };

        int sum = 0;    // 총합을 저장할 변수

        // 배열 내의 모든 값 더하기
        for(int i=0 ; i<4; i++) {
            for(int j=0; j<5; j++) sum += arr[i][j];
        }

        System.out.println("total=" + sum);
        System.out.printf("average= %.2f", (float)sum/20);
    }
}
