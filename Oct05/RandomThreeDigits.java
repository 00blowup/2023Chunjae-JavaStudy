package Oct05;

import java.util.ArrayList;

public class RandomThreeDigits {
    // 1부터 9까지 서로 겹치지 않는 3개의 숫자를 골라 3자리 정수를 만드는 문제
    public static void main(String[] args) {
        // 아직 뽑힌 적 없는 수들을 저장하는 ArrayList 생성
        ArrayList<String> ballArr = new ArrayList<String>();
        // ArrayList에 1~9 범위의 정수 저장
        for (int i=1; i<=9; i++) ballArr.add(Integer.toString(i));
        // 뽑힌 수들을 순서대로 저장하는 배열 생성
        String[] pickedBalls = new String[3];

        for(int i=0; i<3; i++) {
            // 0~아직 안 뽑힌 수 개수 사이의 랜덤 정수를 얻기
            int rand = (int)(Math.random() * ballArr.size());
            // 정해진 랜덤 정수를 인덱스로 하여 수 선택
            pickedBalls[i] = ballArr.get(rand); // 해당 인덱스의 수 가져오기
            ballArr.remove(rand);   // 해당 인덱스의 수를 ballArr에서 삭제
        }

        // 선택 결과 출력
        for(String s: pickedBalls) System.out.print(s);
    }
}
