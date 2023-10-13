package oct11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordScramble {
    // 주어진 문자열의 철자를 랜덤으로 스크램블하여, 원래의 문자열을 맞추는 게임을 제작하는 문제
    public static void main(String[] args) {
        // 주어진 정답 문자열들
        String[] words = { "television", "computer", "mouse", "phone" };

        Scanner sc = new Scanner(System.in);

        String answer = "";

        // 사용자가 정답을 맞춘 횟수
        int correctCnt = 0;

        // 반복문으로 총 4번의 문제를 출제하기
        for(String word: words) {
            // 철자 섞기 (Collections.shuffle()을 사용)
            List<Character> letters = new ArrayList<>();
            for(char c: word.toCharArray()) letters.add(c);
            Collections.shuffle(letters);

            // 문제 출력
            System.out.print("다음의 문자열은 원래 어떤 단어였을까요? : ");
            for(char c: letters) System.out.print(c);
            System.out.println();
            System.out.print("답안: ");

            // 사용자의 정답 읽어오기
            answer = sc.next();
            if(answer.trim().equals(word)) {
                correctCnt++;
                System.out.println("정답입니다!");
            }
            else System.out.println("오답입니다!");


        }

        // 풀이 결과 출력
        System.out.printf("총 %d문제를 맞추셨습니다.", correctCnt);

        // Scanner close
        sc.close();
    }
}
