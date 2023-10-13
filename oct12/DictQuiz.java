package oct12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictQuiz {
    // 영단어의 한국어 뜻을 맞추는 퀴즈 프로그램을 만드는 문제
    // 단, 영단어 하나에 한국어 뜻 하나가 매핑되어있던 기존 문제와 달리, 영단어 하나에 여러 개의 한국어 뜻을 매핑하여 구현하였다.
    public static void main(String[] args) {
        // Scanner 선언
        Scanner sc = new Scanner(System.in);

        // 해시맵으로 사전 생성
        Map<String, ArrayList<String>> hs = new HashMap<>();

        // 사전 내용 채우기
        hs.put("chair", new ArrayList<>());
        hs.get("chair").add("의자");
        hs.get("chair").add("걸상");
        hs.put("find", new ArrayList<>());
        hs.get("find").add("찾다");
        hs.get("find").add("발견하다");
        hs.get("find").add("알게 되다");
        hs.put("ray", new ArrayList<>());
        hs.get("ray").add("광선");
        hs.get("ray").add("선");
        hs.get("ray").add("빛살");
        hs.get("ray").add("가오리");

        // 사용자의 정답 수를 저장할 변수
        int correctCnt = 0;

        // 3개 영단어에 대하여 문제 출제 및 채점
        for(String eng : hs.keySet()){
            System.out.print(eng + "의 뜻은? : "); // 문제 출제
            String kor = sc.nextLine(); // 답변 입력받기
            if(hs.get(eng).contains(kor)) { // 정답 여부 판별
                System.out.println("정답입니다!");
                correctCnt++;
            }
            else System.out.println("오답입니다!");
        }

        // 퀴즈 결과 출력
        System.out.printf("총 %d문제를 맞추셨습니다.", correctCnt);

        // Scanner close
        sc.close();
    }
}
