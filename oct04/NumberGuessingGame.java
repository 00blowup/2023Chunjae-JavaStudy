package oct04;

import java.util.Scanner;

public class NumberGuessingGame {
    // 컴퓨터와의 숫자 업다운 게임을 구현하는 문제
    // 컴퓨터가 1~100 사이의 숫자를 선택한다. 사용자는 이 숫자가 무엇인지 맞출 때까지 시도를 반복한다.
    // 숫자를 맞추면 몇 번의 시도만에 맞추었는지 출력한다.
    public static void main(String[] args) {
        int answer = (int)(Math.random()*100) + 1;  // Math.random()을 사용하여 1~100의 수 선택

        int input = 0;  // 사용자입력을 저장하기 위한 변수
        int cnt = 0;    // 사용자의 시도횟수를 저장하기 위한 변수

        Scanner sc = new Scanner(System.in);

        while (true) {
            cnt++;
            System.out.print("1과 100 사이의 정수를 입력하세요: ");
            input = sc.nextInt();

            // 맞춘 경우 시도횟수를 출력한 뒤 break
            if(input == answer) {
                System.out.println("맞췄습니다!");
                System.out.print("시도횟수는 총 " + cnt + "번입니다.");
                break;
            }
            // 맞추지 못한 경우 더 큰 수가 정답인지 OR 더 작은 수가 정답인지 출력
            if(input>answer) System.out.println("더 작은 수를 입력하세요.");// (if문에 break가 있으므로 else는 필요 없음)
            else System.out.println("더 큰 수를 입력하세요.");


        }

        // Scanner close
        sc.close();
    }


}
