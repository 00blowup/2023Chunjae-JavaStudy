package Oct04;

import java.util.Scanner;

public class AddDigitsStr {

    // 정수가 문자열 타입으로 주어졌을 때, 정수 각 자리의 수를 모두 더한 값을 출력하는 문제
    public static void main(String[] args) {
        // Scanner로 문자열을 읽어옴
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int sum = 0;    // 정답을 저장할 변수

        // 주어진 문자열의 앞쪽부터 모든 문자를 덧셈 (ASCII 코드 활용하여 char -> int 변환)
        for (int i=0; i<str.length(); i++) {
            sum += str.charAt(i) - '0';
        }

        // 정답 출력
        System.out.print(sum);

        // Scanner close
        sc.close();

    }
}
