package oct04;

import java.util.Scanner;

public class AddDigitsInt {

    // 정수가 int 타입으로 주어졌을 때, 각 자리의 합을 모두 더한 결과를 출력하는 문제
    public static void main(String[] args) {
        // Scanner로 정수를 읽어옴
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sum = 0;    // 정답을 저장할 변수

        // 1의 자리 덧셈
        int n = 10;
        sum += input%n;
        
        // 10의 자리부터는 있을 수도 없을 수도 있으므로 while문으로 처리
        while(true) {
            // 이번 자리수가 존재하는지 점검
            if (input/n == 0) break;    // 존재하지 않으면 break
            
            // 존재한다면 덧셈 수행
            sum += (input/n)%10;
            
            // 다음 자리수 연산을 위해 n 값 증가
            n *= 10;
        }
        
        // 정답 출력
        System.out.print(sum);


        // Scanner close
        sc.close();
    }
}
