package Oct04;

import java.util.Scanner;

public class CheckIfNum {
    // 주어진 문자열이 숫자인지를 판별하는 문제
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.next(); // 문자열 읽어오기

        // 숫자인지 여부를 저장하는 boolean형 변수. 숫자가 아닌 문자가 발견되는 순간 false로 변경.
        boolean isNumber = true;

        // 주어진 문자열의 글자 수만큼 반복하며, 앞에서부터 한 글자씩 점검.
        for (int i=0; i<value.length(); i++) {
            int n = value.charAt(i) - '0';  // 이번 글자의 아스키코드 - '0'의 아스키코드
            if(n < 0 || n > 9 ) {   // n의 값이 0~9 사이가 아니라면 이번 글자는 숫자가 아님
                isNumber = false;   // inNumber 값을 false로 변경한 후
                break;              // 남은 글자와 무관하게 isNumber의 값이 확정되었으므로 break
            }
        }

        // isNumber 값에 따라 결과 문자열을 출력
        if (isNumber) System.out.print(value + "는 숫자입니다.");
        else System.out.print(value + "는 숫자가 아닙니다.");

        // Scanner close
        sc.close();
    }
}
