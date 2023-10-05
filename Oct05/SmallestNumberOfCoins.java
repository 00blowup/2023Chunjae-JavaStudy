package Oct05;

import java.util.Scanner;

public class SmallestNumberOfCoins {
    // 가장 적은 수의 동전으로 거스름돈을 거슬러 주는 문제. 동전이 종류별로 몇 개 사용되는지 출력한다.

    public static void main(String[] args) {
        // 가지고 있는 동전의 종류를 저장하는 배열
        int[] coins = {500, 100, 50, 10, 1};

        Scanner sc = new Scanner(System.in);

        // 거스름돈 금액 읽어오기
        System.out.print("거스름돈의 금액을 입력하세요: ");
        int change = sc.nextInt();

        // 사용할 동전 계산하기
        for (int i: coins) {    // 금액이 큰 동전부터 계산
            int answer = change/i;  // 이번 동전의 개수 계산
            change -= answer*i; // 이번 동전으로 거슬러진 만큼을 총액에서 뺄셈
            // 이번 동전의 개수 출력
            System.out.println(i + "원짜리 동전의 개수: " + answer);
        }


        // Scanner close
        sc.close();
    }
}
